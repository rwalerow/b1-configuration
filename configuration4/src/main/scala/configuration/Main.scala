package configuration

import pureconfig.generic.auto._

object Main extends App {

  val appConfig = pureconfig.loadConfigOrThrow[AppConfig]
  val externalApiService = new ExternalApiService(appConfig.externalApi)

  externalApiService.apiCall()
}
