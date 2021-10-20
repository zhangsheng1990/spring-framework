import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Person;

public class IocTest {
	@Test
	public void testIoc() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
