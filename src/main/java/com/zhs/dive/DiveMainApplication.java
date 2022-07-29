package com.zhs.dive;

import com.zhs.dive.common.User;
import com.zhs.dive.util.ApplicationContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DiveMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiveMainApplication.class, args);

        // 1.进行Bean对象获取
        User user = ApplicationContextUtil.getBean("user", User.class);
        System.out.println("------usr:"+user);
    }

}
