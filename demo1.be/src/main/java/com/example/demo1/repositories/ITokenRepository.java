package com.example.demo1.repositories;

import com.example.demo1.models.TokenModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ITokenRepository extends JpaRepository<TokenModel, Integer> {

    @Query(value = """
        select t from TokenModel t inner join UserModel u\s
        on t.user.id = u.id\s
        where u.id = :id and (t.expired = false or t.revoked = false )\s
    """)

    List<TokenModel> findAllValidTokenByUser(Integer id);

    Optional<TokenModel> findByToken(String token);
}
