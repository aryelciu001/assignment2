<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+SC:wght@300&display=swap" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles.css">
    <title>Assignment 2 - CZ3002</title>
  </head>
  <body>
    <div class="container">
      <p style="text-align: center;">
        Successful Login!<br>
        Welcome <strong><s:property value="user.email" /></strong>
      </p>
    </div>
  </body>
</html>