/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smcproject.ProfilePage;

/**
 *
 * @author PRASANNA KUMAR
 */
public class ProfileService 
{
    public ProfileModel profileData()throws Exception {

        ProfileDAO dao = new ProfileDAO();

        return dao.getProfile();
    }

    public void update(ProfileModel pm)throws Exception {

        ProfileDAO dao = new ProfileDAO();

        dao.updateProfile(pm);
    }
    
}
