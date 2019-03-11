package frameworkdemo.summerboot.dao;

import frameworkdemo.summerboot.pojo.account;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface accountDao {
     account findById(@Param("id") int id);
}
