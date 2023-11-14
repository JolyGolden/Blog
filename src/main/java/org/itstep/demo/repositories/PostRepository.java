package org.itstep.demo.repositories;

import org.itstep.demo.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
