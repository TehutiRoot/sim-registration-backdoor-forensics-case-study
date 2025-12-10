package androidx.compose.p003ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.PaintingStyle;
import androidx.compose.p003ui.graphics.ShaderBrush;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001d\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0010R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R4\u00109\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u008e\u0002ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\u001a\u0004\b3\u00104\"\u0004\b5\u00106*\u0004\b7\u00108\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006:"}, m28850d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecoration", "", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "shadow", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "brush", "Landroidx/compose/ui/geometry/Size;", "size", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "Landroidx/compose/ui/graphics/Paint;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/Paint;", "composePaint", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/text/style/TextDecoration;", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "()V", "d", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "Landroidx/compose/ui/graphics/BlendMode;", "<set-?>", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;)Ljava/lang/Object;", "blendMode", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidTextPaint */
/* loaded from: classes2.dex */
public final class AndroidTextPaint extends TextPaint {

    /* renamed from: a */
    public final Paint f31495a;

    /* renamed from: b */
    public TextDecoration f31496b;

    /* renamed from: c */
    public Shadow f31497c;

    /* renamed from: d */
    public DrawStyle f31498d;

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.f31495a = AndroidPaint_androidKt.asComposePaint(this);
        this.f31496b = TextDecoration.Companion.getNone();
        this.f31497c = Shadow.Companion.getNone();
    }

    @VisibleForTesting
    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default  reason: not valid java name */
    public static /* synthetic */ void m73436setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m73439setBrush12SF9DM(brush, j, f);
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public final int m73437getBlendMode0nO6VwU() {
        return this.f31495a.mo71616getBlendMode0nO6VwU();
    }

    @NotNull
    public final Shadow getShadow$ui_text_release() {
        return this.f31497c;
    }

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public final void m73438setBlendModes9anfk8(int i) {
        this.f31495a.mo71622setBlendModes9anfk8(i);
    }

    /* renamed from: setBrush-12SF9DM  reason: not valid java name */
    public final void m73439setBrush12SF9DM(@Nullable Brush brush, long j, float f) {
        float coerceIn;
        if (((brush instanceof SolidColor) && ((SolidColor) brush).m72025getValue0d7_KjU() != Color.Companion.m71771getUnspecified0d7_KjU()) || ((brush instanceof ShaderBrush) && j != Size.Companion.m71579getUnspecifiedNHjbRc())) {
            Paint paint = this.f31495a;
            if (Float.isNaN(f)) {
                coerceIn = this.f31495a.getAlpha();
            } else {
                coerceIn = AbstractC11719c.coerceIn(f, 0.0f, 1.0f);
            }
            brush.mo71688applyToPq9zytI(j, paint, coerceIn);
        } else if (brush == null) {
            this.f31495a.setShader(null);
        }
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m73440setColor8_81llA(long j) {
        if (j != Color.Companion.m71771getUnspecified0d7_KjU()) {
            this.f31495a.mo71623setColor8_81llA(j);
            this.f31495a.setShader(null);
        }
    }

    public final void setDrawStyle(@Nullable DrawStyle drawStyle) {
        if (drawStyle != null && !Intrinsics.areEqual(this.f31498d, drawStyle)) {
            this.f31498d = drawStyle;
            if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
                this.f31495a.mo71627setStylek9PVt8s(PaintingStyle.Companion.m71962getFillTiuSbCo());
            } else if (drawStyle instanceof Stroke) {
                this.f31495a.mo71627setStylek9PVt8s(PaintingStyle.Companion.m71963getStrokeTiuSbCo());
                Stroke stroke = (Stroke) drawStyle;
                this.f31495a.setStrokeWidth(stroke.getWidth());
                this.f31495a.setStrokeMiterLimit(stroke.getMiter());
                this.f31495a.mo71626setStrokeJoinWw9F2mQ(stroke.m72232getJoinLxFBmk8());
                this.f31495a.mo71625setStrokeCapBeK7IIE(stroke.m72231getCapKaPHkGw());
                this.f31495a.setPathEffect(stroke.getPathEffect());
            }
        }
    }

    public final void setShadow(@Nullable Shadow shadow) {
        if (shadow != null && !Intrinsics.areEqual(this.f31497c, shadow)) {
            this.f31497c = shadow;
            if (Intrinsics.areEqual(shadow, Shadow.Companion.getNone())) {
                clearShadowLayer();
            } else {
                setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.f31497c.getBlurRadius()), Offset.m71502getXimpl(this.f31497c.m72016getOffsetF1C5BW0()), Offset.m71503getYimpl(this.f31497c.m72016getOffsetF1C5BW0()), ColorKt.m71788toArgb8_81llA(this.f31497c.m72015getColor0d7_KjU()));
            }
        }
    }

    public final void setShadow$ui_text_release(@NotNull Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "<set-?>");
        this.f31497c = shadow;
    }

    public final void setTextDecoration(@Nullable TextDecoration textDecoration) {
        if (textDecoration != null && !Intrinsics.areEqual(this.f31496b, textDecoration)) {
            this.f31496b = textDecoration;
            TextDecoration.Companion companion = TextDecoration.Companion;
            setUnderlineText(textDecoration.contains(companion.getUnderline()));
            setStrikeThruText(this.f31496b.contains(companion.getLineThrough()));
        }
    }
}
