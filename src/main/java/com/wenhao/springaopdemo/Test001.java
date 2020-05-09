package com.wenhao.springaopdemo;

import com.wenhao.springaopdemo.execution.MethodExecution;
import com.wenhao.springaopdemo.interceptor.MethodInterceptor;
import com.wenhao.springaopdemo.interceptor.impl.AfterMethodInterceptor;
import com.wenhao.springaopdemo.interceptor.impl.BeforeMethodInterceptor;

import java.util.ArrayList;
import java.util.List;

public class Test001 {

    public static void main(String[] args) {
        List<MethodInterceptor> list = new ArrayList<>();
        list.add(new BeforeMethodInterceptor());
        list.add(new AfterMethodInterceptor());
        MethodExecution methodExecution = new MethodExecution(list);
        methodExecution.process();
    }
}
