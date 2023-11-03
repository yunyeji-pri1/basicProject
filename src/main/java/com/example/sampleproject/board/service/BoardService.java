package com.example.sampleproject.board.service;

import com.example.sampleproject.board.dto.BoardVO;

import java.util.List;

/**
 * @author Yun Yeji
 * @fileName : BoardService
 * @description
 * @since : 2023-11-02
 */
public interface BoardService {
    /* 게시판 목록 */
    List<BoardVO> getList();
}
