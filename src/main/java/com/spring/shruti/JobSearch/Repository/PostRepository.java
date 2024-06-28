package com.spring.shruti.JobSearch.Repository;

import com.spring.shruti.JobSearch.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
