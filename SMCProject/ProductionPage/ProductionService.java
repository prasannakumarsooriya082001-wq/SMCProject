
package smcproject.ProductionPage;

import java.sql.SQLException;
import java.util.List;



public class ProductionService
{
    ProductionDAO pd = new ProductionDAO();
    
    public List getAllProduction() throws ClassNotFoundException, SQLException
    {
        List list = pd.productions();
        return list;
    }
}
