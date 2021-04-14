package com.zhouyu.framework.register;

import com.zhouyu.framework.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoteMapRegister {

    private static Map<String, List<URL>> REGISTER = new HashMap<>();


    public static void regist(String interfaceName, URL url) {
        List<URL> list = REGISTER.get(interfaceName);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(url);

        REGISTER.put(interfaceName, list);
    }

    public static List<URL> get(String interfaceName) {
        List<URL> list = REGISTER.get(interfaceName);
        return list;
    }


}
