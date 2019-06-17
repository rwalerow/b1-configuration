package services

import javax.inject._
import services.configuration.Config2

@Singleton
class Service2 @Inject()(config2: Config2) {

  def getPort = config2.service2.port
}