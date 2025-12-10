package io.grpc;

import io.grpc.ServerCall;

/* loaded from: classes5.dex */
public abstract class ForwardingServerCallListener<ReqT> extends AbstractC10568b {

    /* loaded from: classes5.dex */
    public static abstract class SimpleForwardingServerCallListener<ReqT> extends ForwardingServerCallListener<ReqT> {

        /* renamed from: a */
        public final ServerCall.Listener f63178a;

        public SimpleForwardingServerCallListener(ServerCall.Listener<ReqT> listener) {
            this.f63178a = listener;
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b
        public ServerCall.Listener<ReqT> delegate() {
            return this.f63178a;
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onCancel() {
            super.onCancel();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onComplete() {
            super.onComplete();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onHalfClose() {
            super.onHalfClose();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.AbstractC10568b
    public abstract ServerCall.Listener<ReqT> delegate();

    @Override // io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onCancel() {
        super.onCancel();
    }

    @Override // io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onComplete() {
        super.onComplete();
    }

    @Override // io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onHalfClose() {
        super.onHalfClose();
    }

    @Override // io.grpc.ServerCall.Listener
    public void onMessage(ReqT reqt) {
        delegate().onMessage(reqt);
    }

    @Override // io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // io.grpc.AbstractC10568b
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
