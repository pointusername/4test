package com.itheima.proxy.jdkProxy;

/**
 * 一个生产者
 */
public class ProducerImpl implements Producer{

    /**
     * 销售
     * @param money
     */
    public float saleProduct(float money){
        System.out.println("销售产品，并拿到钱："+money);
return  money;
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供售后服务，并拿到钱："+money);
    }
}