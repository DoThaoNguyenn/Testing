package Common;

import java.io.File;

public class Utilities {
    public static String getProjectPath() {
    String projectPath = new File("D:\\JAVATEST\\Selenium1").getAbsolutePath();
    return projectPath;
    }
}
