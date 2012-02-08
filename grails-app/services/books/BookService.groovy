package books

class BookService {
    boolean transactional = false
    def getStaticBook() {
        return new Book(title: "Green Eggs and Ham", 
                        author: "Dr.Suess",
                        description: "book for kids" ,
                        ISBN: "54668749134561",
                        minimumGradeLevel: 1,
                        maximumGradeLevel: 5,
                        language: "English",
                        category: "Reading skills"
                        )
    }
    def getRandomBook() {
        def allBooks = Book.list()
        def randomBook = null
        if (allBooks.size() > 0) {
            def randomIdx = new Random().nextInt(allBooks.size())
            randomBook = allBooks[randomIdx]
        } else {
            randomBook = getStaticBook()
        }
        return randomBook
    }
}
