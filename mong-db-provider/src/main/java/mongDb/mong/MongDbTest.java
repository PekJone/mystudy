package mongDb.mong;

import mongApi.MongApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongDbTest implements MongApi{

    @Override
    public void test() {

    }
}
