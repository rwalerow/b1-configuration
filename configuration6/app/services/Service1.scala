package services

import javax.inject._
import services.configuration.Config1

@Singleton
class Service1 @Inject()(config1: Config1) {

  def getUrl = config1.service1.url
}