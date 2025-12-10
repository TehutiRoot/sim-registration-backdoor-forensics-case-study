package io.fotoapparat.log;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, m28850d2 = {"Lio/fotoapparat/log/Logger;", "", "log", "", "message", "", "recordMethod", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public interface Logger {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class DefaultImpls {
        public static void recordMethod(@NotNull Logger logger) {
            StackTraceElement stackTraceElement = new Exception().getStackTrace()[2];
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "lastStacktrace.className");
            Object last = CollectionsKt___CollectionsKt.last((List<? extends Object>) StringsKt__StringsKt.split$default((CharSequence) className, new char[]{'.'}, false, 0, 6, (Object) null));
            String methodName = stackTraceElement.getMethodName();
            logger.log(last + ": " + methodName);
        }
    }

    void log(@NotNull String str);

    void recordMethod();
}
