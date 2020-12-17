package com.camundatask;

import java.io.IOException;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class UserClient {
	
	private ArrayList<User> users;
	private User user;
	
	public static void main(String [] args) {
		UserClient userClientObj = new UserClient();
		ArrayList<User> users = userClientObj.queryUsers();
		
		for (int i = 0 ; i < users.size();i++)
			System.out.println(users.get(i).getFirst_name() +" "+ users.get(i).getLast_name());
		
	}

	public ArrayList<User> queryUsers() {
		
		users = new ArrayList<User>();
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				Request request = new Request.Builder()
				  .url("https://reqres.in/api/users?page=1")
				  .method("GET", null)				  
				  .build();
	    try {
	    Response response = client.newCall(request).execute();
	    
	    String jsonString = response.body().string();
	    JSONObject myObject = new JSONObject(jsonString);
	    JSONArray array = myObject.getJSONArray("data");
	    
	    for (int i = 0; i < array.length(); i++) {
	    	user = new User();
	    	Long id = array.getJSONObject(i).getLong("id");
	    	String email = array.getJSONObject(i).getString("email");
	    	String first_name = array.getJSONObject(i).getString("first_name");
	    	String last_name = array.getJSONObject(i).getString("last_name");
	    	
	    	user.setId(id);
	    	user.setFirst_name(first_name);
	    	user.setLast_name(last_name);
	    	user.setEmail(email);
	    	
	    	users.add(user);
	    }
	    }
	    catch(IOException e) {
	    	System.out.println(e.getMessage());
	    }
		return users;
	    
	}

}
