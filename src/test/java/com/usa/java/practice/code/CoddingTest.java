package com.usa.java.practice.code;

import java.awt.Color;

public class CoddingTest {
	
	private Color[] colorArray = new Color[6];
	private int currentIndex = 0;

	public void addColorToArray(int red, int green, int blue) {
	  colorArray[currentIndex++] = new Color(red, green, blue);
	}

	}

