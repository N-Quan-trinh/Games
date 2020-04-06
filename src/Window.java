import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class Window {
    private int height, width;
    private String title;
    private long window;

     Window(int height, int width, String title){
        this.height = height;
        this.width = width;
        this.title = title;

    }
    public void windowCreate(){
         if(!GLFW.glfwInit()){
             System.err.println("ERROR:  scouldn't initialize window");
             System.exit(-1);
         }
         window = GLFW.glfwCreateWindow(this.width, this.height, title, 0, 0 );
         if (window == 0){
             System.err.println("ERROR: could'nt create window");
         }
        GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
        GLFW.glfwSetWindowPos(window, videoMode.width() - this.width, videoMode.height() - this.height);
    }
}
