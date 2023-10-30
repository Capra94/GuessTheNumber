class numberOfAttempts {
    private int numberOfAttempts = 0;

    public numberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public void numberOfAttempsAdd() {
        this.numberOfAttempts++;
    }
}
