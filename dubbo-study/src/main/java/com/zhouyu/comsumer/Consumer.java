package com.zhouyu.comsumer;

import com.zhouyu.framework.proxy.ProxyFactory;
import com.zhouyu.provider.api.HelloService;

public class Consumer {

    public static void main(String[] args) {

//        Invocation invocation = new Invocation(HelloService.class.getName(), "sayHello", new Class[]{String.class}, new Object[]{"周瑜大都督"});
//        NettyClient nettyClient = new NettyClient();
//        String result = nettyClient.send("localhost", 8080, invocation);
//        System.out.println(result);


        HelloService helloService = ProxyFactory.getProxy(HelloService.class);
        for (int i = 0; i < 10; i++) {
            String result = helloService.sayHello("黄小龙");
            System.out.println(result);
        }

    }
}
