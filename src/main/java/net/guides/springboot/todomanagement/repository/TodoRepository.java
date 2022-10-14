package net.guides.springboot.todomanagement.repository;

import java.util.List;

import net.guides.springboot.todomanagement.model.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

    List<Todo> findByUserName(String user);
}
