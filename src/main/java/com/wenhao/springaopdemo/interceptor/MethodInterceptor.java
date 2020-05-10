package com.wenhao.springaopdemo.interceptor;

import com.wenhao.springaopdemo.execution.MethodInvocation;

import java.lang.reflect.InvocationTargetException;

public interface MethodInterceptor {

    //aop 切入点方法调用
    void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException;
}
