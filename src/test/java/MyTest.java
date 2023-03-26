import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author 梁志超
 * @version 1.0
 * @time 2023/3/22 14:17
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl",Books.class);
        for (Books books: bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
