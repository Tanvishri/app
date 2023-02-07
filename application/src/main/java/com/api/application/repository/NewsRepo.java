package com.api.application.repository;
import com.api.application.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepo extends CrudRepository<News, Integer>{

}
