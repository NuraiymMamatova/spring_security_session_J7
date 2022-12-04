package peaksoft.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entities.Person;
import peaksoft.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl {

    private final PersonRepository personRepository;

    public List<Person> findAllPerson() {
        return personRepository.findAll();
    }

    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public Person findByIdPerson(Long id) {
        return personRepository.findById(id).get();
    }

    public void deleteByIdPerson(Long id) {
        personRepository.deleteById(id);
    }
}
