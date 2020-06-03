package com.shaw.ediorderservices.factory;

public interface IFactory {

	public abstract Object getInstance(String type);

	public default Object getInstance(String type, boolean flag)
	{
		return null;
	}
}
