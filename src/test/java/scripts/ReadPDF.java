package scripts;

import utilities.PDFUtil;

public class ReadPDF {

	public static void main(String[] args) {
		String pdfText1 = PDFUtil.readPDF("TestFile.pdf");
		System.out.println(pdfText1);
		
		String pdfText2 = PDFUtil.readPDF("TestFile.pdf", 2, 2);
		System.out.println(pdfText2);
		
		System.out.println(pdfText2.contains("CI/CD capabilities"));

	}

}
