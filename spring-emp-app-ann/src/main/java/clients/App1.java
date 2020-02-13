package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.AppConfig;
import com.demo.spring.service.EmpService;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service=(EmpService)ctx.getBean("empService");
		
		System.out.println(service.registerEmp(100, "A", "B", 45000));
		
		

	}

}
