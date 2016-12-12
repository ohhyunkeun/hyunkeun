package practice_spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice_spring.vo.PlayerVO;



public class Test {

	public static void main(String[] args) {
       
		ApplicationContext context = new ClassPathXmlApplicationContext("practice_spring/applicationContext.xml");

		PlayerDao dao = context.getBean("player", PlayerDao.class);

		PlayerVO player = new PlayerVO(21, "Ki","Swansicity",30,"Korea");
//				
//		System.out.println(dao.insert(player));
		
		System.out.println(dao.select(10));
		
		for (PlayerVO p : dao.selectAll()) {
			System.out.println(p);
		}
		
	}

}
