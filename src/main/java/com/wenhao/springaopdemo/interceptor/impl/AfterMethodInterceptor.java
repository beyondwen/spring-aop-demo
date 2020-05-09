package com.wenhao.springaopdemo.interceptor.impl;

import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

public class AfterMethodInterceptor implements MethodInterceptor {
    @Override
    public void invoke() {
        System.out.println("后置拦截器");
    }
}
