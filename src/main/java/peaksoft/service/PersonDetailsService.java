package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import peaksoft.entities.Person;
import peaksoft.repository.PersonRepository;

@Service
public class PersonDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Person person = personRepository.getByEmailPerson(username);
        if (person == null) {
            throw new UsernameNotFoundException("User name not found exception!");
        }
        return person;
    }
}
