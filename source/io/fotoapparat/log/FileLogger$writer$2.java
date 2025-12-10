package io.fotoapparat.log;

import java.io.File;
import java.io.FileWriter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Ljava/io/FileWriter;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class FileLogger$writer$2 extends Lambda implements Function0<FileWriter> {
    final /* synthetic */ FileLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileLogger$writer$2(FileLogger fileLogger) {
        super(0);
        this.this$0 = fileLogger;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FileWriter invoke() {
        File file;
        file = this.this$0.f62997a;
        return new FileWriter(file);
    }
}
