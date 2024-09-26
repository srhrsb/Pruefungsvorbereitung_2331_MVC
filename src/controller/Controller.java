package controller;

import DAO.LicenseDAO;
import model.LicenseType;

public class Controller {

    private LicenseDAO licenseDB;

    public Controller(LicenseDAO licenseDB) {
        this.licenseDB = licenseDB;
    }

    public static void main(String[] args) {

            new Controller( new LicenseDAO() );

    }
}