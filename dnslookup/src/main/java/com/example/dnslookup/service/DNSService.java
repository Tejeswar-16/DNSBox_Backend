package com.example.dnslookup.service;

import com.example.dnslookup.dnsresponse.DNSResponse;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DNSService {
    public DNSResponse resolveDomain(String domain){
        List<String> ips = new ArrayList<>();
        try
        {
            InetAddress[] addresses = InetAddress.getAllByName(domain);
            for(InetAddress addr:addresses){
                ips.add(addr.getHostAddress());
            }
        }
        catch(UnknownHostException e)
        {
            ips.add("Domain not found");
        }
        return new DNSResponse(ips);
    }
}
