package net.madvirus.spring4.chap3;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    private ErpClientFactory erpClient;

    @Autowired(required = false)
    private Monitor monitor;

    @Autowired
    public void setErpClientFactory(ErpClientFactory erpClientFactory){
        this.erpClient=erpClientFactory;
    }

    public ErpClientFactory getErpClient(){
        return this.erpClient;
    }
}
