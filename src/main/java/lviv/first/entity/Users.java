package lviv.first.entity;

import javax.persistence.*;

/**
 * Created by kobeb on 23.05.2016.
 */
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;


    @Column(length = 55, nullable = false,unique = true)
    private String username;

    @Column(length = 55, nullable = false)
    private String password;

    public Users() {
    }

    public Users(String password, String username) {
        this.password = password;
        this.username = username;
    }


}
