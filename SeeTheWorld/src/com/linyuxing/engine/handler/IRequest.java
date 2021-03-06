package com.linyuxing.engine.handler;


import com.lidroid.xutils.http.RequestParams;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest.HttpMethod;

/**
 * @ClassName: RequestHandlerInf
 * @Description: TODO  请求发送接口
 * @author FH
 * @date 2015年2月5日 上午10:49:07
 * 
*/

public interface IRequest {

	public <T> void send(String url, HttpMethod method, Object obj, RequestCallBack<T> callBack);
	
	public <T> void send(String url,HttpMethod method,RequestCallBack<T> callBack);
	
	public <T> void send(String url,HttpMethod method,RequestParams params,RequestCallBack<T> callBack);
    
	public <T> void send(String url,HttpMethod method,Object obj,RequestParams params,RequestCallBack<T> callBack);
}
