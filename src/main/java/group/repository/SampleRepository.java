package group.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import group.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
