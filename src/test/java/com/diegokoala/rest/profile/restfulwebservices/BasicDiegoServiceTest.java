package com.diegokoala.rest.profile.restfulwebservices;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import com.diegokoala.rest.profile.restfulwebservices.BasicDiegoService;

class BasicDiegoServiceTest {
    BasicDiegoService diegoService = new BasicDiegoService();
    
    @Test
    void testUserInfo() {
        String string = diegoService.getUserInfo("Diego");
        assertEquals("premium", string);
        string = diegoService.getStatus("cartService");
        assertEquals("UP", string);
        List list = diegoService.getCart("Diego");
        assertEquals(Arrays.asList("golden ring","necklace"), list);
        list = diegoService.getUsers();
        assertEquals(Arrays.asList("Diego","Luis","Guilherme"), list);
        int integer = diegoService.getNewVersion(1);
        assertEquals(2, integer);
    }

}