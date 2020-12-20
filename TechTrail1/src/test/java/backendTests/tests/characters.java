package backendTests.tests;

import com.beust.jcommander.internal.Console;
import io.restassured.common.mapper.TypeRef;
import org.testng.annotations.Test;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class characters {

    private static final String baseURL = "https://www.breakingbadapi.com/api";//Ideally should come from some settings file.

    @Test
    public void printWaltersBDay(){
        List<Map<String,Object>> characters = get("https://www.breakingbadapi.com/api/characters/1").as(new TypeRef<List<Map<String, Object>>>() {});
        System.out.println(characters.get(0).get("birthday"));
    }

    @Test
    public void printAllCharacters(){
        List<Map<String,Object>> characters = get("https://www.breakingbadapi.com/api/characters").as(new TypeRef<List<Map<String, Object>>>() {});

        //TODO: figure out how the mapping to objects works

        for (int i =0; i<characters.size(); i++){
            System.out.println("Name: " + characters.get(i).get("name"));
            System.out.println("Portrayed: " + characters.get(i).get("portrayed"));
            System.out.println("---------------------------------");
        }

        
    }
}
