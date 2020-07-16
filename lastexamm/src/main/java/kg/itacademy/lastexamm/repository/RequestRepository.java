package kg.itacademy.lastexamm.repository;

import kg.itacademy.lastexamm.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RequestRepository extends JpaRepository<Request,Long> {
    List<Request> findAllByGenre(String genre);
    List<Request> findAllByBookName(String bookname);


}
