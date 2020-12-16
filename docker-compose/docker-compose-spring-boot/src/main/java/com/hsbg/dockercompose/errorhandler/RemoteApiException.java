package com.hsbg.dockercompose.errorhandler;


/**
 * @author Vilas Varghese
 * @since  06/10/2019.
 */
public class RemoteApiException extends Exception{
    private String code;
    private String feature;
    private String reason;

    public RemoteApiException(String feature, String code, String reason) {
        super(reason);
        this.reason=reason;
        this.feature = feature;
        this.code = code;
    }

	public RemoteApiException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RemoteApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RemoteApiException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RemoteApiException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RemoteApiException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
    
    
}
