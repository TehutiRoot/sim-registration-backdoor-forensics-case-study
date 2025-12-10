package androidx.compose.p003ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ShaderBrush;
import androidx.compose.p003ui.text.platform.AndroidTextPaint_androidKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R+\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR'\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m28850d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroidx/compose/ui/graphics/ShaderBrush;", "shaderBrush", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/ShaderBrush;", "getShaderBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getAlpha", "()F", "Landroidx/compose/ui/geometry/Size;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size", "Lkotlin/Pair;", "Landroid/graphics/Shader;", "d", "Lkotlin/Pair;", "cachedShader", "ui-text_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.style.ShaderBrushSpan */
/* loaded from: classes2.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a */
    public final ShaderBrush f31509a;

    /* renamed from: b */
    public final float f31510b;

    /* renamed from: c */
    public long f31511c;

    /* renamed from: d */
    public Pair f31512d;

    public ShaderBrushSpan(@NotNull ShaderBrush shaderBrush, float f) {
        Intrinsics.checkNotNullParameter(shaderBrush, "shaderBrush");
        this.f31509a = shaderBrush;
        this.f31510b = f;
        this.f31511c = Size.Companion.m71579getUnspecifiedNHjbRc();
    }

    public final float getAlpha() {
        return this.f31510b;
    }

    @NotNull
    public final ShaderBrush getShaderBrush() {
        return this.f31509a;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m73447getSizeNHjbRc() {
        return this.f31511c;
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public final void m73448setSizeuvyYCjk(long j) {
        this.f31511c = j;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Shader mo71710createShaderuvyYCjk;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.f31510b);
        if (this.f31511c == Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return;
        }
        Pair pair = this.f31512d;
        if (pair != null && Size.m71567equalsimpl0(((Size) pair.getFirst()).m71576unboximpl(), this.f31511c)) {
            mo71710createShaderuvyYCjk = (Shader) pair.getSecond();
        } else {
            mo71710createShaderuvyYCjk = this.f31509a.mo71710createShaderuvyYCjk(this.f31511c);
        }
        textPaint.setShader(mo71710createShaderuvyYCjk);
        this.f31512d = TuplesKt.m28844to(Size.m71559boximpl(this.f31511c), mo71710createShaderuvyYCjk);
    }
}
