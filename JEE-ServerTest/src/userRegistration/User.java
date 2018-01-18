package userRegistration;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class User implements Serializable {
	
	private static final long serialVersionUID = 3258246348843861675L;
	
	// ----- Parameters -------------------------
	
	private String lastName;
	private String firstName;
	private String eMail;
	private String password;
	
	// ----- Constructor ------------------------
	
	public User() {
		System.out.println("New User Created");
	}

	// ----- Getters and Setters ----------------
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
