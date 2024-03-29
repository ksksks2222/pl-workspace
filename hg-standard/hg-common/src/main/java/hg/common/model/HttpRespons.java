package hg.common.model;

import java.util.Date;
import java.util.Vector;

public class HttpRespons {
	private String urlString;

	private int defaultPort;

	private String file;

	private String host;

	private String path;

	private int port;

	private String protocol;

	private String query;

	private String ref;

	private String userInfo;

	private String contentEncoding;

	private String content;

	private String contentType;

	private int code;

	private String message;

	private String method;

	private int connectTimeout;

	private int readTimeout;

	private Vector<String> contentCollection;

	private Long urlTimeOut;

	private Date sendTime;

	private Date handOverTime;
	
	

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Date getHandOverTime() {
		return handOverTime;
	}

	public void setHandOverTime(Date handOverTime) {
		this.handOverTime = handOverTime;
	}

	public Long getUrlTimeOut() {
		return urlTimeOut;
	}

	public void setUrlTimeOut(Long urlTimeOut) {
		this.urlTimeOut = urlTimeOut;
	}

	public String getUrlString() {
		return urlString;
	}

	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}

	public int getDefaultPort() {
		return defaultPort;
	}

	public void setDefaultPort(int defaultPort) {
		this.defaultPort = defaultPort;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}

	public String getContentEncoding() {
		return contentEncoding;
	}

	public void setContentEncoding(String contentEncoding) {
		this.contentEncoding = contentEncoding;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public Vector<String> getContentCollection() {
		return contentCollection;
	}

	public void setContentCollection(Vector<String> contentCollection) {
		this.contentCollection = contentCollection;
	}

}
