package ac.dankook.postboard.repository;

import ac.dankook.postboard.data.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SignUpRepositoryImpl implements SignUpRepository{
    @Autowired
    SqlSession sqlSession;

    public void setUserData(User user) {
        sqlSession.selectOne("signupMapper.setUserData",user);
    }
}
