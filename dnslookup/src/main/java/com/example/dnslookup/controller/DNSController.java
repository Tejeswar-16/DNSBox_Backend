package com.example.dnslookup.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
@RestController
public class DNSController {
    @GetMapping("/resolve")
    public List<String> resolveDomain(@RequestParam String domain){
        List<String> results = new ArrayList<>();
        try{
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for(InetAddress addr:addresses){
                results.add(addr.getHostAddress());
            }
        }
        catch(UnknownHostException e){
            results.add("Domain not found");
        }
        return results;
    }


}
