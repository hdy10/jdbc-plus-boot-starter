package com.github.hdy.jdbcplus.result;


import java.util.ArrayList;
import java.util.List;

/**
 * 分页返回结果
 * Created by hdy on 2018/6/12.
 */
public class PageResults {
    private int code;
    private int count;
    private String msg;
    private List data = new ArrayList();

    public PageResults() {
    }

    public PageResults(int code, int count, String msg, List data) {
        this.code = code;
        this.count = count;
        this.msg = msg;
        this.data = data;
    }


    public static PageResults success(int count, List data) {
        return new PageResults(200, count, null, data);
    }

    public static PageResults fail() {
        return new PageResults(500, 0, "查询失败", null);
    }

    public static PageResults noData() {
        return new PageResults(301, 0, "没有查询到更多数据！", null);
    }

    public static PageResults fail(String msg) {
        return new PageResults(500, 0, msg, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
