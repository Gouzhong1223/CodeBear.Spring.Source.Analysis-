package com.gouzhong1223.test;

import com.gouzhong1223.config.Appconfig;
import com.gouzhong1223.pojo.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-03-27 8:41 下午
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.test
 * @ProjectName : spring
 * @Version : 1.0.0
 */
public class IocTest01 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		Student bean = applicationContext.getBean(Student.class);
		System.out.println(bean);
	}
}
