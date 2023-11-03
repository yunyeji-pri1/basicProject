package com.example.sampleproject.board;

import com.example.sampleproject.board.dto.BoardVO;
import com.example.sampleproject.board.dto.Criteria;
import com.example.sampleproject.board.dto.PageMakerDTO;
import com.example.sampleproject.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * @author Yun Yeji
 * @fileName : BoardController
 * @description
 * @since : 2023-11-02
 */
@Controller
public class BoardController {

    @Autowired
    BoardService boardService;


    @GetMapping("/board")
    public ModelAndView testPage(ModelAndView mav) {

        List<BoardVO> boardList = boardService.getList();
        Criteria cri = new Criteria(1,boardList.size());
        PageMakerDTO pageMakerDTO = new PageMakerDTO(cri, boardList.size());


        mav.addObject("boardList",boardList);
        mav.addObject("data", "hello~~~");
        mav.addObject("paging", pageMakerDTO);
        mav.setViewName("/folder/board");

        return mav;
    }
}
