
package smcproject.RegisterPage;

import java.sql.SQLException;

public class RegisterService 
{
    public String createuser(RegisterModel rm) throws ClassNotFoundException, SQLException 
    {
        RegisterDAO rd = new RegisterDAO();

        
        
        if(rm.getUsername().isEmpty() || rm.getEmail().isEmpty() 
           || rm.getAddress().isEmpty() || rm.getPhonumber().isEmpty() || rm.getPassword().isEmpty())
        {
            return "Enter all Details";
        }
        else
        {
            int result = rd.insertuser(rm);
            if (result > 0)
            {
                return "Register Succesfully...";
            } else 
            {
                return "Email already exit!";
            }
        }        
    }
}
