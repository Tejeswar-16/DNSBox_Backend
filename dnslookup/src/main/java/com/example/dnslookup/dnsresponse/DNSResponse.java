package com.example.dnslookup.dnsresponse;

import java.util.List;

public class DNSResponse {
    List<String> ips;

    public DNSResponse(List<String> ips){
        this.ips = ips;
    }

    public List<String> getIps() {
        return ips;
    }
}
