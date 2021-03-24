package com.photoappusers.photo.app.users.data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);


}
