package lviv.first.entity;


import javax.persistence.*;
import java.util.Date;


@Entity
@NamedQueries({
        @NamedQuery(name = "Event.findByName", query = "select a from Event a where a.eventName like :eventName"),
        @NamedQuery(name = "Event.findByDate", query = "select a from Event a where a.eventDate = :eventDate")
})
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String eventName;

    @Column
    private String eventDesc;

    @Column
    private Date eventDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    public Event() {
    }

    public Event(Date eventDate, String eventDesc, String eventName) {
        this.eventDate = eventDate;
        this.eventDesc = eventDesc;
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }
}
