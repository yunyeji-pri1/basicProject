package com.example.sampleproject.board.service;

import com.example.sampleproject.board.dao.BoardDAO;
import com.example.sampleproject.board.dto.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Yun Yeji
 * @fileName : BoardServiceImpl
 * @description
 * @since : 2023-11-02
 */
@Service
public class BoardServiceImpl implements BoardService  {
    @Autowired
    private BoardDAO boardDAO;

    @Override
    public List<BoardVO> getList() {
        return boardDAO.getList();
    }

}
