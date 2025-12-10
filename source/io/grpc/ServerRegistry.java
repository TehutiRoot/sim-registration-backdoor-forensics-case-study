package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ServerProvider;
import io.grpc.ServiceProviders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
@Internal
/* loaded from: classes5.dex */
public final class ServerRegistry {

    /* renamed from: c */
    public static final Logger f63383c = Logger.getLogger(ServerRegistry.class.getName());

    /* renamed from: d */
    public static ServerRegistry f63384d;

    /* renamed from: a */
    public final LinkedHashSet f63385a = new LinkedHashSet();

    /* renamed from: b */
    public List f63386b = Collections.emptyList();

    /* loaded from: classes5.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: io.grpc.ServerRegistry$a */
    /* loaded from: classes5.dex */
    public class C10553a implements Comparator {
        public C10553a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ServerProvider serverProvider, ServerProvider serverProvider2) {
            return serverProvider.priority() - serverProvider2.priority();
        }
    }

    /* renamed from: io.grpc.ServerRegistry$b */
    /* loaded from: classes5.dex */
    public static final class C10554b implements ServiceProviders.PriorityAccessor {
        public C10554b() {
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int getPriority(ServerProvider serverProvider) {
            return serverProvider.priority();
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: b */
        public boolean isAvailable(ServerProvider serverProvider) {
            return serverProvider.isAvailable();
        }

        public /* synthetic */ C10554b(C10553a c10553a) {
            this();
        }
    }

    /* renamed from: b */
    public static List m30340b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.okhttp.OkHttpServerProvider"));
        } catch (ClassNotFoundException e) {
            f63383c.log(Level.FINE, "Unable to find OkHttpServerProvider", (Throwable) e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized ServerRegistry getDefaultRegistry() {
        ServerRegistry serverRegistry;
        synchronized (ServerRegistry.class) {
            try {
                if (f63384d == null) {
                    List<ServerProvider> m30319f = ServiceProviders.m30319f(ServerProvider.class, m30340b(), ServerProvider.class.getClassLoader(), new C10554b(null));
                    f63384d = new ServerRegistry();
                    for (ServerProvider serverProvider : m30319f) {
                        Logger logger = f63383c;
                        logger.fine("Service loader found " + serverProvider);
                        f63384d.m30341a(serverProvider);
                    }
                    f63384d.m30336f();
                }
                serverRegistry = f63384d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serverRegistry;
    }

    /* renamed from: a */
    public final synchronized void m30341a(ServerProvider serverProvider) {
        Preconditions.checkArgument(serverProvider.isAvailable(), "isAvailable() returned false");
        this.f63385a.add(serverProvider);
    }

    /* renamed from: c */
    public ServerBuilder m30339c(int i, ServerCredentials serverCredentials) {
        if (!m30337e().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (ServerProvider serverProvider : m30337e()) {
                ServerProvider.NewServerBuilderResult newServerBuilderForPort = serverProvider.newServerBuilderForPort(i, serverCredentials);
                if (newServerBuilderForPort.getServerBuilder() != null) {
                    return newServerBuilderForPort.getServerBuilder();
                }
                sb.append("; ");
                sb.append(serverProvider.getClass().getName());
                sb.append(": ");
                sb.append(newServerBuilderForPort.getError());
            }
            throw new ProviderNotFoundException(sb.substring(2));
        }
        throw new ProviderNotFoundException("No functional server found. Try adding a dependency on the grpc-netty, grpc-netty-shaded, or grpc-okhttp artifact");
    }

    /* renamed from: d */
    public ServerProvider m30338d() {
        List m30337e = m30337e();
        if (m30337e.isEmpty()) {
            return null;
        }
        return (ServerProvider) m30337e.get(0);
    }

    public synchronized void deregister(ServerProvider serverProvider) {
        this.f63385a.remove(serverProvider);
        m30336f();
    }

    /* renamed from: e */
    public synchronized List m30337e() {
        return this.f63386b;
    }

    /* renamed from: f */
    public final synchronized void m30336f() {
        ArrayList arrayList = new ArrayList(this.f63385a);
        Collections.sort(arrayList, Collections.reverseOrder(new C10553a()));
        this.f63386b = Collections.unmodifiableList(arrayList);
    }

    public synchronized void register(ServerProvider serverProvider) {
        m30341a(serverProvider);
        m30336f();
    }
}
