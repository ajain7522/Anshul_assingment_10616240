<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}

span {
  color: red;
}

</style>

<script type="text/javascript" src="Script.js"> 
</script>
</head>
<body>

<h1>Personal Information</h1>
	<div class="ex">
		<form name="myForm" action="InformationController" method="post" onsubmit="return validateForm()">
			<table style="with: 50%">
				<tr>
					<td>Name <span>*</span></td>
					<td><input type="text" name="name" /></td>
					<td><span id="name"> </span></td>
				</tr>
				<tr>
					<td>Address <span>*</span></td>
					<td><input type="text" name="address" /></td>
					<td><span id="address"> </span></td>
				</tr>
				
				<tr>
					<td>Pan <span>*</span></td>
					<td><input type="text" name="pan" /></td>
					<td><span id="pan"> </span></td>
				</tr>
				
				<tr>
					<td>Date of birth <span>*</span></td>
					<td><input type="text" name="dob" id="datepicker" /></td>
					<td><span id="dob"> </span></td>
				</tr>
				<tr>
					<td>Assessment Year<span>*</span> </td>
					<td><input type="text" name="ayear" /></td>
					<td><span id="income"> </span></td>
				</tr>
				<tr>
					<td>Income<span>*</span></td>
					<td><input type="text" name="income" /></td>
					<td><span id="ayear"> </span></td>
				</tr>
				<tr>
					<td>Tax deducted<span>*</span></td>
					<td><input type="text" name="taxd" /></td>
					<td><span id="taxd"> </span></td>
				</tr>
			
				<tr>
			<td> <input type="submit" value="save" /></td>
			<td> <input type="reset" value="reset"  /><td>
				</tr>
			   
			</table>
		</form>
	</div>

</body>
</html>