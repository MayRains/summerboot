package frameworkdemo.summerboot.service;

import frameworkdemo.summerboot.dao.accountDao;
import frameworkdemo.summerboot.pojo.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class accountService {

    @Autowired
    private accountDao accountDao;
  public  account findInfoById(int id){
      return accountDao.findById(id);
  }
}
