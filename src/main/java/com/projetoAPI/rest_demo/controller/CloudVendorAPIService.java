package com.projetoAPI.rest_demo.controller;

import com.projetoAPI.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
        //return new CloudVendor("C1","Vendor 1","Address One",
        //        "xxxxx");
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfuly!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfuly!";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfuly!";
    }
}
