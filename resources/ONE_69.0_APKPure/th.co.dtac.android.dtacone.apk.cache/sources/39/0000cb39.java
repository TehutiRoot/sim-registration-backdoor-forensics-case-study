package io.grpc;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import java.util.concurrent.Executor;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1914")
/* loaded from: classes5.dex */
public final class CompositeCallCredentials extends CallCredentials {

    /* renamed from: a */
    public final CallCredentials f63179a;

    /* renamed from: b */
    public final CallCredentials f63180b;

    /* renamed from: io.grpc.CompositeCallCredentials$a */
    /* loaded from: classes5.dex */
    public static final class C10495a extends CallCredentials.MetadataApplier {

        /* renamed from: a */
        public final CallCredentials.MetadataApplier f63181a;

        /* renamed from: b */
        public final Metadata f63182b;

        public C10495a(CallCredentials.MetadataApplier metadataApplier, Metadata metadata) {
            this.f63181a = metadataApplier;
            this.f63182b = metadata;
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void apply(Metadata metadata) {
            Preconditions.checkNotNull(metadata, "headers");
            Metadata metadata2 = new Metadata();
            metadata2.merge(this.f63182b);
            metadata2.merge(metadata);
            this.f63181a.apply(metadata2);
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void fail(Status status) {
            this.f63181a.fail(status);
        }
    }

    /* renamed from: io.grpc.CompositeCallCredentials$b */
    /* loaded from: classes5.dex */
    public final class C10496b extends CallCredentials.MetadataApplier {

        /* renamed from: a */
        public final CallCredentials.RequestInfo f63183a;

        /* renamed from: b */
        public final Executor f63184b;

        /* renamed from: c */
        public final CallCredentials.MetadataApplier f63185c;

        /* renamed from: d */
        public final Context f63186d;

        public C10496b(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier, Context context) {
            this.f63183a = requestInfo;
            this.f63184b = executor;
            this.f63185c = (CallCredentials.MetadataApplier) Preconditions.checkNotNull(metadataApplier, "delegate");
            this.f63186d = (Context) Preconditions.checkNotNull(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void apply(Metadata metadata) {
            Preconditions.checkNotNull(metadata, "headers");
            Context attach = this.f63186d.attach();
            try {
                CompositeCallCredentials.this.f63180b.applyRequestMetadata(this.f63183a, this.f63184b, new C10495a(this.f63185c, metadata));
            } finally {
                this.f63186d.detach(attach);
            }
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void fail(Status status) {
            this.f63185c.fail(status);
        }
    }

    public CompositeCallCredentials(CallCredentials callCredentials, CallCredentials callCredentials2) {
        this.f63179a = (CallCredentials) Preconditions.checkNotNull(callCredentials, "creds1");
        this.f63180b = (CallCredentials) Preconditions.checkNotNull(callCredentials2, "creds2");
    }

    @Override // io.grpc.CallCredentials
    public void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier) {
        this.f63179a.applyRequestMetadata(requestInfo, executor, new C10496b(requestInfo, executor, metadataApplier, Context.current()));
    }
}