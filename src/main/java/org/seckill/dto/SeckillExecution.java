package org.seckill.dto;

import lombok.Data;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

@Data
public class SeckillExecution {
    private long seckillId;
    private int state;
    private String stateInfo;
    private SuccessKilled successKilled;

    public SeckillExecution(long seckillId, int state, String stateInfo) {
        this.seckillId = seckillId;
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public SeckillExecution(long seckillId, SeckillStatEnum stateEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.successKilled = successKilled;
    }
}
