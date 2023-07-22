package task_1.facade

import task_1.data.Student
import task_1.managers.GradeCalculator
import task_1.managers.StudentInformation

class StudentFacade(private val gradeCalculator: GradeCalculator,private val studentInformation: StudentInformation) {

    fun calculateGrades(student: Student){
        gradeCalculator.calculateGrades(student)
    }

    fun printStudentInformation(student: Student){
        studentInformation.printStudentInformation(student)
    }
}