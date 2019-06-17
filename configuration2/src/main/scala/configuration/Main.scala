package configuration

import com.typesafe.config.ConfigFactory

object Main extends App {

  val config = ConfigFactory.load()
  val externalApiService = new ExternalApiService(config)


  externalApiService.apiCall()
}
