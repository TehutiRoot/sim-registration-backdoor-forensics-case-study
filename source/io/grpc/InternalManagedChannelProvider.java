package io.grpc;

import io.grpc.ManagedChannelProvider;

@Internal
/* loaded from: classes5.dex */
public final class InternalManagedChannelProvider {
    public static ManagedChannelBuilder<?> builderForAddress(ManagedChannelProvider managedChannelProvider, String str, int i) {
        return managedChannelProvider.builderForAddress(str, i);
    }

    public static ManagedChannelBuilder<?> builderForTarget(ManagedChannelProvider managedChannelProvider, String str) {
        return managedChannelProvider.builderForTarget(str);
    }

    public static boolean isAvailable(ManagedChannelProvider managedChannelProvider) {
        return managedChannelProvider.isAvailable();
    }

    public static ManagedChannelProvider.NewChannelBuilderResult newChannelBuilder(ManagedChannelProvider managedChannelProvider, String str, ChannelCredentials channelCredentials) {
        return managedChannelProvider.newChannelBuilder(str, channelCredentials);
    }
}
