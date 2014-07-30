package controllers

import play.api._
import play.api.mvc._
import play.twirl.api.Html

object Application extends Controller {

  def index = Action {

    Ok(views.html.index("Your new application is ready."))
  }

  def log = Action {
    Ok(views.html.log("Web Log index page"))
  }

  def one = Action {
    Ok(views.html.one("Web log 1"))
  }

  def contact = Action {
    Ok(views.html.contact("Contact Page"))
  }

}