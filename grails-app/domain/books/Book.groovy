package books

class Book {
    String title
    String author
    String description
    String ISBN
    
    int minimumGradeLevel
    int maximumGradeLevel
    String language
    String category
    
    static constraints = {
        title(blank: false)
        author(blank: false)
        description(maxSize:1000, blank:true)
        ISBN (matches: '^(97(8|9))?\\d{9}(\\d|X)\$' , blank:true)
        minimumGradeLevel(inList: [0, 1, 2, 3, 4, 5, 6], blank: false)
        maximumGradeLevel(inList: [0, 1, 2, 3, 4, 5, 6])
        language(inList: ["English", "Spanish", "French", "Arabic"])
        category(inList: ["General Leisure Reading", "Reading skills", "Math skills", "Health", "Science"])
        
    }
}