package io.grpc;

import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public final class CompositeChannelCredentials extends ChannelCredentials {

    /* renamed from: a */
    public final ChannelCredentials f63188a;

    /* renamed from: b */
    public final CallCredentials f63189b;

    public CompositeChannelCredentials(ChannelCredentials channelCredentials, CallCredentials callCredentials) {
        this.f63188a = (ChannelCredentials) Preconditions.checkNotNull(channelCredentials, "channelCreds");
        this.f63189b = (CallCredentials) Preconditions.checkNotNull(callCredentials, "callCreds");
    }

    public static ChannelCredentials create(ChannelCredentials channelCredentials, CallCredentials callCredentials) {
        return new CompositeChannelCredentials(channelCredentials, callCredentials);
    }

    public CallCredentials getCallCredentials() {
        return this.f63189b;
    }

    public ChannelCredentials getChannelCredentials() {
        return this.f63188a;
    }

    @Override // io.grpc.ChannelCredentials
    public ChannelCredentials withoutBearerTokens() {
        return this.f63188a.withoutBearerTokens();
    }
}