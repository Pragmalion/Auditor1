class Therapist {
    private Patient currentPatient;

    public Therapist(Patient patient) {
        this.currentPatient = patient;
        performExamination();
    }

    public void performExamination() {
        MriRoom mriRoom = new MriRoom(currentPatient);
        // Therapist examines the patient and sends them to MRI Room
    }
}

