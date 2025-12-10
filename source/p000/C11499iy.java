package p000;

import io.grpc.Context;
import io.opencensus.trace.ContextHandle;

/* renamed from: iy */
/* loaded from: classes5.dex */
public class C11499iy implements ContextHandle {

    /* renamed from: a */
    public final Context f67130a;

    public C11499iy(Context context) {
        this.f67130a = context;
    }

    /* renamed from: a */
    public Context m29294a() {
        return this.f67130a;
    }

    @Override // io.opencensus.trace.ContextHandle
    public ContextHandle attach() {
        return new C11499iy(this.f67130a.attach());
    }

    @Override // io.opencensus.trace.ContextHandle
    public void detach(ContextHandle contextHandle) {
        this.f67130a.detach(((C11499iy) contextHandle).f67130a);
    }
}
