import com.li.controller.UserController;
import com.li.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author mnli
 * @date 2022/11/20 19:58
 **/
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"/applicationContext.xml"}) //加载配置文件
public class TestSpring {

    @Test
    public void testSpringStart(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = (UserController)applicationContext.getBean("userController");
        System.out.println(userController);
        DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");
        applicationContext.close();

    }
    @Test
    public  void testMybatis() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session= factory.openSession();
        IUserDao aDao = session.getMapper(IUserDao.class);
        aDao.selectUser(1);
        System.out.println(aDao);
    }
}
