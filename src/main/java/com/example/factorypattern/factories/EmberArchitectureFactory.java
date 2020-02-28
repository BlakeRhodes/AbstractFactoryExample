package com.example.factorypattern.factories;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.cpu.Cpu;
import com.example.factorypattern.models.cpu.EmberCpu;
import com.example.factorypattern.models.mmus.EmberMmu;
import com.example.factorypattern.models.mmus.Mmu;
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
