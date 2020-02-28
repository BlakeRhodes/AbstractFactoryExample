package com.example.factorypattern.factories;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.cpu.AlphaCpu;
import com.example.factorypattern.models.mmus.AlphaMmu;
import com.example.factorypattern.models.cpu.Cpu;
import com.example.factorypattern.models.mmus.Mmu;
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
