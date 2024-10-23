package net.swiftSpin.laundrymanagement.model;

	public class signup {
	    private String name;
	    private String email;
	    private String mobileNumber;
	    private String securityQuestion;
	    private String answer;
	    private String password;
	    private String address;
	    

	    // Constructors
	    public signup() {
	    }

	    public signup(String name, String email, String mobileNumber, String securityQuestion, String answer, String password,
	                  String address) {
	        this.name = name;
	        this.email = email;
	        this.mobileNumber = mobileNumber;
	        this.securityQuestion = securityQuestion;
	        this.answer = answer;
	        this.password = password;
	        this.address = address;
	        
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    public String getSecurityQuestion() {
	        return securityQuestion;
	    }

	    public void setSecurityQuestion(String securityQuestion) {
	        this.securityQuestion = securityQuestion;
	    }

	    public String getAnswer() {
	        return answer;
	    }

	    public void setAnswer(String answer) {
	        this.answer = answer;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    
	}


