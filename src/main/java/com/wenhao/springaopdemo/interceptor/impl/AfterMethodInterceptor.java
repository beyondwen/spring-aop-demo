package com.wenhao.springaopdemo.interceptor.impl;

import com.wenhao.springaopdemo.execution.MethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;

public class AfterMethodInterceptor implements MethodInterceptor {
    @Override
    public void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException {
        //通过执行器 执行递归方法
        methodInvocation.process();
        System.out.println("后置拦截器");
    }
}
