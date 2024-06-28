package com.spring.shruti.JobSearch.Repository;

import com.spring.shruti.JobSearch.models.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository {
    List<Post> findByText(String text);
}
