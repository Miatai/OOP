package com.training.oop.task1;

import java.io.IOException;

public class File {
	protected String fileName;
	protected Directory directory;

	public File(String fileName, Directory directory) {
		super();
		this.fileName = fileName;
		this.directory = directory;
	}

	public File() {}

	public void renameFile(String newName) {
		fileName = newName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Directory getDirectory() {
		return directory;
	}

	public void setDirectory(Directory directory) {
		this.directory = directory;
	}

	public void createFile() {
		try {
			java.io.File file = new java.io.File(getDirectoryAndName());
			if (file.createNewFile()) {
				System.out.println("Файл создан: " + getFileName());
			} else {
				System.out.println("Файл с таким именем уже существует.");
			}
		} catch (IOException e) {
			System.out.println("Проблема с созданием файла!");
			e.printStackTrace();
		}
	}

	public void deleteFile() {
		java.io.File file = new java.io.File(getDirectoryAndName());
		if (file.delete()) {
			System.out.println("Файл успешно удален.");
		} else {
			System.out.println("Не удалось удалить файл.");
		}
	}

	public String getDirectoryAndName() {
		return getDirectory() + getFileName();
	}

}
