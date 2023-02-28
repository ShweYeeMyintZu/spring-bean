package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentDemo {
    public static void main(String[] args) {
        ApplicationContext factory=new ClassPathXmlApplicationContext("beans.xml");
        Student student=factory.getBean("student",Student.class);
        System.out.println("Name:"+student.getFirstName()+" "+student.getLastName());
        System.out.println("Code: "+student.getCode());
        ((ClassPathXmlApplicationContext)factory).close();

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student stu=context.getBean("student",Student.class);
        System.out.println("Name:"+stu.getFirstName()+" "+stu.getLastName());
        System.out.println("Code: "+stu.getCode());
        context.close();
    }
}
