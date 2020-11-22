package com.example.myapplication;

public class Registration {

    String fn;
    String ln;
    String cnct;
    String eml;
    String pwd;

    public Registration(String fn, String ln, String cnct, String eml, String pwd) {
        this.fn = fn;
        this.ln = ln;
        this.cnct = cnct;
        this.eml = eml;
        this.pwd = pwd;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getCnct() {
        return cnct;
    }

    public void setCnct(String cnct) {
        this.cnct = cnct;
    }

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
