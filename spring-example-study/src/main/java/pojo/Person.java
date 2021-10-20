package pojo;


import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Person implements InitializingBean {
	private String name;
	private int age;

	public Person() {
		System.out.println("构造器....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet.....");
	}
}
