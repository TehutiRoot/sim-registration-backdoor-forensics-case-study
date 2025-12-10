package io.fotoapparat.log;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001¢\u0006\u0002\u0010\t\u001a\u0006\u0010\n\u001a\u00020\u0001¨\u0006\u000b"}, m28850d2 = {"fileLogger", "Lio/fotoapparat/log/Logger;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "file", "Ljava/io/File;", "logcat", "loggers", "", "([Lio/fotoapparat/log/Logger;)Lio/fotoapparat/log/Logger;", SchedulerSupport.NONE, "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class LoggersKt {
    @NotNull
    public static final Logger fileLogger(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new BackgroundThreadLogger(new FileLogger(file));
    }

    @NotNull
    public static final Logger logcat() {
        return new LogcatLogger();
    }

    @NotNull
    public static final Logger loggers(@NotNull Logger... loggers) {
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        return new CompositeLogger(ArraysKt___ArraysKt.toList(loggers));
    }

    @NotNull
    public static final Logger none() {
        return new DummyLogger();
    }

    @NotNull
    public static final Logger fileLogger(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return fileLogger(new File(context.getExternalFilesDir("logs"), "log.txt"));
    }
}
