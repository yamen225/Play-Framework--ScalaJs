package controllers

import play.api.mvc.{AbstractController, ControllerComponents}

import javax.inject._

@Singleton
class TaskList1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def taskList = Action {
    Ok("This Works!")
  }
}
