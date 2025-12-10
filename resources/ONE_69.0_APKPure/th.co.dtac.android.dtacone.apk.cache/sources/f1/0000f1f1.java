package org.apache.http.impl.client;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.EnumSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class DefaultRedirectStrategy implements RedirectStrategy {
    public static final DefaultRedirectStrategy INSTANCE = new DefaultRedirectStrategy();
    @Deprecated
    public static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public static final int SC_PERMANENT_REDIRECT = 308;

    /* renamed from: a */
    public final Log f74155a;

    /* renamed from: b */
    public final String[] f74156b;

    public DefaultRedirectStrategy() {
        this(new String[]{"GET", "HEAD"});
    }

    public URI createLocationURI(String str) throws ProtocolException {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid redirect URI: " + str, e);
        }
    }

    public URI getLocationURI(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        EnumSet<URIUtils.UriFlag> enumSet;
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        Args.notNull(httpContext, "HTTP context");
        HttpClientContext adapt = HttpClientContext.adapt(httpContext);
        Header firstHeader = httpResponse.getFirstHeader(FirebaseAnalytics.Param.LOCATION);
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (this.f74155a.isDebugEnabled()) {
                Log log = this.f74155a;
                log.debug("Redirect requested to location '" + value + OperatorName.SHOW_TEXT_LINE);
            }
            RequestConfig requestConfig = adapt.getRequestConfig();
            URI createLocationURI = createLocationURI(value);
            try {
                if (requestConfig.isNormalizeUri()) {
                    createLocationURI = URIUtils.normalizeSyntax(createLocationURI);
                }
                if (!createLocationURI.isAbsolute()) {
                    if (requestConfig.isRelativeRedirectsAllowed()) {
                        HttpHost targetHost = adapt.getTargetHost();
                        Asserts.notNull(targetHost, "Target host");
                        URI uri = new URI(httpRequest.getRequestLine().getUri());
                        if (requestConfig.isNormalizeUri()) {
                            enumSet = URIUtils.NORMALIZE;
                        } else {
                            enumSet = URIUtils.NO_FLAGS;
                        }
                        createLocationURI = URIUtils.resolve(URIUtils.rewriteURI(uri, targetHost, enumSet), createLocationURI);
                    } else {
                        throw new ProtocolException("Relative redirect location '" + createLocationURI + "' not allowed");
                    }
                }
                RedirectLocations redirectLocations = (RedirectLocations) adapt.getAttribute("http.protocol.redirect-locations");
                if (redirectLocations == null) {
                    redirectLocations = new RedirectLocations();
                    httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
                }
                if (!requestConfig.isCircularRedirectsAllowed() && redirectLocations.contains(createLocationURI)) {
                    throw new CircularRedirectException("Circular redirect to '" + createLocationURI + OperatorName.SHOW_TEXT_LINE);
                }
                redirectLocations.add(createLocationURI);
                return createLocationURI;
            } catch (URISyntaxException e) {
                throw new ProtocolException(e.getMessage(), e);
            }
        }
        throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
    }

    @Override // org.apache.http.client.RedirectStrategy
    public HttpUriRequest getRedirect(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI locationURI = getLocationURI(httpRequest, httpResponse, httpContext);
        String method = httpRequest.getRequestLine().getMethod();
        if (method.equalsIgnoreCase("HEAD")) {
            return new HttpHead(locationURI);
        }
        if (method.equalsIgnoreCase("GET")) {
            return new HttpGet(locationURI);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != 307 && statusCode != 308) {
            return new HttpGet(locationURI);
        }
        return RequestBuilder.copy(httpRequest).setUri(locationURI).build();
    }

    public boolean isRedirectable(String str) {
        if (Arrays.binarySearch(this.f74156b, str) >= 0) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.client.RedirectStrategy
    public boolean isRedirected(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String method = httpRequest.getRequestLine().getMethod();
        Header firstHeader = httpResponse.getFirstHeader(FirebaseAnalytics.Param.LOCATION);
        if (statusCode != 307 && statusCode != 308) {
            switch (statusCode) {
                case 301:
                    break;
                case 302:
                    if (isRedirectable(method) && firstHeader != null) {
                        return true;
                    }
                    return false;
                case 303:
                    return true;
                default:
                    return false;
            }
        }
        return isRedirectable(method);
    }

    public DefaultRedirectStrategy(String[] strArr) {
        this.f74155a = LogFactory.getLog(getClass());
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f74156b = strArr2;
    }
}