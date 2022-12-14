package svobodavlad.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import svobodavlad.domain.Location;

/**
 * Spring Data JPA repository for the Location entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {}
