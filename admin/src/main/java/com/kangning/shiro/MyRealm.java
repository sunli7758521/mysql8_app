package com.kangning.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 类的功能描述.
 * shiro 认证
 *
 * @Auther hxy
 * @Date 2017/4/27
 */
@Component
public class MyRealm extends AuthorizingRealm {

    private static final Logger log = LoggerFactory.getLogger(MyRealm.class);

//    @Autowired
//    private SysUserService sysUserService;
//    @Autowired
//    private SysRoleService roleService;
//    @Autowired
//    private SysMenuService menuService;
//    @Autowired
//    private PasswordService passwordService;
//    @Autowired
//    private UserLoginLogService userLoginLogService;
//


    /**
     * 授权
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals)
    {
//        SysUser user = ShiroUtils.getUserEntity();

        // 角色列表

        Set<String> roles = new HashSet<String>();
        // 功能列表
        Set<String> menus = new HashSet<String>();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 管理员拥有所有权限
//        if (user.isAdmin())
//        {
//            info.addRole("admin");
//            info.addStringPermission("*:*:*");
//        }
//        else
//        {
//            roles = roleService.selectRoleKeys(user.getUserId());
//            menus = menuService.selectPermsByUserId(user.getUserId());
//            // 角色加入AuthorizationInfo认证对象
//            info.setRoles(roles);
//            // 权限加入AuthorizationInfo认证对象
//            info.setStringPermissions(menus);
//        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String phone = upToken.getUsername();
        String password = "";
        if (upToken.getPassword() != null)
        {
            password = new String(upToken.getPassword());
        }
//        SysUser user = sysUserService.selectPhoneByUser(phone);
//        if(user == null){
//            throw new  AuthenticationException("对不起没有该手机号");
//        }
//        if (!user.getPhonenumber().equalsIgnoreCase(phone)){
//            throw new  AuthenticationException("对不起手机号输入错误");
//        }
//
//        if (!user.getPassword().equalsIgnoreCase(passwordService.encryptPassword(user.getLoginName(),password,user.getSalt()))){
//            throw new  AuthenticationException("对不起手机号或密码错误");
//        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(null, password, getName());
//
//        Integer userId =user.getUserId();
//        System.out.println(userId);
//                if (userId>0){
//                    Date qwer = DateUtils.getNowDate();
//                    userLoginLogService.xinxi(userId,qwer);
//                }
//
//

        return info;

    }

    /**
     * 清理缓存权限
     */
    public void clearCachedAuthorizationInfo()
    {
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}
