<h2>All Books</h2>
<table border="1">
    <tr>
        <th>ID</th><th>Title</th><th>Author</th><th>Price</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="addBook.jsp">Add New Book</a>
<br>
<form action="searchBook" method="get">
    Search Title: <input type="text" name="title">
    <input type="submit" value="Search">
</form>
