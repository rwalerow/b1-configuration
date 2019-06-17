package configuration

import com.typesafe.config.Config

final case class ExternalApiConfig(url: String, port: Int)
final case class AppConfig(
  externalApi: ExternalApiConfig
)


object ConfigParser {

  def parseConfig(config: Config): AppConfig = {
    val externalApiConfig = {
      val url = config.getString("external-api.url")
      val port = config.getInt("external-api.port")

      ExternalApiConfig(
        url = url,
        port = port
      )
    }

    AppConfig(
      externalApi = externalApiConfig
    )
  }
}
