package io.github.elkan1788.osc.adminlte2.modules;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

/**
 * 首页信息入口
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 1.0
 */
@At("/admin")
@IocBean
public class HomeModule {

    @At("/index")
    @Ok("beetl:index.btl")
    public void homePage() {

    }

    @At("/alte2")
    @Ok("beetl:alte2.btl")
    public void lte2Page() {

    }
}
