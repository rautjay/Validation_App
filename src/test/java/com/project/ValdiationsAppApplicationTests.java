package com.project;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.entity.Validations;
import com.project.repo.ValRepositiory;

@SpringBootTest
class ValdiationsAppApplicationTests {

	@Autowired
	private ValRepositiory valrepo;
	
	@Test
	void AddvalueTest() {
		
		Validations val = new Validations();
		
		val.setPAN("GEHPS9644H" );
		val.setCIN("U21091KA2019OPC141331");
		Date date =  new Date(04,18,2012);
		
		val.setDate(date);
		val.setPincode("444606");
		val.setCountrycode("91");
		val.setMobile("9834567812");
		val.setStd_code("91");
		this.valrepo.save(val);
		boolean result = valrepo.existsById(val.getC_id());
		assertThat(true).isTrue();
		
	}
}

	/*
	 * "PAN":"GEHPS9644H", "CIN":"U21091KA2019OPC141331", "Audit_date":"11/11/2020",
	 * "pincode":"411014", "countrycode":"+91", "mobile":"8329842450", "std_code"
	
	 */
		 

