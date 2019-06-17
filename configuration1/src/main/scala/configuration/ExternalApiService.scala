package configuration

import com.typesafe.config.Config

class ExternalApiService(config: Config) {

  private val externalApiUrl = config.getString("external-api.url")
  private val externalApiPort = config.getString("external-api.url")


  def apiCall(): Unit = {
    println(s"Api call with $externalApiUrl:$externalApiPort")
  }
}
