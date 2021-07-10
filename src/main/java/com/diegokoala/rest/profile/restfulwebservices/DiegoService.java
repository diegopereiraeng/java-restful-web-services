package com.diegokoala.rest.profile.restfulwebservices;

import java.util.Dictionary;
import java.util.List;

public interface DiegoService {
    int getNewVersion(int version) ;
    
    List getCart(String user);
    
    List getUsers();

    String getStatus(String service);

    String getUserInfo(String user);
}