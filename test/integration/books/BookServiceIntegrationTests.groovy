package books

import grails.test.*
import org.junit.*
import assignment01.*


class BookServiceIntegrationTests extends GrailsUnitTestCase {

	def bookService
	
	void testStaticBook() {
		def staticBook = bookService.getStaticBook()
		assertEquals("Green Eggs and Ham", staticBook.title)
		assertEquals("Dr.Suess", staticBook.author)
	}
}


