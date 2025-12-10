package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ManagedChannelProvider;
import io.grpc.ServiceProviders;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
public final class ManagedChannelRegistry {

    /* renamed from: c */
    public static final Logger f63286c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* renamed from: d */
    public static ManagedChannelRegistry f63287d;

    /* renamed from: a */
    public final LinkedHashSet f63288a = new LinkedHashSet();

    /* renamed from: b */
    public List f63289b = Collections.emptyList();

    /* loaded from: classes5.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    /* renamed from: io.grpc.ManagedChannelRegistry$a */
    /* loaded from: classes5.dex */
    public class C10530a implements Comparator {
        public C10530a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
            return managedChannelProvider.priority() - managedChannelProvider2.priority();
        }
    }

    /* renamed from: io.grpc.ManagedChannelRegistry$b */
    /* loaded from: classes5.dex */
    public static final class C10531b implements ServiceProviders.PriorityAccessor {
        public C10531b() {
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int getPriority(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.priority();
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: b */
        public boolean isAvailable(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.isAvailable();
        }

        public /* synthetic */ C10531b(C10530a c10530a) {
            this();
        }
    }

    /* renamed from: b */
    public static List m30413b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.okhttp.OkHttpChannelProvider"));
        } catch (ClassNotFoundException e) {
            f63286c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            f63286c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            f63286c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized ManagedChannelRegistry getDefaultRegistry() {
        ManagedChannelRegistry managedChannelRegistry;
        synchronized (ManagedChannelRegistry.class) {
            try {
                if (f63287d == null) {
                    List<ManagedChannelProvider> m30319f = ServiceProviders.m30319f(ManagedChannelProvider.class, m30413b(), ManagedChannelProvider.class.getClassLoader(), new C10531b(null));
                    f63287d = new ManagedChannelRegistry();
                    for (ManagedChannelProvider managedChannelProvider : m30319f) {
                        Logger logger = f63286c;
                        logger.fine("Service loader found " + managedChannelProvider);
                        f63287d.m30414a(managedChannelProvider);
                    }
                    f63287d.m30408g();
                }
                managedChannelRegistry = f63287d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return managedChannelRegistry;
    }

    /* renamed from: a */
    public final synchronized void m30414a(ManagedChannelProvider managedChannelProvider) {
        Preconditions.checkArgument(managedChannelProvider.isAvailable(), "isAvailable() returned false");
        this.f63288a.add(managedChannelProvider);
    }

    /* renamed from: c */
    public ManagedChannelBuilder m30412c(NameResolverRegistry nameResolverRegistry, String str, ChannelCredentials channelCredentials) {
        NameResolverProvider nameResolverProvider;
        Collection<Class<? extends SocketAddress>> emptySet;
        try {
            nameResolverProvider = nameResolverRegistry.getProviderForScheme(new URI(str).getScheme());
        } catch (URISyntaxException unused) {
            nameResolverProvider = null;
        }
        if (nameResolverProvider == null) {
            nameResolverProvider = nameResolverRegistry.getProviderForScheme(nameResolverRegistry.getDefaultScheme());
        }
        if (nameResolverProvider != null) {
            emptySet = nameResolverProvider.getProducedSocketAddressTypes();
        } else {
            emptySet = Collections.emptySet();
        }
        if (!m30409f().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (ManagedChannelProvider managedChannelProvider : m30409f()) {
                if (!managedChannelProvider.getSupportedSocketAddressTypes().containsAll(emptySet)) {
                    sb.append("; ");
                    sb.append(managedChannelProvider.getClass().getName());
                    sb.append(": does not support 1 or more of ");
                    sb.append(Arrays.toString(emptySet.toArray()));
                } else {
                    ManagedChannelProvider.NewChannelBuilderResult newChannelBuilder = managedChannelProvider.newChannelBuilder(str, channelCredentials);
                    if (newChannelBuilder.getChannelBuilder() != null) {
                        return newChannelBuilder.getChannelBuilder();
                    }
                    sb.append("; ");
                    sb.append(managedChannelProvider.getClass().getName());
                    sb.append(": ");
                    sb.append(newChannelBuilder.getError());
                }
            }
            throw new ProviderNotFoundException(sb.substring(2));
        }
        throw new ProviderNotFoundException("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* renamed from: d */
    public ManagedChannelBuilder m30411d(String str, ChannelCredentials channelCredentials) {
        return m30412c(NameResolverRegistry.getDefaultRegistry(), str, channelCredentials);
    }

    public synchronized void deregister(ManagedChannelProvider managedChannelProvider) {
        this.f63288a.remove(managedChannelProvider);
        m30408g();
    }

    /* renamed from: e */
    public ManagedChannelProvider m30410e() {
        List m30409f = m30409f();
        if (m30409f.isEmpty()) {
            return null;
        }
        return (ManagedChannelProvider) m30409f.get(0);
    }

    /* renamed from: f */
    public synchronized List m30409f() {
        return this.f63289b;
    }

    /* renamed from: g */
    public final synchronized void m30408g() {
        ArrayList arrayList = new ArrayList(this.f63288a);
        Collections.sort(arrayList, Collections.reverseOrder(new C10530a()));
        this.f63289b = Collections.unmodifiableList(arrayList);
    }

    public synchronized void register(ManagedChannelProvider managedChannelProvider) {
        m30414a(managedChannelProvider);
        m30408g();
    }
}
