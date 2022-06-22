package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public static void main(String[] args) {
        System.out.println("son ekleme");
    }
}
