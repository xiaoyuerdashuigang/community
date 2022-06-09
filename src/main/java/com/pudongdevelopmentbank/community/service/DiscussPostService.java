package com.pudongdevelopmentbank.community.service;

import com.pudongdevelopmentbank.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/***
 *@Description TODO
 *@Author:Lihuiming
 *@Date:2022/6/9
 */
@Mapper
public interface DiscussPostService {

    List<DiscussPost> findDiscussPosts(int userId, int offset, int limit);

    int findDiscussPostRows(int userId);
}
