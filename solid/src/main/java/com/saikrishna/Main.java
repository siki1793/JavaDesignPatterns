package com.saikrishna;

/**
 * Example implementation for SOLID principal
 * <u>
 * <b>Single Responsibility:</b>
 * a class should only have one responsibility. Furthermore, it should only have one reason to
 * change. benefits: Testing, Lower coupling, Organization
 * </u>
 * ----------------------------------------------------------------
 * <u>
 * <b>Open for Extension, Closed for Modification:</b>
 * open-closed principle. Simply put, classes should be open for extension but closed for
 * modification.
 * </u>
 * <u>
 * <b>Liskov Substitution: </b>
 * if class A is a subtype of class B, we should be able to replace B with A without disrupting the
 * behavior of our program.
 * </u>
 * <u>
 * <b>Interface Segregation:</b>
 * larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing
 * classes only need to be concerned about the methods that are of interest to them
 * </u>
 * <u>
 * <b>Dependency Inversion:</b>
 * The principle of dependency inversion refers to the decoupling of software modules. This way,
 * instead of high-level modules depending on low-level modules, both will depend on abstractions.
 * </u>
 *
 * @author <a href="mailto:saikrishna.mundrathi@gmail.com>Saikrishna Mundrati</a>"
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}