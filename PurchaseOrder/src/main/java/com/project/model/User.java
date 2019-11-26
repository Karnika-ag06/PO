package com.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Table_User")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private int userId;
	
	@NotEmpty
	@Size(min = 2, message = "User Name should be Atleast 4")
	@Pattern(regexp="[^0-9]*",message="enter valid name")
    @Column(name="User_Name")
	private String userName;
	
	@Email(message = "email is not valid")
	@NotNull
	@Column(name="User_Email")
	private String  userEmail;
	
	@NotEmpty(message="please enter your userAddress")
	@Column(name="User_Address")
	private String userAddress;
	
	@NotNull(message="please enter the mobile no.")
	@Max(10)
	@Column(name="User_Mobile")
	private long userMobile;
	
	@Column(name="User_IsActive")
	private String userIsActive;
	
	@Column(name="Created_Date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate createdDate;
	
	@Column(name="Updated_Date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate updatedDate;
	
	@Column(name="Created_By")
	private String createdBy;
	

	@Column(name="Updated_By")
	private String updatedBy;
	
	
	@Column(name="User_Role")
	private String userRole;
	
	@NotEmpty
	@Size(min = 1, message = "User password should be Atleast 4")
	@Column(name="User_Password")
	private String userPassword;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public long getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserIsActive() {
		return userIsActive;
	}

	public void setUserIsActive(String userIsActive) {
		this.userIsActive = userIsActive;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
}
