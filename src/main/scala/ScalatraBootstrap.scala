import com.example.app.{DocumentStore, DocumentsApp}
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    val store = DocumentStore("data")
    val app = new DocumentsApp(store)
    context.mount(app, "/*")
  }
}
