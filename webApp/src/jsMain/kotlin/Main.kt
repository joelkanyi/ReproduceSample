import com.joelkanyi.reproducebugsample.Main
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("ReproduceBugSample") {
            Main()
        }
    }
}
