package com.wenhao.springaopdemo.execution;

import com.wenhao.springaopdemo.interceptor.MethodInterceptor;

import java.util.List;

public class MethodExecution {

    //传入 带切入方法
    public MethodExecution(List<MethodInterceptor> list) {
        this.list = list;
    }

    private List<MethodInterceptor> list;

    // 指针
    private int index;

    //执行方法
    public void process() {
        if (index == list.size()) {
            return;
        }
        MethodInterceptor methodInterceptor = list.get(index++);
        methodInterceptor.invoke();
        process();
    }
}
