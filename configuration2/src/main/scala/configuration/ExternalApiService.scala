package configuration

import com.typesafe.config.Config

class ExternalApiService(config: Config) {

  def apiCall(): Unit = {

    val externalApiUrl = config.getString("external-api.url")
    val externalApiPort = config.getString("external-api.url")

    println(s"Api call with $externalApiUrl:$externalApiPort")
  }
}
