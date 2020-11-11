<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <link rel="stylesheet" href="styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assignment 2 - CZ3002</title>
    </head>
    <body>
      <div class="container">
        <s:form action="login">
          <s:textfield type="email" name="email" label="Email" />
          <s:textfield type="password" name="password" label="Password" />
          <s:submit value="Submit" />
        </s:form>
      </div class="container">
    </body>
</html>