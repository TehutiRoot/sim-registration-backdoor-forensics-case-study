package androidx.compose.p003ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.graphics.AndroidCanvas;
import androidx.compose.p003ui.graphics.CanvasHolder;
import androidx.compose.p003ui.graphics.CompositingStrategy;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.RenderEffect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@RequiresApi(29)
@Metadata(m29143d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b?\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ5\u0010#\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001f\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010\u0015\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010JR\u0014\u0010O\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010JR\u0014\u0010Q\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010JR$\u0010X\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010[\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR$\u0010^\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010WR$\u0010a\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010U\"\u0004\b`\u0010WR$\u0010d\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR$\u0010g\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010J\"\u0004\bf\u0010\u001aR$\u0010j\u001a\u00020\u00112\u0006\u0010S\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010J\"\u0004\bi\u0010\u001aR$\u0010m\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR$\u0010p\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010U\"\u0004\bo\u0010WR$\u0010s\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010U\"\u0004\br\u0010WR$\u0010v\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010U\"\u0004\bu\u0010WR$\u0010y\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010U\"\u0004\bx\u0010WR$\u0010|\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010U\"\u0004\b{\u0010WR%\u0010\u0080\u0001\u001a\u00020\u00062\u0006\u0010S\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010\b\"\u0004\b~\u0010\u007fR'\u0010\u0083\u0001\u001a\u00020\u00062\u0006\u0010S\u001a\u00020\u00068V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010\b\"\u0005\b\u0082\u0001\u0010\u007fR'\u0010\u0086\u0001\u001a\u00020R2\u0006\u0010S\u001a\u00020R8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010U\"\u0005\b\u0085\u0001\u0010WR-\u0010\u008b\u0001\u001a\u0004\u0018\u00010=2\b\u0010S\u001a\u0004\u0018\u00010=8V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R0\u0010\u008e\u0001\u001a\u00020A2\u0006\u0010S\u001a\u00020A8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010J\"\u0005\b\u008d\u0001\u0010\u001aR\u0016\u0010\u0090\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0091\u0001"}, m29142d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "isUsingCompositingLayer$ui_release", "()Z", "isUsingCompositingLayer", "hasOverlappingRendering$ui_release", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "", "setOutline", "(Landroid/graphics/Outline;)V", "", OneNadOutboundSearchFragment.POSITION_LEFT, "top", OneNadOutboundSearchFragment.POSITION_RIGHT, "bottom", "setPosition", "(IIII)Z", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/RenderEffect;", "internalRenderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "d", "I", "internalCompositingStrategy", "", "getUniqueId", "()J", "uniqueId", "getLeft", "()I", "getTop", "getRight", "getBottom", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "(Z)V", "clipToOutline", "getClipToBounds", "setClipToBounds", "clipToBounds", "getAlpha", "setAlpha", "alpha", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeApi29 */
/* loaded from: classes2.dex */
public final class RenderNodeApi29 implements DeviceRenderNode {

    /* renamed from: a */
    public final AndroidComposeView f30829a;

    /* renamed from: b */
    public final RenderNode f30830b;

    /* renamed from: c */
    public RenderEffect f30831c;

    /* renamed from: d */
    public int f30832d;

    public RenderNodeApi29(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.f30829a = ownerView;
        this.f30830b = AbstractC17734Gx1.m68185a("Compose");
        this.f30832d = CompositingStrategy.Companion.m72000getAutoNrFUSI();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        this.f30830b.discardDisplayList();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f30830b);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        long uniqueId;
        int left;
        int top;
        int right;
        int bottom;
        int width;
        int height;
        float scaleX;
        float scaleY;
        float translationX;
        float translationY;
        float elevation;
        int ambientShadowColor;
        int spotShadowColor;
        float rotationZ;
        float rotationX;
        float rotationY;
        float cameraDistance;
        float pivotX;
        float pivotY;
        boolean clipToOutline;
        boolean clipToBounds;
        float alpha;
        uniqueId = this.f30830b.getUniqueId();
        left = this.f30830b.getLeft();
        top = this.f30830b.getTop();
        right = this.f30830b.getRight();
        bottom = this.f30830b.getBottom();
        width = this.f30830b.getWidth();
        height = this.f30830b.getHeight();
        scaleX = this.f30830b.getScaleX();
        scaleY = this.f30830b.getScaleY();
        translationX = this.f30830b.getTranslationX();
        translationY = this.f30830b.getTranslationY();
        elevation = this.f30830b.getElevation();
        ambientShadowColor = this.f30830b.getAmbientShadowColor();
        spotShadowColor = this.f30830b.getSpotShadowColor();
        rotationZ = this.f30830b.getRotationZ();
        rotationX = this.f30830b.getRotationX();
        rotationY = this.f30830b.getRotationY();
        cameraDistance = this.f30830b.getCameraDistance();
        pivotX = this.f30830b.getPivotX();
        pivotY = this.f30830b.getPivotY();
        clipToOutline = this.f30830b.getClipToOutline();
        clipToBounds = this.f30830b.getClipToBounds();
        alpha = this.f30830b.getAlpha();
        return new DeviceRenderNodeData(uniqueId, left, top, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, this.f30831c, this.f30832d, null);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getAlpha() {
        float alpha;
        alpha = this.f30830b.getAlpha();
        return alpha;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        int ambientShadowColor;
        ambientShadowColor = this.f30830b.getAmbientShadowColor();
        return ambientShadowColor;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getBottom() {
        int bottom;
        bottom = this.f30830b.getBottom();
        return bottom;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        float cameraDistance;
        cameraDistance = this.f30830b.getCameraDistance();
        return cameraDistance;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        boolean clipToBounds;
        clipToBounds = this.f30830b.getClipToBounds();
        return clipToBounds;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        boolean clipToOutline;
        clipToOutline = this.f30830b.getClipToOutline();
        return clipToOutline;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo73213getCompositingStrategyNrFUSI() {
        return this.f30832d;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getElevation() {
        float elevation;
        elevation = this.f30830b.getElevation();
        return elevation;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        boolean hasDisplayList;
        hasDisplayList = this.f30830b.hasDisplayList();
        return hasDisplayList;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getHeight() {
        int height;
        height = this.f30830b.getHeight();
        return height;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f30830b.getInverseMatrix(matrix);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getLeft() {
        int left;
        left = this.f30830b.getLeft();
        return left;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f30830b.getMatrix(matrix);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f30829a;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getPivotX() {
        float pivotX;
        pivotX = this.f30830b.getPivotX();
        return pivotX;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getPivotY() {
        float pivotY;
        pivotY = this.f30830b.getPivotY();
        return pivotY;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.f30831c;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getRight() {
        int right;
        right = this.f30830b.getRight();
        return right;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationX() {
        float rotationX;
        rotationX = this.f30830b.getRotationX();
        return rotationX;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationY() {
        float rotationY;
        rotationY = this.f30830b.getRotationY();
        return rotationY;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationZ() {
        float rotationZ;
        rotationZ = this.f30830b.getRotationZ();
        return rotationZ;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getScaleX() {
        float scaleX;
        scaleX = this.f30830b.getScaleX();
        return scaleX;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getScaleY() {
        float scaleY;
        scaleY = this.f30830b.getScaleY();
        return scaleY;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        int spotShadowColor;
        spotShadowColor = this.f30830b.getSpotShadowColor();
        return spotShadowColor;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getTop() {
        int top;
        top = this.f30830b.getTop();
        return top;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getTranslationX() {
        float translationX;
        translationX = this.f30830b.getTranslationX();
        return translationX;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getTranslationY() {
        float translationY;
        translationY = this.f30830b.getTranslationY();
        return translationY;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public long getUniqueId() {
        long uniqueId;
        uniqueId = this.f30830b.getUniqueId();
        return uniqueId;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getWidth() {
        int width;
        width = this.f30830b.getWidth();
        return width;
    }

    public final boolean hasOverlappingRendering$ui_release() {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f30830b.hasOverlappingRendering();
        return hasOverlappingRendering;
    }

    public final boolean isUsingCompositingLayer$ui_release() {
        boolean useCompositingLayer;
        useCompositingLayer = this.f30830b.getUseCompositingLayer();
        return useCompositingLayer;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i) {
        this.f30830b.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i) {
        this.f30830b.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder, @Nullable Path path, @NotNull Function1<? super androidx.compose.p003ui.graphics.Canvas, Unit> drawBlock) {
        RecordingCanvas beginRecording;
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        beginRecording = this.f30830b.beginRecording();
        Intrinsics.checkNotNullExpressionValue(beginRecording, "renderNode.beginRecording()");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(beginRecording);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            AbstractC16859ul.m1055m(androidCanvas, path, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.f30830b.endRecording();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.f30830b.setAlpha(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i) {
        this.f30830b.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.f30830b.setCameraDistance(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.f30830b.setClipToBounds(z);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        this.f30830b.setClipToOutline(z);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo73214setCompositingStrategyaDBOjCE(int i) {
        RenderNode renderNode = this.f30830b;
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m71996equalsimpl0(i, companion.m72002getOffscreenNrFUSI())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m71996equalsimpl0(i, companion.m72001getModulateAlphaNrFUSI())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f30832d = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        this.f30830b.setElevation(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z) {
        boolean hasOverlappingRendering;
        hasOverlappingRendering = this.f30830b.setHasOverlappingRendering(z);
        return hasOverlappingRendering;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline) {
        this.f30830b.setOutline(outline);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        this.f30830b.setPivotX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        this.f30830b.setPivotY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean setPosition(int i, int i2, int i3, int i4) {
        boolean position;
        position = this.f30830b.setPosition(i, i2, i3, i4);
        return position;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.f30831c = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            C18189Nx1.f4311a.m67170a(this.f30830b, renderEffect);
        }
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        this.f30830b.setRotationX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        this.f30830b.setRotationY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        this.f30830b.setRotationZ(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.f30830b.setScaleX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.f30830b.setScaleY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i) {
        this.f30830b.setSpotShadowColor(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        this.f30830b.setTranslationX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        this.f30830b.setTranslationY(f);
    }
}