/*
 * Example HelloWorldFile: print a "Hello, World" message to a
 * file.
 */

// we need to use a few more items from the Java API when writing files
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldFile {

    // we need to change up our main method signature just a bit --
    // it is possible that an error condition could occur if we try
    // to create a file and cannot do so.  There are a number of
    // mechanisms we can use to handle this in Java -- the simplest
    // and the one we'll use for now is to add this extra clause
    // to the end of our main method signature to say that it's OK
    // for that error to occur and essentially that our program can
    // just crash if that happens.
    public static void main(String[] args) throws IOException {
        
        // We create a PrintWriter on a File to be able to
        // write text to that file.  "hello.out" here is the name
        // of the file we wish to create.  It will be created in 
        // the same folder where our BlueJ project resides.
        // Beware: if the file previously existed, it will be
        // overwritten without warning!
        PrintWriter output = new PrintWriter(new File("hello.out"));
        
        // "output" can now be used like "System.out", except that
        // the things we print end up in the file instead of in
        // our terminal window.
        
        output.println("Hello, File Output World!");
        
        // when we finish with a file, we need to "close" it.  This tells
        // the operating system that it should make sure everything
        // we put into the file has been written to the disk.
        
        output.close();
        
    }
}