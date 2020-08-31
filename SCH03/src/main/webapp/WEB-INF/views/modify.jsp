<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>

<!DOCTYPE>
<html>
<head>
<title>글수정</title>
</head>
<body>
<form action="modify" method = "post">
 
    <p><label>글번호</label> <input type="text" name ="b_no" value ="${boardVO.b_no}" readonly="readonly"></p>
    <p><label>제목</label ><input type="text" name ="b_title" value = "${boardVO.b_title}" ></p>
    <p><label>작성자</label> <input type="text" name="b_writer" size="15" value = "${boardVO.b_writer}" ></p>
    <label>내용</label>
    <input type="text" name="b_detail" size="15" value = "${boardVO.b_detail}" >

    <button type ="submit">완료</button>
 	

 </form>
 </body>

</html>