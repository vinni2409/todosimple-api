package com.vinni2409.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinni2409.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
   List<Task> findByUser_Id(Long id);

   /*@Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")// : -> se refere ao parametro, ou seja o id 
   List<Task> findByUser_Id(@Param ("id")Long id); */
   
                // Os outros estão comentados por ter sido apanas para aprendizagem

                
    // @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
    // List<Task> findByUser_Id(@Param("id") Long id);

}
