/*
Задание 1
Создайте приложение для подсчета площади геометрических фигур.
Минимальные требования по фигурам:
 ■Треугольник;
 ■Прямоугольник;
 ■Квадрат;
 ■Ромб.
 Протестируйте все возможности приложения с использованием JUnit.

Задание 3
Создайте приложение для работы со строками.
Минимальные требования по функциональности:
 ■Проверка строки на палиндром;
 ■Проверка количества гласных;
 ■Проверка количества согласных;
 ■Подсчет количества вхождений слова в строку.
 Протестируйте все возможности приложения с использованием JUnit*/


public class Figures {
    public double AreaOfTriangle(double base, double high){
        return 0.5 * base * high;
    }
    public double AreaOfRectangle(double length, double width){
        return length * width;
    }
    public double AreaOfSquare(double length){
        return length * length;
    }
    public double AreaOfRhombus(double length, double high){
        return length * high;
    }
}