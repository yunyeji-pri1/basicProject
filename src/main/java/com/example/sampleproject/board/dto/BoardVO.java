package com.example.sampleproject.board.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author Yun Yeji
 * @fileName : BoardVO
 * @description
 * @since : 2023-11-02
 */
@Data
public class BoardVO {

    /* 게시판 번호 */
    private int bno;

    /* 게시판 제목 */
    private String title;

    /* 게시판 내용 */
    private String content;

    /* 게시판 작가 */
    private String writer;

    /* 등록 날짜 */
    private Date regdate;

    /* 수정 날짜 */
    private Date updateDate;

}
