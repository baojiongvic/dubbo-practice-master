package com.baojiong.dubbo.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 源程序名称：ComsumerFilter <br>
 * 源程序包名：com.baojiong.dubbo.filter <br>
 * 软件著作权：恒生电子股份有限公司 版权所有 <br>
 * 系统名称：dubbo-practice <br>
 * 开发时间：2020/6/26 1:39 下午 <br>
 *
 * @author baojiong20176
 */
public class ConsumerFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        logger.info("已发送请求");
        return invoker.invoke(invocation);
    }
}
