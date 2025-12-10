package p000;

import java.io.IOException;
import org.apache.http.ExceptionLogger;
import org.apache.http.HttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.protocol.HttpService;

/* renamed from: r62  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class RunnableC21875r62 implements Runnable {

    /* renamed from: a */
    public final HttpService f77173a;

    /* renamed from: b */
    public final HttpServerConnection f77174b;

    /* renamed from: c */
    public final ExceptionLogger f77175c;

    public RunnableC21875r62(HttpService httpService, HttpServerConnection httpServerConnection, ExceptionLogger exceptionLogger) {
        this.f77173a = httpService;
        this.f77174b = httpServerConnection;
        this.f77175c = exceptionLogger;
    }

    /* renamed from: a */
    public HttpServerConnection m23358a() {
        return this.f77174b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    BasicHttpContext basicHttpContext = new BasicHttpContext();
                    HttpCoreContext adapt = HttpCoreContext.adapt(basicHttpContext);
                    while (!Thread.interrupted() && this.f77174b.isOpen()) {
                        this.f77173a.handleRequest(this.f77174b, adapt);
                        basicHttpContext.clear();
                    }
                    this.f77174b.close();
                    this.f77174b.shutdown();
                } catch (Exception e) {
                    this.f77175c.log(e);
                    this.f77174b.shutdown();
                }
            } catch (Throwable th2) {
                try {
                    this.f77174b.shutdown();
                } catch (IOException e2) {
                    this.f77175c.log(e2);
                }
                throw th2;
            }
        } catch (IOException e3) {
            this.f77175c.log(e3);
        }
    }
}
