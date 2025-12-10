package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m29143d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0094\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020 *\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b7\u00103R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010E\u001a\u0004\bU\u0010GR \u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010GR \u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m29142d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "node", "", "e", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getScaleX", "()F", OperatorName.CURVE_TO, "getScaleY", "getAlpha", "getTranslationX", OperatorName.FILL_NON_ZERO, "getTranslationY", OperatorName.NON_STROKING_GRAY, "getShadowElevation", OperatorName.CLOSE_PATH, "getRotationX", "i", "getRotationY", OperatorName.SET_LINE_JOINSTYLE, "getRotationZ", OperatorName.NON_STROKING_CMYK, "getCameraDistance", OperatorName.LINE_TO, OperatorName.SET_LINE_CAPSTYLE, "getTransformOrigin-SzJe1aQ", "()J", OperatorName.MOVE_TO, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", OperatorName.ENDPATH, "Z", "getClip", "()Z", "o", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "p", "getAmbientShadowColor-0d7_KjU", OperatorName.SAVE, "getSpotShadowColor-0d7_KjU", PDPageLabelRange.STYLE_ROMAN_LOWER, "I", "getCompositingStrategy--NrFUSI", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerElement */
/* loaded from: classes2.dex */
public final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {

    /* renamed from: b */
    public final float f29160b;

    /* renamed from: c */
    public final float f29161c;

    /* renamed from: d */
    public final float f29162d;

    /* renamed from: e */
    public final float f29163e;

    /* renamed from: f */
    public final float f29164f;

    /* renamed from: g */
    public final float f29165g;

    /* renamed from: h */
    public final float f29166h;

    /* renamed from: i */
    public final float f29167i;

    /* renamed from: j */
    public final float f29168j;

    /* renamed from: k */
    public final float f29169k;

    /* renamed from: l */
    public final long f29170l;

    /* renamed from: m */
    public final Shape f29171m;

    /* renamed from: n */
    public final boolean f29172n;

    /* renamed from: o */
    public final RenderEffect f29173o;

    /* renamed from: p */
    public final long f29174p;

    /* renamed from: q */
    public final long f29175q;

    /* renamed from: r */
    public final int f29176r;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.f29160b, this.f29161c, this.f29162d, this.f29163e, this.f29164f, this.f29165g, this.f29166h, this.f29167i, this.f29168j, this.f29169k, this.f29170l, this.f29171m, this.f29172n, this.f29173o, this.f29174p, this.f29175q, this.f29176r, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(SimpleGraphicsLayerModifier node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setScaleX(this.f29160b);
        node.setScaleY(this.f29161c);
        node.setAlpha(this.f29162d);
        node.setTranslationX(this.f29163e);
        node.setTranslationY(this.f29164f);
        node.setShadowElevation(this.f29165g);
        node.setRotationX(this.f29166h);
        node.setRotationY(this.f29167i);
        node.setRotationZ(this.f29168j);
        node.setCameraDistance(this.f29169k);
        node.m72208setTransformOrigin__ExYCQ(this.f29170l);
        node.setShape(this.f29171m);
        node.setClip(this.f29172n);
        node.setRenderEffect(this.f29173o);
        node.m72205setAmbientShadowColor8_81llA(this.f29174p);
        node.m72207setSpotShadowColor8_81llA(this.f29175q);
        node.m72206setCompositingStrategyaDBOjCE(this.f29176r);
        node.m59688b();
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            return Float.compare(this.f29160b, graphicsLayerElement.f29160b) == 0 && Float.compare(this.f29161c, graphicsLayerElement.f29161c) == 0 && Float.compare(this.f29162d, graphicsLayerElement.f29162d) == 0 && Float.compare(this.f29163e, graphicsLayerElement.f29163e) == 0 && Float.compare(this.f29164f, graphicsLayerElement.f29164f) == 0 && Float.compare(this.f29165g, graphicsLayerElement.f29165g) == 0 && Float.compare(this.f29166h, graphicsLayerElement.f29166h) == 0 && Float.compare(this.f29167i, graphicsLayerElement.f29167i) == 0 && Float.compare(this.f29168j, graphicsLayerElement.f29168j) == 0 && Float.compare(this.f29169k, graphicsLayerElement.f29169k) == 0 && TransformOrigin.m72258equalsimpl0(this.f29170l, graphicsLayerElement.f29170l) && Intrinsics.areEqual(this.f29171m, graphicsLayerElement.f29171m) && this.f29172n == graphicsLayerElement.f29172n && Intrinsics.areEqual(this.f29173o, graphicsLayerElement.f29173o) && Color.m71920equalsimpl0(this.f29174p, graphicsLayerElement.f29174p) && Color.m71920equalsimpl0(this.f29175q, graphicsLayerElement.f29175q) && CompositingStrategy.m71996equalsimpl0(this.f29176r, graphicsLayerElement.f29176r);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode;
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f29160b) * 31) + Float.floatToIntBits(this.f29161c)) * 31) + Float.floatToIntBits(this.f29162d)) * 31) + Float.floatToIntBits(this.f29163e)) * 31) + Float.floatToIntBits(this.f29164f)) * 31) + Float.floatToIntBits(this.f29165g)) * 31) + Float.floatToIntBits(this.f29166h)) * 31) + Float.floatToIntBits(this.f29167i)) * 31) + Float.floatToIntBits(this.f29168j)) * 31) + Float.floatToIntBits(this.f29169k)) * 31) + TransformOrigin.m72261hashCodeimpl(this.f29170l)) * 31) + this.f29171m.hashCode()) * 31;
        boolean z = this.f29172n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        RenderEffect renderEffect = this.f29173o;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return ((((((i2 + hashCode) * 31) + Color.m71926hashCodeimpl(this.f29174p)) * 31) + Color.m71926hashCodeimpl(this.f29175q)) * 31) + CompositingStrategy.m71997hashCodeimpl(this.f29176r);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.f29160b));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.f29161c));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f29162d));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.f29163e));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.f29164f));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.f29165g));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.f29166h));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.f29167i));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.f29168j));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.f29169k));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m72251boximpl(this.f29170l));
        inspectorInfo.getProperties().set("shape", this.f29171m);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.f29172n));
        inspectorInfo.getProperties().set("renderEffect", this.f29173o);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m71909boximpl(this.f29174p));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m71909boximpl(this.f29175q));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m71993boximpl(this.f29176r));
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f29160b + ", scaleY=" + this.f29161c + ", alpha=" + this.f29162d + ", translationX=" + this.f29163e + ", translationY=" + this.f29164f + ", shadowElevation=" + this.f29165g + ", rotationX=" + this.f29166h + ", rotationY=" + this.f29167i + ", rotationZ=" + this.f29168j + ", cameraDistance=" + this.f29169k + ", transformOrigin=" + ((Object) TransformOrigin.m72262toStringimpl(this.f29170l)) + ", shape=" + this.f29171m + ", clip=" + this.f29172n + ", renderEffect=" + this.f29173o + ", ambientShadowColor=" + ((Object) Color.m71927toStringimpl(this.f29174p)) + ", spotShadowColor=" + ((Object) Color.m71927toStringimpl(this.f29175q)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m71998toStringimpl(this.f29176r)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f29160b = f;
        this.f29161c = f2;
        this.f29162d = f3;
        this.f29163e = f4;
        this.f29164f = f5;
        this.f29165g = f6;
        this.f29166h = f7;
        this.f29167i = f8;
        this.f29168j = f9;
        this.f29169k = f10;
        this.f29170l = j;
        this.f29171m = shape;
        this.f29172n = z;
        this.f29173o = renderEffect;
        this.f29174p = j2;
        this.f29175q = j3;
        this.f29176r = i;
    }
}