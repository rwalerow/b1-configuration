package configuration

import pureconfig.generic.auto._

object Main extends App {

  val module1Config = pureconfig.loadConfigOrThrow[Module1Config]
  val module2Config = pureconfig.loadConfigOrThrow[Module2Config]
  val externalApiService = new ExternalApiService(module1Config.externalApi)

  externalApiService.apiCall()
}
