package androidx.compose.p003ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@Metadata(m28851d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b6\b\u0001\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010!J5\u0010*\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00060'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001f\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010\u0019\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010A\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010!R\"\u0010\u001a\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010\u000f\"\u0004\bH\u0010!R\"\u0010\u001b\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010\u000f\"\u0004\bK\u0010!R\"\u0010\u001c\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010A\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010!R$\u0010V\u001a\u0004\u0018\u00010O8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR*\u0010]\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0013\"\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u000fR\u0014\u0010e\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u000fR$\u0010k\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010n\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR$\u0010q\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR$\u0010t\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\br\u0010h\"\u0004\bs\u0010jR$\u0010w\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010h\"\u0004\bv\u0010jR$\u0010z\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bx\u0010\u000f\"\u0004\by\u0010!R$\u0010}\u001a\u00020\r2\u0006\u0010W\u001a\u00020\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b{\u0010\u000f\"\u0004\b|\u0010!R%\u0010\u0080\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b~\u0010h\"\u0004\b\u007f\u0010jR'\u0010\u0083\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010h\"\u0005\b\u0082\u0001\u0010jR'\u0010\u0086\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010h\"\u0005\b\u0085\u0001\u0010jR'\u0010\u0089\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010h\"\u0005\b\u0088\u0001\u0010jR'\u0010\u008c\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010h\"\u0005\b\u008b\u0001\u0010jR'\u0010\u008f\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u008d\u0001\u0010h\"\u0005\b\u008e\u0001\u0010jR'\u0010\u0092\u0001\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0090\u0001\u0010\u0013\"\u0005\b\u0091\u0001\u0010\\R'\u0010\u0095\u0001\u001a\u00020f2\u0006\u0010W\u001a\u00020f8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010h\"\u0005\b\u0094\u0001\u0010jR0\u0010\u0098\u0001\u001a\u00020?2\u0006\u0010W\u001a\u00020?8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\u000f\"\u0005\b\u0097\u0001\u0010!R\u0016\u0010\u009a\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009c\u0001"}, m28850d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()V", "Landroid/view/RenderNode;", "renderNode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/view/RenderNode;)V", "", "getLayerType$ui_release", "()I", "getLayerType", "", "hasOverlappingRendering$ui_release", "()Z", "hasOverlappingRendering", "Landroid/graphics/Outline;", "outline", "setOutline", "(Landroid/graphics/Outline;)V", "left", "top", "right", "bottom", "setPosition", "(IIII)Z", TypedValues.CycleType.S_WAVE_OFFSET, "offsetLeftAndRight", "(I)V", "offsetTopAndBottom", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "record", "(Landroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "getMatrix", "(Landroid/graphics/Matrix;)V", "getInverseMatrix", "Landroid/graphics/Canvas;", "canvas", "drawInto", "(Landroid/graphics/Canvas;)V", "setHasOverlappingRendering", "(Z)Z", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "dumpRenderNodeData", "()Landroidx/compose/ui/platform/DeviceRenderNodeData;", "discardDisplayList", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/CompositingStrategy;", OperatorName.CURVE_TO, "I", "internalCompositingStrategy", "d", "getLeft", "setLeft", "e", "getTop", "setTop", OperatorName.FILL_NON_ZERO, "getRight", "setRight", OperatorName.NON_STROKING_GRAY, "getBottom", "setBottom", "Landroidx/compose/ui/graphics/RenderEffect;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderEffect", "value", "i", "Z", "getClipToBounds", "setClipToBounds", "(Z)V", "clipToBounds", "", "getUniqueId", "()J", "uniqueId", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "setScaleX", "(F)V", "scaleX", "getScaleY", "setScaleY", "scaleY", "getTranslationX", "setTranslationX", "translationX", "getTranslationY", "setTranslationY", "translationY", "getElevation", "setElevation", "elevation", "getAmbientShadowColor", "setAmbientShadowColor", "ambientShadowColor", "getSpotShadowColor", "setSpotShadowColor", "spotShadowColor", "getRotationZ", "setRotationZ", "rotationZ", "getRotationX", "setRotationX", "rotationX", "getRotationY", "setRotationY", "rotationY", "getCameraDistance", "setCameraDistance", "cameraDistance", "getPivotX", "setPivotX", "pivotX", "getPivotY", "setPivotY", "pivotY", "getClipToOutline", "setClipToOutline", "clipToOutline", "getAlpha", "setAlpha", "alpha", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "compositingStrategy", "getHasDisplayList", "hasDisplayList", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeApi23 */
/* loaded from: classes2.dex */
public final class RenderNodeApi23 implements DeviceRenderNode {

    /* renamed from: j */
    public static boolean f30730j;

    /* renamed from: a */
    public final AndroidComposeView f30732a;

    /* renamed from: b */
    public final RenderNode f30733b;

    /* renamed from: c */
    public int f30734c;

    /* renamed from: d */
    public int f30735d;

    /* renamed from: e */
    public int f30736e;

    /* renamed from: f */
    public int f30737f;

    /* renamed from: g */
    public int f30738g;

    /* renamed from: h */
    public RenderEffect f30739h;

    /* renamed from: i */
    public boolean f30740i;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    public static boolean f30731k = true;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "()V", "needToValidateAccess", "", "testFailCreateRenderNode", "getTestFailCreateRenderNode$ui_release", "()Z", "setTestFailCreateRenderNode$ui_release", "(Z)V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.platform.RenderNodeApi23$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getTestFailCreateRenderNode$ui_release() {
            return RenderNodeApi23.f30730j;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z) {
            RenderNodeApi23.f30730j = z;
        }

        public Companion() {
        }
    }

    public RenderNodeApi23(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.f30732a = ownerView;
        RenderNode create = RenderNode.create("Compose", ownerView);
        Intrinsics.checkNotNullExpressionValue(create, "create(\"Compose\", ownerView)");
        this.f30733b = create;
        this.f30734c = CompositingStrategy.Companion.m71816getAutoNrFUSI();
        if (f30731k) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            m59204b(create);
            m59205a();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            f30731k = false;
        }
        if (!f30730j) {
            return;
        }
        throw new NoClassDefFoundError();
    }

    /* renamed from: a */
    public final void m59205a() {
        if (Build.VERSION.SDK_INT >= 24) {
            C18534Tw1.f6148a.m66160a(this.f30733b);
        } else {
            C18470Sw1.f5871a.m66257a(this.f30733b);
        }
    }

    /* renamed from: b */
    public final void m59204b(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C18598Uw1 c18598Uw1 = C18598Uw1.f6492a;
            c18598Uw1.m65956c(renderNode, c18598Uw1.m65958a(renderNode));
            c18598Uw1.m65955d(renderNode, c18598Uw1.m65957b(renderNode));
        }
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void discardDisplayList() {
        m59205a();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void drawInto(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f30733b);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    @NotNull
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.f30733b.getScaleX(), this.f30733b.getScaleY(), this.f30733b.getTranslationX(), this.f30733b.getTranslationY(), this.f30733b.getElevation(), getAmbientShadowColor(), getSpotShadowColor(), this.f30733b.getRotation(), this.f30733b.getRotationX(), this.f30733b.getRotationY(), this.f30733b.getCameraDistance(), this.f30733b.getPivotX(), this.f30733b.getPivotY(), this.f30733b.getClipToOutline(), getClipToBounds(), this.f30733b.getAlpha(), getRenderEffect(), this.f30734c, null);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.f30733b.getAlpha();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getAmbientShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18598Uw1.f6492a.m65958a(this.f30733b);
        }
        return -16777216;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.f30738g;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.f30733b.getCameraDistance();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.f30740i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.f30733b.getClipToOutline();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    /* renamed from: getCompositingStrategy--NrFUSI */
    public int mo73029getCompositingStrategyNrFUSI() {
        return this.f30734c;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.f30733b.getElevation();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.f30733b.isValid();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void getInverseMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f30733b.getInverseMatrix(matrix);
    }

    public final int getLayerType$ui_release() {
        if (CompositingStrategy.m71812equalsimpl0(this.f30734c, CompositingStrategy.Companion.m71818getOffscreenNrFUSI())) {
            return 2;
        }
        return 0;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.f30735d;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void getMatrix(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f30733b.getMatrix(matrix);
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f30732a;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.f30733b.getPivotX();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.f30733b.getPivotY();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.f30739h;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getRight() {
        return this.f30737f;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.f30733b.getRotationX();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.f30733b.getRotationY();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.f30733b.getRotation();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.f30733b.getScaleX();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.f30733b.getScaleY();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getSpotShadowColor() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C18598Uw1.f6492a.m65957b(this.f30733b);
        }
        return -16777216;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getTop() {
        return this.f30736e;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.f30733b.getTranslationX();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.f30733b.getTranslationY();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return 0L;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public int getWidth() {
        return getRight() - getLeft();
    }

    public final boolean hasOverlappingRendering$ui_release() {
        return this.f30733b.hasOverlappingRendering();
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int i) {
        setLeft(getLeft() + i);
        setRight(getRight() + i);
        this.f30733b.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int i) {
        setTop(getTop() + i);
        setBottom(getBottom() + i);
        this.f30733b.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void record(@NotNull CanvasHolder canvasHolder, @Nullable Path path, @NotNull Function1<? super androidx.compose.p003ui.graphics.Canvas, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        DisplayListCanvas start = this.f30733b.start(getWidth(), getHeight());
        Intrinsics.checkNotNullExpressionValue(start, "renderNode.start(width, height)");
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas((Canvas) start);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (path != null) {
            androidCanvas.save();
            AbstractC16846ul.m1200m(androidCanvas, path, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (path != null) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        this.f30733b.end(start);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.f30733b.setAlpha(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setAmbientShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C18598Uw1.f6492a.m65956c(this.f30733b, i);
        }
    }

    public void setBottom(int i) {
        this.f30738g = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.f30733b.setCameraDistance(-f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.f30740i = z;
        this.f30733b.setClipToBounds(z);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        this.f30733b.setClipToOutline(z);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    /* renamed from: setCompositingStrategy-aDBOjCE */
    public void mo73030setCompositingStrategyaDBOjCE(int i) {
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m71812equalsimpl0(i, companion.m71818getOffscreenNrFUSI())) {
            this.f30733b.setLayerType(2);
            this.f30733b.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m71812equalsimpl0(i, companion.m71817getModulateAlphaNrFUSI())) {
            this.f30733b.setLayerType(0);
            this.f30733b.setHasOverlappingRendering(false);
        } else {
            this.f30733b.setLayerType(0);
            this.f30733b.setHasOverlappingRendering(true);
        }
        this.f30734c = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        this.f30733b.setElevation(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z) {
        return this.f30733b.setHasOverlappingRendering(z);
    }

    public void setLeft(int i) {
        this.f30735d = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setOutline(@Nullable Outline outline) {
        this.f30733b.setOutline(outline);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        this.f30733b.setPivotX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        this.f30733b.setPivotY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public boolean setPosition(int i, int i2, int i3, int i4) {
        setLeft(i);
        setTop(i2);
        setRight(i3);
        setBottom(i4);
        return this.f30733b.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.f30739h = renderEffect;
    }

    public void setRight(int i) {
        this.f30737f = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        this.f30733b.setRotationX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        this.f30733b.setRotationY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        this.f30733b.setRotation(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.f30733b.setScaleX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.f30733b.setScaleY(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setSpotShadowColor(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C18598Uw1.f6492a.m65955d(this.f30733b, i);
        }
    }

    public void setTop(int i) {
        this.f30736e = i;
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        this.f30733b.setTranslationX(f);
    }

    @Override // androidx.compose.p003ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        this.f30733b.setTranslationY(f);
    }
}
