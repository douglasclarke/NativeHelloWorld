import org.yaml.snakeyaml.Yaml;

public class HelloWorld { 
    
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 

        Map<String, Object> data = new HashMap<String, Object>();
        data.put("Hello", "World");

       Yaml yaml = new Yaml();
       yaml.dump(data, System.out);
    } 
}
