public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, char g, String e) {
        name = n;
        gender = g;
        email = e;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "author - "+this.name+" ("+this.gender+") "+"at"+" "+this.email;
    }
}
