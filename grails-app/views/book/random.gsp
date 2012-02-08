<html>
  <head>
    <title>Random Book</title>
    <g:javascript library="jquery" plugin="jquery"/>
	<r:require module="jquery"/>
     <r:layoutResources />
</head>
<body>
<ul id="menu">
<li>
<g:remoteLink action="ajaxRandom" update="displayBook">
Next Book
</g:remoteLink>
</li>
<li>
<g:link action="list">
Admin
</g:link>
</li>
</ul>
    <div id="displayBook">
      <p> Title: ${book.title}</p>
      <p> Author: ${book.author}</p>
      <p> Description: ${book.description}</p>
      <p> ISBN: ${book.ISBN}</p>
      <p> Minimum Grade Level: ${book.minimumGradeLevel}</p>
      <p> Maximum Grade Level: ${book.maximumGradeLevel}</p>
      <p> Language: ${book.language}</p>
      <p> Category: ${book.category}</p>
    </div>
  </body>
</html>