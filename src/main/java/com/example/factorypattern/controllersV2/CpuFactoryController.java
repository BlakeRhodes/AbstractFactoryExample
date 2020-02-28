package com.example.factorypattern.controllersV2;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.factories.ArchitectureFactory;
import com.example.factorypattern.models.Cpu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/cpus")
public class CpuFactoryController {

    @GetMapping("/{architecture}")
    public Cpu get(@PathVariable Architecture architecture) {
        Cpu cpu;

        ArchitectureFactory factory = ArchitectureFactory.getFactory(architecture);
        cpu = factory.createCpu();

        return cpu;

    }
}
