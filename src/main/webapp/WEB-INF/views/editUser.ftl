<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EditUser</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>id</p>
    <input title="id" type="text" name="id" value="${user.id}" >
    <br>
    <p>name</p>
    <input title="name" type="text" name="name" value="${user.name}">
    <br>
    <p>email</p>
    <input title="email" type="text" name="email" value="${user.email}">
    <br>
    <p>age</p>
    <input title="age" type="text" name="age" value="${user.age}">
    <input type="submit" value="edit">
</form>
</body>
</html>