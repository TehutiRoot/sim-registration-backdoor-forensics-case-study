package org.apache.http.impl.execchain;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.http.HttpException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class BackoffStrategyExec implements ClientExecChain {

    /* renamed from: a */
    public final ClientExecChain f74400a;

    /* renamed from: b */
    public final ConnectionBackoffStrategy f74401b;

    /* renamed from: c */
    public final BackoffManager f74402c;

    public BackoffStrategyExec(ClientExecChain clientExecChain, ConnectionBackoffStrategy connectionBackoffStrategy, BackoffManager backoffManager) {
        Args.notNull(clientExecChain, "HTTP client request executor");
        Args.notNull(connectionBackoffStrategy, "Connection backoff strategy");
        Args.notNull(backoffManager, "Backoff manager");
        this.f74400a = clientExecChain;
        this.f74401b = connectionBackoffStrategy;
        this.f74402c = backoffManager;
    }

    @Override // org.apache.http.impl.execchain.ClientExecChain
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        try {
            CloseableHttpResponse execute = this.f74400a.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            if (this.f74401b.shouldBackoff(execute)) {
                this.f74402c.backOff(httpRoute);
            } else {
                this.f74402c.probe(httpRoute);
            }
            return execute;
        } catch (Exception e) {
            if (this.f74401b.shouldBackoff(e)) {
                this.f74402c.backOff(httpRoute);
            }
            if (!(e instanceof RuntimeException)) {
                if (!(e instanceof HttpException)) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    throw new UndeclaredThrowableException(e);
                }
                throw ((HttpException) e);
            }
            throw ((RuntimeException) e);
        }
    }
}
