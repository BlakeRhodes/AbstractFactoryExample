package com.example.factorypattern.factories;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.models.AlphaCpu;
import com.example.factorypattern.models.AlphaMmu;
import com.example.factorypattern.models.Cpu;
import com.example.factorypattern.models.Mmu;
import org.springframework.stereotype.Component;

@Component
public class AlphaArchitectureFactory extends ArchitectureFactory {

    public AlphaArchitectureFactory() {
        super.architecture = Architecture.ALPHA;
    }

    @Override
    public Cpu createCpu() {
        return new AlphaCpu();
    }

    @Override
    public Mmu createMmu() {
        return new AlphaMmu();
    }
}
