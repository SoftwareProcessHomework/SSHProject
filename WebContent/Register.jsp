<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Register</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Register Page" />
        <meta name="keywords" content="Register your account with a character of Risk"/>
		<link rel="shortcut icon" href="../favicon.ico" type="image/x-icon"/>
        <link rel="stylesheet" type="text/css" href="/SSHProject/css/stylerisk.css" />
		<script src="/SSHProject/js/cufon-yui.js" type="text/javascript"></script>
		<script src="/SSHProject/js/ChunkFive_400.font.js" type="text/javascript"></script>
		<script type="text/javascript">
			Cufon.replace('h1',{ textShadow: '1px 1px #fff'});
			Cufon.replace('h2',{ textShadow: '1px 1px #fff'});
			Cufon.replace('h3',{ textShadow: '1px 1px #000'});
			Cufon.replace('.back');
		</script>
    </head>
    <body>
		<div class="wrapper">
			<h1>Animated Form Switching</h1>
			<h2>Demo: click the <span>orange links</span> to see the form animating and switching</h2>
			<div class="content">
					<s:form action="register">
						<h3>Register</h3>
						<div>
							<label>Account:</label>
							<input type="text" name="user.username" id="login">
						</div>
						<div>
							<label>Password: </label>
							<input type="password" name="user.password" id="password">
						</div>
						 <div class="input">
            				<label for="select2">Character: </label>
            					<select name="user.type" id="select2" onchange = "changeAction2();">
                					<option value="M">Manager</option>
                					<option value="U">User</option>
            					</select>
        				</div>
						<script type="text/javascript">
							function changeAction2(){
								var selectValue=document.getElementById('select2').value;
								document.forms[2]=parseInt(selectValue);
							}
						</script>
						<div class="bottom">
							<input type="submit" value="Register Your Account"></input>
							<div class="clear"></div>
						</div>
					</s:form>
				<div class="clear"></div>
			</div>
			<a class="back" href="http://tympanus.net/codrops/2011/01/06/animated-form-switching/">back to the Codrops tutorial</a>
		</div>
		

		<!-- The JavaScript -->
		
    </body>
</html>