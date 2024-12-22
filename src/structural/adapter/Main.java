package structural.adapter;

public class Main {
}

// Client want to connect to USB C type port
// This is "Target" interface
interface USB_C {
    void connect_C_Type();
}

// But Client has USB A type memory stick
// This is "Adaptee" interface
class USB_A {
    public void connect_A_Type() {}
}

// Clients needs USB C <-> USB A adapter
// This is "Adapter" class, but with "Class Adapter" pattern
class USB_C_to_A_Adapter1 extends USB_A implements USB_C {
    @Override
    public void connect_C_Type() {
        super.connect_A_Type();
    }
}

// This is another "Adapter" class, but with "Class Adapter" pattern
class USB_C_to_A_Adapter2 implements USB_C {
    private final USB_A usbA;
    public USB_C_to_A_Adapter2(USB_A usbA) {
        this.usbA = usbA;
    }

    @Override
    public void connect_C_Type() {
        usbA.connect_A_Type();
    }
}
