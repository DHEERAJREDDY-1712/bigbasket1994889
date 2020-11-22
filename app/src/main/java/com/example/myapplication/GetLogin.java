package com.example.myapplication;

public class GetLogin {

    String un;
    String passwd;

    public GetLogin(String un, String passwd) {
        this.un = un;
        this.passwd = passwd;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String fn) {
        this.un = un;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String ln) {
        this.passwd = passwd;
    }
}
