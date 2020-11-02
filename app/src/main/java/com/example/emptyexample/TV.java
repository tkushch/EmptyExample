package com.example.emptyexample;

public class Board {
    int a = 0;
    int b = 0;
    String messages = '';
    public Board(){
        this.a = 1;
        this.b = 1;
    }
    public void sendtoBoard(TV tv1, m){
        tv1.messages += (m + "\n");
    }
    public void sendtoPhone(Phone ph1, m){
        ph1.messages += (m + "\n");
    }
    public String showMessages(){
        return this.messages;
    }
    public void clearMessages(){
        this.messages = "";
    }
    
}
