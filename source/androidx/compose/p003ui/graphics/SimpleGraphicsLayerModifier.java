package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.AbstractC3526a;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.NodeKind;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier */
/* loaded from: classes2.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: A */
    public RenderEffect f29164A;

    /* renamed from: B */
    public long f29165B;

    /* renamed from: C */
    public long f29166C;

    /* renamed from: D */
    public int f29167D;

    /* renamed from: E */
    public Function1 f29168E;

    /* renamed from: n */
    public float f29169n;

    /* renamed from: o */
    public float f29170o;

    /* renamed from: p */
    public float f29171p;

    /* renamed from: q */
    public float f29172q;

    /* renamed from: r */
    public float f29173r;

    /* renamed from: s */
    public float f29174s;

    /* renamed from: t */
    public float f29175t;

    /* renamed from: u */
    public float f29176u;

    /* renamed from: v */
    public float f29177v;

    /* renamed from: w */
    public float f29178w;

    /* renamed from: x */
    public long f29179x;

    /* renamed from: y */
    public Shape f29180y;

    /* renamed from: z */
    public boolean f29181z;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, renderEffect, j2, j3, i);
    }

    /* renamed from: b */
    public final void m59738b() {
        NodeCoordinator wrapped$ui_release = DelegatableNodeKt.m72894requireCoordinator64DMado(this, NodeKind.m72961constructorimpl(2)).getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            wrapped$ui_release.updateLayerBlock(this.f29168E, true);
        }
    }

    public final float getAlpha() {
        return this.f29171p;
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU  reason: not valid java name */
    public final long m72017getAmbientShadowColor0d7_KjU() {
        return this.f29165B;
    }

    public final float getCameraDistance() {
        return this.f29178w;
    }

    public final boolean getClip() {
        return this.f29181z;
    }

    /* renamed from: getCompositingStrategy--NrFUSI  reason: not valid java name */
    public final int m72018getCompositingStrategyNrFUSI() {
        return this.f29167D;
    }

    public final RenderEffect getRenderEffect() {
        return this.f29164A;
    }

    public final float getRotationX() {
        return this.f29175t;
    }

    public final float getRotationY() {
        return this.f29176u;
    }

    public final float getRotationZ() {
        return this.f29177v;
    }

    public final float getScaleX() {
        return this.f29169n;
    }

    public final float getScaleY() {
        return this.f29170o;
    }

    public final float getShadowElevation() {
        return this.f29174s;
    }

    public final Shape getShape() {
        return this.f29180y;
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU  reason: not valid java name */
    public final long m72019getSpotShadowColor0d7_KjU() {
        return this.f29166C;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ  reason: not valid java name */
    public final long m72020getTransformOriginSzJe1aQ() {
        return this.f29179x;
    }

    public final float getTranslationX() {
        return this.f29172q;
    }

    public final float getTranslationY() {
        return this.f29173r;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59388a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59387b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new SimpleGraphicsLayerModifier$measure$1(mo72811measureBRTryo0, this), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59386c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59385d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final void setAlpha(float f) {
        this.f29171p = f;
    }

    /* renamed from: setAmbientShadowColor-8_81llA  reason: not valid java name */
    public final void m72021setAmbientShadowColor8_81llA(long j) {
        this.f29165B = j;
    }

    public final void setCameraDistance(float f) {
        this.f29178w = f;
    }

    public final void setClip(boolean z) {
        this.f29181z = z;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE  reason: not valid java name */
    public final void m72022setCompositingStrategyaDBOjCE(int i) {
        this.f29167D = i;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.f29164A = renderEffect;
    }

    public final void setRotationX(float f) {
        this.f29175t = f;
    }

    public final void setRotationY(float f) {
        this.f29176u = f;
    }

    public final void setRotationZ(float f) {
        this.f29177v = f;
    }

    public final void setScaleX(float f) {
        this.f29169n = f;
    }

    public final void setScaleY(float f) {
        this.f29170o = f;
    }

    public final void setShadowElevation(float f) {
        this.f29174s = f;
    }

    public final void setShape(Shape shape) {
        Intrinsics.checkNotNullParameter(shape, "<set-?>");
        this.f29180y = shape;
    }

    /* renamed from: setSpotShadowColor-8_81llA  reason: not valid java name */
    public final void m72023setSpotShadowColor8_81llA(long j) {
        this.f29166C = j;
    }

    /* renamed from: setTransformOrigin-__ExYCQ  reason: not valid java name */
    public final void m72024setTransformOrigin__ExYCQ(long j) {
        this.f29179x = j;
    }

    public final void setTranslationX(float f) {
        this.f29172q = f;
    }

    public final void setTranslationY(float f) {
        this.f29173r = f;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f29169n + ", scaleY=" + this.f29170o + ", alpha = " + this.f29171p + ", translationX=" + this.f29172q + ", translationY=" + this.f29173r + ", shadowElevation=" + this.f29174s + ", rotationX=" + this.f29175t + ", rotationY=" + this.f29176u + ", rotationZ=" + this.f29177v + ", cameraDistance=" + this.f29178w + ", transformOrigin=" + ((Object) TransformOrigin.m72078toStringimpl(this.f29179x)) + ", shape=" + this.f29180y + ", clip=" + this.f29181z + ", renderEffect=" + this.f29164A + ", ambientShadowColor=" + ((Object) Color.m71743toStringimpl(this.f29165B)) + ", spotShadowColor=" + ((Object) Color.m71743toStringimpl(this.f29166C)) + ", compositingStrategy=" + ((Object) CompositingStrategy.m71814toStringimpl(this.f29167D)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, Shape shape, boolean z, RenderEffect renderEffect, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f29169n = f;
        this.f29170o = f2;
        this.f29171p = f3;
        this.f29172q = f4;
        this.f29173r = f5;
        this.f29174s = f6;
        this.f29175t = f7;
        this.f29176u = f8;
        this.f29177v = f9;
        this.f29178w = f10;
        this.f29179x = j;
        this.f29180y = shape;
        this.f29181z = z;
        this.f29164A = renderEffect;
        this.f29165B = j2;
        this.f29166C = j3;
        this.f29167D = i;
        this.f29168E = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }
}
