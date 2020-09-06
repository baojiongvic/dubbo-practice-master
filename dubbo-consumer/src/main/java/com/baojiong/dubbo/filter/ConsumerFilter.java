package com.baojiong.dubbo.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
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
