package com.gmail.ptimofejev;

import java.util.Arrays;

public class BlackList {
	private Class[] blacklisted;

	public BlackList() {

	}

	public BlackList(Class[] blacklisted) {
		this.blacklisted = blacklisted;
	}

	public Class[] getBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(Class[] blacklisted) {
		this.blacklisted = blacklisted;
	}

	public void addClassToBlackList(Class addedClass) {
		Class[] temp = Arrays.copyOf(blacklisted, blacklisted.length + 1);
		temp[temp.length - 1] = addedClass;
		blacklisted = temp;
	}

	@Override
	public String toString() {
		return "BlackList [blacklisted=" + Arrays.toString(blacklisted) + "]";
	}

}
