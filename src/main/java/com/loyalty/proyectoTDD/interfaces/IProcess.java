package com.loyalty.proyectoTDD.interfaces;
@FunctionalInterface
public interface IProcess<T, U> {
    @SuppressWarnings("unchecked")
    T process(U... params);
}