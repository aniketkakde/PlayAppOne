package controllers

import play.api._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import scala.concurrent.Future

import model.User

class Application extends Controller {

  def index = Action.async { implicit rs =>
    //Future.successful(Ok(htmlPages.html.portFolio()))
    Future.successful(Ok(pages.html.index("")))
  }


  def contactUs = Action.async { implicit rs =>
    //Future.successful(Ok(htmlPages.html.portFolio()))
    Future.successful(Ok(pages.html.contactUs("")))
  }

  def saveFeedBack = Action.async { implicit rs =>
    //Future.successful(Ok(htmlPages.html.portFolio()))
    Future.successful(Ok(pages.html.contactUs("")))
  }


  /* val anyData = Map("name" -> "bob", "age" -> "21")
   val userData = userForm.bind(anyData).get

   val userForm = Form(mapping("usersName" -> text, "age" -> number)(User.apply)(User.unapply))

   def displayUser = Action.async { implicit rs =>
     userForm.bindFromRequest.fold(
       error =>{
        Future.successful(BadRequest(pages.html.user(error)))
       },
       userData => {
         val newUser = model.User(userData.name, userData.age)
         //val id = model.User.create(newUser)
         Future.successful(Ok("Success"))
       })
   }*/


}