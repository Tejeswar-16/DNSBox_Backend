package com.example.dnslookup.controller;
import com.example.dnslookup.dnsresponse.DNSResponse;
import com.example.dnslookup.service.DNSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DNSController {
    @Autowired
    DNSService dnsService;

    @GetMapping("/resolve")
    public DNSResponse resolveDomain(@RequestParam String domain){
        return dnsService.resolveDomain(domain);
    }
}
