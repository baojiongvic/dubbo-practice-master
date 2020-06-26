package com.baojiong.dubbo.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 源程序名称：ProviderFilter <br>
 * 源程序包名：com.baojiong.dubbo.filter <br>
 * 软件著作权：恒生电子股份有限公司 版权所有 <br>
 * 系统名称：dubbo-practice <br>
 * 开发时间：2020/6/26 1:19 下午 <br>
 *
 * @author baojiong20176
 */
@Activate(group = "provider")
public class ProviderFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ProviderFilter.class);


    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        logger.info("成功调用");
        return invoker.invoke(invocation);
    }
}
