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
@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0094\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020 *\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u00101\u001a\u0004\b7\u00103R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b9\u00103R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u00103R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u00103R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R \u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010\u0017\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bT\u0010E\u001a\u0004\bU\u0010GR \u0010\u0018\u001a\u00020\u00168\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010GR \u0010\u001a\u001a\u00020\u00198\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010+\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, m28850d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "node", "", "e", "(Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getScaleX", "()F", OperatorName.CURVE_TO, "getScaleY", "getAlpha", "getTranslationX", OperatorName.FILL_NON_ZERO, "getTranslationY", OperatorName.NON_STROKING_GRAY, "getShadowElevation", OperatorName.CLOSE_PATH, "getRotationX", "i", "getRotationY", OperatorName.SET_LINE_JOINSTYLE, "getRotationZ", OperatorName.NON_STROKING_CMYK, "getCameraDistance", OperatorName.LINE_TO, OperatorName.SET_LINE_CAPSTYLE, "getTransformOrigin-SzJe1aQ", "()J", OperatorName.MOVE_TO, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", OperatorName.ENDPATH, "Z", "getClip", "()Z", "o", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "p", "getAmbientShadowColor-0d7_KjU", OperatorName.SAVE, "getSpotShadowColor-0d7_KjU", PDPageLabelRange.STYLE_ROMAN_LOWER, "I", "getCompositingStrategy--NrFUSI", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerElement */
/* loaded from: classes2.dex */
public final class GraphicsLayerElement extends ModifierNodeElement<SimpleGraphicsLayerModifier> {

    /* renamed from: b */
    public final float f29072b;

    /* renamed from: c */
    public final float f29073c;

    /* renamed from: d */
    public final float f29074d;

    /* renamed from: e */
    public final float f29075e;

    /* renamed from: f */
    public final float f29076f;

    /* renamed from: g */
    public final float f29077g;

    /* renamed from: h */
    public final float f29078h;

    /* renamed from: i */
    public final float f29079i;

    /* renamed from: j */
    public final float f29080j;

    /* renamed from: k */
    public final float f29081k;

    /* renamed from: l */
    public final long f29082l;

    /* renamed from: m */
    public final Shape f29083m;

    /* renamed from: n */
    public final boolean f29084n;

    /* renamed from: o */
    public final RenderEffect f29085o;

    /* renamed from: p */
    public final long f29086p;

    /* renamed from: q */
    public final long f29087q;

    /* renamed from: r */
    public final int f29088r;

