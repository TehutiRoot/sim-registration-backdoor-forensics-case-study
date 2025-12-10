package org.bson.util;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bson.util.AbstractCopyOnWriteMap;

/* loaded from: classes5.dex */
public abstract class CopyOnWriteMap extends AbstractCopyOnWriteMap {

    /* loaded from: classes5.dex */
    public static class Builder<K, V> {

        /* renamed from: a */
        public AbstractCopyOnWriteMap.View.Type f76084a = AbstractCopyOnWriteMap.View.Type.STABLE;

        /* renamed from: b */
        public final Map f76085b = new HashMap();

        public Builder<K, V> addAll(Map<? extends K, ? extends V> map) {
            this.f76085b.putAll(map);
            return this;
        }

        public Builder<K, V> liveViews() {
            this.f76084a = AbstractCopyOnWriteMap.View.Type.LIVE;
            return this;
        }

        public CopyOnWriteMap newHashMap() {
            return new C12953a(this.f76085b, this.f76084a);
        }

        public CopyOnWriteMap newLinkedMap() {
            return new C12954b(this.f76085b, this.f76084a);
        }

        public Builder<K, V> stableViews() {
            this.f76084a = AbstractCopyOnWriteMap.View.Type.STABLE;
            return this;
        }
    }

    /* renamed from: org.bson.util.CopyOnWriteMap$a */
    /* loaded from: classes5.dex */
    public static class C12953a extends CopyOnWriteMap {
        public C12953a(Map map, AbstractCopyOnWriteMap.View.Type type) {
            super(map, type);
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap
        /* renamed from: e */
        public Map mo24062e(Map map) {
            return new HashMap(map);
        }
    }

    /* renamed from: org.bson.util.CopyOnWriteMap$b */
    /* loaded from: classes5.dex */
    public static class C12954b extends CopyOnWriteMap {
        public C12954b(Map map, AbstractCopyOnWriteMap.View.Type type) {
            super(map, type);
        }

        @Override // org.bson.util.AbstractCopyOnWriteMap
        /* renamed from: e */
        public Map mo24062e(Map map) {
            return new LinkedHashMap(map);
        }
    }

    public CopyOnWriteMap(Map map, AbstractCopyOnWriteMap.View.Type type) {
        super(map, type);
    }

    /* renamed from: h */
    public static Builder m24064h() {
        return new Builder();
    }

    /* renamed from: i */
    public static CopyOnWriteMap m24063i() {
        return m24064h().newHashMap();
    }
}
