package com.training.oop.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 1. ������� ������ ������ ��������� ����, ��������� ������ ����, ����������. 
//������: �������, �������������, ������� �� ������� ����������, ���������, �������.
public class TextFile extends File {
	private String content;

	public TextFile(String fileName, Directory directory, String content) {
		super(fileName, directory);
		this.content = content;
	}

	public void printContent() {
		System.out.println(content);
	}

	public void printFileContent() {
		System.out.println(readFileContent());
	}

	public void saveContentFromFile() {
		setContent(readFileContent());
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String readFileContent() {
		try {
			FileReader reader = new FileReader(getDirectoryAndName());
			StringBuilder sb = new StringBuilder();
			int i;
			while ((i = reader.read()) != -1) {
				sb.append((char) i);
			}
			reader.close();
			return sb.toString();
		} catch (FileNotFoundException fileNotFoundExceprion) {
			System.out.println("���� �� ������. ���������� ������ ������.");
			fileNotFoundExceprion.printStackTrace();
			return "";
		} catch (IOException ioException) {
			System.out.println("������ ������ �����. ���������� ������ ������.");
			ioException.printStackTrace();
			return "";
		}
	}

	public void addContent(String additionalContent) {
		content = content + additionalContent;
	}

	public void removeFromContent(int startIndex, int endIndex) {
		StringBuilder sb = new StringBuilder(content);
		sb.delete(startIndex, endIndex);
		content = sb.toString();
	}

	public void removeAllContent() {
		content = "";
	}

	public void saveContentToFile() {
		try {
			FileWriter writer = new FileWriter(getDirectoryAndName());
			writer.write(content);
			writer.close();
			System.out.println("������� ������� � ����.");
		} catch (IOException e) {
			System.out.println("�������� � ������� � ����!");
			e.printStackTrace();
		}
	}

}
