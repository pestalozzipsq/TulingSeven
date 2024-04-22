/**
 * Hello world!
 *
 */

//gc详情指令：-XX:+PrintGCDetails
public class App {
    public static void main( String[] args ) {
        // 获取 Java 版本
        String javaVersion = System.getProperty("java.version");

        // 打印 Java 版本
        System.out.println("Java 版本：" + javaVersion);
        // 获取 JVM 名称
        String jvmName = System.getProperty("java.vm.name");

        // 获取 JVM 版本
        String jvmVersion = System.getProperty("java.vm.version");

        // 获取 JVM 供应商
        String jvmVendor = System.getProperty("java.vm.vendor");

        // 打印 JVM 信息
        System.out.println("JVM 名称：" + jvmName);
        System.out.println("JVM 版本：" + jvmVersion);
        System.out.println("JVM 供应商：" + jvmVendor);
    }
}
