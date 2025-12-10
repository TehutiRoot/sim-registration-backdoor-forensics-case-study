package io.fotoapparat.log;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.log.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m29142d2 = {"Lio/fotoapparat/log/CompositeLogger;", "Lio/fotoapparat/log/Logger;", "", "loggers", "<init>", "(Ljava/util/List;)V", "", "message", "", "log", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCompositeLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositeLogger.kt\nio/fotoapparat/log/CompositeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n1855#2,2:14\n*S KotlinDebug\n*F\n+ 1 CompositeLogger.kt\nio/fotoapparat/log/CompositeLogger\n*L\n9#1:14,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CompositeLogger implements Logger {

    /* renamed from: a */
    public final List f63059a;

    public CompositeLogger(@NotNull List<? extends Logger> loggers) {
        Intrinsics.checkNotNullParameter(loggers, "loggers");
        this.f63059a = loggers;
    }

    @Override // io.fotoapparat.log.Logger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        for (Logger logger : this.f63059a) {
            logger.log(message);
        }
    }

    @Override // io.fotoapparat.log.Logger
    public void recordMethod() {
        Logger.DefaultImpls.recordMethod(this);
    }
}