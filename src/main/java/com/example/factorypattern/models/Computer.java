package com.example.factorypattern.models;

import com.example.factorypattern.models.cpu.Cpu;
import com.example.factorypattern.models.mmus.Mmu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private Cpu cpu;
    private Mmu mmu;
}
