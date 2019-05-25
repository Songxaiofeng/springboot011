<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User informations displaying</title>
</head>
<body>
<#--<h1>姓名：${user.name}</h1>-->

<p>这是通过freemarker模板获得的数据从后台:
<table border="1">
    <thead>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>性别</td>
        </tr>
    </thead>
    <tbody>
    <#list usernames as a>
        <#if a.id %2==0>
            <tr style="color: red">
                <td>${a.id}
                <td>
                <td>${a.name}
                <td>
                <td>${a.sex}
                <td>

            </tr>

        </#if>
        <tr>
            <td>${a.id}
            <td>
            <td>${a.name}
            <td>
            <td>${a.sex}
            <td>
        </tr>
    </#list>

    </tbody>
</table>
</body>
</html>