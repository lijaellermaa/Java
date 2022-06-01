package com.company;

public class PhonesDemoParam extends PhonesDemo1 {
    String system;
    int core;
    int memory;

    PhonesDemoParam() {
    }

    PhonesDemoParam(String system, int core, int memory) {
        this.system = system;
        this.core = core;
        this.memory = memory;
    }

    PhonesDemoParam(String system, int core, int memory, String model, String number, int price) {
        super(model, number, price);
        this.system = system;
        this.core = core;
        this.memory = memory;
    }

    public void tellModel() {
        System.out.println(super.model);
    }

    public void tellPhone10() {
        System.out.print(system + " " + core + " " + memory + " " + super.model + " " + super.number + " " + super.price);

    }
}
