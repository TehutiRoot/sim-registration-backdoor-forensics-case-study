package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public final class InternalConfiguratorRegistry {
    public static void configureChannelBuilder(ManagedChannelBuilder<?> managedChannelBuilder) {
        for (InterfaceC0216Cw interfaceC0216Cw : C0286Dw.m68578b().m68579a()) {
            interfaceC0216Cw.configureChannelBuilder(managedChannelBuilder);
        }
    }

    public static void configureServerBuilder(ServerBuilder<?> serverBuilder) {
        for (InterfaceC0216Cw interfaceC0216Cw : C0286Dw.m68578b().m68579a()) {
            interfaceC0216Cw.configureServerBuilder(serverBuilder);
        }
    }

    public static List<?> getConfigurators() {
        return C0286Dw.m68578b().m68579a();
    }

    public static void setConfigurators(List<InternalConfigurator> list) {
        C0286Dw.m68578b().m68577c(list);
    }

    public static boolean wasSetConfiguratorsCalled() {
        return C0286Dw.m68578b().m68576d();
    }
}
