package app.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 52400 on 2017/6/20.
 */
@Table(name = "role")
@Entity
//这是与系统管理相关的角色
public class SysRoleDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;

    @ManyToMany
    @JoinTable(
            name = "role_permission",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "permission_id")})
    private List<SysPermissionDO> listPermission;

    @OneToMany
    private List<UserDO> userDO;

    public List<SysPermissionDO> getListPermission() {
        return listPermission;
    }

    public void setListPermission(List<SysPermissionDO> listPermission) {
        this.listPermission = listPermission;
    }

    public List<UserDO> getUserDO() {
        return userDO;
    }

    public void setUserDO(List<UserDO> userDO) {
        this.userDO = userDO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}