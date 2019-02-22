package utilsForTheHttpClientTests;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpPost;
import org.codehaus.plexus.util.Base64;

import java.nio.charset.Charset;

public class RequestUtils {

    public static void setBasicAuthHeader(HttpPost request){
        String auth = ApiCredentials.EMAIL + ":" + ApiCredentials.PASSWORD;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("ISO-8859-1")));
        String authHeader = "Basic " + new String(encodedAuth);
        request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
    }
}
