package Com.Utils;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	String filepath;
	public JsonDataReader(String fileName) {
		filepath =System.getProperty("user.dir") + "\\src\\test\\java\\Com\\TestDat\\"+fileName+".json";
	}

	public String GetData(String key) {

		JSONParser parser = new JSONParser();
		String value = null;

		try (Reader reader = new FileReader(filepath)) {

			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			System.out.println(jsonObject);

			value = (String) jsonObject.get(key);
		}

		catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return value;
	}
}
