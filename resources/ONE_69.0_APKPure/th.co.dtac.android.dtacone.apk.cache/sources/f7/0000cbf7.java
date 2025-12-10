package io.grpc;

import androidx.core.p005os.EnvironmentCompat;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import io.grpc.NameResolver;
import io.grpc.ServiceProviders;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/4159")
@ThreadSafe
/* loaded from: classes5.dex */
public final class NameResolverRegistry {

    /* renamed from: e */
    public static final Logger f63425e = Logger.getLogger(NameResolverRegistry.class.getName());

    /* renamed from: f */
    public static NameResolverRegistry f63426f;

    /* renamed from: a */
    public final NameResolver.Factory f63427a = new C10532b();

    /* renamed from: b */
    public String f63428b = EnvironmentCompat.MEDIA_UNKNOWN;

    /* renamed from: c */
    public final LinkedHashSet f63429c = new LinkedHashSet();

    /* renamed from: d */
    public ImmutableMap f63430d = ImmutableMap.m40965of();

    /* renamed from: io.grpc.NameResolverRegistry$b */
    /* loaded from: classes5.dex */
    public final class C10532b extends NameResolver.Factory {
        public C10532b() {
        }

        @Override // io.grpc.NameResolver.Factory
        public String getDefaultScheme() {
            return NameResolverRegistry.this.getDefaultScheme();
        }

        @Override // io.grpc.NameResolver.Factory
        public NameResolver newNameResolver(URI uri, NameResolver.Args args) {
            NameResolverProvider providerForScheme = NameResolverRegistry.this.getProviderForScheme(uri.getScheme());
            if (providerForScheme == null) {
                return null;
            }
            return providerForScheme.newNameResolver(uri, args);
        }
    }

    /* renamed from: io.grpc.NameResolverRegistry$c */
    /* loaded from: classes5.dex */
    public static final class C10533c implements ServiceProviders.PriorityAccessor {
        public C10533c() {
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int getPriority(NameResolverProvider nameResolverProvider) {
            return nameResolverProvider.priority();
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: b */
        public boolean isAvailable(NameResolverProvider nameResolverProvider) {
            return nameResolverProvider.isAvailable();
        }
    }

    /* renamed from: b */
    public static List m30693b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.internal.DnsNameResolverProvider"));
        } catch (ClassNotFoundException e) {
            f63425e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized NameResolverRegistry getDefaultRegistry() {
        NameResolverRegistry nameResolverRegistry;
        synchronized (NameResolverRegistry.class) {
            try {
                if (f63426f == null) {
                    List<NameResolverProvider> m30659f = ServiceProviders.m30659f(NameResolverProvider.class, m30693b(), NameResolverProvider.class.getClassLoader(), new C10533c());
                    if (m30659f.isEmpty()) {
                        f63425e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    f63426f = new NameResolverRegistry();
                    for (NameResolverProvider nameResolverProvider : m30659f) {
                        Logger logger = f63425e;
                        logger.fine("Service loader found " + nameResolverProvider);
                        f63426f.m30694a(nameResolverProvider);
                    }
                    f63426f.m30691d();
                }
                nameResolverRegistry = f63426f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nameResolverRegistry;
    }

    /* renamed from: a */
    public final synchronized void m30694a(NameResolverProvider nameResolverProvider) {
        Preconditions.checkArgument(nameResolverProvider.isAvailable(), "isAvailable() returned false");
        this.f63429c.add(nameResolverProvider);
    }

    public NameResolver.Factory asFactory() {
        return this.f63427a;
    }

    /* renamed from: c */
    public synchronized Map m30692c() {
        return this.f63430d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0010 A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m30691d() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "unknown"
            java.util.LinkedHashSet r2 = r9.f63429c     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L33
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L10:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L33
            io.grpc.NameResolverProvider r4 = (io.grpc.NameResolverProvider) r4     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = r4.getScheme()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L33
            io.grpc.NameResolverProvider r6 = (io.grpc.NameResolverProvider) r6     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L35
            int r6 = r6.priority()     // Catch: java.lang.Throwable -> L33
            int r7 = r4.priority()     // Catch: java.lang.Throwable -> L33
            if (r6 >= r7) goto L38
            goto L35
        L33:
            r0 = move-exception
            goto L54
        L35:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L33
        L38:
            int r5 = r4.priority()     // Catch: java.lang.Throwable -> L33
            if (r3 >= r5) goto L10
            int r1 = r4.priority()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r4.getScheme()     // Catch: java.lang.Throwable -> L33
            r8 = r3
            r3 = r1
            r1 = r8
            goto L10
        L4a:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)     // Catch: java.lang.Throwable -> L33
            r9.f63430d = r0     // Catch: java.lang.Throwable -> L33
            r9.f63428b = r1     // Catch: java.lang.Throwable -> L33
            monitor-exit(r9)
            return
        L54:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L33
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.NameResolverRegistry.m30691d():void");
    }

    public synchronized void deregister(NameResolverProvider nameResolverProvider) {
        this.f63429c.remove(nameResolverProvider);
        m30691d();
    }

    public synchronized String getDefaultScheme() {
        return this.f63428b;
    }

    public NameResolverProvider getProviderForScheme(String str) {
        if (str == null) {
            return null;
        }
        return (NameResolverProvider) m30692c().get(str.toLowerCase(Locale.US));
    }

    public synchronized void register(NameResolverProvider nameResolverProvider) {
        m30694a(nameResolverProvider);
        m30691d();
    }
}