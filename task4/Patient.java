class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
        enterPolyclinic();
    }

    public void enterPolyclinic() {
        Therapist therapist = new Therapist(this);
        // Patient enters the polyclinic and starts with Therapist
    }
}