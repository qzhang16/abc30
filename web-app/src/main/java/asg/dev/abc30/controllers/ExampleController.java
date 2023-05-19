package asg.dev.abc30.controllers;

import asg.dev.abc30.webmodel.AddressSchema;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {
    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> returnVal = new HashMap<>();
        returnVal.put("hello", "world");
        return returnVal;
    }

    @RequestMapping("/address")
    public AddressSchema getAddress() {
        AddressSchema address = new AddressSchema();
        address.setLocality("CN");
        address.setCountryName("China");
        address.setRegion("Shanghai");
        address.setStreetAddress("Yunping Rd, JiaDing");
        address.setExtendedAddress("Baiyingshidai3#");
        address.setPostalCode("201801");
        address.setPostOfficeBox("1602");
        return address;
    }

}
