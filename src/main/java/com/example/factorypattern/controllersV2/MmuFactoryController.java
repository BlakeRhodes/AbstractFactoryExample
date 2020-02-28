package com.example.factorypattern.controllersV2;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.factories.ArchitectureFactory;
import com.example.factorypattern.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/mmus")
public class MmuFactoryController {

    @GetMapping("/{architecture}")
    public Mmu get(@PathVariable Architecture architecture) {
        Mmu mmu;

        ArchitectureFactory factory = ArchitectureFactory.getFactory(architecture);
        mmu = factory.createMmu();

        return mmu;

    }
}
