
public static void cat(File file) {
	
	public static void main (String[] args) {
		RandomAccessFile input = null;
		String line = null;
	}

	try {
		input = new RandomAccessFile(file, "r");
		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}
		return;
	} 
	catch(FileNotFoundException fnf) {
		System.err.format("File: %s not found%n", file);
	} catch(IOException e) {
		System.err.println(e.toString());
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch(IOException io) {
			}
		}
	}
}