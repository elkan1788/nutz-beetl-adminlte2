package io.github.elkan1788.osc.adminlte2.modules;

import java.util.HashMap;
import java.util.Map;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Param;

/**
 * 登录会话模块
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 1.0
 */
@At("/admin/login")
@IocBean
public class LoginModule {

    private static final Log log = Logs.get();

    @At("/check")
    public Object checkLogin(@Param("account") String account, @Param("password") String password) {
        log.infof("Login check value: [%s - %s].", account, password);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("act", account);
        result.put("id", 100);
        result.put("cnt", 10);
        result.put("home", "admin/index.ntz");
        return result;
    }
}
