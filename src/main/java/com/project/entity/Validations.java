package com.project.entity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "sample")
public class Validations {

	    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int C_id;
	@Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$")
    private String PAN;
	@Pattern(regexp = "^([L|U]{1})([0-9]{5})([A-Za-z]{2})([0-9]{4})([A-Za-z]{3})([0-9]{6})$")
	private String CIN;
	@JsonFormat(pattern = "dd/mm/yyyy")
	private Date date;
	@Pattern(regexp = "^[0-9]{6}$")
	private String pincode;
	private String  countrycode;
	@Pattern(regexp = "^\\d{10}$")
	private String mobile;
	private String std_code;
	
	//getters and setters
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getPAN() {
		return PAN;
	}
	
	@JsonProperty("PAN")
	public void setPAN(String PAN) {
		this.PAN = PAN;
	}
	
	public String getCIN() {
		return CIN;
	}
	
	@JsonProperty("CIN")
	public void setCIN(String CIN) {
		this.CIN = CIN;
	}

	@JsonProperty("date")
	public  Date getDate() {
		return date;
	}
	@JsonProperty("date")
	public void setDate( Date date) {
		this.date = date;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

	public Validations(int c_id, @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$") String pAN,
			@Pattern(regexp = "^([L|U]{1})([0-9]{5})([A-Za-z]{2})([0-9]{4})([A-Za-z]{3})([0-9]{6})$") String cIN,
			Date date,
			@Pattern(regexp = "^[0-9]{6}$") String pincode, String countrycode,
			@Pattern(regexp = "^\\d{10}$") String mobile, String std_code) {
		super();
		C_id = c_id;
		PAN = pAN;
		CIN = cIN;
		this.date = date;
		this.pincode = pincode;
		this.countrycode = countrycode;
		this.mobile = mobile;
		this.std_code = std_code;
	}
	public String getStd_code() {
		return std_code;
	}
	public void setStd_code(String std_code) {
		this.std_code = std_code;
	}
	public Validations() {
		super();
	}
	
	
	
	
	
	
}


