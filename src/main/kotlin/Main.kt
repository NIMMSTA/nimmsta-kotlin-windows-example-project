import com.nimmsta.core.jvm.framework.ConnectionManager
import com.nimmsta.core.shared.device.NIMMSTADevice
import com.nimmsta.core.shared.device.NIMMSTAEventHandler

class ExampleEventHandler: NIMMSTAEventHandler {

    override fun didStartConnecting(device: NIMMSTADevice) {
        // Connection process has started
        // Device interaction not yet possible
    }

    override fun didConnectAndInit(device: NIMMSTADevice) {
        // Device interaction is now possible
    }

}

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val connectionManager = ConnectionManager()
    val eventHandler = ExampleEventHandler()
    connectionManager.startReceivingEvents(eventHandler)
    connectionManager.displayConnectionActivity()

    // Prevent app from exiting
    while (true) {
        Thread.sleep(10)
    }
}