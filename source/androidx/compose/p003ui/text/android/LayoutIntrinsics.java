package androidx.compose.p003ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalPlatformTextApi
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0013\u0010 \u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010\"¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/CharSequence;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/text/TextPaint;", OperatorName.CURVE_TO, "I", "", "d", "F", "_maxIntrinsicWidth", "e", "_minIntrinsicWidth", "Landroid/text/BoringLayout$Metrics;", OperatorName.FILL_NON_ZERO, "Landroid/text/BoringLayout$Metrics;", "_boringMetrics", "", OperatorName.NON_STROKING_GRAY, "Z", "boringMetricsIsInit", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.android.LayoutIntrinsics */
/* loaded from: classes2.dex */
public final class LayoutIntrinsics {

    /* renamed from: a */
    public final CharSequence f31132a;

    /* renamed from: b */
    public final TextPaint f31133b;

    /* renamed from: c */
    public final int f31134c;

    /* renamed from: d */
    public float f31135d;

    /* renamed from: e */
    public float f31136e;

    /* renamed from: f */
    public BoringLayout.Metrics f31137f;

    /* renamed from: g */
    public boolean f31138g;

    public LayoutIntrinsics(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f31132a = charSequence;
        this.f31133b = textPaint;
        this.f31134c = i;
        this.f31135d = Float.NaN;
        this.f31136e = Float.NaN;
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.f31138g) {
            this.f31137f = BoringLayoutFactory.INSTANCE.measure(this.f31132a, this.f31133b, TextLayoutKt.getTextDirectionHeuristic(this.f31134c));
            this.f31138g = true;
        }
        return this.f31137f;
    }

    public final float getMaxIntrinsicWidth() {
        Float f;
        boolean m59083c;
        if (!Float.isNaN(this.f31135d)) {
            return this.f31135d;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        if (boringMetrics != null) {
            f = Float.valueOf(boringMetrics.width);
        } else {
            f = null;
        }
        if (f == null) {
            CharSequence charSequence = this.f31132a;
            f = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f31133b)));
        }
        m59083c = LayoutIntrinsicsKt.m59083c(f.floatValue(), this.f31132a, this.f31133b);
        if (m59083c) {
            f = Float.valueOf(f.floatValue() + 0.5f);
        }
        float floatValue = f.floatValue();
        this.f31135d = floatValue;
        return floatValue;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this.f31136e)) {
            return this.f31136e;
        }
        float minIntrinsicWidth = LayoutIntrinsicsKt.minIntrinsicWidth(this.f31132a, this.f31133b);
        this.f31136e = minIntrinsicWidth;
        return minIntrinsicWidth;
    }
}
