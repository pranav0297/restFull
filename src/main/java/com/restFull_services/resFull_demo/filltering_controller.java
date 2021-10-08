package com.restFull_services.resFull_demo;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filltering_controller {
    @GetMapping("/filltering-dyanamic")
    public MappingJacksonValue getfilter(){
        filter_example filterExample = new filter_example("ABC",200,1234);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
        FilterProvider filters= new SimpleFilterProvider().addFilter("Dynamic_filterExample",filter);
        MappingJacksonValue mapping = new MappingJacksonValue(filterExample);
        mapping.setFilters(filters);
         return mapping;
    }
}
