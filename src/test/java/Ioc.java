import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nagisa.service.impl.MessageService;

public class Ioc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		MessageService messageService = (MessageService) applicationContext.getBean("messageService");
		messageService.printMessage();
		System.out.println(messageService);
	}

}
