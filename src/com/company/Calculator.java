package com.company;

public class Calculator<T extends Number> implements MathematicalOperations<T> {

    @Override
    public Double plus(T firstT, T secondS) {
        return (firstT.doubleValue() + secondS.doubleValue());
    }

    @Override
    public Double multyply(T firstT, T secondS) {
        return (firstT.doubleValue() * secondS.doubleValue());
    }

    @Override
    public Double minus(T firstT, T secondS) {
        return (firstT.doubleValue() - secondS.doubleValue());
    }

    @Override
    public Double divigen(T firstT, T secondS) {
        return (firstT.doubleValue() / secondS.doubleValue());
    }
}
