package mapper;

import entity.Lol;

public interface LolMapper {

    //根据id进行查找
    Lol selectByPrimaryKey(Integer id);

    //根据name进行查找
    Lol selectByName(String name);

    //注册的时候进行添加
    int insert(Lol record);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Lol record);

    int updateByPrimaryKeySelective(Lol record);

    int updateByPrimaryKey(Lol record);

}