package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class ServiceDescriptor {

    /* renamed from: a */
    public final String f63457a;

    /* renamed from: b */
    public final Collection f63458b;

    /* renamed from: c */
    public final Object f63459c;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f63460a;

        /* renamed from: b */
        public List f63461b;

        /* renamed from: c */
        public Object f63462c;

        public Builder addMethod(MethodDescriptor<?, ?> methodDescriptor) {
            this.f63461b.add((MethodDescriptor) Preconditions.checkNotNull(methodDescriptor, FirebaseAnalytics.Param.METHOD));
            return this;
        }

        public ServiceDescriptor build() {
            return new ServiceDescriptor(this);
        }

        /* renamed from: e */
        public final Builder m30665e(Collection collection) {
            this.f63461b.addAll(collection);
            return this;
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2666")
        public Builder setName(String str) {
            this.f63460a = (String) Preconditions.checkNotNull(str, "name");
            return this;
        }

        public Builder setSchemaDescriptor(@Nullable Object obj) {
            this.f63462c = obj;
            return this;
        }

        public Builder(String str) {
            this.f63461b = new ArrayList();
            setName(str);
        }
    }

    /* renamed from: a */
    public static void m30670a(String str, Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            MethodDescriptor methodDescriptor = (MethodDescriptor) it.next();
            Preconditions.checkNotNull(methodDescriptor, FirebaseAnalytics.Param.METHOD);
            String serviceName = methodDescriptor.getServiceName();
            Preconditions.checkArgument(str.equals(serviceName), "service names %s != %s", serviceName, str);
            Preconditions.checkArgument(hashSet.add(methodDescriptor.getFullMethodName()), "duplicate name %s", methodDescriptor.getFullMethodName());
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public Collection<MethodDescriptor<?, ?>> getMethods() {
        return this.f63458b;
    }

    public String getName() {
        return this.f63457a;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2222")
    @Nullable
    public Object getSchemaDescriptor() {
        return this.f63459c;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("name", this.f63457a).add("schemaDescriptor", this.f63459c).add("methods", this.f63458b).omitNullValues().toString();
    }

    public ServiceDescriptor(String str, MethodDescriptor<?, ?>... methodDescriptorArr) {
        this(str, Arrays.asList(methodDescriptorArr));
    }

    public ServiceDescriptor(String str, Collection<MethodDescriptor<?, ?>> collection) {
        this(newBuilder(str).m30665e((Collection) Preconditions.checkNotNull(collection, "methods")));
    }

    public ServiceDescriptor(Builder builder) {
        String str = builder.f63460a;
        this.f63457a = str;
        m30670a(str, builder.f63461b);
        this.f63458b = Collections.unmodifiableList(new ArrayList(builder.f63461b));
        this.f63459c = builder.f63462c;
    }
}