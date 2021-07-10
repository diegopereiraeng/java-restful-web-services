package com.diegokoala.rest.profile.restfulwebservices;

import org.springframework.stereotype.Service;

import java.util.Dictionary;
import java.util.List;
import java.util.Arrays;
import com.diegokoala.rest.profile.restfulwebservices.DiegoService;

@Service
public class BasicDiegoService implements DiegoService {

    @Override
    public int getNewVersion(int version) {
        if (version <= 0) {
            throw new RuntimeException("Must include latest version and be greater than 0");
        }
        try {
            return version+1;
        } catch (Exception e) {
            throw new RuntimeException("Must include latest version as integer");
        }

    }
    
    @Override
    public List getUsers() {
        List<String> users = Arrays.asList("Diego","Luis","Guilherme");
        return users;
    }

    @Override
    public String getStatus(String service) {
        return "UP";
    }
    @Override
    public String getUserInfo(String user) {
        return "premium";
    }

    @Override
    public List getCart(String user) {
        List<String> products = Arrays.asList("golden ring","necklace");
        return products;
    }

    
}