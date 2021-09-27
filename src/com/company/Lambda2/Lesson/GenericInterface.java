package com.company.Lambda2.Lesson;
@FunctionalInterface
public interface GenericInterface<T> {
    T executeOperation(T a, T b);
}