    public /* synthetic */ GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public SimpleGraphicsLayerModifier create() {
        return new SimpleGraphicsLayerModifier(this.f29072b, this.f29073c, this.f29074d, this.f29075e, this.f29076f, this.f29077g, this.f29078h, this.f29079i, this.f29080j, this.f29081k, this.f29082l, this.f29083m, this.f29084n, this.f29085o, this.f29086p, this.f29087q, this.f29088r, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(SimpleGraphicsLayerModifier node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.setScaleX(this.f29072b);
        node.setScaleY(this.f29073c);
        node.setAlpha(this.f29074d);
        node.setTranslationX(this.f29075e);
        node.setTranslationY(this.f29076f);
        node.setShadowElevation(this.f29077g);
        node.setRotationX(this.f29078h);
        node.setRotationY(this.f29079i);
        node.setRotationZ(this.f29080j);
        node.setCameraDistance(this.f29081k);
        node.m72024setTransformOrigin__ExYCQ(this.f29082l);
        node.setShape(this.f29083m);
        node.setClip(this.f29084n);
        node.setRenderEffect(this.f29085o);
        node.m72021setAmbientShadowColor8_81llA(this.f29086p);
        node.m72023setSpotShadowColor8_81llA(this.f29087q);
        node.m72022setCompositingStrategyaDBOjCE(this.f29088r);
        node.m59738b();
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            return Float.compare(this.f29072b, graphicsLayerElement.f29072b) == 0 && Float.compare(this.f29073c, graphicsLayerElement.f29073c) == 0 && Float.compare(this.f29074d, graphicsLayerElement.f29074d) == 0 && Float.compare(this.f29075e, graphicsLayerElement.f29075e) == 0 && Float.compare(this.f29076f, graphicsLayerElement.f29076f) == 0 && Float.compare(this.f29077g, graphicsLayerElement.f29077g) == 0 && Float.compare(this.f29078h, graphicsLayerElement.f29078h) == 0 && Float.compare(this.f29079i, graphicsLayerElement.f29079i) == 0 && Float.compare(this.f29080j, graphicsLayerElement.f29080j) == 0 && Float.compare(this.f29081k, graphicsLayerElement.f29081k) == 0 && TransformOrigin.m72074equalsimpl0(this.f29082l, graphicsLayerElement.f29082l) && Intrinsics.areEqual(this.f29083m, graphicsLayerElement.f29083m) && this.f29084n == graphicsLayerElement.f29084n && Intrinsics.areEqual(this.f29085o, graphicsLayerElement.f29085o) && Color.m71736equalsimpl0(this.f29086p, graphicsLayerElement.f29086p) && Color.m71736equalsimpl0(this.f29087q, graphicsLayerElement.f29087q) && CompositingStrategy.m71812equalsimpl0(this.f29088r, graphicsLayerElement.f29088r);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode;
        int floatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f29072b) * 31) + Float.floatToIntBits(this.f29073c)) * 31) + Float.floatToIntBits(this.f29074d)) * 31) + Float.floatToIntBits(this.f29075e)) * 31) + Float.floatToIntBits(this.f29076f)) * 31) + Float.floatToIntBits(this.f29077g)) * 31) + Float.floatToIntBits(this.f29078h)) * 31) + Float.floatToIntBits(this.f29079i)) * 31) + Float.floatToIntBits(this.f29080j)) * 31) + Float.floatToIntBits(this.f29081k)) * 31) + TransformOrigin.m72077hashCodeimpl(this.f29082l)) * 31) + this.f29083m.hashCode()) * 31;
        boolean z = this.f29084n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (floatToIntBits + i) * 31;
        RenderEffect renderEffect = this.f29085o;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return ((((((i2 + hashCode) * 31) + Color.m71742hashCodeimpl(this.f29086p)) * 31) + Color.m71742hashCodeimpl(this.f29087q)) * 31) + CompositingStrategy.m71813hashCodeimpl(this.f29088r);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set("scaleX", Float.valueOf(this.f29072b));
        inspectorInfo.getProperties().set("scaleY", Float.valueOf(this.f29073c));
        inspectorInfo.getProperties().set("alpha", Float.valueOf(this.f29074d));
        inspectorInfo.getProperties().set("translationX", Float.valueOf(this.f29075e));
        inspectorInfo.getProperties().set("translationY", Float.valueOf(this.f29076f));
        inspectorInfo.getProperties().set("shadowElevation", Float.valueOf(this.f29077g));
        inspectorInfo.getProperties().set("rotationX", Float.valueOf(this.f29078h));
        inspectorInfo.getProperties().set("rotationY", Float.valueOf(this.f29079i));
        inspectorInfo.getProperties().set("rotationZ", Float.valueOf(this.f29080j));
        inspectorInfo.getProperties().set("cameraDistance", Float.valueOf(this.f29081k));
        inspectorInfo.getProperties().set("transformOrigin", TransformOrigin.m72067boximpl(this.f29082l));
        inspectorInfo.getProperties().set("shape", this.f29083m);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.f29084n));
        inspectorInfo.getProperties().set("renderEffect", this.f29085o);
        inspectorInfo.getProperties().set("ambientShadowColor", Color.m71725boximpl(this.f29086p));
        inspectorInfo.getProperties().set("spotShadowColor", Color.m71725boximpl(this.f29087q));
        inspectorInfo.getProperties().set("compositingStrategy", CompositingStrategy.m71809boximpl(this.f29088r));
    }

    public String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f29072b + ", scaleY=" + this.f29073c + ", alpha=" + this.f29074d + ", translationX=" + this.f29075e + ", translationY=" + this.f29076f + ", shadowElevation=" + this.f29077g + ", rotationX=" + this.f29078h + ", rotationY=" + this.f29079i + ", rotationZ=" + this.f29080j + ", cameraDistance=" + this.f29081k + ", transformOrigin=" + ((Object) TransformOrigin.m72078toStringimpl(this.f29082l)) + ", shape=" + this.f29083m + ", clip=" + this.f29084n + ", renderEffect=" + this.f29085o + ", ambientShadowColor=" + ((Object) Color.m71743toStringimpl(this.f29086p)) + ", spotShadowColor=" + ((Object) Color.m71743toStringimpl(this.f29087q)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m71814toStringimpl(this.f29088r)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f29072b = f;
        this.f29073c = f2;
        this.f29074d = f3;
        this.f29075e = f4;
        this.f29076f = f5;
        this.f29077g = f6;
        this.f29078h = f7;
        this.f29079i = f8;
        this.f29080j = f9;
        this.f29081k = f10;
        this.f29082l = j;
        this.f29083m = shape;
        this.f29084n = z;
        this.f29085o = renderEffect;
        this.f29086p = j2;
        this.f29087q = j3;
        this.f29088r = i;
    }
}
