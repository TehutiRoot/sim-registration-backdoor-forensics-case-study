package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FieldDescriptor {

    /* renamed from: a */
    public final String f55423a;

    /* renamed from: b */
    public final Map f55424b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final String f55425a;

        /* renamed from: b */
        public Map f55426b = null;

        public Builder(String str) {
            this.f55425a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            Map unmodifiableMap;
            String str = this.f55425a;
            if (this.f55426b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f55426b));
            }
            return new FieldDescriptor(str, unmodifiableMap);
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t) {
            if (this.f55426b == null) {
                this.f55426b = new HashMap();
            }
            this.f55426b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    /* renamed from: of */
    public static FieldDescriptor m38754of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        if (this.f55423a.equals(fieldDescriptor.f55423a) && this.f55424b.equals(fieldDescriptor.f55424b)) {
            return true;
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f55423a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.f55424b.get(cls);
    }

    public int hashCode() {
        return (this.f55423a.hashCode() * 31) + this.f55424b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f55423a + ", properties=" + this.f55424b.values() + "}";
    }

    public FieldDescriptor(String str, Map map) {
        this.f55423a = str;
        this.f55424b = map;
    }
}