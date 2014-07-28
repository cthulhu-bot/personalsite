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

}