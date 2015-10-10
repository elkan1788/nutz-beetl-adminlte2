package io.github.elkan1788.osc.adminlte2;

import org.beetl.ext.nutz.BeetlViewMaker;
import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Views;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * AdminLTE2 入口
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 1.0
 */
@Modules(scanPackage = true)
@IocBy(type = ComboIocProvider.class, args = {/* "*js", "ioc/", */
        "*anno", "io.github.elkan1788.osc.adminlte2"
})
@Encoding(input = "UTF8", output = "UTF8")
@Ok("json")
@Fail("json")
@Views({ BeetlViewMaker.class })
public class MainModule {


}
