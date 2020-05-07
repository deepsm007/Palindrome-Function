<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project3Task3</title>
</head>
<body>
	<h1>Palindrome</h1>
	<table>

		<div id="result">
			<form name="palindrome" action="result" method="POST">
				<tr>
					Enter a string :
					<input type="text" name="palin" required />
					<br />
				</tr>
				<tr>

					<button type="submit" class="button" value=index>Submit</button>

				</tr>
			</form>
			<tr>
				<pre>
        ${requestScope.output}
    </pre>
			</tr>
		</div>
	</table>
</body>
</html>