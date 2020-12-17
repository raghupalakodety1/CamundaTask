package main.com.camundatask;

import java.util.*;

public class UserClient {

    OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
    Request request = new Request.Builder()
            .url("https://reqres.in/api/users?page=1")
            .method("GET", null)
            .build();
    Response response = client.newCall(request).execute();

    System.out.println(response)
}
