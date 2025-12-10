package p000;

import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import ch.qos.logback.core.net.server.ServerListener;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* renamed from: uv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22529uv1 extends ConcurrentServerRunner {

    /* renamed from: h */
    public final int f107506h;

    public C22529uv1(ServerListener serverListener, Executor executor, int i) {
        super(serverListener, executor);
        this.f107506h = i;
    }

    @Override // ch.qos.logback.core.net.server.ConcurrentServerRunner
    /* renamed from: k */
    public boolean configureClient(InterfaceC22185sv1 interfaceC22185sv1) {
        interfaceC22185sv1.setContext(getContext());
        interfaceC22185sv1.mo967h(new ArrayBlockingQueue(this.f107506h));
        return true;
    }
}
