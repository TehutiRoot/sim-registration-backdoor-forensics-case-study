package io.grpc;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1764")
@Immutable
/* loaded from: classes5.dex */
public final class Attributes {
    public static final Attributes EMPTY;

    /* renamed from: b */
    public static final IdentityHashMap f63067b;

    /* renamed from: a */
    public final IdentityHashMap f63068a;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public Attributes f63069a;

        /* renamed from: b */
        public IdentityHashMap f63070b;

        /* renamed from: a */
        public final IdentityHashMap m30463a(int i) {
            if (this.f63070b == null) {
                this.f63070b = new IdentityHashMap(i);
            }
            return this.f63070b;
        }

        public Attributes build() {
            if (this.f63070b != null) {
                for (Map.Entry entry : this.f63069a.f63068a.entrySet()) {
                    if (!this.f63070b.containsKey(entry.getKey())) {
                        this.f63070b.put((Key) entry.getKey(), entry.getValue());
                    }
                }
                this.f63069a = new Attributes(this.f63070b);
                this.f63070b = null;
            }
            return this.f63069a;
        }

        public <T> Builder discard(Key<T> key) {
            if (this.f63069a.f63068a.containsKey(key)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f63069a.f63068a);
                identityHashMap.remove(key);
                this.f63069a = new Attributes(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f63070b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(key);
            }
            return this;
        }

        public <T> Builder set(Key<T> key, T t) {
            m30463a(1).put(key, t);
            return this;
        }

        public Builder setAll(Attributes attributes) {
            m30463a(attributes.f63068a.size()).putAll(attributes.f63068a);
            return this;
        }

        public Builder(Attributes attributes) {
            this.f63069a = attributes;
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static final class Key<T> {

        /* renamed from: a */
        public final String f63071a;

        public Key(String str) {
            this.f63071a = str;
        }

        public static <T> Key<T> create(String str) {
            return new Key<>(str);
        }

        @Deprecated
        /* renamed from: of */
        public static <T> Key<T> m30462of(String str) {
            return new Key<>(str);
        }

        public String toString() {
            return this.f63071a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f63067b = identityHashMap;
        EMPTY = new Attributes(identityHashMap);
    }

    @Deprecated
    public static Builder newBuilder(Attributes attributes) {
        Preconditions.checkNotNull(attributes, "base");
        return new Builder();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L5a
            java.lang.Class r2 = r7.getClass()
            java.lang.Class<io.grpc.Attributes> r3 = io.grpc.Attributes.class
            if (r3 == r2) goto L10
            goto L5a
        L10:
            io.grpc.Attributes r7 = (io.grpc.Attributes) r7
            java.util.IdentityHashMap r2 = r6.f63068a
            int r2 = r2.size()
            java.util.IdentityHashMap r3 = r7.f63068a
            int r3 = r3.size()
            if (r2 == r3) goto L21
            return r1
        L21:
            java.util.IdentityHashMap r2 = r6.f63068a
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.IdentityHashMap r4 = r7.f63068a
            java.lang.Object r5 = r3.getKey()
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L44
            return r1
        L44:
            java.lang.Object r4 = r3.getValue()
            java.util.IdentityHashMap r5 = r7.f63068a
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r5.get(r3)
            boolean r3 = com.google.common.base.Objects.equal(r4, r3)
            if (r3 != 0) goto L2b
            return r1
        L59:
            return r0
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.Attributes.equals(java.lang.Object):boolean");
    }

    @Nullable
    public <T> T get(Key<T> key) {
        return (T) this.f63068a.get(key);
    }

    public int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f63068a.entrySet()) {
            i += Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return i;
    }

    @Deprecated
    public Set<Key<?>> keys() {
        return Collections.unmodifiableSet(this.f63068a.keySet());
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public String toString() {
        return this.f63068a.toString();
    }

    public Attributes(IdentityHashMap identityHashMap) {
        this.f63068a = identityHashMap;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
