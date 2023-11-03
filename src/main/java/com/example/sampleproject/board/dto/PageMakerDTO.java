package com.example.sampleproject.board.dto;

import lombok.Data;

/**
 * @author Yun Yeji
 * @fileName : Paging
 * @description
 * @since : 2023-11-02
 */
@Data
public class PageMakerDTO {
    // 시작페이지
    private int startPage;

    // 끝페이지
    private int endPage;
    
    // 이전페이지, 다음페이지 존재유무
    private boolean prev, next;
    
    // 전체 게시물 수
    private int total;

    // 현제 페이지, 페이지당 게시물 표시수 정보
    private Criteria cri;


    // 생성자
    public PageMakerDTO(Criteria cri, int total){
        this.cri = cri;
        this.total = total;

        // 마지막페이지
        this.endPage =  (int)(Math.ceil(cri.getPageNum()/10.0))*10;
        // 시작페이지
        this.startPage = this.endPage - 9;
        // 전체마지막페이지

    }

}
