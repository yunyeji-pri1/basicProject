<%@ page contentType='text/html; charset=UTF-8'%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
<div class="path">
    <input type="text" name="datetimes" />
</div>

<head>
    <style>
        .pagination {
            display: inline-block;
        }

        .pagination a {
            color: black;
            float: left;
            padding: 8px 16px;
            text-decoration: none;
        }
    </style>
</head>
<body>

<h2>Simple Pagination</h2>

<table>
    <c:forEach items="${boardList}" var="boardVo" varStatus="status">
        <tr>
            <td><c:out value="${boardVo.bno}" /></td>
            <td><c:out value="${boardVo.title}" /></td>
            <td><c:out value="${boardVo.content}" /></td>
            <td><c:out value="${boardVo.writer}" /></td>
            <td><c:out value="${boardVo.regdate}" /></td>
            <td><c:out value="${boardVo.updateDate}" /></td>
        </tr>
    </c:forEach>
</table>

<c:out value="${data}"/>


<div class="pagination">
    <a href="#">&laquo;</a>
    <c:forEach begin="${paging.startPage}" end="${paging.endPage}" varStatus="status" >
        <li><a href="${status.index}"></a></li>
    </c:forEach>
    <a href="#">&raquo;</a>
</div>

</body>


<script>

    $(function() {
        $('input[name="datetimes"]').daterangepicker({
            timePicker: true,
            startDate: moment().startOf('hour'),
            endDate: moment().startOf('hour').add(32, 'hour'),
            locale: {
                format: 'M/DD hh:mm A'
            }
        });
    });
</script>