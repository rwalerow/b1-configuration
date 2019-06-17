package configuration

final case class ExternalApiConfig(url: String, port: Int)
final case class Module1Config(
  externalApi: ExternalApiConfig
)
