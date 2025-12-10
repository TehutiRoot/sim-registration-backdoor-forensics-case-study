package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.ServerServiceDefinition;
import io.grpc.ServiceDescriptor;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ServerInterceptors {

    /* renamed from: io.grpc.ServerInterceptors$a */
    /* loaded from: classes5.dex */
    public class C10547a implements MethodDescriptor.Marshaller {
        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: a */
        public InputStream parse(InputStream inputStream) {
            if (inputStream.markSupported()) {
                return inputStream;
            }
            if (inputStream instanceof KnownLength) {
                return new C10552d(inputStream);
            }
            return new BufferedInputStream(inputStream);
        }

        @Override // io.grpc.MethodDescriptor.Marshaller
        /* renamed from: b */
        public InputStream stream(InputStream inputStream) {
            return inputStream;
        }
    }

    /* renamed from: io.grpc.ServerInterceptors$b */
    /* loaded from: classes5.dex */
    public class C10548b implements ServerCallHandler {

        /* renamed from: a */
        public final /* synthetic */ MethodDescriptor f63370a;

        /* renamed from: b */
        public final /* synthetic */ MethodDescriptor f63371b;

        /* renamed from: c */
        public final /* synthetic */ ServerCallHandler f63372c;

        /* renamed from: io.grpc.ServerInterceptors$b$a */
        /* loaded from: classes5.dex */
        public class C10549a extends AbstractC18051Mh1 {

            /* renamed from: a */
            public final /* synthetic */ ServerCall f63373a;

            public C10549a(ServerCall serverCall) {
                this.f63373a = serverCall;
            }

            @Override // p000.AbstractC18051Mh1
            public ServerCall delegate() {
                return this.f63373a;
            }

            @Override // io.grpc.ServerCall
            public MethodDescriptor getMethodDescriptor() {
                return C10548b.this.f63370a;
            }

            @Override // io.grpc.ServerCall
            public void sendMessage(Object obj) {
                delegate().sendMessage(C10548b.this.f63371b.parseResponse(C10548b.this.f63370a.streamResponse(obj)));
            }
        }

        /* renamed from: io.grpc.ServerInterceptors$b$b */
        /* loaded from: classes5.dex */
        public class C10550b extends AbstractC10568b {

            /* renamed from: a */
            public final /* synthetic */ ServerCall.Listener f63375a;

            public C10550b(ServerCall.Listener listener) {
                this.f63375a = listener;
            }

            @Override // io.grpc.AbstractC10568b
            public ServerCall.Listener delegate() {
                return this.f63375a;
            }

            @Override // io.grpc.ServerCall.Listener
            public void onMessage(Object obj) {
                delegate().onMessage(C10548b.this.f63370a.parseRequest(C10548b.this.f63371b.streamRequest(obj)));
            }
        }

        public C10548b(MethodDescriptor methodDescriptor, MethodDescriptor methodDescriptor2, ServerCallHandler serverCallHandler) {
            this.f63370a = methodDescriptor;
            this.f63371b = methodDescriptor2;
            this.f63372c = serverCallHandler;
        }

        @Override // io.grpc.ServerCallHandler
        public ServerCall.Listener startCall(ServerCall serverCall, Metadata metadata) {
            return new C10550b(this.f63372c.startCall(new C10549a(serverCall), metadata));
        }
    }

    /* renamed from: io.grpc.ServerInterceptors$c */
    /* loaded from: classes5.dex */
    public static final class C10551c implements ServerCallHandler {

        /* renamed from: a */
        public final ServerInterceptor f63377a;

        /* renamed from: b */
        public final ServerCallHandler f63378b;

        public C10551c(ServerInterceptor serverInterceptor, ServerCallHandler serverCallHandler) {
            this.f63377a = (ServerInterceptor) Preconditions.checkNotNull(serverInterceptor, "interceptor");
            this.f63378b = serverCallHandler;
        }

        /* renamed from: a */
        public static C10551c m30342a(ServerInterceptor serverInterceptor, ServerCallHandler serverCallHandler) {
            return new C10551c(serverInterceptor, serverCallHandler);
        }

        @Override // io.grpc.ServerCallHandler
        public ServerCall.Listener startCall(ServerCall serverCall, Metadata metadata) {
            return this.f63377a.interceptCall(serverCall, metadata, this.f63378b);
        }
    }

    /* renamed from: io.grpc.ServerInterceptors$d */
    /* loaded from: classes5.dex */
    public static final class C10552d extends BufferedInputStream implements KnownLength {
        public C10552d(InputStream inputStream) {
            super(inputStream);
        }
    }

    /* renamed from: a */
    public static void m30347a(ServerServiceDefinition.Builder builder, ServerMethodDefinition serverMethodDefinition, List list) {
        ServerCallHandler serverCallHandler = serverMethodDefinition.getServerCallHandler();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            serverCallHandler = C10551c.m30342a((ServerInterceptor) it.next(), serverCallHandler);
        }
        builder.addMethod(serverMethodDefinition.withServerCallHandler(serverCallHandler));
    }

    /* renamed from: b */
    public static ServerCallHandler m30346b(ServerCallHandler serverCallHandler, MethodDescriptor methodDescriptor, MethodDescriptor methodDescriptor2) {
        return new C10548b(methodDescriptor, methodDescriptor2, serverCallHandler);
    }

    /* renamed from: c */
    public static ServerMethodDefinition m30345c(ServerMethodDefinition serverMethodDefinition, MethodDescriptor methodDescriptor) {
        return ServerMethodDefinition.create(methodDescriptor, m30346b(serverMethodDefinition.getServerCallHandler(), serverMethodDefinition.getMethodDescriptor(), methodDescriptor));
    }

    public static ServerServiceDefinition intercept(ServerServiceDefinition serverServiceDefinition, ServerInterceptor... serverInterceptorArr) {
        return intercept(serverServiceDefinition, Arrays.asList(serverInterceptorArr));
    }

    public static ServerServiceDefinition interceptForward(ServerServiceDefinition serverServiceDefinition, ServerInterceptor... serverInterceptorArr) {
        return interceptForward(serverServiceDefinition, Arrays.asList(serverInterceptorArr));
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1712")
    public static ServerServiceDefinition useInputStreamMessages(ServerServiceDefinition serverServiceDefinition) {
        return useMarshalledMessages(serverServiceDefinition, new C10547a());
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1712")
    public static <T> ServerServiceDefinition useMarshalledMessages(ServerServiceDefinition serverServiceDefinition, MethodDescriptor.Marshaller<T> marshaller) {
        return useMarshalledMessages(serverServiceDefinition, marshaller, marshaller);
    }

    public static ServerServiceDefinition intercept(BindableService bindableService, ServerInterceptor... serverInterceptorArr) {
        Preconditions.checkNotNull(bindableService, "bindableService");
        return intercept(bindableService.bindService(), Arrays.asList(serverInterceptorArr));
    }

    public static ServerServiceDefinition interceptForward(BindableService bindableService, ServerInterceptor... serverInterceptorArr) {
        return interceptForward(bindableService.bindService(), Arrays.asList(serverInterceptorArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/9870")
    public static <ReqT, RespT> ServerServiceDefinition useMarshalledMessages(ServerServiceDefinition serverServiceDefinition, MethodDescriptor.Marshaller<ReqT> marshaller, MethodDescriptor.Marshaller<RespT> marshaller2) {
        ArrayList<ServerMethodDefinition<ReqT, RespT>> arrayList = new ArrayList();
        ArrayList<MethodDescriptor<?, ?>> arrayList2 = new ArrayList();
        for (ServerMethodDefinition<?, ?> serverMethodDefinition : serverServiceDefinition.getMethods()) {
            MethodDescriptor build = serverMethodDefinition.getMethodDescriptor().toBuilder(marshaller, marshaller2).build();
            arrayList2.add(build);
            arrayList.add(m30345c(serverMethodDefinition, build));
        }
        ServiceDescriptor.Builder schemaDescriptor = ServiceDescriptor.newBuilder(serverServiceDefinition.getServiceDescriptor().getName()).setSchemaDescriptor(serverServiceDefinition.getServiceDescriptor().getSchemaDescriptor());
        for (MethodDescriptor<?, ?> methodDescriptor : arrayList2) {
            schemaDescriptor.addMethod(methodDescriptor);
        }
        ServerServiceDefinition.Builder builder = ServerServiceDefinition.builder(schemaDescriptor.build());
        for (ServerMethodDefinition<ReqT, RespT> serverMethodDefinition2 : arrayList) {
            builder.addMethod(serverMethodDefinition2);
        }
        return builder.build();
    }

    public static ServerServiceDefinition interceptForward(ServerServiceDefinition serverServiceDefinition, List<? extends ServerInterceptor> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(serverServiceDefinition, arrayList);
    }

    public static ServerServiceDefinition intercept(ServerServiceDefinition serverServiceDefinition, List<? extends ServerInterceptor> list) {
        Preconditions.checkNotNull(serverServiceDefinition, "serviceDef");
        if (list.isEmpty()) {
            return serverServiceDefinition;
        }
        ServerServiceDefinition.Builder builder = ServerServiceDefinition.builder(serverServiceDefinition.getServiceDescriptor());
        for (ServerMethodDefinition<?, ?> serverMethodDefinition : serverServiceDefinition.getMethods()) {
            m30347a(builder, serverMethodDefinition, list);
        }
        return builder.build();
    }

    public static ServerServiceDefinition interceptForward(BindableService bindableService, List<? extends ServerInterceptor> list) {
        return interceptForward(bindableService.bindService(), list);
    }

    public static ServerServiceDefinition intercept(BindableService bindableService, List<? extends ServerInterceptor> list) {
        Preconditions.checkNotNull(bindableService, "bindableService");
        return intercept(bindableService.bindService(), list);
    }
}
