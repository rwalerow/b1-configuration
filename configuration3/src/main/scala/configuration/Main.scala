package configuration

import com.typesafe.config.ConfigFactory

object Main extends App {

  val config = ConfigFactory.load()
  val appConfig = ConfigParser.parseConfig(config)
  val externalApiService = new ExternalApiService(appConfig.externalApi)

  externalApiService.apiCall()
}
