import java.util.Map;
import java.util.HashMap;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Optional;

import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.yaml.snakeyaml.Yaml;

public class HelloWorld { 
    
    public static void main(String[] args) { 
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("Hello", "World");

        Yaml yaml = new Yaml();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        yaml.dump(data, out);

        String schema = "type Query{hello: String}";
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
        Optional<?> typeDef = typeDefinitionRegistry.getType("Query");

        System.out.println(typeDef.toString());
    } 
}
