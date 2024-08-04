
public class Test {
	public static void main(String[] args) {

		WordDocumentFactory Word_Doc_Obj = new WordDocumentFactory();
		Word_Doc_Obj.createDocument().write();

		PdfDocumentFactory Pdf_Doc_Obj = new PdfDocumentFactory();
		Pdf_Doc_Obj.createDocument().write();

		ExcelDocumentFactory Excel_Doc_Obj = new ExcelDocumentFactory();
		Excel_Doc_Obj.createDocument().write();

	}
}
