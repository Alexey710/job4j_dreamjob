package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

public class PsqlMain {
    public static void main(String[] args) {
        Store store = PsqlStore.instOf();
        //store.save(new User(0, "Alexey", "alex@mail", "alex"));
        System.out.println(store.findByEmail("alex@mail"));
        /*store.save(new Post(0, "Java Job"));
        store.save(new Post(1, "Java Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println(store.findById(1));
        store.save(new Candidate(0, "Candidate for Java Job"));
        store.save(new Candidate(1, "Candidate for Java Job2"));
        for (Candidate can : store.findAllCandidates()) {
            System.out.println(can.getId() + " " + can.getName());
        }
        System.out.println(store.findByIdCan(1));*/

    }
}
