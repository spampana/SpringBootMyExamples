package helpezee.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Person.
 * 
 * @see helpezee.models.UserBaseRepository
 */
@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }
