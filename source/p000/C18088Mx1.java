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

/* renamed from: Mx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18088Mx1 extends HttpEntityWrapper implements EofSensorWatcher {

    /* renamed from: a */
    public final C1210Qw f3961a;

    public C18088Mx1(HttpEntity httpEntity, C1210Qw c1210Qw) {
        super(httpEntity);
        this.f3961a = c1210Qw;
    }

    private void abortConnection() {
        C1210Qw c1210Qw = this.f3961a;
        if (c1210Qw != null) {
            c1210Qw.abortConnection();
        }
    }

    /* renamed from: b */
    public static void m67259b(HttpResponse httpResponse, C1210Qw c1210Qw) {
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null && entity.isStreaming() && c1210Qw != null) {
            httpResponse.setEntity(new C18088Mx1(entity, c1210Qw));
        }
    }

    /* renamed from: a */
    public final void m67260a() {
        C1210Qw c1210Qw = this.f3961a;
        if (c1210Qw != null) {
            c1210Qw.close();
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
            m67260a();
            return false;
        } catch (Throwable th2) {
            m67260a();
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
        C1210Qw c1210Qw = this.f3961a;
        if (c1210Qw != null) {
            c1210Qw.releaseConnection();
        }
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamAbort(InputStream inputStream) {
        m67260a();
        return false;
    }

    @Override // org.apache.http.conn.EofSensorWatcher
    public boolean streamClosed(InputStream inputStream) {
        boolean z;
        try {
            try {
                C1210Qw c1210Qw = this.f3961a;
                if (c1210Qw != null && !c1210Qw.m66519b()) {
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
            m67260a();
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
            m67260a();
        } catch (Throwable th2) {
            m67260a();
            throw th2;
        }
    }
}
