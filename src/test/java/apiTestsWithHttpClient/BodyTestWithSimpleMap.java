package apiTestsWithHttpClient;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import static entitiesForHttpClientTests.User.*;


public class BodyTestWithSimpleMap extends ApiBase{

    @Test
    public void returnsCorrectLogin() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        String jsonBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(jsonBody);

        String loginValue = (String) getValueFor(jsonObject, LOGIN);

        Assert.assertEquals(loginValue, "zandeto");
    }
    @Test
    public void returnsCorrectId() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        String jsonBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(jsonBody);

        Integer loginValue = (Integer) getValueFor(jsonObject, ID);

        Assert.assertEquals(loginValue, Integer.valueOf(46777422));
    }

    @Test
    public void returnsCorrectType() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        String jsonBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(jsonBody);

        String loginValue = (String) getValueFor(jsonObject, TYPE);

        Assert.assertEquals(loginValue, "User");
    }

    @Test
    public void returnsCorrectName() throws IOException {

        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        String jsonBody = EntityUtils.toString(response.getEntity());

        JSONObject jsonObject = new JSONObject(jsonBody);

        String loginValue = (String) getValueFor(jsonObject, NAME);

        Assert.assertEquals(loginValue, "Alex");
    }

    private Object getValueFor(JSONObject jsonObject, String key) {

        return jsonObject.get(key);
    }
}
