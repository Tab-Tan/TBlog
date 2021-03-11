package com.example.websocketdemo.socket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
@ServerEndpoint("/websocket/{username}")
public class Demo {

    private static AtomicInteger onlineCount = new AtomicInteger(0);//在线人数
    private static Map<String,Demo> clinets = new ConcurrentHashMap<>();
    private Session session;
    private String username;

    @OnOpen
    public void onOpen(@PathParam("username") String username, Session session){

        this.username = username;
        this.session = session;
        // 添加在线人数
        addOnlineCount();
        clinets.put(username,this);
        log.info("用户{} 已连接,当前人数{}",username,onlineCount);
    }

    @OnClose
    public void onClose(){
        clinets.remove(username);
        subOnlineCount();
        log.info("用户{}已退出,当前人数{}",username,onlineCount);
    }

    @OnMessage
    public void onMessage(String message){
        log.info(message);
        for (Demo item : clinets.values()) {
            item.session.getAsyncRemote().sendText(message);
        }
    }

    public void addOnlineCount(){
        onlineCount.incrementAndGet();
    }

    public void subOnlineCount(){
        onlineCount.decrementAndGet();
    }
}
