package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.LoadBalancer;
import io.grpc.NameResolver;
import java.util.Map;
import org.apache.commons.logging.LogFactory;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
/* loaded from: classes5.dex */
public abstract class LoadBalancerProvider extends LoadBalancer.Factory {

    /* renamed from: a */
    public static final NameResolver.ConfigOrError f63277a = NameResolver.ConfigOrError.fromConfig(new C10528a());

    /* renamed from: io.grpc.LoadBalancerProvider$a */
    /* loaded from: classes5.dex */
    public static final class C10528a {
        public String toString() {
            return "service config is unused";
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String getPolicyName();

    public abstract int getPriority();

    public final int hashCode() {
        return super.hashCode();
    }

    public abstract boolean isAvailable();

    public NameResolver.ConfigOrError parseLoadBalancingPolicyConfig(Map<String, ?> map) {
        return f63277a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("policy", getPolicyName()).add(LogFactory.PRIORITY_KEY, getPriority()).add("available", isAvailable()).toString();
    }
}
