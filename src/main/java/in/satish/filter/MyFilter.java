package in.satish.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;



import reactor.core.publisher.Mono;

@Component
public class MyFilter implements GlobalFilter {
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
           
		ServerHttpRequest request = exchange.getRequest();//used to capture the complete request from the browser
		
		HttpHeaders headers = request.getHeaders();
			
		Set<String> keySet = headers.keySet();
		
		keySet.forEach(
				   key-> {
					  System.out.println(key + " -- "+headers.getValuesAsList(key));   
				   }
				);
		
		
		return chain.filter(exchange);
	}
}
