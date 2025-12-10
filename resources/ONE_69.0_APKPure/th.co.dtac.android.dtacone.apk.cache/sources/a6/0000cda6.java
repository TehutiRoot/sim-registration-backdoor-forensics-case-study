package io.opencensus.trace.unsafe;

import io.grpc.Context;
import io.opencensus.trace.ContextHandle;
import io.opencensus.trace.ContextManager;
import io.opencensus.trace.Span;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class ContextManagerImpl implements ContextManager {
    /* renamed from: a */
    public static Context m30467a(ContextHandle contextHandle) {
        return ((C11487iy) contextHandle).m29640a();
    }

    /* renamed from: b */
    public static ContextHandle m30466b(Context context) {
        return new C11487iy(context);
    }

    @Override // io.opencensus.trace.ContextManager
    public ContextHandle currentContext() {
        return m30466b(Context.current());
    }

    @Override // io.opencensus.trace.ContextManager
    public Span getValue(ContextHandle contextHandle) {
        return ContextUtils.getValue(m30467a(contextHandle));
    }

    @Override // io.opencensus.trace.ContextManager
    public ContextHandle withValue(ContextHandle contextHandle, @Nullable Span span) {
        return m30466b(ContextUtils.withValue(m30467a(contextHandle), span));
    }
}