package com.example.address;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.address.web.AddressController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AddressApplicationTests {
	
	@Autowired
	private AddressController controller; 
	
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull(); 
	}

}
