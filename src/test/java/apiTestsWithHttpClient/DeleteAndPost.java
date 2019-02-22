package apiTestsWithHttpClient;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilsForTheHttpClientTests.ApiCredentials;
import utilsForTheHttpClientTests.RequestUtils;
import java.io.IOException;


public class DeleteAndPost extends ApiBase {

    @Test
    public void createRepoReturns201() throws IOException {
        //Create an HttpPost with valid Endpoint
        HttpPost request = new HttpPost("https://api.github.com/user/repos");

        RequestUtils.setBasicAuthHeader(request);

        //Define Json to Post and set as Entity
        String json = "{\"name\": \"createRepoWithPostRequest\"}";
        request.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));

        //Send
        response = client.execute(request);

        int actualStatusCode = response.getStatusLine().getStatusCode();
        Assert.assertEquals(actualStatusCode, 201);
    }

    @Test
    public void deleteIsSuccessful() throws IOException {

        HttpDelete requеst = new HttpDelete("https://api.github.com/repos/zandeto/createRepoWithPostRequest");

        requеst.setHeader(HttpHeaders.AUTHORIZATION, "token " + ApiCredentials.ТОКЕН);

        response = client.execute(requеst);

        int actualStatusCode = response.getStatusLine().getStatusCode();

        Assert.assertEquals(actualStatusCode, 204);
    }
}
