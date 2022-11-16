package com.tutorial.userservice.feignclients;

import com.tutorial.userservice.model.Bike;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "bike-service")
//@RequestMapping("/bike")
public interface BikeFeignClient {

    //@PostMapping()
    @RequestMapping(method = RequestMethod.POST, value = "/bike")
    Bike save(@RequestBody Bike bike);

    //@GetMapping("/byuser/{userId}")
    @RequestMapping(method = RequestMethod.GET, value = "/bike/byuser/{userId}")
    List<Bike> getBikes(@PathVariable("userId") int userId);
}
