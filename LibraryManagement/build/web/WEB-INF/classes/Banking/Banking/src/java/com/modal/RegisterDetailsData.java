package com.modal;

public class RegisterDetailsData 
{
	private String name;
	private String uname;
	private String password;
        private String address;
        private String phonenumber;
        private String pandetails;
        private String dob;
        private String nationality;
        private int accountnumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
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

        /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
   
       
    public String getPhoneNumber() {
        return phonenumber;
    }

        public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

        public String getPanDetails() {
        return pandetails;
    }

        public void setPanDetails(String pandetails) {
        this.pandetails = pandetails;
    }
    
        public String getDob() {
        return dob;
    }
    
        public void setDob(String dob) {
        this.dob = dob;
    }

        public String getNationality() {
        return nationality;
    }

        public void setNationality(String nationality) {
        this.nationality = nationality;
    }

        public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    } 
   
}