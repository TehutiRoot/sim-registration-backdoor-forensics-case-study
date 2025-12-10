package io.grpc;

import io.grpc.ClientCall;

/* loaded from: classes5.dex */
public abstract class ForwardingClientCallListener<RespT> extends AbstractC10567a {

    /* loaded from: classes5.dex */
    public static abstract class SimpleForwardingClientCallListener<RespT> extends ForwardingClientCallListener<RespT> {

        /* renamed from: a */
        public final ClientCall.Listener f63176a;

        public SimpleForwardingClientCallListener(ClientCall.Listener<RespT> listener) {
            this.f63176a = listener;
        }

        @Override // io.grpc.ForwardingClientCallListener, io.grpc.AbstractC10567a
        public ClientCall.Listener<RespT> delegate() {
            return this.f63176a;
        }

        @Override // io.grpc.ForwardingClientCallListener, io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
        public /* bridge */ /* synthetic */ void onClose(Status status, Metadata metadata) {
            super.onClose(status, metadata);
        }

        @Override // io.grpc.ForwardingClientCallListener, io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
        public /* bridge */ /* synthetic */ void onHeaders(Metadata metadata) {
            super.onHeaders(metadata);
        }

        @Override // io.grpc.ForwardingClientCallListener, io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // io.grpc.ForwardingClientCallListener, io.grpc.AbstractC10567a
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.AbstractC10567a
    public abstract ClientCall.Listener<RespT> delegate();

    @Override // io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
    public /* bridge */ /* synthetic */ void onClose(Status status, Metadata metadata) {
        super.onClose(status, metadata);
    }

    @Override // io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
    public /* bridge */ /* synthetic */ void onHeaders(Metadata metadata) {
        super.onHeaders(metadata);
    }

    @Override // io.grpc.ClientCall.Listener
    public void onMessage(RespT respt) {
        delegate().onMessage(respt);
    }

    @Override // io.grpc.AbstractC10567a, io.grpc.ClientCall.Listener
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // io.grpc.AbstractC10567a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
