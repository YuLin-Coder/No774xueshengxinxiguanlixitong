package com.dao;

import com.entity.JiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaofeiView;

/**
 * 缴费表 Dao 接口
 *
 * @author 
 * @since 2021-04-05
 */
public interface JiaofeiDao extends BaseMapper<JiaofeiEntity> {

   List<JiaofeiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
