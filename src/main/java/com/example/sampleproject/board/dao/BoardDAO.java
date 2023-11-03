package com.example.sampleproject.board.dao;

import com.example.sampleproject.board.dto.BoardVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yun Yeji
 * @fileName : BoardDAO
 * @description
 * @since : 2023-11-02
 */
@Mapper
@Repository
public interface BoardDAO {
    List<BoardVO> getList();
}
