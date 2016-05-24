package com.huluohu.learning.springboot.n2.dao;

import com.huluohu.learning.springboot.n2.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/24
 * Time           :   18:30
 * Description    :
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
	List<Person> findByName(String name);
	List<Person> findByAddress(String address);
	List<Person> findByNameAndAddress(String name,String address);

	@Query("select p from Person p where p.name=:name and p.address=:address")
	Person withNameNadAddressQuery(@Param("name")String name,@Param("address")String address);

	List<Person> withNameAndAddressNamedQuery(String name,String address);
}
