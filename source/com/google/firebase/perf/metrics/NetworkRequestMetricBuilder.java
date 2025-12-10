package com.google.firebase.perf.metrics;

import androidx.annotation.Nullable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.p016v1.NetworkRequestMetric;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class NetworkRequestMetricBuilder extends AppStateUpdateHandler implements SessionAwareObject {

    /* renamed from: i */
    public static final AndroidLogger f56186i = AndroidLogger.getInstance();

    /* renamed from: a */
    public final List f56187a;

    /* renamed from: b */
    public final GaugeManager f56188b;

    /* renamed from: c */
    public final TransportManager f56189c;

    /* renamed from: d */
    public final NetworkRequestMetric.Builder f56190d;

    /* renamed from: e */
    public final WeakReference f56191e;

    /* renamed from: f */
    public String f56192f;

    /* renamed from: g */
    public boolean f56193g;

    /* renamed from: h */
    public boolean f56194h;

    public NetworkRequestMetricBuilder(TransportManager transportManager) {
        this(transportManager, AppStateMonitor.getInstance(), GaugeManager.getInstance());
    }

    /* renamed from: b */
    private boolean m38245b() {
        return this.f56190d.hasClientStartTimeUs();
    }

    public static NetworkRequestMetricBuilder builder(TransportManager transportManager) {
        return new NetworkRequestMetricBuilder(transportManager);
    }

    /* renamed from: c */
    private boolean m38244c() {
        return this.f56190d.hasTimeToResponseCompletedUs();
    }

    /* renamed from: d */
    public static boolean m38243d(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public List m38246a() {
        List unmodifiableList;
        synchronized (this.f56187a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (PerfSession perfSession : this.f56187a) {
                    if (perfSession != null) {
                        arrayList.add(perfSession);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unmodifiableList;
    }

    public NetworkRequestMetric build() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f56191e);
        unregisterForAppState();
        com.google.firebase.perf.p016v1.PerfSession[] buildAndSort = PerfSession.buildAndSort(m38246a());
        if (buildAndSort != null) {
            this.f56190d.addAllPerfSessions(Arrays.asList(buildAndSort));
        }
        NetworkRequestMetric build = this.f56190d.build();
        if (!NetworkRequestMetricBuilderUtil.isAllowedUserAgent(this.f56192f)) {
            f56186i.debug("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        } else if (!this.f56193g) {
            this.f56189c.log(build, getAppState());
            this.f56193g = true;
            return build;
        } else {
            if (this.f56194h) {
                f56186i.debug("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
    }

    public long getTimeToResponseInitiatedMicros() {
        return this.f56190d.getTimeToResponseInitiatedUs();
    }

    public String getUrl() {
        return this.f56190d.getUrl();
    }

    public boolean hasHttpResponseCode() {
        return this.f56190d.hasHttpResponseCode();
    }

    public NetworkRequestMetricBuilder setCustomAttributes(Map<String, String> map) {
        this.f56190d.clearCustomAttributes().putAllCustomAttributes(map);
        return this;
    }

    public NetworkRequestMetricBuilder setHttpMethod(@Nullable String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            NetworkRequestMetric.HttpMethod httpMethod2 = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case 1:
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case 2:
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case 3:
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case 4:
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case 5:
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case 6:
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case 7:
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case '\b':
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f56190d.setHttpMethod(httpMethod);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setHttpResponseCode(int i) {
        this.f56190d.setHttpResponseCode(i);
        return this;
    }

    public void setManualNetworkRequestMetric() {
        this.f56194h = true;
    }

    public NetworkRequestMetricBuilder setNetworkClientErrorReason() {
        this.f56190d.setNetworkClientErrorReason(NetworkRequestMetric.NetworkClientErrorReason.GENERIC_CLIENT_ERROR);
        return this;
    }

    public NetworkRequestMetricBuilder setRequestPayloadBytes(long j) {
        this.f56190d.setRequestPayloadBytes(j);
        return this;
    }

    public NetworkRequestMetricBuilder setRequestStartTimeMicros(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f56191e);
        this.f56190d.setClientStartTimeUs(j);
        updateSession(perfSession);
        if (perfSession.isGaugeAndEventCollectionEnabled()) {
            this.f56188b.collectGaugeMetricOnce(perfSession.getTimer());
        }
        return this;
    }

    public NetworkRequestMetricBuilder setResponseContentType(@Nullable String str) {
        if (str == null) {
            this.f56190d.clearResponseContentType();
            return this;
        }
        if (m38243d(str)) {
            this.f56190d.setResponseContentType(str);
        } else {
            AndroidLogger androidLogger = f56186i;
            androidLogger.warn("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public NetworkRequestMetricBuilder setResponsePayloadBytes(long j) {
        this.f56190d.setResponsePayloadBytes(j);
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToRequestCompletedMicros(long j) {
        this.f56190d.setTimeToRequestCompletedUs(j);
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToResponseCompletedMicros(long j) {
        this.f56190d.setTimeToResponseCompletedUs(j);
        if (SessionManager.getInstance().perfSession().isGaugeAndEventCollectionEnabled()) {
            this.f56188b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().getTimer());
        }
        return this;
    }

    public NetworkRequestMetricBuilder setTimeToResponseInitiatedMicros(long j) {
        this.f56190d.setTimeToResponseInitiatedUs(j);
        return this;
    }

    public NetworkRequestMetricBuilder setUrl(@Nullable String str) {
        if (str != null) {
            this.f56190d.setUrl(Utils.truncateURL(Utils.stripSensitiveInfo(str), Constants.MAX_URL_LENGTH));
        }
        return this;
    }

    public NetworkRequestMetricBuilder setUserAgent(@Nullable String str) {
        this.f56192f = str;
        return this;
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public void updateSession(PerfSession perfSession) {
        if (perfSession == null) {
            f56186i.warn("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (m38245b() && !m38244c()) {
            this.f56187a.add(perfSession);
        }
    }

    public NetworkRequestMetricBuilder(TransportManager transportManager, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.f56190d = NetworkRequestMetric.newBuilder();
        this.f56191e = new WeakReference(this);
        this.f56189c = transportManager;
        this.f56188b = gaugeManager;
        this.f56187a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
