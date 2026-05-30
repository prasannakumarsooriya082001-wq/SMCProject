
package smcproject.RegisterPage;


public class RegisterModel
{
    private String username;
    private String email;
    private String phonumber;
    private String address;
    private String password;

    public RegisterModel() {
    }

    public RegisterModel(String username, String email, String phonumber, String address, String password) {
        this.username = username;
        this.email = email;
        this.phonumber = phonumber;
        this.address = address;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonumber() {
        return phonumber;
    }

    public void setPhonumber(String phonumber) {
        this.phonumber = phonumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
