public class Person implements Comparable<Person> {
    public String company;
    public String name;

    Person() {
    }

    Person(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String toString() {
        return (company + "\t" + name);
    }

    public int compareTo(Person other) {
        int companyComp = this.company.compareTo(other.company);
        if (companyComp != 0)
            return companyComp;
        return this.name.compareTo(other.name);
    }
}
