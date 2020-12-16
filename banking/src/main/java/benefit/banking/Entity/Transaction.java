package benefit.banking.Entity;

import java.sql.Date;
import java.util.Arrays;

public class Transaction
{
    private int benefitID;
    private int hc;
    private String mode;
    private String employee_Name;
    private String req_Type;
    private String req_No;
    private String od;
    private String lob;
    private String target_Req;
    private String source_Req;
    private String ats_Id;
    private String gdn_Project_Id;
    private Boolean check_Taleo;
    private String sdl_Created_By;
    private Date sdl_Updated_On;
    private String benefit_Status;
    private Boolean od_Req_Check;
    private Boolean od_Conflict_with_Global_Benefit;
    private String od_Comments;
    private byte od_Attchments[];
    private String od_Created_By;
    private Date od_Updated_On;
    private Boolean hr_Req_Closure_Check;
    private Boolean hr_Req_Type_Check;
    private Boolean hr_Attrition_Check;
    private Boolean hr_IJP_Check;
    private String hr_Comments;
    private byte hr_Attachments[];
    private String hr_Created_By;
    private Date hr_Updated_On;
    private Boolean gdn_GDN_Project_Id_Check;
    private Boolean gdn_TFS_Id_Generation;
    private String  gdn_Comments;
    private byte gdn_AttachmentS[];
    private String gdn_Created_By;
    private Date gdn_Updated_On;
    private Boolean finance_HC_Forecast_Reduction;
    private Boolean finance_New_Req_Check;
    private Boolean finance_Global_Benefit_Check;
    private Boolean finance_Obtain_Approval_From_Global_Finance;
    private String finance_Comments;
    private byte finance_Attachments[];
    private String finance_Created_By;
    private Date finance_Updated_On;
    private String status;
    public Transaction()
    {

    }

    public Transaction(int benefitID, int hc, String mode, String employee_Name, String req_Type, String req_No, String od, String lob, String target_Req, String source_Req, String ats_Id, String gdn_Project_Id, Boolean check_Taleo, String sdl_Created_By, Date sdl_Updated_On, String benefit_Status, Boolean od_Req_Check, Boolean od_Conflict_with_Global_Benefit, String od_Comments, byte[] od_Attchments, String od_Created_By, Date od_Updated_On, Boolean hr_Req_Closure_Check, Boolean hr_Req_Type_Check, Boolean hr_Attrition_Check, Boolean hr_IJP_Check, String hr_Comments, byte[] hr_Attachments, String hr_Created_By, Date hr_Updated_On, Boolean gdn_GDN_Project_Id_Check, Boolean gdn_TFS_Id_Generation, String gdn_Comments, byte[] gdn_AttachmentS, String gdn_Created_By, Date gdn_Updated_On, Boolean finance_HC_Forecast_Reduction, Boolean finance_New_Req_Check, Boolean finance_Global_Benefit_Check, Boolean finance_Obtain_Approval_From_Global_Finance, String finance_Comments, byte[] finance_Attachments, String finance_Created_By, Date finance_Updated_On,String status) {
        this.benefitID = benefitID;
        this.hc = hc;
        this.mode = mode;
        this.employee_Name = employee_Name;
        this.req_Type = req_Type;
        this.req_No = req_No;
        this.od = od;
        this.lob = lob;
        this.target_Req = target_Req;
        this.source_Req = source_Req;
        this.ats_Id = ats_Id;
        this.gdn_Project_Id = gdn_Project_Id;
        this.check_Taleo = check_Taleo;
        this.sdl_Created_By = sdl_Created_By;
        this.sdl_Updated_On = sdl_Updated_On;
        this.benefit_Status = benefit_Status;
        this.od_Req_Check = od_Req_Check;
        this.od_Conflict_with_Global_Benefit = od_Conflict_with_Global_Benefit;
        this.od_Comments = od_Comments;
        this.od_Attchments = od_Attchments;
        this.od_Created_By = od_Created_By;
        this.od_Updated_On = od_Updated_On;
        this.hr_Req_Closure_Check = hr_Req_Closure_Check;
        this.hr_Req_Type_Check = hr_Req_Type_Check;
        this.hr_Attrition_Check = hr_Attrition_Check;
        this.hr_IJP_Check = hr_IJP_Check;
        this.hr_Comments = hr_Comments;
        this.hr_Attachments = hr_Attachments;
        this.hr_Created_By = hr_Created_By;
        this.hr_Updated_On = hr_Updated_On;
        this.gdn_GDN_Project_Id_Check = gdn_GDN_Project_Id_Check;
        this.gdn_TFS_Id_Generation = gdn_TFS_Id_Generation;
        this.gdn_Comments = gdn_Comments;
        this.gdn_AttachmentS = gdn_AttachmentS;
        this.gdn_Created_By = gdn_Created_By;
        this.gdn_Updated_On = gdn_Updated_On;
        this.finance_HC_Forecast_Reduction = finance_HC_Forecast_Reduction;
        this.finance_New_Req_Check = finance_New_Req_Check;
        this.finance_Global_Benefit_Check = finance_Global_Benefit_Check;
        this.finance_Obtain_Approval_From_Global_Finance = finance_Obtain_Approval_From_Global_Finance;
        this.finance_Comments = finance_Comments;
        this.finance_Attachments = finance_Attachments;
        this.finance_Created_By = finance_Created_By;
        this.finance_Updated_On = finance_Updated_On;
        this.status=status;
    }

