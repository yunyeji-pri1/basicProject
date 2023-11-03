<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="wrapper">
    <header>
        <tiles:insertAttribute name="header" />
    </header>
    <section>
        <tiles:insertAttribute name="body"/>
    </section>
    <footer>
        <span>Copyright © 2023 NEONEXSoft. All rights reserved.</span>
    </footer>
<%--    <div>--%>
<%--        <tiles:insertAttribute name="modal"/>--%>
<%--    </div>--%>
</div>