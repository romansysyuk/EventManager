package lviv.first.Dao.implementation;

import lviv.first.Dao.EventDao;
import lviv.first.entity.Event;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;


@Repository
public class EventDaoimpl extends AbstractDaoimpl<Event> implements EventDao {
    @PersistenceContext(unitName = "task")
    private EntityManager entityManager;

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Event> findBetweenTwoDates(Date startDate, Date endDate) {
        return (List<Event>) entityManager.createQuery("from Event e where e.eventDate between :startDate and :endDate").getResultList();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Event> findByDate(Date date) {
        return entityManager.createNamedQuery("Event.findByDate").setParameter("eventDate", date).getResultList();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<Event> findByName(String name) {
        return entityManager.createNamedQuery("Event.findByName").setParameter("eventName", name).getResultList();
    }

    @Transactional
    @Override
    public void add(Event entity) {
        super.add(entity);
    }

    @Transactional
    @Override
    public void edit(Event entity) {
        super.edit(entity);
    }

    @Transactional
    @Override
    public void delete(Event entity) {
        super.delete(entity);
    }

    @Transactional
    @Override
    public List<Event> getAll() {
        return super.getAll();
    }

    @Override
    public Event findById(int id) {
        return super.findById(id);
    }
}
