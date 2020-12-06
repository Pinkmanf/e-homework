package com.company;

public class Result {
    private int code;
    private String msg;
    public String toString(){
        String str;
        str="{'code':"+code+","+"'msg':'"+msg+"'"+ "}";
        return str;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
