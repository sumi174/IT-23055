<h2>Search Results</h2>
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
<a href="listBooks">Back to All Books</a>
