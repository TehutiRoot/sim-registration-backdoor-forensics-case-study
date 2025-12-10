package io.grpc;

import io.grpc.ClientCall;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class ForwardingClientCall<ReqT, RespT> extends AbstractC17987Lh1 {

    /* loaded from: classes5.dex */
    public static abstract class SimpleForwardingClientCall<ReqT, RespT> extends ForwardingClientCall<ReqT, RespT> {

        /* renamed from: a */
        public final ClientCall f63175a;

        public SimpleForwardingClientCall(ClientCall<ReqT, RespT> clientCall) {
            this.f63175a = clientCall;
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ void cancel(@Nullable String str, @Nullable Throwable th2) {
            super.cancel(str, th2);
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1
        public ClientCall<ReqT, RespT> delegate() {
            return this.f63175a;
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ Attributes getAttributes() {
            return super.getAttributes();
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ void halfClose() {
            super.halfClose();
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ boolean isReady() {
            return super.isReady();
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ void request(int i) {
            super.request(i);
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1, io.grpc.ClientCall
        public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
            super.setMessageCompression(z);
        }

        @Override // io.grpc.ForwardingClientCall, p000.AbstractC17987Lh1
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ void cancel(@Nullable String str, @Nullable Throwable th2) {
        super.cancel(str, th2);
    }

    @Override // p000.AbstractC17987Lh1
    public abstract ClientCall<ReqT, RespT> delegate();

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ Attributes getAttributes() {
        return super.getAttributes();
    }

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ void halfClose() {
        super.halfClose();
    }

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ void request(int i) {
        super.request(i);
    }

    @Override // io.grpc.ClientCall
    public void sendMessage(ReqT reqt) {
        delegate().sendMessage(reqt);
    }

    @Override // p000.AbstractC17987Lh1, io.grpc.ClientCall
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
        super.setMessageCompression(z);
    }

    @Override // io.grpc.ClientCall
    public void start(ClientCall.Listener<RespT> listener, Metadata metadata) {
        delegate().start(listener, metadata);
    }

    @Override // p000.AbstractC17987Lh1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
