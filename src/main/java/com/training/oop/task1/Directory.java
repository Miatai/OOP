package com.training.oop.task1;

import java.util.regex.Pattern;

public class Directory {
	private String directory;

	public Directory(String directory) {
		super();
		setDirectory(directory);
	}

	private boolean isDirectoryMatched(String path) {
		String regEx = "([a-zA-Z]:)?(\\\\[a-zA-Z0-9_.-]+)?\\\\";
//		Pattern pattern = Pattern.compile(regEx);
		return Pattern.matches(regEx, path);
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		if (isDirectoryMatched(directory)) {
			this.directory = directory;
		} else {
			this.directory = "";
			System.out.println("Неправильный формат дирректории. Вместо данных записана пустая строка.");
		}
	}

	@Override
	public String toString() {
		return directory;
	}

}
