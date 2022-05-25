package com.company;

public class PhoneParam {
    class Core {
        String core = "Switched off";

        public void notWorking() {
            core = "Core is not working";
            System.out.println(core);
        }

        public void working() {
            core = "Core is working";
            System.out.println(core);
        }
    }

    class Memory {
        String memory = "Switched off";

        public void notWorking() {
            memory = "Memory is not working";
            System.out.println(memory);
        }

        public void working() {
            memory = "Memory is working";
            System.out.println(memory);
        }
    }

    Core intelCore = new Core();
    Memory ram = new Memory();
}
