package q6;
public class Main {
	
	public static void main(String [] args) {
	
	PDFDocument pdfDocument = new PDFDocument("I am the PDF Document!");
	WordDocument wordDocument= new WordDocument("I am the Word Document!");
	
	
	// Static olarak belirterek yeni bir obje olu�turmadan printer s�n�f�ndaki print methodlar�na ula�abildik. 

	Printer.printPDFDocument(pdfDocument);
	Printer.printWordDocument(wordDocument);
	
	
	}
	
}
