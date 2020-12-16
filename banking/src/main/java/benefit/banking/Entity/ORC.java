package benefit.banking.Entity;

import org.springframework.stereotype.Component;

import java.sql.Date;

public class ORC {

    private String req_Type;
    private String req_No;
    private String sdl_Created_By;
    private Date sdl_Updated_On;
    private String benefit_Status;
    public ORC()
    {

    }

    public ORC(String req_Type, String req_No, String sdl_Created_By, Date sdl_Updated_On, String benefit_Status) {
        this.req_Type = req_Type;
        this.req_No = req_No;
        this.sdl_Created_By = sdl_Created_By;
        this.sdl_Updated_On = sdl_Updated_On;
        this.benefit_Status = benefit_Status;
    }

    public String getReq_Type() {
        return req_Type;
    }

    public void setReq_Type(String req_Type) {
        this.req_Type = req_Type;
    }

    public String getReq_No() {
        return req_No;
    }

    public void setReq_No(String req_No) {
        this.req_No = req_No;
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
        return "ORC{" +
                "req_Type='" + req_Type + '\'' +
                ", req_No='" + req_No + '\'' +
                ", sdl_Created_By='" + sdl_Created_By + '\'' +
                ", sdl_Updated_On=" + sdl_Updated_On +
                ", benefit_Status='" + benefit_Status + '\'' +
                '}';
    }
}

