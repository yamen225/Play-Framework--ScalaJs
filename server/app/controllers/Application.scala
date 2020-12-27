package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import play.api.i18n._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def product(prodType: String, prodNumber: Int) = Action {
    Ok(s"Product Type is: $prodType and product number is: $prodNumber")
  }
  
}
