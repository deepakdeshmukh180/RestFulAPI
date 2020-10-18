package in.vertoz.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

import in.vertoz.dao.FailedObject;
import in.vertoz.dao.Filter;
import in.vertoz.dao.HostIdErrorResponse;
import in.vertoz.dao.HostIdRequest;
import in.vertoz.dao.HostIdResponse;
import in.vertoz.dao.ParamHost;
import in.vertoz.dao.Params;
import in.vertoz.dao.SucessObject;
import in.vertoz.dao.UserLoginRequest;

@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public ResponseEntity<String> getResponse() {
		
		 /*.1).USER Login ..*/ 
		String url="http://monitor.vertoz.com/zabbix/api_jsonrpc.php";
		UserLoginRequest request = new UserLoginRequest();
		request.setId(1);
		request.setMethod("user.login");
		request.setJsonrpc("2.0");
		request.setParams(new Params("sp.mishra", "Vertoz@123"));
		Gson gson = new Gson();
		System.out.println(gson.toJson(request));
		ResponseEntity<String> so = restTemplate.postForEntity(url,
				request, String.class);
		String str = so.getBody();
		System.out.println(str);
		SucessObject sucessObject = null;
		if (!(str.contains("error"))) {
			 sucessObject = gson.fromJson(str, SucessObject.class);
			System.out.println("(1)Request : RESPONSE :---> "+sucessObject.toString());
		} else {
			FailedObject error = gson.fromJson(str, FailedObject.class);
			System.out.println("(1)Request  : ERROR    :---> "+error.getError().getData());
		}
		
	      /*.2).getting host id ..*/ 	
		
	
		
		HostIdRequest hostIdRequest = new HostIdRequest();
		hostIdRequest.setAuth(sucessObject.getResult());
		hostIdRequest.setMethod("host.get");
		hostIdRequest.setId(1);
		hostIdRequest.setJsonrpc("2.0");
        ParamHost params = new ParamHost();
        ArrayList<String> output = new ArrayList<>();
        output.add("hostid");
        params.setOutput(output);
        Filter filter = new Filter();
        ArrayList<String> host = new ArrayList<>();
        host.add("Spdp-nginx-7-new");
        filter.setHost(host);
        params.setFilter(filter);
		hostIdRequest.setParams(params);
		
		System.out.println(gson.toJson(request));
		ResponseEntity<String> hostId = restTemplate.postForEntity(url,
				hostIdRequest, String.class);
		String body = hostId.getBody();
		System.out.println(body);
		HostIdResponse hostIdResponse = null;
		if (!(body.contains("error"))) {
			hostIdResponse = gson.fromJson(body, HostIdResponse.class);
			System.out.println("(2)Request RESPONSE :---> "+hostIdResponse.toString());
		} else {
			HostIdErrorResponse error = gson.fromJson(body, HostIdErrorResponse.class);
			System.out.println("(2)Request ERROR    :---> "+error.getError().getData());
		}
		
		return hostId;
	}

}
