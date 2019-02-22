package apiTestsWithHttpClient;

import entitiesForHttpClientTests.NotFound;
import entitiesForHttpClientTests.RateLimit;
import entitiesForHttpClientTests.User;
import org.apache.http.client.methods.HttpGet;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilsForTheHttpClientTests.ResponseUtils;
import java.io.IOException;

public class BodyTestWithJackson extends ApiBase {

    @Test
    public void returnsCorrectLogin() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        User user = ResponseUtils.unmarshallGeneric(response, User.class);

        Assert.assertEquals(user.getLogin(), "zandeto");
    }

    @Test
    public void returnsCorrectId() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        User user = ResponseUtils.unmarshallGeneric(response, User.class);

        Assert.assertEquals(user.getId(), 46777422);
    }
    @Test
    public void returnsCorrectType() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        User user = ResponseUtils.unmarshallGeneric(response, User.class);

        Assert.assertEquals(user.getType(), "User");
    }

    @Test
    public void returnsCorrectName() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/users/zandeto");
        response = client.execute(get);

        User user = ResponseUtils.unmarshallGeneric(response, User.class);

        Assert.assertEquals(user.getName(), "Alex");
    }
    @Test
    public void notFoundMessageIsCorrect() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/nonexistingendpoint");
        response = client.execute(get);

        NotFound notFoundMessage = ResponseUtils.unmarshallGeneric(response, NotFound.class);

        Assert.assertEquals(notFoundMessage.getMessage(), "Not Found");
    }
    @Test
    public void correctRateLimitsAreSet() throws IOException {
        HttpGet get = new HttpGet(BASE_ENDPOINT + "/rate_limit");
        response = client.execute(get);

        RateLimit rateLimits = ResponseUtils.unmarshallGeneric(response, RateLimit.class);

        Assert.assertEquals(rateLimits.getCoreLimit(), 60);
        Assert.assertEquals(rateLimits.getSearchLimit(), "10");
    }



}
