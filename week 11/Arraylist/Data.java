class Data {
    private String firstName;
    private String lastName;
    private int postalCode;

    public Data() {
        this.firstName = "";
        this.lastName = "";
        this.postalCode = 0;

    }

    public Data(String firstName, String lastName, int postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public String toString() {
        return firstName + "\t" + lastName + "\t" + postalCode;
    }

}
