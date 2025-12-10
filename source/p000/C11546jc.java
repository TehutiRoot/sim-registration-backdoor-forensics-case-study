package p000;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: jc */
/* loaded from: classes2.dex */
public final class C11546jc {

    /* renamed from: a */
    public static final C11546jc f67311a = new C11546jc();

    @JvmStatic
    @DoNotInline
    @NotNull
    /* renamed from: a */
    public static final BoringLayout m29189a(@NotNull CharSequence text, @NotNull TextPaint paint, int i, @NotNull Layout.Alignment alignment, float f, float f2, @NotNull BoringLayout.Metrics metrics, boolean z, boolean z2, @Nullable TextUtils.TruncateAt truncateAt, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        return AbstractC10477ic.m30622a(text, paint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    @JvmStatic
    @DoNotInline
    @Nullable
    /* renamed from: b */
    public static final BoringLayout.Metrics m29188b(@NotNull CharSequence text, @NotNull TextPaint paint, @NotNull TextDirectionHeuristic textDir) {
        BoringLayout.Metrics isBoring;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        isBoring = BoringLayout.isBoring(text, paint, textDir, true, null);
        return isBoring;
    }

    /* renamed from: c */
    public final boolean m29187c(BoringLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        Intrinsics.checkNotNullParameter(layout, "layout");
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
