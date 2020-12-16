package benefit.banking.Entity;

import java.sql.Date;

public class User
{
private String commitId;
private String name;
private String email;
private int roleId;
private int od;
private boolean isActive;
private String createdBy;
private Date createdOn;
public User()
{

}
    public User(String commitId, String name, String email, int roleId, int od, boolean isActive, String createdBy, Date createdOn) {
        this.commitId = commitId;
        this.name = name;
        this.email = email;
        this.roleId = roleId;
        this.od = od;
        this.isActive = isActive;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
    }

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getOd() {
        return od;
    }

    public void setOd(int od) {
        this.od = od;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
