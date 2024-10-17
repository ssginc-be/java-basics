package com.qriosity.day13.exception;

/**
 * @author Queue-ri
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.money();
        } catch (MyException e) {
            System.out.println("main에서 에러 처리함.");
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    // 인텔리제이 generate로 생성함
    public MyException(String message) {
        super(message);
    }
}

class Account {
    public void money() throws MyException {
        int n = 10000;
        if (n >= 10000) {
            throw new MyException("메로나 하나만요");
        }
    }
}