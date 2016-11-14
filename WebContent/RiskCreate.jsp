<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Risk Create </title>
        <!-- jQuery AND jQueryUI -->
        <script type="text/javascript" src="/SSHProject/js/libs/jquery/1.6/jquery.min.js"></script>
        <script type="text/javascript" src="/SSHProject/js/libs/jqueryui/1.8.13/jquery-ui.min.js"></script>
        
        <!-- Compressed Version
        <link type="text/css" rel="stylesheet" href="min/b=CoreAdmin&f=css/reset.css,css/style.css,css/jqueryui/jqueryui.css,js/jwysiwyg/jquery.wysiwyg.old-school.css,js/zoombox/zoombox.css" />
        <script type="text/javascript" src="min/b=CoreAdmin/js&f=cookie/jquery.cookie.js,jwysiwyg/jquery.wysiwyg.js,tooltipsy.min.js,iphone-style-checkboxes.js,excanvas.js,zoombox/zoombox.js,visualize.jQuery.js,jquery.uniform.min.js,main.js"></script>
        -->
        <link rel="stylesheet" href="/SSHProject/css/min.css" />
        <script type="text/javascript" src="/SSHProject/js/min.js"></script>
</head>
<body>
 <script type="text/javascript" src="/SSHProject/content/settings/main.js"></script>
			<link rel="stylesheet" href="/SSHProject/content/settings/style.css" />


  <div class="settings" id="settings">
        <div class="wrapper">
            <div class="grid3">
                <div class="titre">Backgrounds</div>
                <a href="url(/SSHProject/css/img/bg.html" class="backgroundChanger active" title="White"></a>
                <a href="url(/SSHProject/css/img/dark-bg.html" class="backgroundChanger dark" title="Dark"></a>
                <a href="url(/SSHProject/css/img/wood.html" class="backgroundChanger dark" title="Wood"></a>
                <a href="url(/SSHProject/css/img/altbg/smoothwall.html" class="backgroundChanger" title="Smoothwall"></a>
                <a href="url(/SSHProject/css/img/altbg/black_denim.html" class="backgroundChanger dark" title="black_denim"></a>
                <a href="url(/SSHProject/css/img/altbg/carbon.html" class="backgroundChanger dark" title="Carbon"></a>
                <a href="url(/SSHProject/css/img/altbg/double_lined.html" class="backgroundChanger" title="Double lined"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Bloc style</div>
                <a href="black.html" class="blocChanger" title="Black" style="background:url(/SSHProject/css/img/bloctitle.png);"></a>
                <a href="white.html" class="blocChanger active" title="White" style="background:url(/SSHProject/css/img/white-title.png);"></a>
                <a href="wood.html" class="blocChanger" title="Wood" style="background:url(/SSHProject/css/img/wood-title.jpg);"></a>
                <div class="clear"></div>
            </div>
            <div class="grid3">
                <div class="titre">Sidebar style</div>
                <a href="grey.html" class="sidebarChanger active" title="Grey" style="background:#494949"></a>
                <a href="black.html" class="sidebarChanger" title="Black" style="background:#262626"></a>
                <a href="white.html" class="sidebarChanger" title="White" style="background:#EEEEEE"></a>
                <div class="clear"></div>
            </div>
            <div class="clear"></div>
        </div>
        <a class="settingbutton" href="#">

        </a>
    </div>        
        <!--              
                HEAD
                        --> 
        <div id="head">
            <div class="left">
                <a href="#" class="button profile"><img src="/SSHProject/img/icons/top/huser.png" alt="" /></a>
                Hi, 
                <a href="#">${sessionScope.user.username}</a>
                <a href="#">Logout</a>
            </div>
            <div class="right">
                <form action="#" id="search" class="search placeholder">
                    <label>Looking for something ?</label>
                    <input type="text" value="" name="q" class="text"/>
                    <input type="submit" value="rechercher" class="submit"/>
                </form>
            </div>
        </div>
                
                
        <!--            
                SIDEBAR
                         --> 
           <div id="sidebar">
             <ul>
                <li>
                    <a href="Index.jsp">
                        <img src="/SSHProject/img/icons/menu/inbox.png" alt="" />
                        Dashboard
                    </a>
                </li>
                <li class="current"><a href="#"><img src="/SSHProject/img/icons/menu/layout.png" alt="" />Options On Risk</a>
                    <ul>
                         <li class="current"><a href="RiskCreate.jsp">Create Risk</a></li>
                         <li><a href="allriskaction.action">Risk List Check</a></li>
                    </ul>
                </li>
              </ul>
        </div>  

	<div id="content" class="white">
            <h1><img src="img/icons/posts.png" alt="" /> Forms</h1>

<div class="bloc">
    <div class="title">创建风险条目</div>
    <div class="content">
      <s:form action="riskaction">
        <div class="input">
            <label for="input1">风险内容</label>
            <input type="text" name = "risk.content" id="input1"/>
        </div>
        <div class="input">
            <label for="select2">可能性: </label>
            <select name="risk.possibility" id="select2" onchange = "changeAction2();">
                <option value="High">High</option>
                <option value="Medium">Medium</option>
                <option value="Low">Low</option>
            </select>
        </div>
        <script type="text/javascript">
				function changeAction2(){
					var selectValue=document.getElementById('select2').value;
					document.forms[1]=parseInt(selectValue);
				}
		</script>
		<div class="input">
            <label for="select3">影响程度: </label>
            <select name="risk.influence" id="select3" onchange = "changeAction3();">
                <option value="High">High</option>
                <option value="Medium">Medium</option>
                <option value="Low">Low</option>
            </select>
        </div>
        <script type="text/javascript">
				function changeAction2(){
					var selectValue=document.getElementById('select3').value;
					document.forms[2]=parseInt(selectValue);
				}
		</script>
        <div class="input">
            <label for="input1">触发器/阈值</label>
            <input type="text" name = "risk.triggerthreshold" id="input1"/>
        </div>
        <div class="input">
            <label for="input1">提交者</label>
            <input type="text" name = "risk.submitter" id="input1"/>
        </div>
        <div class="input">
            <label for="input1">跟踪者</label>
            <input type="text" name = "risk.spoorer" id="input1"/>
        </div>
        <div class="submit">
            <input type="submit" value="Create Risk Entry" />
        </div>
       </s:form>
    </div>
</div>     

</div>
        
</body>
</html>