package androidx.compose.p003ui.text.android;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jß\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0003\u0010\u0013\u001a\u00020\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m29142d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "<init>", "()V", "", TextBundle.TEXT_ENTRY, "", "start", "end", "Landroid/text/TextPaint;", "paint", "width", "Landroid/text/TextDirectionHeuristic;", "textDir", "Landroid/text/Layout$Alignment;", "alignment", "maxLines", "Landroid/text/TextUtils$TruncateAt;", "ellipsize", "ellipsizedWidth", "", "lineSpacingMultiplier", "lineSpacingExtra", "justificationMode", "", "includePadding", "useFallbackLineSpacing", "breakStrategy", "lineBreakStyle", "lineBreakWordStyle", "hyphenationFrequency", "", "leftIndents", "rightIndents", "Landroid/text/StaticLayout;", "create", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)Landroid/text/StaticLayout;", "layout", "isFallbackLineSpacingEnabled", "(Landroid/text/StaticLayout;Z)Z", "LtN1;", PDPageLabelRange.STYLE_LETTERS_LOWER, "LtN1;", "delegate", "ui-text_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory */
/* loaded from: classes2.dex */
public final class StaticLayoutFactory {
    public static final int $stable;
    @NotNull
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();

    /* renamed from: a */
    public static final InterfaceC22334tN1 f31227a;

    static {
        InterfaceC22334tN1 staticLayoutFactoryDefault;
        if (Build.VERSION.SDK_INT >= 23) {
            staticLayoutFactoryDefault = new C20258hN1();
        } else {
            staticLayoutFactoryDefault = new StaticLayoutFactoryDefault();
        }
        f31227a = staticLayoutFactoryDefault;
        $stable = 8;
    }

    @NotNull
    public final StaticLayout create(@NotNull CharSequence text, int i, int i2, @NotNull TextPaint paint, int i3, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, @IntRange(from = 0) int i4, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i5, @FloatRange(from = 0.0d) float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return f31227a.mo22694b(new C22507uN1(text, i, i2, paint, i3, textDir, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, i9, i10, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(@NotNull StaticLayout layout, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return f31227a.mo22695a(layout, z);
    }
}