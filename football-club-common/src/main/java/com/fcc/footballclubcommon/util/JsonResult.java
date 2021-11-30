package com.fcc.footballclubcommon.util;

import java.io.Serializable;

public class JsonResult implements Serializable {
    private static final long serialVersionUID = -4800793124936904868L;

    private static int code;
    private static String msg;
    private static Object data;

    public JsonResult(){}

    public JsonResult(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static JsonResult ok(Object data){
        return new JsonResult(200, "操作成功", data);
    }

    public static JsonResult error(){
        return new JsonResult(500, "操作失败", null);
    }

    public static JsonResult error(String msg){
        return new JsonResult(500, msg, null);
    }

    public static JsonResult convert(int i){
        if(i>0){
            return new JsonResult(200, "操作成功");
        }else{
            return new JsonResult(500, "操作失败");
        }
    }
}
