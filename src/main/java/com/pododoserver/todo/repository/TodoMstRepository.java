package com.pododoserver.todo.repository;

import com.pododoserver.todo.entity.TodoMstET;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TodoMstRepository extends JpaRepository<TodoMstET, Long> {


    List<TodoMstET> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(LocalDateTime startDate, LocalDateTime endDate);
}
