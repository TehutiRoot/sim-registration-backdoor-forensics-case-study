package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/support/FileFactory;", "", "<init>", "()V", "Ljava/io/File;", "directory", "create", "(Ljava/io/File;)Ljava/io/File;", "", "fileName", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "Ljava/util/concurrent/atomic/AtomicLong;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/concurrent/atomic/AtomicLong;", "uniqueIdGenerator", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FileFactory {
    @NotNull
    public static final FileFactory INSTANCE = new FileFactory();

    /* renamed from: a */
    public static final AtomicLong f42944a = new AtomicLong();

    @Nullable
    public final File create(@NotNull File directory) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        long andIncrement = f42944a.getAndIncrement();
        return create(directory, "chucker-" + andIncrement);
    }

    @Nullable
    public final File create(@NotNull File directory, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            File file = new File(directory, fileName);
            if (file.exists() && !file.delete()) {
                throw new IOException("Failed to delete file " + file);
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (file.createNewFile()) {
                return file;
            }
            throw new IOException("File " + file + " already exists");
        } catch (IOException e) {
            Logger.Companion.error("An error occurred while creating a file", e);
            return null;
        }
    }
}