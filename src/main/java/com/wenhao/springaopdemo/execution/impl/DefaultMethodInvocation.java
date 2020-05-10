package com.wenhao.springaopdemo.execution.impl;

import com.wenhao.springaopdemo.execution.MethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class DefaultMethodInvocation implements MethodInvocation {

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

    // 指针
    private int index;

    //执行方法
    public void process() throws InvocationTargetException, IllegalAccessException {
        if (index == list.size()) {
            method.invoke(target, args);
            return;
        }
        MethodInterceptor methodInterceptor = list.get(index++);
        methodInterceptor.invoke(this);
    }
}
