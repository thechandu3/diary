<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">

</head>
<body>
<div class="container">
  <header>
    <h1>My Diary</h1>
    <div class="date" id="date"></div>
    <button onclick="changeFont()">Change Font</button>
  </header>
  <form action="Entry" method="post">
  <textarea id="diary-entry" name ="Entry" placeholder="Write your thoughts here..."></textarea>
  <input type="submit" value="save your thoughts">
  </form>
</div>
<script>
  // Function to display current date
  function displayDate() {
    var dateElement = document.getElementById("date");
    var currentDate = new Date();
    var options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
    dateElement.innerHTML = currentDate.toLocaleDateString('en-US', options);
  }

  // Function to change font
  function changeFont() {
    var textarea = document.getElementById("diary-entry");
    if (textarea.style.fontFamily === "Arial") {
      textarea.style.fontFamily = "Times New Roman";
    } else {
      textarea.style.fontFamily = "Arial";
    }
  }

  // Call displayDate function when page loads
  displayDate();
</script>

</body>
</html>