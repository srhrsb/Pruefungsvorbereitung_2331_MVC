package model;

public class License {
    private int id;
    private String softwareName;
    private LicenseType licenseType;

    private int userId;

    public License(int clientID, String softwareName, LicenseType licenseType, int userId) {
        this.id = clientID;
        this.softwareName = softwareName;
        this.licenseType = licenseType;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

}
