package com.sky.elasticearch.model;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface StudentDao extends ElasticsearchRepository<Student, Student> {
    List<Student> findAllByStudentName(String studentName);
}
