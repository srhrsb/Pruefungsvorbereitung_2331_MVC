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

    /**
     * Fügt einen User hinzu
     * @param id Userid
     * @param firstName Vorname
     * @param lastName Nachname
     * @return Erfolg
     */
    public boolean addUser(int id, String firstName, String lastName){

        //Implementieren Sie die Funktion:
        //erzeugen Sie eine Lizenz aus obigen Daten
        //und weisen sie diese der Liste zu

        User user = new User( id, firstName, lastName);
        return userList.add(user);
    }

    /**
     * Gibt den User mit der gegebenen Id zurück
     * @param id ID des Users
     * @return User oder NULL
     */
    public User getUserById( int id){

      for( User user : userList){
          if(user.getId() == id){
              return user;
          }
      }

      return null;
    }

    /**
     * Gibt die Lizenz mit der gegebenen Id zurück
     * @param id ID der Lizenz
     * @return Lizenz oder NULL
     */
    public License getLicenseById( int id){

        for( License license : licenseList){
            if(license.getId() == id){
                return license;
            }
        }

        return null;
    }

    /**
     * Löscht User mit gegebener Id
     * @return Erfolg
     */
    public boolean deleteUserById(){




        return false;
    }

    /**
     * Prüft ob die LizenzId noch nicht vergeben wurde
     * @param id LizenzId
     * @return Erfolg
     */
    public boolean isLicenseIdUnique( int id ){




        return false;
    }

    /**
     * Prüft ob die UserId noch nicht vergeben wurde
     * @param id UserId
     * @return Erfolg
     */
    public boolean isUserIdUnique( int id ){



        return false;
    }













}
