package helpezee.models;

import javax.transaction.Transactional;

/**
 * Repository for the entity Company.
 * 
 * @see helpezee.models.UserBaseRepository
 */
@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> { }
