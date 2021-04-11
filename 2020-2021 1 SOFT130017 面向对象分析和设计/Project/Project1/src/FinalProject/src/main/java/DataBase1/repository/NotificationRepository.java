package DataBase1.repository;

import DataBase1.relation.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {
    List<Notification> findByTargetPersonId(Long targetPersonId);
    Notification findByRegulatorySingleTaskId(long regulatorySingleTaskId);
}
