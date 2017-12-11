package net.madvirus.spring4.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProductService {


    private SearchClientFactory searchClientFactory;

    @Autowired
    public void setSearchClientFactory(@Qualifier("order") SearchClientFactory searchClientFactory){
        this.searchClientFactory=searchClientFactory;
    }
}
