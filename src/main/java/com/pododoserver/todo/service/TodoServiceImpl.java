package com.pododoserver.todo.service;

import com.pododoserver.todo.entity.TodoMstET;
import com.pododoserver.todo.repository.TodoMstRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl {

    private final TodoMstRepository todoMstRepository;

    public TodoMstET save(TodoMstET entity) {
        return todoMstRepository.save(entity);
    }
    public List<TodoMstET> findAll() {
        return todoMstRepository.findAll();
    }

    public List<TodoMstET> findByDate(LocalDateTime startDate, LocalDateTime endDate) {
        return todoMstRepository.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(startDate, endDate);
    }

    public Optional<TodoMstET> findById(Long id) {
        return todoMstRepository.findById(id);
    }
}
