package androidx.compose.p003ui.graphics;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020(8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R-\u0010.\u001a\u00020-2\u0006\u0010.\u001a\u00020-8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R-\u00107\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R-\u0010;\u001a\u0002082\u0006\u0010\u001a\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010>\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010$\"\u0004\b=\u0010&R-\u0010B\u001a\u00020?2\u0006\u0010\u001a\u001a\u00020?8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b@\u00104\"\u0004\bA\u00106R-\u0010F\u001a\u00020C2\u0006\u0010\u001a\u001a\u00020C8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bD\u00104\"\u0004\bE\u00106R$\u0010I\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R-\u0010M\u001a\u00020J2\u0006\u0010\u001a\u001a\u00020J8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bK\u00104\"\u0004\bL\u00106R4\u0010R\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010W\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m29142d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "asFrameworkPaint", "()Landroid/graphics/Paint;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/BlendMode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", OperatorName.CURVE_TO, "Landroid/graphics/Shader;", "internalShader", "Landroidx/compose/ui/graphics/ColorFilter;", "d", "Landroidx/compose/ui/graphics/ColorFilter;", "internalColorFilter", "Landroidx/compose/ui/graphics/PathEffect;", "value", "e", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "pathEffect", "", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "", "isAntiAlias", "()Z", "setAntiAlias", "(Z)V", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "style", "getStrokeWidth", "setStrokeWidth", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeJoin", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeMiterLimit", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "filterQuality", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "shader", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "colorFilter", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.AndroidPaint */
/* loaded from: classes2.dex */
public final class AndroidPaint implements Paint {

    /* renamed from: a */
    public Paint f29062a;

    /* renamed from: b */
    public int f29063b;

    /* renamed from: c */
    public Shader f29064c;

    /* renamed from: d */
    public ColorFilter f29065d;

    /* renamed from: e */
    public PathEffect f29066e;

    public AndroidPaint(@NotNull Paint internalPaint) {
        Intrinsics.checkNotNullParameter(internalPaint, "internalPaint");
        this.f29062a = internalPaint;
        this.f29063b = BlendMode.Companion.m71870getSrcOver0nO6VwU();
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    @NotNull
    public Paint asFrameworkPaint() {
        return this.f29062a;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public int mo71800getBlendMode0nO6VwU() {
        return this.f29063b;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getColor-0d7_KjU  reason: not valid java name */
    public long mo71801getColor0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    @Nullable
    public ColorFilter getColorFilter() {
        return this.f29065d;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getFilterQuality-f-v9h1I  reason: not valid java name */
    public int mo71802getFilterQualityfv9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    @Nullable
    public PathEffect getPathEffect() {
        return this.f29066e;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    @Nullable
    public Shader getShader() {
        return this.f29064c;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getStrokeCap-KaPHkGw  reason: not valid java name */
    public int mo71803getStrokeCapKaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getStrokeJoin-LxFBmk8  reason: not valid java name */
    public int mo71804getStrokeJoinLxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: getStyle-TiuSbCo  reason: not valid java name */
    public int mo71805getStyleTiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.f29062a);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.f29062a, f);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setAntiAlias(boolean z) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.f29062a, z);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public void mo71806setBlendModes9anfk8(int i) {
        if (!BlendMode.m71839equalsimpl0(this.f29063b, i)) {
            this.f29063b = i;
            AndroidPaint_androidKt.m71812setNativeBlendModeGB0RdKg(this.f29062a, i);
        }
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public void mo71807setColor8_81llA(long j) {
        AndroidPaint_androidKt.m71813setNativeColor4WTKRHQ(this.f29062a, j);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f29065d = colorFilter;
        AndroidPaint_androidKt.setNativeColorFilter(this.f29062a, colorFilter);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setFilterQuality-vDHp3xo  reason: not valid java name */
    public void mo71808setFilterQualityvDHp3xo(int i) {
        AndroidPaint_androidKt.m71814setNativeFilterQuality50PEsBU(this.f29062a, i);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setPathEffect(@Nullable PathEffect pathEffect) {
        AndroidPaint_androidKt.setNativePathEffect(this.f29062a, pathEffect);
        this.f29066e = pathEffect;
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setShader(@Nullable Shader shader) {
        this.f29064c = shader;
        AndroidPaint_androidKt.setNativeShader(this.f29062a, shader);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setStrokeCap-BeK7IIE  reason: not valid java name */
    public void mo71809setStrokeCapBeK7IIE(int i) {
        AndroidPaint_androidKt.m71815setNativeStrokeCapCSYIeUk(this.f29062a, i);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setStrokeJoin-Ww9F2mQ  reason: not valid java name */
    public void mo71810setStrokeJoinWw9F2mQ(int i) {
        AndroidPaint_androidKt.m71816setNativeStrokeJoinkLtJ_vA(this.f29062a, i);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.f29062a, f);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.f29062a, f);
    }

    @Override // androidx.compose.p003ui.graphics.Paint
    /* renamed from: setStyle-k9PVt8s  reason: not valid java name */
    public void mo71811setStylek9PVt8s(int i) {
        AndroidPaint_androidKt.m71817setNativeStyle5YerkU(this.f29062a, i);
    }

    public AndroidPaint() {
        this(AndroidPaint_androidKt.makeNativePaint());
    }
}