package top.shanhai1024.SimpleFactory.impl;

import top.shanhai1024.SimpleFactory.MobilePhone;

/**
 * @author null
 * @date 2024/10/16 20:28
 * Meizu mobile phone
 */
public class Meizu   implements MobilePhone {
    @Override
    public void call() {
        System.out.println("Use meizu phone to  make call");
    }
}
