package com.kosta.acme;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TopicRepository extends CrudRepository<Topic, Long> {
}
