package io.opencensus.trace.unsafe;

import ch.qos.logback.core.CoreConstants;
import io.grpc.Context;
import io.opencensus.internal.Utils;
import io.opencensus.trace.BlankSpan;
import io.opencensus.trace.Span;
import javax.annotation.Nullable;

@Deprecated
/* loaded from: classes5.dex */
public final class ContextUtils {

    /* renamed from: a */
    public static final Context.Key f63790a = Context.key("opencensus-trace-span-key");

    public static Span getValue(Context context) {
        Span span = (Span) f63790a.get((Context) Utils.checkNotNull(context, CoreConstants.CONTEXT_SCOPE_VALUE));
        if (span == null) {
            return BlankSpan.INSTANCE;
        }
        return span;
    }

    public static Context withValue(Context context, @Nullable Span span) {
        return ((Context) Utils.checkNotNull(context, CoreConstants.CONTEXT_SCOPE_VALUE)).withValue(f63790a, span);
    }
}
