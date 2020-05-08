package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * The interface Seckill dao.
 */
public interface SeckillDao {

    /**
     * 减库存
     *
     * @param seckillId the seckill id
     * @param killTime  the kill time
     * @return the int 更新行数
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     * 根据id查找秒杀对象
     *
     * @param seckillId the seckill id
     * @return the seckill
     */
    Seckill queryById(long seckillId);

    /**
     * 偏移量查询秒杀商品列表
     *
     * @param offset the offset
     * @param limit  the limit
     * @return the list
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
