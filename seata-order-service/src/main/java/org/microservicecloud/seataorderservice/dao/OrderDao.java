package org.microservicecloud.seataorderservice.dao;

import org.apache.ibatis.annotations.Param;
import org.microservicecloud.seataorderservice.domain.Order;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
