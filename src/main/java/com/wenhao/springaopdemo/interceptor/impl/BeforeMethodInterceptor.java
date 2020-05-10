package com.wenhao.springaopdemo.interceptor.impl;

import com.wenhao.springaopdemo.execution.MethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;

public class BeforeMethodInterceptor implements MethodInterceptor {
    @Override
    public void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("前置拦截器");
        methodInvocation.process();
    }
}
