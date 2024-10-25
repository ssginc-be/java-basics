package com.qriosity.day19.design_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Queue-ri
 */

public class ObserverTest {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();
        User user1 = new User("홍길동");
        room.addUser(user1);
        room.addUser(new User("김길동"));
        room.addUser(new User("박길동"));

        room.notifyUsers("오늘은 금요일!!!");
        
        // 채팅방에서 '홍길동' 삭제
        room.removeUser(user1);
        // (삭제 확인차) 다른 내용 보내보기
        room.notifyUsers("집에 가고 싶다 ^ㅅ^");
    }
}

class ChatRoom {
    List<User> users;

    ChatRoom() {
        this.users = new ArrayList<User>();
    }

    // 사람들 추가하는 기능
    void addUser(User user) {
        users.add(user);
    }
    // 사람들 삭제하는 기능
    void removeUser(User user) {
        users.remove(user);
    }
    // 유저 리스트 알림
    // 옵저버 패턴: 메세지를 입력하면 관찰하고 있다가 다른 객체로 알려줌
    void notifyUsers(String m) {
        for (User user : users) {
            user.update(m);
        }
    }
}

class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "(이)가 메세지를 보냄>> " + message);
    }
}

interface Observer {
    void update(String message);
}