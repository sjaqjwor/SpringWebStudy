package net.madvirus.spring4.chap3;

public interface ErpClient {

    public void connect();

    public void close();

    public void sendPurchaseInfo(ErpOrderData oi);

}
