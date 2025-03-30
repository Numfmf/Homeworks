package src.main.attestations.attestation01.represitory;

import  src.main.attestations.attestation01.User;

import java.util.List;

public interface UsersRepository {
    void create(User user);
    User findById(String id);
    List<User> findAll();
    void update(User user);
    void deleteById(String id);
    User deleteAll();


}
