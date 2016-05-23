package lviv.first.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by kobeb on 23.05.2016.
 */
@Entity
public class Users {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Id
    @Column(length = 55, nullable = false,unique = true,name = "username")
    private String username;

    @Column(length = 55, nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "users")
    @JoinColumn(name = "username")
    private UserInfo userInfo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
    private List<Event> eventList;

    public Users() {
    }

    public Users(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
