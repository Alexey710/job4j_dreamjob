package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MemStoreStub implements Store {
    private static AtomicInteger POST_ID = new AtomicInteger(0);
    private static AtomicInteger CANDIDATE_ID = new AtomicInteger(0);

    private static final MemStoreStub INST = new MemStoreStub();

    private Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    private MemStoreStub() {
    }

    public static MemStoreStub instOf() {
        return INST;
    }

    public Collection<Post> findAllPosts() {
        return posts.values();
    }

    public Collection<Candidate> findAllCandidates() {
        return candidates.values();
    }

    public void save(Post post) {
        if (post.getId() == 0) {
            post.setId(POST_ID.incrementAndGet());
        }
        posts.put(post.getId(), post);
    }

    public Post findById(int id) {
        return posts.get(id);
    }

    public void save(Candidate candidate) {
        if (candidate.getId() == 0) {
            candidate.setId(CANDIDATE_ID.incrementAndGet());
        }
        candidates.put(candidate.getId(), candidate);
    }

    @Override
    public void save(User user) {

    }

    public Candidate findByIdCan(int id) {
        return candidates.get(id);
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public void deleteCan(int id) {

    }

    @Override
    public Collection<String> findAllCities() {
        return null;
    }
}
