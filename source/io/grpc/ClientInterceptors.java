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
    public static final ClientCall f63098a = new C10506b();

    /* loaded from: classes5.dex */
    public static abstract class CheckedForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public ClientCall f63099a;

        public CheckedForwardingClientCall(ClientCall<ReqT, RespT> clientCall) {
            this.f63099a = clientCall;
        }

        public abstract void checkedStart(ClientCall.Listener<RespT> listener, Metadata metadata) throws Exception;

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1
        public final ClientCall<ReqT, RespT> delegate() {
            return this.f63099a;
        }

        @Override // io.grpc.ForwardingClientCall, io.grpc.ClientCall
        public final void start(ClientCall.Listener<RespT> listener, Metadata metadata) {
            try {
                checkedStart(listener, metadata);
            } catch (Exception e) {
                this.f63099a = ClientInterceptors.f63098a;
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
    public class C10503a implements ClientInterceptor {

        /* renamed from: a */
        public final /* synthetic */ MethodDescriptor.Marshaller f63100a;

        /* renamed from: b */
        public final /* synthetic */ MethodDescriptor.Marshaller f63101b;

        /* renamed from: c */
        public final /* synthetic */ ClientInterceptor f63102c;

        /* renamed from: io.grpc.ClientInterceptors$a$a */
        /* loaded from: classes5.dex */
        public class C10504a extends AbstractC17987Lh1 {

            /* renamed from: a */
            public final /* synthetic */ ClientCall f63103a;

            /* renamed from: b */
            public final /* synthetic */ MethodDescriptor f63104b;

            /* renamed from: io.grpc.ClientInterceptors$a$a$a */
            /* loaded from: classes5.dex */
            public class C10505a extends AbstractC10567a {

                /* renamed from: a */
                public final /* synthetic */ ClientCall.Listener f63106a;

                public C10505a(ClientCall.Listener listener) {
                    this.f63106a = listener;
                }

                @Override // io.grpc.AbstractC10567a
                public ClientCall.Listener delegate() {
                    return this.f63106a;
                }

                @Override // io.grpc.ClientCall.Listener
                public void onMessage(Object obj) {
                    this.f63106a.onMessage(C10504a.this.f63104b.getResponseMarshaller().parse(C10503a.this.f63101b.stream(obj)));
                }
            }

            public C10504a(ClientCall clientCall, MethodDescriptor methodDescriptor) {
                this.f63103a = clientCall;
                this.f63104b = methodDescriptor;
            }

            @Override // p000.AbstractC17987Lh1
            public ClientCall delegate() {
                return this.f63103a;
            }

            @Override // io.grpc.ClientCall
            public void sendMessage(Object obj) {
                this.f63103a.sendMessage(C10503a.this.f63100a.parse(this.f63104b.getRequestMarshaller().stream(obj)));
            }

            @Override // io.grpc.ClientCall
            public void start(ClientCall.Listener listener, Metadata metadata) {
                this.f63103a.start(new C10505a(listener), metadata);
            }
        }

        public C10503a(MethodDescriptor.Marshaller marshaller, MethodDescriptor.Marshaller marshaller2, ClientInterceptor clientInterceptor) {
            this.f63100a = marshaller;
            this.f63101b = marshaller2;
            this.f63102c = clientInterceptor;
        }

        @Override // io.grpc.ClientInterceptor
        public ClientCall interceptCall(MethodDescriptor methodDescriptor, CallOptions callOptions, Channel channel) {
            return new C10504a(this.f63102c.interceptCall(methodDescriptor.toBuilder(this.f63100a, this.f63101b).build(), callOptions, channel), methodDescriptor);
        }
    }

    /* renamed from: io.grpc.ClientInterceptors$b */
    /* loaded from: classes5.dex */
    public class C10506b extends ClientCall {
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
    public static class C10507c extends Channel {

        /* renamed from: a */
        public final Channel f63108a;

        /* renamed from: b */
        public final ClientInterceptor f63109b;

        public /* synthetic */ C10507c(Channel channel, ClientInterceptor clientInterceptor, C10503a c10503a) {
            this(channel, clientInterceptor);
        }

        @Override // io.grpc.Channel
        public String authority() {
            return this.f63108a.authority();
        }

        @Override // io.grpc.Channel
        public ClientCall newCall(MethodDescriptor methodDescriptor, CallOptions callOptions) {
            return this.f63109b.interceptCall(methodDescriptor, callOptions, this.f63108a);
        }

        public C10507c(Channel channel, ClientInterceptor clientInterceptor) {
            this.f63108a = channel;
            this.f63109b = (ClientInterceptor) Preconditions.checkNotNull(clientInterceptor, "interceptor");
        }
    }

    /* renamed from: b */
    public static ClientInterceptor m30454b(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller marshaller, MethodDescriptor.Marshaller marshaller2) {
        return new C10503a(marshaller, marshaller2, clientInterceptor);
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
            channel = new C10507c(channel, clientInterceptor, null);
        }
        return channel;
    }

    public static Channel interceptForward(Channel channel, List<? extends ClientInterceptor> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return intercept(channel, arrayList);
    }
}
