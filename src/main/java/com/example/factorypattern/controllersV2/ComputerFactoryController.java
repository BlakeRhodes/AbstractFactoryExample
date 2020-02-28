package com.example.factorypattern.controllersV2;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.factories.ArchitectureFactory;
import com.example.factorypattern.models.Computer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/computers")
public class ComputerFactoryController {

    @GetMapping("/{architecture}")
    public Computer get(@PathVariable Architecture architecture) {
        Computer computer;

        ArchitectureFactory factory = ArchitectureFactory.getFactory(architecture);
        computer = new Computer(factory.createCpu(), factory.createMmu());

        return computer;
    }
}
