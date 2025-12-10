package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ForwardingServerCallListener;
import io.grpc.ServerCall;
import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* loaded from: classes5.dex */
public final class Contexts {

    /* renamed from: io.grpc.Contexts$a */
    /* loaded from: classes5.dex */
    public static class C10518a extends ForwardingServerCallListener.SimpleForwardingServerCallListener {

        /* renamed from: b */
        public final Context f63157b;

        public C10518a(ServerCall.Listener listener, Context context) {
            super(listener);
            this.f63157b = context;
        }

        @Override // io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener, io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public void onCancel() {
            Context attach = this.f63157b.attach();
            try {
                super.onCancel();
            } finally {
                this.f63157b.detach(attach);
            }
        }

        @Override // io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener, io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public void onComplete() {
            Context attach = this.f63157b.attach();
            try {
                super.onComplete();
            } finally {
                this.f63157b.detach(attach);
            }
        }

        @Override // io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener, io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public void onHalfClose() {
            Context attach = this.f63157b.attach();
            try {
                super.onHalfClose();
            } finally {
                this.f63157b.detach(attach);
            }
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.ServerCall.Listener
        public void onMessage(Object obj) {
            Context attach = this.f63157b.attach();
            try {
                super.onMessage(obj);
            } finally {
                this.f63157b.detach(attach);
            }
        }

        @Override // io.grpc.ForwardingServerCallListener.SimpleForwardingServerCallListener, io.grpc.ForwardingServerCallListener, io.grpc.AbstractC10568b, io.grpc.ServerCall.Listener
        public void onReady() {
            Context attach = this.f63157b.attach();
            try {
                super.onReady();
            } finally {
                this.f63157b.detach(attach);
            }
        }
    }

    public static <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(Context context, ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        Context attach = context.attach();
        try {
            return new C10518a(serverCallHandler.startCall(serverCall, metadata), context);
        } finally {
            context.detach(attach);
        }
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1975")
    public static Status statusFromCancelled(Context context) {
        Preconditions.checkNotNull(context, "context must not be null");
        if (!context.isCancelled()) {
            return null;
        }
        Throwable cancellationCause = context.cancellationCause();
        if (cancellationCause == null) {
            return Status.CANCELLED.withDescription("io.grpc.Context was cancelled without error");
        }
        if (cancellationCause instanceof TimeoutException) {
            return Status.DEADLINE_EXCEEDED.withDescription(cancellationCause.getMessage()).withCause(cancellationCause);
        }
        Status fromThrowable = Status.fromThrowable(cancellationCause);
        if (Status.Code.UNKNOWN.equals(fromThrowable.getCode()) && fromThrowable.getCause() == cancellationCause) {
            return Status.CANCELLED.withDescription("Context cancelled").withCause(cancellationCause);
        }
        return fromThrowable.withCause(cancellationCause);
    }
}
