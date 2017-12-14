/* Перехват unchecked исключений 09.08.05
В методе processExceptions обработайте все unchecked исключения.
*/

public class Solution
{
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (NullPointerException e1) {
            StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
            printStack(e1);
        }
        catch (IndexOutOfBoundsException e2) {
            StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
            printStack(e2);
        }
        catch (NumberFormatException e3) {
            StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
            printStack(e3);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1(){
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
