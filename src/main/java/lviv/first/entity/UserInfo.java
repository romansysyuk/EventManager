package lviv.first.entity;



import javax.persistence.*;
import java.util.Date;

/**
 * Created by kobeb on 23.05.2016.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "UserInfo.findByName", query = "Select a from UserInfo a where a.firstName like: firstName "),
        @NamedQuery(name = "UserInfo.findByTwoName", query = "select a from UserInfo a where a.firstName like: firstName and a.lastName like:lastName"),
        @NamedQuery(name = "UserInfo.findByUsername",query = "select a from UserInfo a where a.username like: username")

})
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(length = 55, nullable = false)
    private String firstName;

    @Column(length = 55, nullable = false)
    private String lastName;

    @Column
    private Date dateBirth;

    @Column
    private String eMail;

    @Column
    private String username;

    @OneToOne(fetch = FetchType.LAZY)
    private Users users;


    public UserInfo() {
    }

    public UserInfo(Date dateBirth, String lastName, String eMail, String firstName, String username) {
        this.dateBirth = dateBirth;
        this.lastName = lastName;
        this.eMail = eMail;
        this.firstName = firstName;
        this.username = username;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
