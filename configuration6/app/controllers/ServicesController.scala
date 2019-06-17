package controllers

import javax.inject._
import play.api.mvc._
import services.{Service1, Service2}

@Singleton
class ServicesController @Inject()(cc: ControllerComponents, service1: Service1, service2: Service2) extends AbstractController(cc) {

  def fullUrl = Action {
    val url = service1.getUrl
    val port = service2.getPort
    Ok(s"$url:$port")
  }
}
