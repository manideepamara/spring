package com.training.org;
import java.util.List;
public class User {
	
	private  String email;
	private String password;
	private String phoneNumber;
           private    String address;
           private boolean verified;
           private boolean enabled;
           private List<Role> roles;
	
	
	public User(String email, String password, String phoneNumber, String address, boolean verified,
				boolean enabled, List<Role> roles) {
			super();
			this.email = email;
			this.password = password;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.verified = verified;
			this.enabled = enabled;
			this.roles = roles;
		}
	public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public boolean isVerified() {
			return verified;
		}
		public void setVerified(boolean verified) {
			this.verified = verified;
		}
		public List<Role> getRoles() {
			return roles;
		}
		public void setRoles(List<Role> roles) {
			this.roles = roles;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		@Override
		public String toString() {
			return "User [email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", address="
					+ address + ", verified=" + verified + ", enabled=" + enabled + "]";
		}
	
		
	
}
       