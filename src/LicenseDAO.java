import model.License;
import model.LicenseType;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class LicenseDAO {

    private List<License> licenseList;
    private List<User> userList;


    public LicenseDAO()
    {
        licenseList = new ArrayList<>();
    }

    public boolean addLicense(int id, String softwareName, LicenseType type, int userId){

        //Implementieren Sie die Funktion:
        //erzeugen Sie eine Lizenz aus obigen Daten
        //und weisen sie diese der Liste zu

        License license = new License( id, softwareName, type, userId);
        return licenseList.add(license);
    }

    public boolean addUser(int id, String firstName, String lastName){

        //Implementieren Sie die Funktion:
        //erzeugen Sie eine Lizenz aus obigen Daten
        //und weisen sie diese der Liste zu

        User user = new User( id, firstName, lastName);
        return userList.add(user);
    }



}
