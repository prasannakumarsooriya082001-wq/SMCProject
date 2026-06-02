
package smcproject.Loginpage1;

import java.sql.SQLException;


public class LoginService 
{
    public int  login(LoginModel lm) throws ClassNotFoundException, SQLException
    {
        if(lm.getUserName().isEmpty() || lm.getPassWord().isEmpty())
        {
            return -1;
        }
        else
        {
            LoginDAO ld = new LoginDAO();
            int res = ld.userLogin(lm);
            
            if(res > 0)
            {
                return 1;
            }
            else {
                return 0;
            }
        }
        
    }
}
