import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("cats");
        Cat beanCat2 = (Cat) applicationContext.getBean("cats");

        System.out.println(bean.getMessage());

        System.out.println("Сравниваем bean1 и bean2: "+compareBeans(bean,bean2));
        System.out.println("Сравниваем beanCat и beanCat2: "+compareBeans(beanCat,beanCat2));
        System.out.println("Сравниваем bean1 и beanCat2: "+compareBeans(bean,beanCat2));
    }

    public static boolean compareBeans(Object bean1, Object bean2) {
        return bean1 == bean2;
    }
}