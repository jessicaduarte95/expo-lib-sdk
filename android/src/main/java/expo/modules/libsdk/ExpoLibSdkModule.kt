package expo.modules.libsdk

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ExpoLibSdkModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ExpoSettings")

    Function("getTheme") {
      return@Function "system"
    }
  }
}
