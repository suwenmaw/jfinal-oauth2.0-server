package cn.zhucongqi.oauth2.request;

import javax.servlet.http.HttpServletRequest;

import cn.zhucongqi.oauth2.base.request.OAuthRequest;
import cn.zhucongqi.oauth2.clientcredentials.ImplicitClientCredentials;

/**
 * ImplicitRequest
 * @author Jobsz
 */
public class ImplicitRequest extends OAuthRequest{

	public ImplicitRequest(HttpServletRequest request) {
		super(request);
		this.setClientClientCredentials(new ImplicitClientCredentials());
	}
}
