
package smcproject.Loginpage1;


public class LoginModel 
{
    private String userName;
    private String PassWord;

    public LoginModel() 
    {
        
    }

    public LoginModel(String userName, String PassWord) 
    {
        this.userName = userName;
        this.PassWord = PassWord;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    
}
