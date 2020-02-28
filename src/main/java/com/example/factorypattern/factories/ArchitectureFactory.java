package com.example.factorypattern.factories;

import com.example.factorypattern.models.enums.Architecture;
import com.example.factorypattern.models.cpu.Cpu;
import com.example.factorypattern.models.mmus.Mmu;

public abstract class ArchitectureFactory {
    protected Architecture architecture;

    public abstract Cpu createCpu();

    public abstract Mmu createMmu();

    public static ArchitectureFactory getFactory(Architecture architecture) {
        ArchitectureFactory factory = null;
        switch(architecture) {
            case ENGINOLA:
                factory = new EnginolaArchitectureFactory();
                break;
            case EMBER:
                factory = new EmberArchitectureFactory();
                break;
            case ALPHA:
                factory = new AlphaArchitectureFactory();
                break;
        }
        return factory;
    }

//    private static Map<Architecture, ArchitectureFactory> map = new HashMap<>();

//    public static ArchitectureFactory getFactory(Architecture architecture) {
//        return map.get(architecture);
//    }
//

//
//    @PostConstruct
//    public void postConstruct() {
//        map.put(
//            architecture,
//            this
//        );
//    }
}
