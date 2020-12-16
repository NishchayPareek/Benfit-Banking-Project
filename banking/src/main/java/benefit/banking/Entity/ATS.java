package benefit.banking.Entity;

import java.sql.Date;

public class ATS
{
    private String ats_Id;
    private String gdn_Project_Id;
    private Boolean check_Taleo;
    private String sdl_Created_By;
    private Date sdl_Updated_On;
    private String benefit_Status;
    public ATS()
    {}

    public ATS(String ats_Id, String gdn_Project_Id, Boolean check_Taleo, String sdl_Created_By, Date sdl_Updated_On, String benefit_Status) {
        this.ats_Id = ats_Id;
        this.gdn_Project_Id = gdn_Project_Id;
        this.check_Taleo = check_Taleo;
        this.sdl_Created_By = sdl_Created_By;
        this.sdl_Updated_On = sdl_Updated_On;
        this.benefit_Status = benefit_Status;
    }

    public String getAts_Id() {
        return ats_Id;
    }

    public void setAts_Id(String ats_Id) {
        this.ats_Id = ats_Id;
    }

    public String getGdn_Project_Id() {
        return gdn_Project_Id;
    }

    public void setGdn_Project_Id(String gdn_Project_Id) {
        this.gdn_Project_Id = gdn_Project_Id;
    }

    public Boolean getCheck_Taleo() {
        return check_Taleo;
    }

    public void setCheck_Taleo(Boolean check_Taleo) {
        this.check_Taleo = check_Taleo;
    }

    public String getSdl_Created_By() {
        return sdl_Created_By;
    }

    public void setSdl_Created_By(String sdl_Created_By) {
        this.sdl_Created_By = sdl_Created_By;
    }

    public Date getSdl_Updated_On() {
        return sdl_Updated_On;
    }

    public void setSdl_Updated_On(Date sdl_Updated_On) {
        this.sdl_Updated_On = sdl_Updated_On;
    }

    public String getBenefit_Status() {
        return benefit_Status;
    }

    public void setBenefit_Status(String benefit_Status) {
        this.benefit_Status = benefit_Status;
    }

    @Override
    public String toString() {
        return "ATS{" +
                "ats_Id='" + ats_Id + '\'' +
                ", gdn_Project_Id='" + gdn_Project_Id + '\'' +
                ", check_Taleo=" + check_Taleo +
                ", sdl_Created_By='" + sdl_Created_By + '\'' +
                ", sdl_Updated_On=" + sdl_Updated_On +
                ", benefit_Status='" + benefit_Status + '\'' +
                '}';
    }
}
