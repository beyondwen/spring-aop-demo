package com.wenhao.springaopdemo.interceptor.impl;

import com.wenhao.springaopdemo.execution.MethodInvocation;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.lang.reflect.InvocationTargetException;

public class AroundMethodInterceptor implements MethodInterceptor {
    @Override
    public void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("环绕通知在目标方法之前执行");
        methodInvocation.process();
        System.out.println("环绕通知在目标方法之后执行");
    }
}
