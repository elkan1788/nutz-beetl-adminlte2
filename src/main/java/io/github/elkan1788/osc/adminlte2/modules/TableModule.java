package io.github.elkan1788.osc.adminlte2.modules;

import java.util.ArrayList;
import java.util.List;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;
import org.nutz.mvc.annotation.Param;

/**
 * 表格入口
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 2015年10月13日
 */
@At("/admin/table")
@IocBean
public class TableModule {

    @At("/datagrid")
    @Ok("beetl:table/datagrid.btl")
    public void dataGrid() {

    }

    @POST
    @At("/data")
    public NutMap data(@Param("start") int start,
                       @Param("length") int length,
                       @Param("draw") int draw,
                       @Param("search[value]") String search) {
        NutMap nm = new NutMap();
        List<Object[]> datas = new ArrayList<Object[]>();
        int totalLength = 156;
        int loop = (start + length) <= totalLength ? (start + length) : totalLength;
        search = Strings.sBlank(search, null);
        for (int i = start; i < loop; i++) {
            Object[] data = new Object[5];
            if (i % 2 == 0) {
                if (!Strings.isBlank(search) && !Strings.equals(search, "A")) {
                    continue;
                }
                data[0] = "Gecko " + (i + 1);
                data[1] = "Firefox 1.0";
                data[2] = "Win 98+ / OSX.2+";
                data[3] = 1.7;
                data[4] = "A";
            }
            else if (i % 2 != 0) {
                if (!Strings.isBlank(search) && !Strings.equals(search, "D")) {
                    continue;
                }
                data[0] = "Gecko " + (i + 1);
                data[1] = "Netscape Browser 8";
                data[2] = "Win 98SE+";
                data[3] = 1.8;
                data[4] = "D";
            }
            datas.add(data);
        }
        nm.put("draw", draw);
        nm.put("recordsTotal", totalLength);
        nm.put("recordsFiltered", totalLength);
        nm.put("data", datas);
        return nm;
    }

}
