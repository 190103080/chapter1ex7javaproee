<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 22.07.2022
  Time: 4:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <form action="/add" method="post">
    <label>
      NAME:
    </label>
    <input type="text" placeholder="Insert name" name="user_name" style="margin-left: 100px"> <br><br>

    <label>
      SURNAME:
    </label>
    <input type="text" placeholder="Insert surname" name="user_surname" style="margin-left: 90px;"> <br><br>

    <label>
       CLUB:
    </label>
    <select name="user_club" style="margin-left: 110px">
      <option>Real Madrid CF</option>
      <option>Barcelona CF</option>
      <option>Arsenal CF</option>
      <option>Chelsea CF</option>
      <option>Manchester City CF</option>
      <option>Manchester United CF</option>
      <option>Juventus CF</option>
      <option>Atletico Madrid CF</option>
      <option>Liverpool CF</option>
    </select> <br><br>

    <label>
      SALARY:
    </label>
    <input type="number" name="user_salary" placeholder="Insert salary" style="margin-left: 80px"> <br><br>

    <label>
      TRANSFER PRICE:
    </label>
    <input type="number" name="user_transferPrice" placeholder="Insert transfer price" style="margin-left: 50px"> <br><br>

    <button style="background-color: blue; color: white; border: 1px solid blue; margin-left: 100px">ADD FOOTBALLER</button>

  </form>

</body>
</html>
