
package smcproject.PasswordPage;


public class PasswordModel 
{
    private String newpass;
    private String confirmpass;
    private String email;

    public PasswordModel() {
    }

    public PasswordModel(String newpass, String confirmpass, String email) {
        this.newpass = newpass;
        this.confirmpass = confirmpass;
        this.email = email;
    }

    public String getNewpass() {
        return newpass;
    }

    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }

    public String getConfirmpass() {
        return confirmpass;
    }

    public void setConfirmpass(String confirmpass) {
        this.confirmpass = confirmpass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
