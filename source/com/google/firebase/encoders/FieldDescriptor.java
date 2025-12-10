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
    public final String f55411a;

    /* renamed from: b */
    public final Map f55412b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final String f55413a;

        /* renamed from: b */
        public Map f55414b = null;

        public Builder(String str) {
            this.f55413a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            Map unmodifiableMap;
            String str = this.f55413a;
            if (this.f55414b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f55414b));
            }
            return new FieldDescriptor(str, unmodifiableMap);
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t) {
            if (this.f55414b == null) {
                this.f55414b = new HashMap();
            }
            this.f55414b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    /* renamed from: of */
    public static FieldDescriptor m38762of(@NonNull String str) {
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
        if (this.f55411a.equals(fieldDescriptor.f55411a) && this.f55412b.equals(fieldDescriptor.f55412b)) {
            return true;
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f55411a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.f55412b.get(cls);
    }

    public int hashCode() {
        return (this.f55411a.hashCode() * 31) + this.f55412b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f55411a + ", properties=" + this.f55412b.values() + "}";
    }

    public FieldDescriptor(String str, Map map) {
        this.f55411a = str;
        this.f55412b = map;
    }
}
