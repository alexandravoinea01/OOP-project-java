package entities.clients;

public class Client {
    protected String name;
    protected int age;
    protected String sex;
    protected String mail;

    public Client() {
        this.name = "";
        this.age = 0;
        this.sex = "";
        this.mail = "";
    }

    public Client(String name, int age, String sex, String mail) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
