package helpezee.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity User.
 * 
 * @see helpezee.models.UserBaseRepository
 */
@Transactional
public interface UserRepository extends UserBaseRepository<User> { }
