package configuration

final case class RedisConfig(url: String, port: Int)
final case class Module2Config(
  redisConfig: RedisConfig
)
