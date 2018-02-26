package HomeWork.ComparisonOfAddresses;

public class Person {
    private String name;
    private int id;
    private int age;
    private Addres addres;

    Person(String name, int id, int age, Addres addres) {
        setId(id);
        setAge(age);
        setName(name);
        this.addres=addres;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age =0;
        }
    }
    public void setName(String name) {
        if (name==null || name.equals("")) {
            this.name ="Anonymous";
        }
        else{this.name = name;}
    }

    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public Addres getAddres() {
        return addres;
    }
    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "person name: "+name+", person id: "+id+" ,person age: "+ age + addres;
    }

    public boolean equals(Person o){
       if (o.getAge()!=this.getAge()) return false;
       if (o.getName()!=this.getName()) return false;
    else return true;
    }

    @Override
    public boolean equals(Object o) {

        Person person = (Person) o;

        if (id != person.id) return false;
        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return addres != null ? addres.equals(person.addres) : person.addres == null;
    }
}

