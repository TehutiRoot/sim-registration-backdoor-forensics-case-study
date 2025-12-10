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

/* renamed from: nf0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21336nf0 {

    /* renamed from: f */
    public static final AndroidLogger f72525f = AndroidLogger.getInstance();

    /* renamed from: a */
    public final HttpURLConnection f72526a;

    /* renamed from: b */
    public final NetworkRequestMetricBuilder f72527b;

    /* renamed from: c */
    public long f72528c = -1;

    /* renamed from: d */
    public long f72529d = -1;

    /* renamed from: e */
    public final Timer f72530e;

    public C21336nf0(HttpURLConnection httpURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        this.f72526a = httpURLConnection;
        this.f72527b = networkRequestMetricBuilder;
        this.f72530e = timer;
        networkRequestMetricBuilder.setUrl(httpURLConnection.getURL().toString());
    }

    /* renamed from: A */
    public boolean m26332A() {
        return this.f72526a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long m26331B() {
        m26305a0();
        return this.f72526a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream m26330C() {
        try {
            OutputStream outputStream = this.f72526a.getOutputStream();
            if (outputStream != null) {
                return new InstrHttpOutputStream(outputStream, this.f72527b, this.f72530e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission m26329D() {
        try {
            return this.f72526a.getPermission();
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: E */
    public int m26328E() {
        return this.f72526a.getReadTimeout();
    }

    /* renamed from: F */
    public String m26327F() {
        return this.f72526a.getRequestMethod();
    }

    /* renamed from: G */
    public Map m26326G() {
        return this.f72526a.getRequestProperties();
    }

    /* renamed from: H */
    public String m26325H(String str) {
        return this.f72526a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int m26324I() {
        m26305a0();
        if (this.f72529d == -1) {
            long durationMicros = this.f72530e.getDurationMicros();
            this.f72529d = durationMicros;
            this.f72527b.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            int responseCode = this.f72526a.getResponseCode();
            this.f72527b.setHttpResponseCode(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: J */
    public String m26323J() {
        m26305a0();
        if (this.f72529d == -1) {
            long durationMicros = this.f72530e.getDurationMicros();
            this.f72529d = durationMicros;
            this.f72527b.setTimeToResponseInitiatedMicros(durationMicros);
        }
        try {
            String responseMessage = this.f72526a.getResponseMessage();
            this.f72527b.setHttpResponseCode(this.f72526a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL m26322K() {
        return this.f72526a.getURL();
    }

    /* renamed from: L */
    public boolean m26321L() {
        return this.f72526a.getUseCaches();
    }

    /* renamed from: M */
    public void m26320M(boolean z) {
        this.f72526a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void m26319N(int i) {
        this.f72526a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void m26318O(int i) {
        this.f72526a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void m26317P(boolean z) {
        this.f72526a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void m26316Q(boolean z) {
        this.f72526a.setDoInput(z);
    }

    /* renamed from: R */
    public void m26315R(boolean z) {
        this.f72526a.setDoOutput(z);
    }

    /* renamed from: S */
    public void m26314S(int i) {
        this.f72526a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void m26313T(long j) {
        this.f72526a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void m26312U(long j) {
        this.f72526a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void m26311V(boolean z) {
        this.f72526a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void m26310W(int i) {
        this.f72526a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void m26309X(String str) {
        this.f72526a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void m26308Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f72527b.setUserAgent(str2);
        }
        this.f72526a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void m26307Z(boolean z) {
        this.f72526a.setUseCaches(z);
    }

    /* renamed from: a */
    public void m26306a(String str, String str2) {
        this.f72526a.addRequestProperty(str, str2);
    }

    /* renamed from: a0 */
    public final void m26305a0() {
        if (this.f72528c == -1) {
            this.f72530e.reset();
            long micros = this.f72530e.getMicros();
            this.f72528c = micros;
            this.f72527b.setRequestStartTimeMicros(micros);
        }
        String m26327F = m26327F();
        if (m26327F != null) {
            this.f72527b.setHttpMethod(m26327F);
        } else if (m26290o()) {
            this.f72527b.setHttpMethod("POST");
        } else {
            this.f72527b.setHttpMethod("GET");
        }
    }

    /* renamed from: b */
    public void m26304b() {
        if (this.f72528c == -1) {
            this.f72530e.reset();
            long micros = this.f72530e.getMicros();
            this.f72528c = micros;
            this.f72527b.setRequestStartTimeMicros(micros);
        }
        try {
            this.f72526a.connect();
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: b0 */
    public boolean m26303b0() {
        return this.f72526a.usingProxy();
    }

    /* renamed from: c */
    public void m26302c() {
        this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
        this.f72527b.build();
        this.f72526a.disconnect();
    }

    /* renamed from: d */
    public boolean m26301d() {
        return this.f72526a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int m26300e() {
        return this.f72526a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f72526a.equals(obj);
    }

    /* renamed from: f */
    public Object m26299f() {
        m26305a0();
        this.f72527b.setHttpResponseCode(this.f72526a.getResponseCode());
        try {
            Object content = this.f72526a.getContent();
            if (content instanceof InputStream) {
                this.f72527b.setResponseContentType(this.f72526a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f72527b, this.f72530e);
            }
            this.f72527b.setResponseContentType(this.f72526a.getContentType());
            this.f72527b.setResponsePayloadBytes(this.f72526a.getContentLength());
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            this.f72527b.build();
            return content;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object m26298g(Class[] clsArr) {
        m26305a0();
        this.f72527b.setHttpResponseCode(this.f72526a.getResponseCode());
        try {
            Object content = this.f72526a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f72527b.setResponseContentType(this.f72526a.getContentType());
                return new InstrHttpInputStream((InputStream) content, this.f72527b, this.f72530e);
            }
            this.f72527b.setResponseContentType(this.f72526a.getContentType());
            this.f72527b.setResponsePayloadBytes(this.f72526a.getContentLength());
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            this.f72527b.build();
            return content;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }

    /* renamed from: h */
    public String m26297h() {
        m26305a0();
        return this.f72526a.getContentEncoding();
    }

    public int hashCode() {
        return this.f72526a.hashCode();
    }

    /* renamed from: i */
    public int m26296i() {
        m26305a0();
        return this.f72526a.getContentLength();
    }

    /* renamed from: j */
    public long m26295j() {
        long contentLengthLong;
        m26305a0();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = this.f72526a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    /* renamed from: k */
    public String m26294k() {
        m26305a0();
        return this.f72526a.getContentType();
    }

    /* renamed from: l */
    public long m26293l() {
        m26305a0();
        return this.f72526a.getDate();
    }

    /* renamed from: m */
    public boolean m26292m() {
        return this.f72526a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean m26291n() {
        return this.f72526a.getDoInput();
    }

    /* renamed from: o */
    public boolean m26290o() {
        return this.f72526a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream m26289p() {
        m26305a0();
        try {
            this.f72527b.setHttpResponseCode(this.f72526a.getResponseCode());
        } catch (IOException unused) {
            f72525f.debug("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f72526a.getErrorStream();
        if (errorStream != null) {
            return new InstrHttpInputStream(errorStream, this.f72527b, this.f72530e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long m26288q() {
        m26305a0();
        return this.f72526a.getExpiration();
    }

    /* renamed from: r */
    public String m26287r(int i) {
        m26305a0();
        return this.f72526a.getHeaderField(i);
    }

    /* renamed from: s */
    public String m26286s(String str) {
        m26305a0();
        return this.f72526a.getHeaderField(str);
    }

    /* renamed from: t */
    public long m26285t(String str, long j) {
        m26305a0();
        return this.f72526a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f72526a.toString();
    }

    /* renamed from: u */
    public int m26284u(String str, int i) {
        m26305a0();
        return this.f72526a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String m26283v(int i) {
        m26305a0();
        return this.f72526a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long m26282w(String str, long j) {
        long headerFieldLong;
        m26305a0();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = this.f72526a.getHeaderFieldLong(str, j);
            return headerFieldLong;
        }
        return 0L;
    }

    /* renamed from: x */
    public Map m26281x() {
        m26305a0();
        return this.f72526a.getHeaderFields();
    }

    /* renamed from: y */
    public long m26280y() {
        return this.f72526a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream m26279z() {
        m26305a0();
        this.f72527b.setHttpResponseCode(this.f72526a.getResponseCode());
        this.f72527b.setResponseContentType(this.f72526a.getContentType());
        try {
            InputStream inputStream = this.f72526a.getInputStream();
            if (inputStream != null) {
                return new InstrHttpInputStream(inputStream, this.f72527b, this.f72530e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f72527b.setTimeToResponseCompletedMicros(this.f72530e.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.f72527b);
            throw e;
        }
    }
}