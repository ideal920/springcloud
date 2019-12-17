package org.microservicecloud.sentinelservice.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.microservicecloud.sentinelservice.domain.CommonResult;

/**
 * Created by wyc on 2019/11/7.
 */
public class CustomBlockHandler {

    public CommonResult handleException(BlockException exception){
        return new CommonResult("自定义限流信息",200);
    }
}
