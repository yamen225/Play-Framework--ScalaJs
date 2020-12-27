package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject._

@Singleton
class TaskList1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def taskList = Action {
    val tasks = List("task 1", "task 2", "task 3")
    Ok(views.html.taskList1(tasks))
  }
}
