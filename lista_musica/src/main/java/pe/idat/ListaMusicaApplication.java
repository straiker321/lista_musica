package pe.idat;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ListaMusicaApplication //implements CommandLineRunner
{
	/*
	@Autowired
	private PasswordEncoder passwordEncoder;
	*/
	public static void main(String[] args) {
		SpringApplication.run(ListaMusicaApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception 
	{
		System.out.println("w123: "+passwordEncoder.encode("w123"));
		System.out.println("d123: "+passwordEncoder.encode("d123"));
		System.out.println("r123: "+passwordEncoder.encode("r123"));
		System.out.println("f123: "+passwordEncoder.encode("f123"));
	}
	*/
}

