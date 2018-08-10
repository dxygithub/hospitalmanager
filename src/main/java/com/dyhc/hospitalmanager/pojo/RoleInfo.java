package com.dyhc.hospitalmanager.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_info", schema = "hospital_test_manager_db", catalog = "")
public class RoleInfo {
    private int roleInfoId;
    private String roleName;
    private String userName;
    private String password;
    private String deskId;
    private int roleTypeId;

    @Id
    @Column(name = "role_info_id")
    public int getRoleInfoId() {
        return roleInfoId;
    }

    public void setRoleInfoId(int roleInfoId) {
        this.roleInfoId = roleInfoId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "desk_id")
    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    @Basic
    @Column(name = "role_type_id")
    public int getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(int roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleInfo roleInfo = (RoleInfo) o;
        return roleInfoId == roleInfo.roleInfoId &&
                roleTypeId == roleInfo.roleTypeId &&
                Objects.equals(roleName, roleInfo.roleName) &&
                Objects.equals(userName, roleInfo.userName) &&
                Objects.equals(password, roleInfo.password) &&
                Objects.equals(deskId, roleInfo.deskId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roleInfoId, roleName, userName, password, deskId, roleTypeId);
    }
}
