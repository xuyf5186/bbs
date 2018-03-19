package cn.mapper;

import cn.entity.TagForum;
import cn.entity.TagForumExample;
import cn.entity.TagForumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagForumMapper {
    long countByExample(TagForumExample example);

    int deleteByExample(TagForumExample example);

    int deleteByPrimaryKey(TagForumKey key);

    int insert(TagForum record);

    int insertSelective(TagForum record);

    List<TagForum> selectByExample(TagForumExample example);

    TagForum selectByPrimaryKey(TagForumKey key);

    int updateByExampleSelective(@Param("record") TagForum record, @Param("example") TagForumExample example);

    int updateByExample(@Param("record") TagForum record, @Param("example") TagForumExample example);

    int updateByPrimaryKeySelective(TagForum record);

    int updateByPrimaryKey(TagForum record);
}