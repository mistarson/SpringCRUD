<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>상세 글</title>
</head>
<body>
<form>


<p><label>글번호</label> <input type="text" name ="b_no" value ="${boardVO.b_no}" readonly="readonly"></p>
<p><label>제목</label> <input type="text" name ="b_title" style="background-color:#B0E0E6;" value ="${boardVO.b_title}" readonly="readonly"></p>
<p><label>작성자</label> <input type="text" name="b_writer" size="15" value = "${boardVO.b_writer}"readonly="readonly"><p>
<label>내용</label><textarea name=detail rows ="10" cols="70"  style="background-color:#dddddd;" readonly="readonly" >${boardVO.b_detail}</textarea><br>

<button type="submit" formaction="modify" formmethod="get">수정</button>
<button type="submit" formaction="delete" formmethod="post">삭제</button>
<button type="submit" formaction="listAll" formmethod="get">목록</button>

</form>
</body>
</html>
