import java.util.List;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class File {
	
	private String pathFile;
	private java.io.File file;
	
	public File(String path) {
		this.pathFile = path;
		this.file = new java.io.File(this.pathFile);	
	}
	
	
	public StringBuilder ReadAllFile() throws IOException {
		List<String> lines = FileUtils.readLines(this.file, "UTF-8");
		StringBuilder string = new StringBuilder();
		for (String line : lines) {
			string.append(line);
        }
		return string;
		
	}
	public String ReadAllString() throws IOException {
		String Sfile = FileUtils. readFileToString(this.file);
		return Sfile;
		
	}
	public byte[] ReadAllByte() throws IOException {
		byte[] Bfile = FileUtils. readFileToByteArray(file);
		return Bfile;
	}


	public String getPathFile() {
		return pathFile;
	}


	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}


	public java.io.File getFile() {
		return file;
	}


	public void setFile(java.io.File file) {
		this.file = file;
	}
	
}
