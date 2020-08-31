package controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import domain.BoardVO;
import service.BoardService;

@Controller
@RequestMapping("/")
public class BoardController {
	@Inject
	private BoardService service;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createGET(BoardVO board, Model model) throws Exception {
		System.out.println("/create 입니다. GET 방식");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		System.out.println("/create 입니다. POST 방식");

		service.create(board);

		return "redirect:/listAll";
	}

	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {

		System.out.println("전체목록 페이지");

		model.addAttribute("boardList", service.listAll());

	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("b_no") int b_no, Model model) throws Exception {

		System.out.println("글 번호" + b_no + "번의 상세내용 페이지");

		model.addAttribute(service.read(b_no));

	}
	

	/* 게시판 글 수정 */
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGET(int b_no, Model model) throws Exception {
		model.addAttribute(service.read(b_no));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		service.modify(board);
		return "redirect:/listAll";
	}
	

	/* 게시판글 삭제 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Integer b_no, RedirectAttributes rttr) throws Exception {
		service.delete(b_no);
		return "redirect:/listAll";
	}

}
