package com.tutorial.userservice.feignclients;

import com.tutorial.userservice.model.Car;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "car-service")
//@RequestMapping("/car")
public interface CarFeignClient {

   // @PostMapping()
    @RequestMapping(method = RequestMethod.POST, value = "/car")
    Car save(@RequestBody Car car);

    //@GetMapping("/byuser/{userId}")
    @RequestMapping(method = RequestMethod.GET, value = "/car/byuser/{userId}")
    List<Car> getCars(@PathVariable("userId") int userId);
}
