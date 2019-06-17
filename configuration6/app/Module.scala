import com.google.inject.AbstractModule
import java.time.Clock
import pureconfig.generic.auto._

import services.configuration.{Config1, Config2}

class Module extends AbstractModule {

  override def configure() = {

    val config1 = pureconfig.loadConfigOrThrow[Config1]
    val config2 = pureconfig.loadConfigOrThrow[Config2]

    bind(classOf[Config1]).toInstance(config1)
    bind(classOf[Config2]).toInstance(config2)
  }
}
