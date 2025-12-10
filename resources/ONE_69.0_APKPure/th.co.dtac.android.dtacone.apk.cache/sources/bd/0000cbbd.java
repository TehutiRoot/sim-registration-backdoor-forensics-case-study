package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ServiceProviders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
@ThreadSafe
/* loaded from: classes5.dex */
public final class LoadBalancerRegistry {

    /* renamed from: d */
    public static LoadBalancerRegistry f63342d;

    /* renamed from: a */
    public final LinkedHashSet f63344a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashMap f63345b = new LinkedHashMap();

    /* renamed from: c */
    public static final Logger f63341c = Logger.getLogger(LoadBalancerRegistry.class.getName());

    /* renamed from: e */
    public static final Iterable f63343e = m30759b();

    /* renamed from: io.grpc.LoadBalancerRegistry$a */
    /* loaded from: classes5.dex */
    public static final class C10516a implements ServiceProviders.PriorityAccessor {
        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: a */
        public int getPriority(LoadBalancerProvider loadBalancerProvider) {
            return loadBalancerProvider.getPriority();
        }

        @Override // io.grpc.ServiceProviders.PriorityAccessor
        /* renamed from: b */
        public boolean isAvailable(LoadBalancerProvider loadBalancerProvider) {
            return loadBalancerProvider.isAvailable();
        }
    }

    /* renamed from: b */
    public static List m30759b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.internal.PickFirstLoadBalancerProvider"));
        } catch (ClassNotFoundException e) {
            f63341c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            f63341c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized LoadBalancerRegistry getDefaultRegistry() {
        LoadBalancerRegistry loadBalancerRegistry;
        synchronized (LoadBalancerRegistry.class) {
            try {
                if (f63342d == null) {
                    List<LoadBalancerProvider> m30659f = ServiceProviders.m30659f(LoadBalancerProvider.class, f63343e, LoadBalancerProvider.class.getClassLoader(), new C10516a());
                    f63342d = new LoadBalancerRegistry();
                    for (LoadBalancerProvider loadBalancerProvider : m30659f) {
                        Logger logger = f63341c;
                        logger.fine("Service loader found " + loadBalancerProvider);
                        f63342d.m30760a(loadBalancerProvider);
                    }
                    f63342d.m30758c();
                }
                loadBalancerRegistry = f63342d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return loadBalancerRegistry;
    }

    /* renamed from: a */
    public final synchronized void m30760a(LoadBalancerProvider loadBalancerProvider) {
        Preconditions.checkArgument(loadBalancerProvider.isAvailable(), "isAvailable() returned false");
        this.f63344a.add(loadBalancerProvider);
    }

    /* renamed from: c */
    public final synchronized void m30758c() {
        try {
            this.f63345b.clear();
            Iterator it = this.f63344a.iterator();
            while (it.hasNext()) {
                LoadBalancerProvider loadBalancerProvider = (LoadBalancerProvider) it.next();
                String policyName = loadBalancerProvider.getPolicyName();
                LoadBalancerProvider loadBalancerProvider2 = (LoadBalancerProvider) this.f63345b.get(policyName);
                if (loadBalancerProvider2 != null && loadBalancerProvider2.getPriority() >= loadBalancerProvider.getPriority()) {
                }
                this.f63345b.put(policyName, loadBalancerProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void deregister(LoadBalancerProvider loadBalancerProvider) {
        this.f63344a.remove(loadBalancerProvider);
        m30758c();
    }

    @Nullable
    public synchronized LoadBalancerProvider getProvider(String str) {
        return (LoadBalancerProvider) this.f63345b.get(Preconditions.checkNotNull(str, "policy"));
    }

    public synchronized void register(LoadBalancerProvider loadBalancerProvider) {
        m30760a(loadBalancerProvider);
        m30758c();
    }
}