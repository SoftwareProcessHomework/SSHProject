<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
   	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script language="javascript" type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
	
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div class="bloc">
    <div class="title">筛选风险</div>
    <div class="content">
      <s:form action="risklistaction">
        <div class="input">
            <label for="input1">开始时间</label>
            <input type="text" name = "begintime" id="input1" class="Wdate" onClick="WdatePicker()" />
        </div>
        <div class="input">
            <label for="input1">结束时间</label>
            <input type="text" name = "endtime" id="input1"  class="Wdate" onClick="WdatePicker()" />
        </div>
        <div class="submit">
            <input type="submit" value="Fliter Risk Entry" />
        </div>
       </s:form>
       
       
       
    </div>
</div> 

    
    
  
  
  </body>
</html>