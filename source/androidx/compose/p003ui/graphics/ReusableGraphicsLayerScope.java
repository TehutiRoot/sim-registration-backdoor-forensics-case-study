package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.DpRect;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\"\u0010\u0015\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR\"\u0010\u0019\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\"\u0010\u001d\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\"\u0010!\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u001f\u0010\n\"\u0004\b \u0010\fR+\u0010)\u001a\u00020\"8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010-\u001a\u00020\"8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\"\u00101\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010\b\u001a\u0004\b/\u0010\n\"\u0004\b0\u0010\fR\"\u00105\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\n\"\u0004\b4\u0010\fR\"\u00109\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010\b\u001a\u0004\b7\u0010\n\"\u0004\b8\u0010\fR\"\u0010=\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\b\u001a\u0004\b;\u0010\n\"\u0004\b<\u0010\fR+\u0010B\u001a\u00020>8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b?\u0010$\u001a\u0004\b@\u0010&\"\u0004\bA\u0010(R\"\u0010J\u001a\u00020C8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR+\u0010Z\u001a\u00020S8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010_\u001a\u00020[8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\\\u0010$\u001a\u0004\b]\u0010&\"\u0004\b^\u0010(R\"\u0010g\u001a\u00020`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010o\u001a\u0004\u0018\u00010h8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010\nR\u0014\u0010s\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, m28850d2 = {"Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "<init>", "()V", "", "reset", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getScaleY", "setScaleY", "scaleY", OperatorName.CURVE_TO, "getAlpha", "setAlpha", "alpha", "d", "getTranslationX", "setTranslationX", "translationX", "e", "getTranslationY", "setTranslationY", "translationY", OperatorName.FILL_NON_ZERO, "getShadowElevation", "setShadowElevation", "shadowElevation", "Landroidx/compose/ui/graphics/Color;", OperatorName.NON_STROKING_GRAY, OperatorName.SET_LINE_CAPSTYLE, "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "ambientShadowColor", OperatorName.CLOSE_PATH, "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "spotShadowColor", "i", "getRotationX", "setRotationX", "rotationX", OperatorName.SET_LINE_JOINSTYLE, "getRotationY", "setRotationY", "rotationY", OperatorName.NON_STROKING_CMYK, "getRotationZ", "setRotationZ", "rotationZ", OperatorName.LINE_TO, "getCameraDistance", "setCameraDistance", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", OperatorName.MOVE_TO, "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", OperatorName.ENDPATH, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "", "o", "Z", "getClip", "()Z", "setClip", "(Z)V", "clip", "Landroidx/compose/ui/graphics/CompositingStrategy;", "p", "I", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "compositingStrategy", "Landroidx/compose/ui/geometry/Size;", OperatorName.SAVE, "getSize-NH-jbRc", "setSize-uvyYCjk", "size", "Landroidx/compose/ui/unit/Density;", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/ui/unit/Density;", "getGraphicsDensity$ui_release", "()Landroidx/compose/ui/unit/Density;", "setGraphicsDensity$ui_release", "(Landroidx/compose/ui/unit/Density;)V", "graphicsDensity", "Landroidx/compose/ui/graphics/RenderEffect;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getDensity", "density", "getFontScale", "fontScale", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.ReusableGraphicsLayerScope */
/* loaded from: classes2.dex */
public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {

    /* renamed from: d */
    public float f29142d;

    /* renamed from: e */
    public float f29143e;

    /* renamed from: f */
    public float f29144f;

    /* renamed from: i */
    public float f29147i;

    /* renamed from: j */
    public float f29148j;

    /* renamed from: k */
    public float f29149k;

    /* renamed from: o */
    public boolean f29153o;

    /* renamed from: s */
    public RenderEffect f29157s;

    /* renamed from: a */
    public float f29139a = 1.0f;

    /* renamed from: b */
    public float f29140b = 1.0f;

    /* renamed from: c */
    public float f29141c = 1.0f;

    /* renamed from: g */
    public long f29145g = GraphicsLayerScopeKt.getDefaultShadowColor();

    /* renamed from: h */
    public long f29146h = GraphicsLayerScopeKt.getDefaultShadowColor();

    /* renamed from: l */
    public float f29150l = 8.0f;

    /* renamed from: m */
    public long f29151m = TransformOrigin.Companion.m72080getCenterSzJe1aQ();

    /* renamed from: n */
    public Shape f29152n = RectangleShapeKt.getRectangleShape();

    /* renamed from: p */
    public int f29154p = CompositingStrategy.Companion.m71816getAutoNrFUSI();

    /* renamed from: q */
    public long f29155q = Size.Companion.m71579getUnspecifiedNHjbRc();

    /* renamed from: r */
    public Density f29156r = DensityKt.Density$default(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getAlpha() {
        return this.f29141c;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo71883getAmbientShadowColor0d7_KjU() {
        return this.f29145g;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getCameraDistance() {
        return this.f29150l;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public boolean getClip() {
        return this.f29153o;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo71884getCompositingStrategyNrFUSI() {
        return this.f29154p;
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getDensity() {
        return this.f29156r.getDensity();
    }

    @Override // androidx.compose.p003ui.unit.Density
    public float getFontScale() {
        return this.f29156r.getFontScale();
    }

    @NotNull
    public final Density getGraphicsDensity$ui_release() {
        return this.f29156r;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.f29157s;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getRotationX() {
        return this.f29147i;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getRotationY() {
        return this.f29148j;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getRotationZ() {
        return this.f29149k;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getScaleX() {
        return this.f29139a;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getScaleY() {
        return this.f29140b;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getShadowElevation() {
        return this.f29144f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    @NotNull
    public Shape getShape() {
        return this.f29152n;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: getSize-NH-jbRc */
    public long mo71885getSizeNHjbRc() {
        return this.f29155q;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: getSpotShadowColor-0d7_KjU */
    public long mo71886getSpotShadowColor0d7_KjU() {
        return this.f29146h;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: getTransformOrigin-SzJe1aQ */
    public long mo71887getTransformOriginSzJe1aQ() {
        return this.f29151m;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getTranslationX() {
        return this.f29142d;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public float getTranslationY() {
        return this.f29143e;
    }

    public final void reset() {
        setScaleX(1.0f);
        setScaleY(1.0f);
        setAlpha(1.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setShadowElevation(0.0f);
        mo71888setAmbientShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        mo71890setSpotShadowColor8_81llA(GraphicsLayerScopeKt.getDefaultShadowColor());
        setRotationX(0.0f);
        setRotationY(0.0f);
        setRotationZ(0.0f);
        setCameraDistance(8.0f);
        mo71891setTransformOrigin__ExYCQ(TransformOrigin.Companion.m72080getCenterSzJe1aQ());
        setShape(RectangleShapeKt.getRectangleShape());
        setClip(false);
        setRenderEffect(null);
        mo71889setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m71816getAutoNrFUSI());
        m72002setSizeuvyYCjk(Size.Companion.m71579getUnspecifiedNHjbRc());
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo69431roundToPxR2X_6o(long j) {
        return AbstractC11522jG.m29253a(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo69432roundToPx0680j_4(float f) {
        return AbstractC11522jG.m29252b(this, f);
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setAlpha(float f) {
        this.f29141c = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo71888setAmbientShadowColor8_81llA(long j) {
        this.f29145g = j;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setCameraDistance(float f) {
        this.f29150l = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setClip(boolean z) {
        this.f29153o = z;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo71889setCompositingStrategyaDBOjCE(int i) {
        this.f29154p = i;
    }

    public final void setGraphicsDensity$ui_release(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.f29156r = density;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.f29157s = renderEffect;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setRotationX(float f) {
        this.f29147i = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setRotationY(float f) {
        this.f29148j = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setRotationZ(float f) {
        this.f29149k = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setScaleX(float f) {
        this.f29139a = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setScaleY(float f) {
        this.f29140b = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setShadowElevation(float f) {
        this.f29144f = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setShape(@NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.f29152n = shape;
    }

    /* renamed from: setSize-uvyYCjk  reason: not valid java name */
    public void m72002setSizeuvyYCjk(long j) {
        this.f29155q = j;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo71890setSpotShadowColor8_81llA(long j) {
        this.f29146h = j;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    /* renamed from: setTransformOrigin-__ExYCQ */
    public void mo71891setTransformOrigin__ExYCQ(long j) {
        this.f29151m = j;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setTranslationX(float f) {
        this.f29142d = f;
    }

    @Override // androidx.compose.p003ui.graphics.GraphicsLayerScope
    public void setTranslationY(float f) {
        this.f29143e = f;
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo69433toDpGaN1DYA(long j) {
        return AbstractC11522jG.m29251c(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69434toDpu2uoSUM(float f) {
        return AbstractC11522jG.m29250d(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo69436toDpSizekrfVVM(long j) {
        return AbstractC11522jG.m29248f(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo69437toPxR2X_6o(long j) {
        return AbstractC11522jG.m29247g(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo69438toPx0680j_4(float f) {
        return AbstractC11522jG.m29246h(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return AbstractC11522jG.m29245i(this, dpRect);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo69439toSizeXkaWNTQ(long j) {
        return AbstractC11522jG.m29244j(this, j);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo69440toSp0xMU5do(float f) {
        return AbstractC11522jG.m29243k(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69441toSpkPz2Gy4(float f) {
        return AbstractC11522jG.m29242l(this, f);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo69435toDpu2uoSUM(int i) {
        return AbstractC11522jG.m29249e(this, i);
    }

    @Override // androidx.compose.p003ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo69442toSpkPz2Gy4(int i) {
        return AbstractC11522jG.m29241m(this, i);
    }
}
