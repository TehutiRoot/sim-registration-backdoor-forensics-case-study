package io.fotoapparat.log;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.hardware.ExecutorKt;
import io.fotoapparat.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lio/fotoapparat/log/BackgroundThreadLogger;", "Lio/fotoapparat/log/Logger;", "logger", "<init>", "(Lio/fotoapparat/log/Logger;)V", "", "message", "", "log", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lio/fotoapparat/log/Logger;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class BackgroundThreadLogger implements Logger {

    /* renamed from: a */
    public final Logger f63058a;

    public BackgroundThreadLogger(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f63058a = logger;
    }

    @Override // io.fotoapparat.log.Logger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ExecutorKt.executeLoggingThread(new BackgroundThreadLogger$log$1(this, message));
    }

    @Override // io.fotoapparat.log.Logger
    public void recordMethod() {
        Logger.DefaultImpls.recordMethod(this);
    }
}