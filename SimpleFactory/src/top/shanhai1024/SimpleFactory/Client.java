package top.shanhai1024.SimpleFactory;

/**
 * @author null
 * @date 2024/10/16 20:37
 */
public class Client {
    public static void main(String[] args) {
        MobilePhoneFactory phoneFactory =new MobilePhoneFactory();
        MobilePhone meizu = phoneFactory.phone("meizu");
        meizu.call();
    }
}
