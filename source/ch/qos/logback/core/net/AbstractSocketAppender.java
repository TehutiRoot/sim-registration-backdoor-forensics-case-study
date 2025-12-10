package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements SocketConnector.ExceptionHandler {
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;

    /* renamed from: g */
    public final ObjectWriterFactory f39840g;

    /* renamed from: h */
    public final QueueFactory f39841h;

    /* renamed from: i */
    public String f39842i;

    /* renamed from: j */
    public int f39843j;

    /* renamed from: k */
    public InetAddress f39844k;

    /* renamed from: l */
    public Duration f39845l;

    /* renamed from: m */
    public int f39846m;

    /* renamed from: n */
    public int f39847n;

    /* renamed from: o */
    public Duration f39848o;

    /* renamed from: p */
    public BlockingDeque f39849p;

    /* renamed from: q */
    public String f39850q;

    /* renamed from: r */
    public SocketConnector f39851r;

    /* renamed from: s */
    public Future f39852s;

    /* renamed from: t */
    public volatile Socket f39853t;

    /* renamed from: ch.qos.logback.core.net.AbstractSocketAppender$a */
    /* loaded from: classes.dex */
    public class RunnableC5473a implements Runnable {
        public RunnableC5473a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractSocketAppender.this.m51466d();
        }
    }

    public AbstractSocketAppender() {
        this(new QueueFactory(), new ObjectWriterFactory());
    }

    @Override // ch.qos.logback.core.AppenderBase
    public void append(E e) {
        if (e == null || !isStarted()) {
            return;
        }
        try {
            if (this.f39849p.offer(e, this.f39848o.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                return;
            }
            addInfo("Dropping event due to timeout limit of [" + this.f39848o + "] being exceeded");
        } catch (InterruptedException e2) {
            addError("Interrupted while appending event to SocketAppender", e2);
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String sb2;
        if (exc instanceof InterruptedException) {
            sb2 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.f39850q);
                sb.append("connection refused");
            } else {
                sb = new StringBuilder();
                sb.append(this.f39850q);
                sb.append(exc);
            }
            sb2 = sb.toString();
        }
        addInfo(sb2);
    }

    /* renamed from: d */
    public final void m51466d() {
        StringBuilder sb;
        while (m51462k()) {
            try {
                try {
                    ObjectWriter m51464i = m51464i();
                    addInfo(this.f39850q + "connection established");
                    m51463j(m51464i);
                    CloseUtil.closeQuietly(this.f39853t);
                    this.f39853t = null;
                    sb = new StringBuilder();
                    sb.append(this.f39850q);
                    sb.append("connection closed");
                } catch (IOException e) {
                    addInfo(this.f39850q + "connection failed: " + e);
                    CloseUtil.closeQuietly(this.f39853t);
                    this.f39853t = null;
                    sb = new StringBuilder();
                    sb.append(this.f39850q);
                    sb.append("connection closed");
                }
                addInfo(sb.toString());
            } catch (InterruptedException unused) {
            }
        }
        addInfo("shutting down");
    }

    /* renamed from: g */
    public final SocketConnector m51465g(InetAddress inetAddress, int i, int i2, long j) {
        SocketConnector newConnector = newConnector(inetAddress, i, i2, j);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    public Duration getEventDelayLimit() {
        return this.f39848o;
    }

    public abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.f39843j;
    }

    public int getQueueSize() {
        return this.f39846m;
    }

    public Duration getReconnectionDelay() {
        return this.f39845l;
    }

    public String getRemoteHost() {
        return this.f39842i;
    }

    public SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    /* renamed from: i */
    public final ObjectWriter m51464i() {
        this.f39853t.setSoTimeout(this.f39847n);
        AutoFlushingObjectWriter newAutoFlushingObjectWriter = this.f39840g.newAutoFlushingObjectWriter(this.f39853t.getOutputStream());
        this.f39853t.setSoTimeout(0);
        return newAutoFlushingObjectWriter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m51463j(ObjectWriter objectWriter) {
        while (true) {
            Object takeFirst = this.f39849p.takeFirst();
            postProcessEvent(takeFirst);
            try {
                objectWriter.write(getPST().transform(takeFirst));
            } catch (IOException e) {
                m51461l(takeFirst);
                throw e;
            }
        }
    }

    /* renamed from: k */
    public final boolean m51462k() {
        Socket call = this.f39851r.call();
        this.f39853t = call;
        return call != null;
    }

    /* renamed from: l */
    public final void m51461l(Object obj) {
        if (this.f39849p.offerFirst(obj)) {
            return;
        }
        addInfo("Dropping event due to socket connection error and maxed out deque capacity");
    }

    public SocketConnector newConnector(InetAddress inetAddress, int i, long j, long j2) {
        return new DefaultSocketConnector(inetAddress, i, j, j2);
    }

    public abstract void postProcessEvent(E e);

    public void setEventDelayLimit(Duration duration) {
        this.f39848o = duration;
    }

    public void setPort(int i) {
        this.f39843j = i;
    }

    public void setQueueSize(int i) {
        this.f39846m = i;
    }

    public void setReconnectionDelay(Duration duration) {
        this.f39845l = duration;
    }

    public void setRemoteHost(String str) {
        this.f39842i = str;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        int i;
        if (isStarted()) {
            return;
        }
        if (this.f39843j <= 0) {
            addError("No port was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f39842i == null) {
            i++;
            addError("No remote host was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
        }
        if (this.f39846m == 0) {
            addWarn("Queue size of zero is deprecated, use a size of one to indicate synchronous processing");
        }
        if (this.f39846m < 0) {
            i++;
            addError("Queue size must be greater than zero");
        }
        if (i == 0) {
            try {
                this.f39844k = InetAddress.getByName(this.f39842i);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.f39842i);
                i++;
            }
        }
        if (i == 0) {
            this.f39849p = this.f39841h.newLinkedBlockingDeque(this.f39846m);
            this.f39850q = "remote peer " + this.f39842i + ":" + this.f39843j + ": ";
            this.f39851r = m51465g(this.f39844k, this.f39843j, 0, this.f39845l.getMilliseconds());
            this.f39852s = getContext().getScheduledExecutorService().submit(new RunnableC5473a());
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            CloseUtil.closeQuietly(this.f39853t);
            this.f39852s.cancel(true);
            super.stop();
        }
    }

    public AbstractSocketAppender(QueueFactory queueFactory, ObjectWriterFactory objectWriterFactory) {
        this.f39843j = DEFAULT_PORT;
        this.f39845l = new Duration(30000L);
        this.f39846m = 128;
        this.f39847n = 5000;
        this.f39848o = new Duration(100L);
        this.f39840g = objectWriterFactory;
        this.f39841h = queueFactory;
    }
}
