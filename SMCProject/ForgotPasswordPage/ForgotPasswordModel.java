
package smcproject.ForgotPasswordPage;

public class ForgotPasswordModel 
{
    private String email;
    public static String userEmail;

    public ForgotPasswordModel() {
    }

    public ForgotPasswordModel(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
