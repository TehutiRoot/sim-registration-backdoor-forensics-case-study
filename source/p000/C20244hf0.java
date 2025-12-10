package p000;

import android.os.Build;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.network.InstrHttpInputStream;
import com.google.firebase.perf.network.InstrHttpOutputStream;
import com.google.firebase.perf.network.NetworkRequestMetricBuilderUtil;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* renamed from: hf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20244hf0 {

    /* renamed from: f */
    public static final AndroidLogger f62539f = AndroidLogger.getInstance();

    /* renamed from: a */
    public final HttpURLConnection f62540a;

    /* renamed from: b */
    public final NetworkRequestMetricBuilder f62541b;

    /* renamed from: c */
    public long f62542c = -1;

    /* renamed from: d */
    public long f62543d = -1;

    /* renamed from: e */
    public final Timer f62544e;

    public C20244hf0(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f62540a = httpURLConnection;
        this.f62541b = networkRequestMetricBuilder;
        this.f62544e = timer;
        networkRequestMetricBuilder.setUrl(httpURLConnection.getURL().toString());
    }

    /* renamed from: A */
    public boolean m30845A() {
        return this.f62540a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m30844B() {
        m30818a0();
        return this.f62540a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m30843C() {
        try {
            OutputStream outputStream = this.f62540a.getOutputStream();
            if (outputStream != null) {
                return new InstrHttpOutputStream(outputStream, this.f62541b, this.f62544e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission m30842D() {
        try {
            return this.f62540a.getPermission();
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: E */
    public int m30841E() {
        return this.f62540a.getReadTimeout();
    }

    /* renamed from: F */
    public String m30840F() {
        return this.f62540a.getRequestMethod();
    }

    /* renamed from: G */
    public Map m30839G() {
        return this.f62540a.getRequestProperties();
    }

    /* renamed from: H */
    public String m30838H(String str) {
        return this.f62540a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m30837I() {
        m30818a0();
        if (this.f62543d == -1) {
            long durationMicros = this.f62544e.getDurationMicros();
            this.f62543d = durationMicros;
            this.f62541b.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            int responseCode = this.f62540a.getResponseCode();
            this.f62541b.setHttpResponseCode(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: J */
    public String m30836J() {
        m30818a0();
        if (this.f62543d == -1) {
            long durationMicros = this.f62544e.getDurationMicros();
            this.f62543d = durationMicros;
            this.f62541b.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            String responseMessage = this.f62540a.getResponseMessage();
            this.f62541b.setHttpResponseCode(this.f62540a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL m30835K() {
        return this.f62540a.getURL();
    }

    /* renamed from: L */
    public boolean m30834L() {
        return this.f62540a.getUseCaches();
    }

    /* renamed from: M */
    public void m30833M(boolean z) {
        this.f62540a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void m30832N(int i) {
        this.f62540a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void m30831O(int i) {
        this.f62540a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void m30830P(boolean z) {
        this.f62540a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void m30829Q(boolean z) {
        this.f62540a.setDoInput(z);
    }

    /* renamed from: R */
    public void m30828R(boolean z) {
        this.f62540a.setDoOutput(z);
    }

    /* renamed from: S */
    public void m30827S(int i) {
        this.f62540a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void m30826T(long j) {
        this.f62540a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void m30825U(long j) {
        this.f62540a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void m30824V(boolean z) {
        this.f62540a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void m30823W(int i) {
        this.f62540a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void m30822X(String str) {
        this.f62540a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m30821Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f62541b.setUserAgent(str2);
        }
        this.f62540a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m30820Z(boolean z) {
        this.f62540a.setUseCaches(z);
    }

    /* renamed from: a */
    public void m30819a(String str, String str2) {
        this.f62540a.addRequestProperty(str, str2);
    }

    /* renamed from: a0 */
    public final void m30818a0() {
        if (this.f62542c == -1) {
            this.f62544e.reset();
            long micros = this.f62544e.getMicros();
            this.f62542c = micros;
            this.f62541b.setRequestStartTimeMicros(micros);
        }
        String m30840F = m30840F();
        if (m30840F != null) {
            this.f62541b.setHttpMethod(m30840F);
        } else if (m30803o()) {
            this.f62541b.setHttpMethod("POST");
        } else {
            this.f62541b.setHttpMethod("GET");
        }
    }

    /* renamed from: b */
    public void m30817b() {
        if (this.f62542c == -1) {
            this.f62544e.reset();
            long micros = this.f62544e.getMicros();
            this.f62542c = micros;
            this.f62541b.setRequestStartTimeMicros(micros);
        }
        try {
            this.f62540a.connect();
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: b0 */
    public boolean m30816b0() {
        return this.f62540a.usingProxy();
    }

    /* renamed from: c */
    public void m30815c() {
        this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
        this.f62541b.build();
        this.f62540a.disconnect();
    }

    /* renamed from: d */
    public boolean m30814d() {
        return this.f62540a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m30813e() {
        return this.f62540a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f62540a.equals(obj);
    }

    /* renamed from: f */
    public Object m30812f() {
        m30818a0();
        this.f62541b.setHttpResponseCode(this.f62540a.getResponseCode());
        try {
            Object content = this.f62540a.getContent();
            if (content instanceof InputStream) {
                this.f62541b.setResponseContentType(this.f62540a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f62541b, this.f62544e);
            }
            this.f62541b.setResponseContentType(this.f62540a.getContentType());
            this.f62541b.setResponsePayloadBytes(this.f62540a.getContentLength());
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            this.f62541b.build();
            return content;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object m30811g(Class[] clsArr) {
        m30818a0();
        this.f62541b.setHttpResponseCode(this.f62540a.getResponseCode());
        try {
            Object content = this.f62540a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f62541b.setResponseContentType(this.f62540a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f62541b, this.f62544e);
            }
            this.f62541b.setResponseContentType(this.f62540a.getContentType());
            this.f62541b.setResponsePayloadBytes(this.f62540a.getContentLength());
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            this.f62541b.build();
            return content;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }

    /* renamed from: h */
    public String m30810h() {
        m30818a0();
        return this.f62540a.getContentEncoding();
    }

    public int hashCode() {
        return this.f62540a.hashCode();
    }

    /* renamed from: i */
    public int m30809i() {
        m30818a0();
        return this.f62540a.getContentLength();
    }

    /* renamed from: j */
    public long m30808j() {
        long contentLengthLong;
        m30818a0();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = this.f62540a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    /* renamed from: k */
    public String m30807k() {
        m30818a0();
        return this.f62540a.getContentType();
    }

    /* renamed from: l */
    public long m30806l() {
        m30818a0();
        return this.f62540a.getDate();
    }

    /* renamed from: m */
    public boolean m30805m() {
        return this.f62540a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m30804n() {
        return this.f62540a.getDoInput();
    }

    /* renamed from: o */
    public boolean m30803o() {
        return this.f62540a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m30802p() {
        m30818a0();
        try {
            this.f62541b.setHttpResponseCode(this.f62540a.getResponseCode());
        } catch (IOException unused) {
            f62539f.debug("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f62540a.getErrorStream();
        if (errorStream != null) {
            return new InstrHttpInputStream(errorStream, this.f62541b, this.f62544e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long m30801q() {
        m30818a0();
        return this.f62540a.getExpiration();
    }

    /* renamed from: r */
    public String m30800r(int i) {
        m30818a0();
        return this.f62540a.getHeaderField(i);
    }

    /* renamed from: s */
    public String m30799s(String str) {
        m30818a0();
        return this.f62540a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m30798t(String str, long j) {
        m30818a0();
        return this.f62540a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f62540a.toString();
    }

    /* renamed from: u */
    public int m30797u(String str, int i) {
        m30818a0();
        return this.f62540a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String m30796v(int i) {
        m30818a0();
        return this.f62540a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long m30795w(String str, long j) {
        long headerFieldLong;
        m30818a0();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = this.f62540a.getHeaderFieldLong(str, j);
            return headerFieldLong;
        }
        return 0L;
    }

    /* renamed from: x */
    public Map m30794x() {
        m30818a0();
        return this.f62540a.getHeaderFields();
    }

    /* renamed from: y */
    public long m30793y() {
        return this.f62540a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m30792z() {
        m30818a0();
        this.f62541b.setHttpResponseCode(this.f62540a.getResponseCode());
        this.f62541b.setResponseContentType(this.f62540a.getContentType());
        try {
            InputStream inputStream = this.f62540a.getInputStream();
            if (inputStream != null) {
                return new InstrHttpInputStream(inputStream, this.f62541b, this.f62544e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f62541b.setTimeToResponseCompletedMicros(this.f62544e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f62541b);
            throw e;
        }
    }
}
