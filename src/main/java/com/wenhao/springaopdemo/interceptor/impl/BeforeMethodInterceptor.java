package com.wenhao.springaopdemo.interceptor.impl;

import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

public class BeforeMethodInterceptor implements MethodInterceptor {
    @Override
    public void invoke() {
        System.out.println("前置拦截器");
    }
}
