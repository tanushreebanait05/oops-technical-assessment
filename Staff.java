class Staff {
    void work() {
        System.out.println("Staff performs general hospital duties.");
    }

    // Main method yahan daalne se Staff.java naam kaam karega
    public static void main(String[] args) {
        Staff[] staffList = {
            new Doctor(),
            new Nurse(),
            new Receptionist()
        };

        for (Staff s : staffList) {
            s.work();
        }
    }
}

class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor: Diagnoses illnesses and treats patients.");
    }
}

class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse: Provides patient care and assists doctors.");
    }
}

class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist: Manages appointments and patient records.");
    }
}