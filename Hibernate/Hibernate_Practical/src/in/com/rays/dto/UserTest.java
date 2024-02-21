package in.com.rays.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserTest {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("kapil");
		dto.setLastName("dudhe");
		dto.setLoginId("kapil@gmail.com");
		dto.setPassword("1452");
		dto.setDob(new Date());
		dto.setAddress("khargone");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}

}
