package io.hyte.api;

public interface Service {
	default String getName() { return getClass().getSimpleName(); }
	default int getNumber() { return 100; }
}
