package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.conn.EofSensorInputStream;
import org.apache.http.conn.EofSensorWatcher;
import org.apache.http.entity.HttpEntityWrapper;

/* renamed from: Jy1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17931Jy1 extends HttpEntityWrapper implements EofSensorWatcher {

    /* renamed from: a */
    public final C1189Qw f3181a;

    public C17931Jy1(HttpEntity httpEntity, C1189Qw c1189Qw) {
        super(httpEntity);
        this.f3181a = c1189Qw;
    }

    private void abortConnection() {
        C1189Qw c1189Qw = this.f3181a;
        if (c1189Qw != null) {
            c1189Qw.abortConnection();
        }
    }

    /* renamed from: b */
    public static void m67774b(HttpResponse httpResponse, C1189Qw c1189Qw) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.isStreaming() && c1189Qw != null) {
            httpResponse.setEntity(new C17931Jy1(entity, c1189Qw));
        }
    }

    /* renamed from: a */
    public final void m67775a() {
        C1189Qw c1189Qw = this.f3181a;
        if (c1189Qw != null) {
            c1189Qw.close();
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void consumeContent() {
        releaseConnection();
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean eofDetected(InputStream inputStream) {
        try {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    abortConnection();
                    throw e;
                } catch (RuntimeException e2) {
                    abortConnection();
                    throw e2;
                }
            }
            releaseConnection();
            m67775a();
            return false;
        } catch (Throwable th2) {
            m67775a();
            throw th2;
        }
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public InputStream getContent() {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    public void releaseConnection() {
        C1189Qw c1189Qw = this.f3181a;
        if (c1189Qw != null) {
            c1189Qw.releaseConnection();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        m67775a();
        return false;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        boolean z;
        try {
            try {
                C1189Qw c1189Qw = this.f3181a;
                if (c1189Qw != null && !c1189Qw.m66721b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (SocketException e) {
                        if (z) {
                            throw e;
                        }
                    }
                }
                releaseConnection();
                return false;
            } catch (IOException e2) {
                abortConnection();
                throw e2;
            } catch (RuntimeException e3) {
                abortConnection();
                throw e3;
            }
        } finally {
            m67775a();
        }
    }

    public String toString() {
        return "ResponseEntityProxy{" + this.wrappedEntity + '}';
    }

    @Override // org.apache.http.entity.HttpEntityWrapper, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) {
        try {
            if (outputStream != null) {
                try {
                    try {
                        this.wrappedEntity.writeTo(outputStream);
                    } catch (IOException e) {
                        abortConnection();
                        throw e;
                    }
                } catch (RuntimeException e2) {
                    abortConnection();
                    throw e2;
                }
            }
            releaseConnection();
            m67775a();
        } catch (Throwable th2) {
            m67775a();
            throw th2;
        }
    }
}