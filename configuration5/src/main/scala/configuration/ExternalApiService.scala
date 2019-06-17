package configuration

class ExternalApiService(externalApiConfig: ExternalApiConfig) {

  def apiCall(): Unit = {
    println(s"Api call with ${externalApiConfig.url}:${externalApiConfig.port}")
  }
}
