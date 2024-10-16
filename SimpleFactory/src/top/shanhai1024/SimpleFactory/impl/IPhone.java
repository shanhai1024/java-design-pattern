package top.shanhai1024.SimpleFactory.impl;

import top.shanhai1024.SimpleFactory.MobilePhone;

/**
 * @author null
 * @date 2024/10/16 20:26
 * iphone  im
 */

public class IPhone implements MobilePhone {
    @Override
    public void call() {
        System.out.println("Use iPhone to make calls");
    }
}
