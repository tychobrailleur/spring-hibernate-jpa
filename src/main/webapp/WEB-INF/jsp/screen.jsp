<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>${screen.title}</h1>
<c:forEach var="section" items="${screen.sections}">
    <h2>${section.name}</h2>
    <dl>
        <c:forEach var="field" items="${section.fields}">
            <dt>${field.name} :</dt>
            <dd>${field.type}</dd>
        </c:forEach>
    </dl>
</c:forEach>