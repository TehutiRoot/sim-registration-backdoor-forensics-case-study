package io.fotoapparat.log;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.log.Logger;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m29142d2 = {"Lio/fotoapparat/log/FileLogger;", "Lio/fotoapparat/log/Logger;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "message", "", "log", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/io/File;", "Ljava/io/FileWriter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Lazy;", "()Ljava/io/FileWriter;", "writer", "fotoapparat_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FileLogger implements Logger {

    /* renamed from: a */
    public final File f63060a;

    /* renamed from: b */
    public final Lazy f63061b;

    public FileLogger(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f63060a = file;
        this.f63061b = LazyKt__LazyJVMKt.lazy(new FileLogger$writer$2(this));
    }

    /* renamed from: a */
    public final FileWriter m30863a() {
        return (FileWriter) this.f63061b.getValue();
    }

    @Override // io.fotoapparat.log.Logger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            FileWriter m30863a = m30863a();
            m30863a.write(message + "\n");
            m30863a().flush();
        } catch (IOException unused) {
        }
    }

    @Override // io.fotoapparat.log.Logger
    public void recordMethod() {
        Logger.DefaultImpls.recordMethod(this);
    }
}