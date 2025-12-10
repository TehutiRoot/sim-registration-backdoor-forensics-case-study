package p000;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.Executor;

/* renamed from: hv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20293hv1 extends ConcurrentServerRunner {
    public C20293hv1(ServerListener serverListener, Executor executor) {
        super(serverListener, executor);
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    /* renamed from: k */
    public boolean configureClient(InterfaceC19949fv1 interfaceC19949fv1) {
        interfaceC19949fv1.setLoggerContext((LoggerContext) getContext());
        return true;
    }
}
