package com.gmail.ptimofejev;

import java.util.Arrays;

public class Stack {
	private Object[] contents;
	private BlackList blacklistedClasses;

	public Stack() {

	}

	public Stack(Object[] contents, BlackList blacklistedClasses) {
		this.contents = contents;
		this.blacklistedClasses = blacklistedClasses;
	}

	public Object[] getContents() {
		return contents;
	}

	public void setContents(Object[] contents) {
		this.contents = contents;
	}

	public BlackList getBlacklistedClasses() {
		return blacklistedClasses;
	}

	public void setBlacklistedClasses(BlackList blacklistedClasses) {
		this.blacklistedClasses = blacklistedClasses;
	}

	public void addObjectToStack(Object entry) {
		if (!checkBlacklist(entry)) {
			Object[] temp = new Object[contents.length + 1];
			temp[0] = entry;
			if (contents.length > 0) {
				for (int i = 0; i < contents.length; i++) {
					temp[i + 1] = contents[i];
				}
			}
			contents = temp;
			System.out.println("New object added to Stack");
			return;
		}
		System.out.println("This Object`s Class is blacklisted by current Stack");
	}

	public Object getTopObject() {
		Object result = contents[0];
		return result;
	}

	public Object getTopAndDelete() {
		Object result = contents[0];
		deleteTopObject();
		return result;
	}

	public void deleteTopObject() {
		Object[] temp = Arrays.copyOfRange(contents, 1, contents.length - 1);
		contents = temp;
	}

	public boolean checkBlacklist(Object entry) {
		for (int i = 0; i < blacklistedClasses.getBlacklisted().length; i++) {
			if (entry.getClass().equals(blacklistedClasses.getBlacklisted()[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Stack contents: " + System.lineSeparator());
		for (int i = 0; i < contents.length; i++) {
			sb1.append((i + 1) + ": " + contents[i].toString() + System.lineSeparator());
		}
		sb1.append("Blacklisted Classes: " + System.lineSeparator());
		for (int i = 0; i < blacklistedClasses.getBlacklisted().length; i++) {
			sb1.append((i + 1) + ": " + blacklistedClasses.getBlacklisted()[i] + System.lineSeparator());
		}
		return sb1.toString();
	}

}
