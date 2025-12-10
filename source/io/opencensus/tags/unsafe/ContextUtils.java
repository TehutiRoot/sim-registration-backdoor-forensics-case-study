package io.opencensus.tags.unsafe;

import ch.qos.logback.core.CoreConstants;
import io.grpc.Context;
import io.opencensus.internal.Utils;
import io.opencensus.tags.TagContext;
import java.util.Collections;
import java.util.Iterator;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class ContextUtils {

    /* renamed from: a */
    public static final TagContext f63667a;

    /* renamed from: b */
    public static final Context.Key f63668b;

    /* renamed from: io.opencensus.tags.unsafe.ContextUtils$b */
    /* loaded from: classes5.dex */
    public static final class C10681b extends TagContext {
        public C10681b() {
        }

        @Override // io.opencensus.tags.TagContext
        public Iterator getIterator() {
            return Collections.emptySet().iterator();
        }
    }

    static {
        C10681b c10681b = new C10681b();
        f63667a = c10681b;
        f63668b = Context.keyWithDefault("opencensus-tag-context-key", c10681b);
    }

    public static TagContext getValue(Context context) {
        TagContext tagContext = (TagContext) f63668b.get(context);
        if (tagContext == null) {
            return f63667a;
        }
        return tagContext;
    }

    public static Context withValue(Context context, @Nullable TagContext tagContext) {
        return ((Context) Utils.checkNotNull(context, CoreConstants.CONTEXT_SCOPE_VALUE)).withValue(f63668b, tagContext);
    }
}
