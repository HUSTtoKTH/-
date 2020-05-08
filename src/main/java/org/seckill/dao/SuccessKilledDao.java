package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * The interface Success killed dao.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细, 可过滤重复
     *
     * @param seckillId the seckill id
     * @param userPhone the user phone
     * @return the int 插入的行数
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

    /**
     * 根据 id查询success killed???
     *
     * @param seckillId the seckill id
     * @return the success killed
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
