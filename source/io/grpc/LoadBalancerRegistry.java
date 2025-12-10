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
    public static LoadBalancerRegistry f63279d;

    /* renamed from: a */
    public final LinkedHashSet f63281a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashMap f63282b = new LinkedHashMap();

    /* renamed from: c */
    public static final Logger f63278c = Logger.getLogger(LoadBalancerRegistry.class.getName());

    /* renamed from: e */
    public static final Iterable f63280e = m30419b();

    /* renamed from: io.grpc.LoadBalancerRegistry$a */
    /* loaded from: classes5.dex */
    public static final class C10529a implements ServiceProviders.PriorityAccessor {
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
    public static List m30419b() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("io.grpc.internal.PickFirstLoadBalancerProvider"));
        } catch (ClassNotFoundException e) {
            f63278c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            f63278c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static synchronized LoadBalancerRegistry getDefaultRegistry() {
        LoadBalancerRegistry loadBalancerRegistry;
        synchronized (LoadBalancerRegistry.class) {
            try {
                if (f63279d == null) {
                    List<LoadBalancerProvider> m30319f = ServiceProviders.m30319f(LoadBalancerProvider.class, f63280e, LoadBalancerProvider.class.getClassLoader(), new C10529a());
                    f63279d = new LoadBalancerRegistry();
                    for (LoadBalancerProvider loadBalancerProvider : m30319f) {
                        Logger logger = f63278c;
                        logger.fine("Service loader found " + loadBalancerProvider);
                        f63279d.m30420a(loadBalancerProvider);
                    }
                    f63279d.m30418c();
                }
                loadBalancerRegistry = f63279d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return loadBalancerRegistry;
    }

    /* renamed from: a */
    public final synchronized void m30420a(LoadBalancerProvider loadBalancerProvider) {
        Preconditions.checkArgument(loadBalancerProvider.isAvailable(), "isAvailable() returned false");
        this.f63281a.add(loadBalancerProvider);
    }

    /* renamed from: c */
    public final synchronized void m30418c() {
        try {
            this.f63282b.clear();
            Iterator it = this.f63281a.iterator();
            while (it.hasNext()) {
                LoadBalancerProvider loadBalancerProvider = (LoadBalancerProvider) it.next();
                String policyName = loadBalancerProvider.getPolicyName();
                LoadBalancerProvider loadBalancerProvider2 = (LoadBalancerProvider) this.f63282b.get(policyName);
                if (loadBalancerProvider2 != null && loadBalancerProvider2.getPriority() >= loadBalancerProvider.getPriority()) {
                }
                this.f63282b.put(policyName, loadBalancerProvider);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void deregister(LoadBalancerProvider loadBalancerProvider) {
        this.f63281a.remove(loadBalancerProvider);
        m30418c();
    }

    @Nullable
    public synchronized LoadBalancerProvider getProvider(String str) {
        return (LoadBalancerProvider) this.f63282b.get(Preconditions.checkNotNull(str, "policy"));
    }

    public synchronized void register(LoadBalancerProvider loadBalancerProvider) {
        m30420a(loadBalancerProvider);
        m30418c();
    }
}
