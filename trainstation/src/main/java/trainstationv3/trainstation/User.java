package trainstationv3.trainstation;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;
    private String password;
    public User(){}
    public User(String email,String password)
    {
        this.email = email;
        this.password=password;
    }
    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", email='" + email + '\''+
                ", password='" + password + '\'' + '}';
    }
}
