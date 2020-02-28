package com.example.factorypattern.models;

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
