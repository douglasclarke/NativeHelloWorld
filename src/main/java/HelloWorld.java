import java.util.Map;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import org.yaml.snakeyaml.Yaml;

public class HelloWorld { 
    
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("Hello", "World");

       Yaml yaml = new Yaml();
       BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
       yaml.dump(data, out);
    } 
}
