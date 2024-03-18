class MriRoom {
    private Patient currentPatient;

    public MriRoom(Patient patient) {
        this.currentPatient = patient;
        performMriExamination();
    }

    public void performMriExamination() {
        // MRI examination is performed
    }
}
