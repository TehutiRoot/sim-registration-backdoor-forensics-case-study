package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public final class InternalConfiguratorRegistry {
    public static void configureChannelBuilder(ManagedChannelBuilder<?> managedChannelBuilder) {
        for (InterfaceC0210Cw interfaceC0210Cw : C0278Dw.m68739b().m68740a()) {
            interfaceC0210Cw.configureChannelBuilder(managedChannelBuilder);
        }
    }

    public static void configureServerBuilder(ServerBuilder<?> serverBuilder) {
        for (InterfaceC0210Cw interfaceC0210Cw : C0278Dw.m68739b().m68740a()) {
            interfaceC0210Cw.configureServerBuilder(serverBuilder);
        }
    }

    public static List<?> getConfigurators() {
        return C0278Dw.m68739b().m68740a();
    }

    public static void setConfigurators(List<InternalConfigurator> list) {
        C0278Dw.m68739b().m68738c(list);
    }

    public static boolean wasSetConfiguratorsCalled() {
        return C0278Dw.m68739b().m68737d();
    }
}