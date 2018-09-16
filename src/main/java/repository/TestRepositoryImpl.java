package repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl {
    @Autowired
    SqlSession sqlSession;

    public void testRepository() {
        sqlSession.selectOne("test-mapper.selectData");
    }
}
