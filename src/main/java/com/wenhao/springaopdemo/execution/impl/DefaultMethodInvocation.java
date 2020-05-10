package com.wenhao.springaopdemo.execution.impl;

import com.wenhao.springaopdemo.execution.MethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class DefaultMethodInvocation implements MethodInvocation {

    //list 中装入 相关切入点执行类
    private List<MethodInterceptor> list;

    private Object target;//目标对象
    private Method method;//目标方法
    private Object args[];//目标参数

    public DefaultMethodInvocation(List<MethodInterceptor> list, Object target, Method method, Object[] args) {
        this.list = list;
        this.target = target;
        this.method = method;
        this.args = args;
    }

    // 切入点方法执行到那一步的指针
    private int index;

    //执行方法 递归方法
    public void process() throws InvocationTargetException, IllegalAccessException {
        //在后置方法之前执行 目标方法
        if (index == list.size()) {
            //调用目标方法
            method.invoke(target, args);
            return;
        }
        //通过递归调用 获取 切入点 类
        MethodInterceptor methodInterceptor = list.get(index++);
        //执行 切入点方法
        methodInterceptor.invoke(this);
    }
}
