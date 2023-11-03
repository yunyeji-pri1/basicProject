package com.example.sampleproject.board.dto;

import lombok.Data;

/**
 * @author Yun Yeji
 * @fileName : Criteria
 * @description
 * @since : 2023-11-03
 */
@Data
public class Criteria {
    
    // 현제페이지
    private int pageNum;
    
    // 한페이지당 보여질 게시물 갯수
    private int amount;

    // 스킵할 게시물 수
    private int skip;

    // 생성자
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
        this.skip = (pageNum-1)*amount;
    }

    public void setPageNum(int pageNum){
        this.skip = (pageNum-1)*this.amount;
        this.pageNum = pageNum;
    }

    public void setAmount(int amount){
        this.skip = (this.pageNum-1)*amount;
        this.amount = amount;
    }


}
