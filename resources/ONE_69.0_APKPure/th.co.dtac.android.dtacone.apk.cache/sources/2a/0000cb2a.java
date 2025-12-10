package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ClientCall;
import io.grpc.MethodDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class ClientInterceptors {

    /* renamed from: a */
    public static final ClientCall f63161a = new C10493b();

    /* loaded from: classes5.dex */
    public static abstract class CheckedForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public ClientCall f63162a;

        public CheckedForwardingClientCall(ClientCall<ReqT, RespT> clientCall) {
            this.f63162a = clientCall;
        }

        public abstract void checkedStart(ClientCall.Listener<RespT> listener, Metadata metadata) throws Exception;

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17829Ii1
        public final ClientCall<ReqT, RespT> delegate() {
            return this.f63162a;
        }

        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        public final void start(ClientCall.Listener<RespT> listener, Metadata metadata) {
            try {
                checkedStart(listener, metadata);
            } catch (Exception e) {
                this.f63162a = ClientInterceptors.f63161a;
                Metadata trailersFromThrowable = Status.trailersFromThrowable(e);
                Status fromThrowable = Status.fromThrowable(e);
                if (trailersFromThrowable == null) {
                    trailersFromThrowable = new Metadata();
                }
                listener.onClose(fromThrowable, trailersFromThrowable);
            }
        }
    }

    /* renamed from: io.grpc.ClientInterceptors$a */
    /* loaded from: classes5.dex */
    public class C10490a implements ClientInterceptor {

        /* renamed from: a */
        public final /* synthetic */ MethodDescriptor.Marshaller f63163a;

        /* renamed from: b */
        public final /* synthetic */ MethodDescriptor.Marshaller f63164b;

        /* renamed from: c */
        public final /* synthetic */ ClientInterceptor f63165c;

        /* renamed from: io.grpc.ClientInterceptors$a$a */
        /* loaded from: classes5.dex */
        public class C10491a extends AbstractC17829Ii1 {

            /* renamed from: a */
            public final /* synthetic */ ClientCall f63166a;

            /* renamed from: b */
            public final /* synthetic */ MethodDescriptor f63167b;

            /* renamed from: io.grpc.ClientInterceptors$a$a$a */
            /* loaded from: classes5.dex */
            public class C10492a extends AbstractC10554a {

                /* renamed from: a */
                public final /* synthetic */ ClientCall.Listener f63169a;

                public C10492a(ClientCall.Listener listener) {
                    this.f63169a = listener;
                }

                @Override // io.grpc.AbstractC10554a
                public ClientCall.Listener delegate() {
                    return this.f63169a;
                }

                @Override // io.grpc.ClientCall.Listener
                public void onMessage(Object obj) {
                    this.f63169a.onMessage(C10491a.this.f63167b.getResponseMarshaller().parse(C10490a.this.f63164b.stream(obj)));
                }
            }

            public C10491a(ClientCall clientCall, MethodDescriptor methodDescriptor) {
                this.f63166a = clientCall;
                this.f63167b = methodDescriptor;
            }

            @Override // p000.AbstractC17829Ii1
            public ClientCall delegate() {
                return this.f63166a;
            }

            @Override // io.grpc.ClientCall
            public void sendMessage(Object obj) {
                this.f63166a.sendMessage(C10490a.this.f63163a.parse(this.f63167b.getRequestMarshaller().stream(obj)));
            }

            @Override // io.grpc.ClientCall
            public void start(ClientCall.Listener listener, Metadata metadata) {
                this.f63166a.start(new C10492a(listener), metadata);
            }
        }

        public C10490a(MethodDescriptor.Marshaller marshaller, MethodDescriptor.Marshaller marshaller2, ClientInterceptor clientInterceptor) {
            this.f63163a = marshaller;
            this.f63164b = marshaller2;
            this.f63165c = clientInterceptor;
        }

        @Override // io.grpc.ClientInterceptor
        public ClientCall interceptCall(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel) {
            return new C10491a(this.f63165c.interceptCall(methodDescriptor.toBuilder(this.f63163a, this.f63164b).build(), callOptions, channel), methodDescriptor);
        }
    }

    /* renamed from: io.grpc.ClientInterceptors$b */
    /* loaded from: classes5.dex */
    public class C10493b extends ClientCall {
        @Override // io.grpc.ClientCall
        public void cancel(String str, Throwable th2) {
        }

        @Override // io.grpc.ClientCall
        public void halfClose() {
        }

        @Override // io.grpc.ClientCall
        public boolean isReady() {
            return false;
        }

        @Override // io.grpc.ClientCall
        public void request(int i) {
        }

        @Override // io.grpc.ClientCall
        public void sendMessage(Object obj) {
        }

        @Override // io.grpc.ClientCall
        public void start(ClientCall.Listener listener, Metadata metadata) {
        }
    }

    /* renamed from: io.grpc.ClientInterceptors$c */
    /* loaded from: classes5.dex */
    public static class C10494c extends Channel {

        /* renamed from: a */
        public final Channel f63171a;

        /* renamed from: b */
        public final ClientInterceptor f63172b;

        public /* synthetic */ C10494c(Channel channel, ClientInterceptor clientInterceptor, C10490a c10490a) {
            this(channel, clientInterceptor);
        }

        @Override // io.grpc.Channel
        public String authority() {
            return this.f63171a.authority();
        }

        @Override // io.grpc.Channel
        public ClientCall newCall(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            return this.f63172b.interceptCall(methodDescriptor, callOptions, this.f63171a);
        }

        public C10494c(Channel channel, ClientInterceptor clientInterceptor) {
            this.f63171a = channel;
            this.f63172b = (ClientInterceptor) Preconditions.checkNotNull(clientInterceptor, "interceptor");
        }
    }

    /* renamed from: b */
    public static ClientInterceptor m30794b(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller marshaller, MethodDescriptor.Marshaller marshaller2) {
        return new C10490a(marshaller, marshaller2, clientInterceptor);
    }

    public static Channel intercept(Channel channel, ClientInterceptor... clientInterceptorArr) {
        return intercept(channel, Arrays.asList(clientInterceptorArr));
    }

    public static Channel interceptForward(Channel channel, ClientInterceptor... clientInterceptorArr) {
        return interceptForward(channel, Arrays.asList(clientInterceptorArr));
    }

    public static Channel intercept(Channel channel, List<? extends ClientInterceptor> list) {
        Preconditions.checkNotNull(channel, "channel");
        for (ClientInterceptor clientInterceptor : list) {
            channel = new C10494c(channel, clientInterceptor, null);
        }
        return channel;
    }

    public static Channel interceptForward(Channel channel, List<? extends ClientInterceptor> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(channel, arrayList);
    }
}