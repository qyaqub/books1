package books
////sjkhsuilhsujhssuhsuhklushsklhsl
class BookController {
    def scaffold = true
    def index = {  redirect(action: random) }
    def bookService
    def random = {
        def randomBook = bookService.getRandomBook()
        [ book : randomBook ]
    }
    def ajaxRandom = {
        def randomBook = bookService.getRandomBook()
        render "<p> Title: ${randomBook.title}</p>" + 
               "<p> Author: ${randomBook.author}</p>" +
               "<p> Description: ${randomBook.description}</p>" +
               "<p> ISBN: ${randomBook.ISBN}</p>" +
               "<p> Minimum Grade Level: ${randomBook.minimumGradeLevel}</p>" +
               "<p> Maximum Grade Level: ${randomBook.maximumGradeLevel}</p>" +
               "<p> Language: ${randomBook.language}</p>" +
               "<p> Category: ${randomBook.category}</p>"
    }
}
