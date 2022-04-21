package com.example.address;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;

import com.example.address.domain.Address;
import com.example.address.domain.AddressRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AddressRepositoryTest {

	@Autowired
	private AddressRepository repository;

	@Test
	public void findByNameShouldReturnName() {
		List<Address> addresses = repository.findByName("Mariia Solo");

		assertThat(addresses).hasSize(1);
		assertThat(addresses.get(0).getStreet()).isEqualTo("Porvoontie");
	}

	@Test
	public void createNewAddress() {
		Address address = new Address("Suraj Mishra", "Pakilantie", 2, 'D', "00660", "Helsinki");
		repository.save(address);
		assertThat(address.getId()).isNotNull();
	}

}
