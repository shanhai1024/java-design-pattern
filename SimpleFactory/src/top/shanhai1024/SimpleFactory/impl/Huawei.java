package top.shanhai1024.SimpleFactory.impl;

import top.shanhai1024.SimpleFactory.MobilePhone;

/**
 * @author null
 * @date 2024/10/16 20:30
 */
public class Huawei implements MobilePhone {
    @Override
    public void call() {
        System.out.println("use  huawei phone to make call");
    }
}
