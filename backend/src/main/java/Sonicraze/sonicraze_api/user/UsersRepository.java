package Sonicraze.sonicraze_api.user;

import org.springframework.data.jpa.repository.JpaRepository;

;

public interface UsersRepository extends JpaRepository<User, Long> {
}
