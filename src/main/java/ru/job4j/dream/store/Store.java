package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);

    void save(Candidate post);

    void save(User user);

    Post findById(int id);

    Candidate findByIdCan(int id);

    User findByCredential(String email, String password);

    void deleteCan(int id);

    Collection<String> findAllCities();

}
