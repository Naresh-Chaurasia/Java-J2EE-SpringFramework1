package com.dp.mvc;

public class MVCDemo {
    public static void main(String[] args) {
        // Create model
        Student model = new Student("Alice", "101");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(model, view);

        // Display initial data
        controller.updateView();

        // Update model data
        controller.setStudentName("Bob");
        controller.setStudentRollNo("102");

        // Display updated data
        controller.updateView();
    }
}
