package com.example.factorypattern.factories;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.models.Cpu;
import com.example.factorypattern.models.EmberCpu;
import com.example.factorypattern.models.EmberMmu;
import com.example.factorypattern.models.Mmu;
import org.springframework.stereotype.Component;

@Component
public class EmberArchitectureFactory extends ArchitectureFactory {

    public EmberArchitectureFactory() {
        super.architecture = Architecture.EMBER;
    }

    @Override
    public Cpu createCpu() {
        return new EmberCpu();
    }

    @Override
    public Mmu createMmu() {
        return new EmberMmu();
    }
}
