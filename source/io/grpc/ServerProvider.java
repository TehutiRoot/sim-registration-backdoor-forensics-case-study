package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ManagedChannelProvider;

@Internal
/* loaded from: classes5.dex */
public abstract class ServerProvider {

    /* loaded from: classes5.dex */
    public static final class NewServerBuilderResult {

        /* renamed from: a */
        public final ServerBuilder f63381a;

        /* renamed from: b */
        public final String f63382b;

        public NewServerBuilderResult(ServerBuilder serverBuilder, String str) {
            this.f63381a = serverBuilder;
            this.f63382b = str;
        }

        public static NewServerBuilderResult error(String str) {
            return new NewServerBuilderResult(null, (String) Preconditions.checkNotNull(str));
        }

        public static NewServerBuilderResult serverBuilder(ServerBuilder<?> serverBuilder) {
            return new NewServerBuilderResult((ServerBuilder) Preconditions.checkNotNull(serverBuilder), null);
        }

        public String getError() {
            return this.f63382b;
        }

        public ServerBuilder<?> getServerBuilder() {
            return this.f63381a;
        }
    }

    public static ServerProvider provider() {
        ServerProvider m30338d = ServerRegistry.getDefaultRegistry().m30338d();
        if (m30338d != null) {
            return m30338d;
        }
        throw new ManagedChannelProvider.ProviderNotFoundException("No functional server found. Try adding a dependency on the grpc-netty or grpc-netty-shaded artifact");
    }

    public abstract ServerBuilder<?> builderForPort(int i);

    public abstract boolean isAvailable();

    public NewServerBuilderResult newServerBuilderForPort(int i, ServerCredentials serverCredentials) {
        return NewServerBuilderResult.error("ServerCredentials are unsupported");
    }

    public abstract int priority();
}
