package com.example.demofor.git;
#aefghjgfdjj
	#wdfgb
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoforGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoforGitApplication.class, args);

		//Fibanaci Series
		int n1=0,n2=1,n3,i,count=10;
		System.out.print(n1+" "+n2);

		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
