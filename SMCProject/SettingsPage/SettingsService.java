
package smcproject.SettingsPage;

import smcproject.ProfilePage.ProfileDAO;
import smcproject.ProfilePage.ProfileModel;


public class SettingsService
{
    public SettingsModel profileData()throws Exception {

        SettingsDAO sd = new SettingsDAO();

        return sd.getProfile();
    }

    public void update(SettingsModel sm)throws Exception {

        SettingsDAO sd = new SettingsDAO();

        sd.updateProfile(sm);
    }
    
    public SettingsModel companyData()throws Exception {

        SettingsDAO sd = new SettingsDAO();

        return sd.getComapany();
    }
    
    
    public void updatecomapny(SettingsModel sm)throws Exception {

        SettingsDAO sd = new SettingsDAO();

        sd.updateCompany(sm);
    }
    
}
