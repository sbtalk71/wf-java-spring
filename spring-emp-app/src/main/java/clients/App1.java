package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmpService;

public class App1 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
		EmpService service=(EmpService)ctx.getBean("es");
		
		System.out.println(service.registerEmp(100, "A", "B", 45000));
		
		

	}

}
