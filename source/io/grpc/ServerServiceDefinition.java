package io.grpc;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ServerServiceDefinition {

    /* renamed from: a */
    public final ServiceDescriptor f63388a;

    /* renamed from: b */
    public final Map f63389b;

    public static Builder builder(String str) {
        return new Builder(str);
    }

    @Internal
    public ServerMethodDefinition<?, ?> getMethod(String str) {
        return (ServerMethodDefinition) this.f63389b.get(str);
    }

    public Collection<ServerMethodDefinition<?, ?>> getMethods() {
        return this.f63389b.values();
    }

    public ServiceDescriptor getServiceDescriptor() {
        return this.f63388a;
    }

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public final String f63390a;

        /* renamed from: b */
        public final ServiceDescriptor f63391b;

        /* renamed from: c */
        public final Map f63392c;

        public <ReqT, RespT> Builder addMethod(MethodDescriptor<ReqT, RespT> methodDescriptor, ServerCallHandler<ReqT, RespT> serverCallHandler) {
            return addMethod(ServerMethodDefinition.create((MethodDescriptor) Preconditions.checkNotNull(methodDescriptor, "method must not be null"), (ServerCallHandler) Preconditions.checkNotNull(serverCallHandler, "handler must not be null")));
        }

        public ServerServiceDefinition build() {
            ServiceDescriptor serviceDescriptor = this.f63391b;
            if (serviceDescriptor == null) {
                ArrayList arrayList = new ArrayList(this.f63392c.size());
                for (ServerMethodDefinition serverMethodDefinition : this.f63392c.values()) {
                    arrayList.add(serverMethodDefinition.getMethodDescriptor());
                }
                serviceDescriptor = new ServiceDescriptor(this.f63390a, arrayList);
            }
            HashMap hashMap = new HashMap(this.f63392c);
            for (MethodDescriptor<?, ?> methodDescriptor : serviceDescriptor.getMethods()) {
                ServerMethodDefinition serverMethodDefinition2 = (ServerMethodDefinition) hashMap.remove(methodDescriptor.getFullMethodName());
                if (serverMethodDefinition2 != null) {
                    if (serverMethodDefinition2.getMethodDescriptor() != methodDescriptor) {
                        throw new IllegalStateException("Bound method for " + methodDescriptor.getFullMethodName() + " not same instance as method in service descriptor");
                    }
                } else {
                    throw new IllegalStateException("No method bound for descriptor entry " + methodDescriptor.getFullMethodName());
                }
            }
            if (hashMap.size() <= 0) {
                return new ServerServiceDefinition(serviceDescriptor, this.f63392c);
            }
            throw new IllegalStateException("No entry in descriptor matching bound method " + ((ServerMethodDefinition) hashMap.values().iterator().next()).getMethodDescriptor().getFullMethodName());
        }

        public Builder(String str) {
            this.f63392c = new HashMap();
            this.f63390a = (String) Preconditions.checkNotNull(str, "serviceName");
            this.f63391b = null;
        }

        public <ReqT, RespT> Builder addMethod(ServerMethodDefinition<ReqT, RespT> serverMethodDefinition) {
            MethodDescriptor<ReqT, RespT> methodDescriptor = serverMethodDefinition.getMethodDescriptor();
            Preconditions.checkArgument(this.f63390a.equals(methodDescriptor.getServiceName()), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f63390a, methodDescriptor.getFullMethodName());
            String fullMethodName = methodDescriptor.getFullMethodName();
            Preconditions.checkState(!this.f63392c.containsKey(fullMethodName), "Method by same name already registered: %s", fullMethodName);
            this.f63392c.put(fullMethodName, serverMethodDefinition);
            return this;
        }

        public Builder(ServiceDescriptor serviceDescriptor) {
            this.f63392c = new HashMap();
            this.f63391b = (ServiceDescriptor) Preconditions.checkNotNull(serviceDescriptor, "serviceDescriptor");
            this.f63390a = serviceDescriptor.getName();
        }
    }

    public ServerServiceDefinition(ServiceDescriptor serviceDescriptor, Map map) {
        this.f63388a = (ServiceDescriptor) Preconditions.checkNotNull(serviceDescriptor, "serviceDescriptor");
        this.f63389b = Collections.unmodifiableMap(new HashMap(map));
    }

    public static Builder builder(ServiceDescriptor serviceDescriptor) {
        return new Builder(serviceDescriptor);
    }
}
