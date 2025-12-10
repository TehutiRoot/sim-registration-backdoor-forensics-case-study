package androidx.work.impl;

import androidx.work.Logger;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m29142d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "TAG", "WORK_DATABASE_NAME", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[Ljava/lang/String;", "DATABASE_EXTRA_FILES", "work-runtime_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WorkDatabasePathHelperKt {
    @NotNull
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";

    /* renamed from: a */
    public static final String f38416a;

    /* renamed from: b */
    public static final String[] f38417b;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"WrkDbPathHelper\")");
        f38416a = tagWithPrefix;
        f38417b = new String[]{"-journal", "-shm", "-wal"};
    }
}