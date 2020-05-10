package com.wenhao.springaopdemo.interceptor;

import com.wenhao.springaopdemo.execution.MethodInvocation;

import java.lang.reflect.InvocationTargetException;

public interface MethodInterceptor {

    void invoke(MethodInvocation methodInvocation) throws InvocationTargetException, IllegalAccessException;
}
