package com.example.reskill;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Administrator
 *
 */
public class SessionListener implements HttpSessionBindingListener {

    private String userName;

    public SessionListener(){

    }

    public SessionListener(String userName){

        this.userName = userName;
    }

    /*
     * session数据绑定
     * @see javax.servlet.http.HttpSessionBindingListener#valueBound(javax.servlet.http.HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent event) {

        HttpSession session = event.getSession();
        ServletContext application = session.getServletContext();//获取session的Servletcontext对象
        HashSet<String>  onLineList = (HashSet<String>) application.getAttribute("onLineList");//返回的是一个对象，强转成集合对象
        if(onLineList == null){//看看是否为空，若为空则
            onLineList =  new HashSet<> ();
            application.setAttribute("onLineList", onLineList);//初始化一下

        }
        onLineList.add(this.userName);
        System.out.println("添加成功"+this.userName);
    }

    /*
     * session数据绑定取消
     * @see javax.servlet.http.HttpSessionBindingListener#valueUnbound(javax.servlet.http.HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent event) {

        HttpSession session = event.getSession();
        ServletContext application = session.getServletContext();
        List onLineList = (List) application.getAttribute("onLineList");
        onLineList.remove(this.userName);
    }

}