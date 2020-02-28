package com.example.factorypattern.factories;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.cpu.Cpu;
import com.example.factorypattern.models.cpu.EnginolaCpu;
import com.example.factorypattern.models.mmus.EnginolaMmu;
import com.example.factorypattern.models.mmus.Mmu;
import org.springframework.stereotype.Component;

@Component
public class EnginolaArchitectureFactory extends ArchitectureFactory {

    public EnginolaArchitectureFactory() {
        super.architecture = Architecture.ENGINOLA;
    }

    @Override
    public Cpu createCpu() {
        return new EnginolaCpu();
    }

    @Override
    public Mmu createMmu() {
        return new EnginolaMmu();
    }
}
