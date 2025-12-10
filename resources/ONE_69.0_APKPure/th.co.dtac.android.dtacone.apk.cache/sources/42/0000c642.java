package p000;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.Executor;

/* renamed from: ew1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C19831ew1 extends ConcurrentServerRunner {
    public C19831ew1(ServerListener serverListener, Executor executor) {
        super(serverListener, executor);
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    /* renamed from: k */
    public boolean configureClient(InterfaceC19485cw1 interfaceC19485cw1) {
        interfaceC19485cw1.setLoggerContext((LoggerContext) getContext());
        return true;
    }
}