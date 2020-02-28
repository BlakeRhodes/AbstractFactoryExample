package com.example.factorypattern.factories;

import com.example.factorypattern.Architecture;
import com.example.factorypattern.models.Cpu;
import com.example.factorypattern.models.EnginolaCpu;
import com.example.factorypattern.models.EnginolaMmu;
import com.example.factorypattern.models.Mmu;
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
