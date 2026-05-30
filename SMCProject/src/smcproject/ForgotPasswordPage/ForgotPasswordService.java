
package smcproject.ForgotPasswordPage;

import java.sql.SQLException;


public class ForgotPasswordService
{
    public int changePass(ForgotPasswordModel fm) throws ClassNotFoundException, SQLException
    {
        if(fm.getEmail().isEmpty())
        {
            return -1;
        }
        else
        {
            ForgotPasswordDAO fd = new ForgotPasswordDAO();
            int res = fd.setPassword(fm);
            
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
