package org.example.facade;

import org.example.subsystems.CPU;
import org.example.subsystems.HardDrive;
import org.example.subsystems.Memory;

public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.freeze();
        hardDrive.load(0, memory.read(0, 1024));
        cpu.jump(0);
        cpu.execute();
    }

}
