package com.in28miniutes.microservices.limitsmicroservice.dto;

public class Limits {

	private int min;
	private int max;
	
	@Override
	public String toString() {
		return "Limits [min=" + min + ", max=" + max + "]";
	}
	protected Limits() {
		
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Limits(int min, int max) {
		this.min=min;
		this.max=max;
		// TODO Auto-generated constructor stub
	}
}
