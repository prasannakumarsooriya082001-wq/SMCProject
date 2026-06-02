
package smcproject.PasswordPage;

import java.sql.SQLException;



public class PasswordService 
{
    public int pass(PasswordModel pm) throws ClassNotFoundException, SQLException
    {
        if(pm.getConfirmpass().equals(pm.getNewpass()))
        {
            PasswordDAO pd = new PasswordDAO();
            int res = pd.setPassword(pm);
            if(res > 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return -1;
        }
    }
}
