package io.opencensus.trace.unsafe;

import io.grpc.Context;
import io.opencensus.internal.Provider;
import io.opencensus.trace.ContextHandle;
import io.opencensus.trace.ContextManager;
import io.opencensus.trace.Span;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class ContextHandleUtils {

    /* renamed from: a */
    public static final Logger f63788a = Logger.getLogger(ContextHandleUtils.class.getName());

    /* renamed from: b */
    public static final ContextManager f63789b = m30128a(ContextManager.class.getClassLoader());

    /* renamed from: a */
    public static ContextManager m30128a(ClassLoader classLoader) {
        try {
            return (ContextManager) Provider.createInstance(Class.forName("io.opentelemetry.opencensusshim.OpenTelemetryContextManager", true, classLoader), ContextManager.class);
        } catch (ClassNotFoundException e) {
            f63788a.log(Level.FINE, "Couldn't load full implementation for OpenTelemetry context manager, now loading original implementation.", (Throwable) e);
            return new ContextManagerImpl();
        }
    }

    public static ContextHandle currentContext() {
        return f63789b.currentContext();
    }

    public static Span getValue(ContextHandle contextHandle) {
        return f63789b.getValue(contextHandle);
    }

    @Nullable
    public static Context tryExtractGrpcContext(ContextHandle contextHandle) {
        if (contextHandle instanceof C11499iy) {
            return ((C11499iy) contextHandle).m29294a();
        }
        return null;
    }

    public static ContextHandle withValue(ContextHandle contextHandle, @Nullable Span span) {
        return f63789b.withValue(contextHandle, span);
    }
}
