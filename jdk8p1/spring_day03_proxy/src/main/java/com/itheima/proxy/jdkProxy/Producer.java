package com.itheima.proxy.jdkProxy;

/**
 * 对生产厂家要求的接口
 */
public interface Producer {

    /**
     * 销售
     * @param money
     */
    public float saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}