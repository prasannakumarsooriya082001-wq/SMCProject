
package smcproject.ProfilePage;


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
