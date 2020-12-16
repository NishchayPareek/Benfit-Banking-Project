package benefit.banking.Entity;

import java.sql.Date;

public class IJP
{
    private String employee_Name;
    private String od;
    private String lob;
    private String target_Req;
    private String source_Req;
    private String sdl_Created_By;
    private Date sdl_Updated_On;
    private String benefit_Status;

    public IJP() {

    }

    public IJP(String employee_Name, String od, String lob, String target_Req, String source_Req, String sdl_Created_By, Date sdl_Updated_On, String benefit_Status) {
        this.employee_Name = employee_Name;
        this.od = od;
        this.lob = lob;
        this.target_Req = target_Req;
        this.source_Req = source_Req;
        this.sdl_Created_By = sdl_Created_By;
        this.sdl_Updated_On = sdl_Updated_On;
        this.benefit_Status = benefit_Status;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
    }

    public String getOd() {
        return od;
    }

    public void setOd(String od) {
        this.od = od;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getTarget_Req() {
        return target_Req;
    }

    public void setTarget_Req(String target_Req) {
        this.target_Req = target_Req;
    }

    public String getSource_Req() {
        return source_Req;
    }

    public void setSource_Req(String source_Req) {
        this.source_Req = source_Req;
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
        return "IJP{" +
                "employee_Name='" + employee_Name + '\'' +
                ", od='" + od + '\'' +
                ", lob='" + lob + '\'' +
                ", target_Req='" + target_Req + '\'' +
                ", source_Req='" + source_Req + '\'' +
                ", sdl_Created_By='" + sdl_Created_By + '\'' +
                ", sdl_Updated_On=" + sdl_Updated_On +
                ", benefit_Status='" + benefit_Status + '\'' +
                '}';
    }
}
