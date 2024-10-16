package top.shanhai1024.SimpleFactory;

import top.shanhai1024.SimpleFactory.impl.Huawei;
import top.shanhai1024.SimpleFactory.impl.IPhone;
import top.shanhai1024.SimpleFactory.impl.Meizu;

/**
 * @author null
 * @date 2024/10/16 20:26
 */
public class MobilePhoneFactory {
    public MobilePhone phone(String type){
        if("iphone".equalsIgnoreCase(type)){
            return  new IPhone();
        }
        else if ("meizu".equalsIgnoreCase(type)){
            return new Meizu();
        }
        else if ("huawei".equalsIgnoreCase(type)) {
            return new Huawei();
        }else {
            throw  new RuntimeException("No phones of this brand were found");
        }

    }

}
