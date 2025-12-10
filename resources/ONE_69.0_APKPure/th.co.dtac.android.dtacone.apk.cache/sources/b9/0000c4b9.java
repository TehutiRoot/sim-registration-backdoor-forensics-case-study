package dagger.internal;

import ch.qos.logback.core.joran.action.Action;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public abstract class AbstractMapFactory implements Factory {

    /* renamed from: a */
    public final Map f61275a;

    /* loaded from: classes5.dex */
    public static abstract class Builder<K, V, V2> {

        /* renamed from: a */
        public final LinkedHashMap f61276a;

        public Builder(int i) {
            this.f61276a = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder put(Object obj, Provider provider) {
            this.f61276a.put(Preconditions.checkNotNull(obj, Action.KEY_ATTRIBUTE), Preconditions.checkNotNull(provider, "provider"));
            return this;
        }

        public Builder putAll(Provider provider) {
            if (provider instanceof DelegateFactory) {
                return putAll(((DelegateFactory) provider).m31805a());
            }
            this.f61276a.putAll(((AbstractMapFactory) provider).f61275a);
            return this;
        }
    }

    public AbstractMapFactory(Map map) {
        this.f61275a = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    public final Map m31808b() {
        return this.f61275a;
    }
}