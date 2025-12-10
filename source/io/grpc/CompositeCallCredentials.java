package io.grpc;

import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import java.util.concurrent.Executor;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/1914")
/* loaded from: classes5.dex */
public final class CompositeCallCredentials extends CallCredentials {

    /* renamed from: a */
    public final CallCredentials f63116a;

    /* renamed from: b */
    public final CallCredentials f63117b;

    /* renamed from: io.grpc.CompositeCallCredentials$a */
    /* loaded from: classes5.dex */
    public static final class C10508a extends CallCredentials.MetadataApplier {

        /* renamed from: a */
        public final CallCredentials.MetadataApplier f63118a;

        /* renamed from: b */
        public final Metadata f63119b;

        public C10508a(CallCredentials.MetadataApplier metadataApplier, Metadata metadata) {
            this.f63118a = metadataApplier;
            this.f63119b = metadata;
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void apply(Metadata metadata) {
            Preconditions.checkNotNull(metadata, "headers");
            Metadata metadata2 = new Metadata();
            metadata2.merge(this.f63119b);
            metadata2.merge(metadata);
            this.f63118a.apply(metadata2);
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void fail(Status status) {
            this.f63118a.fail(status);
        }
    }

    /* renamed from: io.grpc.CompositeCallCredentials$b */
    /* loaded from: classes5.dex */
    public final class C10509b extends CallCredentials.MetadataApplier {

        /* renamed from: a */
        public final CallCredentials.RequestInfo f63120a;

        /* renamed from: b */
        public final Executor f63121b;

        /* renamed from: c */
        public final CallCredentials.MetadataApplier f63122c;

        /* renamed from: d */
        public final Context f63123d;

        public C10509b(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier, Context context) {
            this.f63120a = requestInfo;
            this.f63121b = executor;
            this.f63122c = (CallCredentials.MetadataApplier) Preconditions.checkNotNull(metadataApplier, "delegate");
            this.f63123d = (Context) Preconditions.checkNotNull(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void apply(Metadata metadata) {
            Preconditions.checkNotNull(metadata, "headers");
            Context attach = this.f63123d.attach();
            try {
                CompositeCallCredentials.this.f63117b.applyRequestMetadata(this.f63120a, this.f63121b, new C10508a(this.f63122c, metadata));
            } finally {
                this.f63123d.detach(attach);
            }
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public void fail(Status status) {
            this.f63122c.fail(status);
        }
    }

    public CompositeCallCredentials(CallCredentials callCredentials, CallCredentials callCredentials2) {
        this.f63116a = (CallCredentials) Preconditions.checkNotNull(callCredentials, "creds1");
        this.f63117b = (CallCredentials) Preconditions.checkNotNull(callCredentials2, "creds2");
    }

    @Override // io.grpc.CallCredentials
    public void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier) {
        this.f63116a.applyRequestMetadata(requestInfo, executor, new C10509b(requestInfo, executor, metadataApplier, Context.current()));
    }
}
