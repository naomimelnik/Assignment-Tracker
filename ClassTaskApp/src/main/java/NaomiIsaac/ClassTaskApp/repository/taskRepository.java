package NaomiIsaac.ClassTaskApp.repository;

import NaomiIsaac.ClassTaskApp.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface taskRepository extends JpaRepository<Tasks, Long> {

}