    public int getBenefitID() {
        return benefitID;
    }

    public void setBenefitID(int benefitID) {
        this.benefitID = benefitID;
    }

    public int getHc() {
        return hc;
    }

    public void setHc(int hc) {
        this.hc = hc;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getEmployee_Name() {
        return employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        this.employee_Name = employee_Name;
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

    public Boolean getOd_Req_Check() {
        return od_Req_Check;
    }

    public void setOd_Req_Check(Boolean od_Req_Check) {
        this.od_Req_Check = od_Req_Check;
    }

    public Boolean getOd_Conflict_with_Global_Benefit() {
        return od_Conflict_with_Global_Benefit;
    }

    public void setOd_Conflict_with_Global_Benefit(Boolean od_Conflict_with_Global_Benefit) {
        this.od_Conflict_with_Global_Benefit = od_Conflict_with_Global_Benefit;
    }

    public String getOd_Comments() {
        return od_Comments;
    }

    public void setOd_Comments(String od_Comments) {
        this.od_Comments = od_Comments;
    }

    public byte[] getOd_Attchments() {
        return od_Attchments;
    }

    public void setOd_Attchments(byte[] od_Attchments) {
        this.od_Attchments = od_Attchments;
    }

    public String getOd_Created_By() {
        return od_Created_By;
    }

    public void setOd_Created_By(String od_Created_By) {
        this.od_Created_By = od_Created_By;
    }

    public Date getOd_Updated_On() {
        return od_Updated_On;
    }

    public void setOd_Updated_On(Date od_Updated_On) {
        this.od_Updated_On = od_Updated_On;
    }

    public Boolean getHr_Req_Closure_Check() {
        return hr_Req_Closure_Check;
    }

    public void setHr_Req_Closure_Check(Boolean hr_Req_Closure_Check) {
        this.hr_Req_Closure_Check = hr_Req_Closure_Check;
    }

    public Boolean getHr_Req_Type_Check() {
        return hr_Req_Type_Check;
    }

    public void setHr_Req_Type_Check(Boolean hr_Req_Type_Check) {
        this.hr_Req_Type_Check = hr_Req_Type_Check;
    }

    public Boolean getHr_Attrition_Check() {
        return hr_Attrition_Check;
    }

    public void setHr_Attrition_Check(Boolean hr_Attrition_Check) {
        this.hr_Attrition_Check = hr_Attrition_Check;
    }

    public Boolean getHr_IJP_Check() {
        return hr_IJP_Check;
    }

    public void setHr_IJP_Check(Boolean hr_IJP_Check) {
        this.hr_IJP_Check = hr_IJP_Check;
    }

    public String getHr_Comments() {
        return hr_Comments;
    }

    public void setHr_Comments(String hr_Comments) {
        this.hr_Comments = hr_Comments;
    }

    public byte[] getHr_Attachments() {
        return hr_Attachments;
    }

    public void setHr_Attachments(byte[] hr_Attachments) {
        this.hr_Attachments = hr_Attachments;
    }

    public String getHr_Created_By() {
        return hr_Created_By;
    }

    public void setHr_Created_By(String hr_Created_By) {
        this.hr_Created_By = hr_Created_By;
    }

    public Date getHr_Updated_On() {
        return hr_Updated_On;
    }

    public void setHr_Updated_On(Date hr_Updated_On) {
        this.hr_Updated_On = hr_Updated_On;
    }

    public Boolean getGdn_GDN_Project_Id_Check() {
        return gdn_GDN_Project_Id_Check;
    }

    public void setGdn_GDN_Project_Id_Check(Boolean gdn_GDN_Project_Id_Check) {
        this.gdn_GDN_Project_Id_Check = gdn_GDN_Project_Id_Check;
    }

    public Boolean getGdn_TFS_Id_Generation() {
        return gdn_TFS_Id_Generation;
    }

    public void setGdn_TFS_Id_Generation(Boolean gdn_TFS_Id_Generation) {
        this.gdn_TFS_Id_Generation = gdn_TFS_Id_Generation;
    }

    public String getGdn_Comments() {
        return gdn_Comments;
    }

    public void setGdn_Comments(String gdn_Comments) {
        this.gdn_Comments = gdn_Comments;
    }

    public byte[] getGdn_AttachmentS() {
        return gdn_AttachmentS;
    }

    public void setGdn_AttachmentS(byte[] gdn_AttachmentS) {
        this.gdn_AttachmentS = gdn_AttachmentS;
    }

    public String getGdn_Created_By() {
        return gdn_Created_By;
    }

    public void setGdn_Created_By(String gdn_Created_By) {
        this.gdn_Created_By = gdn_Created_By;
    }

    public Date getGdn_Updated_On() {
        return gdn_Updated_On;
    }

    public void setGdn_Updated_On(Date gdn_Updated_On) {
        this.gdn_Updated_On = gdn_Updated_On;
    }

    public Boolean getFinance_HC_Forecast_Reduction() {
        return finance_HC_Forecast_Reduction;
    }

    public void setFinance_HC_Forecast_Reduction(Boolean finance_HC_Forecast_Reduction) {
        this.finance_HC_Forecast_Reduction = finance_HC_Forecast_Reduction;
    }

    public Boolean getFinance_New_Req_Check() {
        return finance_New_Req_Check;
    }

    public void setFinance_New_Req_Check(Boolean finance_New_Req_Check) {
        this.finance_New_Req_Check = finance_New_Req_Check;
    }

    public Boolean getFinance_Global_Benefit_Check() {
        return finance_Global_Benefit_Check;
    }

    public void setFinance_Global_Benefit_Check(Boolean finance_Global_Benefit_Check) {
        this.finance_Global_Benefit_Check = finance_Global_Benefit_Check;
    }

    public Boolean getFinance_Obtain_Approval_From_Global_Finance() {
        return finance_Obtain_Approval_From_Global_Finance;
    }

    public void setFinance_Obtain_Approval_From_Global_Finance(Boolean finance_Obtain_Approval_From_Global_Finance) {
        this.finance_Obtain_Approval_From_Global_Finance = finance_Obtain_Approval_From_Global_Finance;
    }

    public String getFinance_Comments() {
        return finance_Comments;
    }

    public void setFinance_Comments(String finance_Comments) {
        this.finance_Comments = finance_Comments;
    }

    public byte[] getFinance_Attachments() {
        return finance_Attachments;
    }

    public void setFinance_Attachments(byte[] finance_Attachments) {
        this.finance_Attachments = finance_Attachments;
    }

    public String getFinance_Created_By() {
        return finance_Created_By;
    }

    public void setFinance_Created_By(String finance_Created_By) {
        this.finance_Created_By = finance_Created_By;
    }

    public Date getFinance_Updated_On() {
        return finance_Updated_On;
    }

    public void setFinance_Updated_On(Date finance_Updated_On) {
        this.finance_Updated_On = finance_Updated_On;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "benefitID=" + benefitID +
                ", hc=" + hc +
                ", mode='" + mode + '\'' +
                ", employee_Name='" + employee_Name + '\'' +
                ", req_Type='" + req_Type + '\'' +
                ", req_No='" + req_No + '\'' +
                ", od='" + od + '\'' +
                ", lob='" + lob + '\'' +
                ", target_Req='" + target_Req + '\'' +
                ", source_Req='" + source_Req + '\'' +
                ", ats_Id='" + ats_Id + '\'' +
                ", gdn_Project_Id='" + gdn_Project_Id + '\'' +
                ", check_Taleo=" + check_Taleo +
                ", sdl_Created_By='" + sdl_Created_By + '\'' +
                ", sdl_Updated_On=" + sdl_Updated_On +
                ", benefit_Status='" + benefit_Status + '\'' +
                ", od_Req_Check=" + od_Req_Check +
                ", od_Conflict_with_Global_Benefit=" + od_Conflict_with_Global_Benefit +
                ", od_Comments='" + od_Comments + '\'' +
                ", od_Attchments=" + Arrays.toString(od_Attchments) +
                ", od_Created_By='" + od_Created_By + '\'' +
                ", od_Updated_On=" + od_Updated_On +
                ", hr_Req_Closure_Check=" + hr_Req_Closure_Check +
                ", hr_Req_Type_Check=" + hr_Req_Type_Check +
                ", hr_Attrition_Check=" + hr_Attrition_Check +
                ", hr_IJP_Check=" + hr_IJP_Check +
                ", hr_Comments='" + hr_Comments + '\'' +
                ", hr_Attachments=" + Arrays.toString(hr_Attachments) +
                ", hr_Created_By='" + hr_Created_By + '\'' +
                ", hr_Updated_On=" + hr_Updated_On +
                ", gdn_GDN_Project_Id_Check=" + gdn_GDN_Project_Id_Check +
                ", gdn_TFS_Id_Generation=" + gdn_TFS_Id_Generation +
                ", gdn_Comments='" + gdn_Comments + '\'' +
                ", gdn_AttachmentS=" + Arrays.toString(gdn_AttachmentS) +
                ", gdn_Created_By='" + gdn_Created_By + '\'' +
                ", gdn_Updated_On=" + gdn_Updated_On +
                ", finance_HC_Forecast_Reduction=" + finance_HC_Forecast_Reduction +
                ", finance_New_Req_Check=" + finance_New_Req_Check +
                ", finance_Global_Benefit_Check=" + finance_Global_Benefit_Check +
                ", finance_Obtain_Approval_From_Global_Finance=" + finance_Obtain_Approval_From_Global_Finance +
                ", finance_Comments='" + finance_Comments + '\'' +
                ", finance_Attachments=" + Arrays.toString(finance_Attachments) +
                ", finance_Created_By='" + finance_Created_By + '\'' +
                ", finance_Updated_On=" + finance_Updated_On +
                '}';
    }
}
