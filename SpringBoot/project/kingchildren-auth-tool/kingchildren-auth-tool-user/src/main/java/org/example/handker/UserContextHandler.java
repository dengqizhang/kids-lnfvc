package org.example.handker;

public class UserContextHandler {
    private static final ThreadLocal<Integer> userIdContext = new ThreadLocal<>();


    public static void setUserId(Integer userId){
        userIdContext.set(userId);
    }
    public static int getUserId(){
        return userIdContext.get();
    }
}
