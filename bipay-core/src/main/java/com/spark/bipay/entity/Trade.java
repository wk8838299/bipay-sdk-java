package com.spark.bipay.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Trade {
    //交易Id
    private String txId ;
    //交易流水号
    private String tradeId ;
    //交易地址
    private String address ;
    //币种类型
    private String coinType ;
    //交易金额
    private BigDecimal amount ;
    //交易类型  1-充值 2-提款(转账)
    private int tradeType ;
    //交易状态 0-待审核 1-成功 2-失败,充值无审核
    private int status ;
    //交易手续费
    private BigDecimal poundage ;
    //旷工费
    private BigDecimal fee ;
    //1审核回调 2交易回调
    private int flag ;
    //提币申请单号
    private String businessId ;

}
