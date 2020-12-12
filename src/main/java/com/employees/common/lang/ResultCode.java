package com.employees.common.lang;

public enum ResultCode {

    SUCCESS(true,200,"操作成功！"),
    FAIL(false,400,"操作失败"),
    DATACREATED(true,201,"创建成功");

//    //---用户操作返回码  2xxxx----
//    MOBILEORPASSWORDERROR(false,20001,"用户名或密码错误");

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    ResultCode(boolean success,int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
