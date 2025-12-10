package androidx.compose.p003ui.platform;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.geometry.MutableRect;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.CanvasHolder;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.RenderEffect;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.TransformOrigin;
import androidx.compose.p003ui.layout.GraphicLayerInfo;
import androidx.compose.p003ui.node.OwnedLayer;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(23)
@Metadata(m29143d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0002\u007fSB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ¯\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001d\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00105\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u00072\u0006\u0010-\u001a\u000206H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00104J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010:J%\u0010D\u001a\u00020,2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0004\bI\u0010JJ\u001d\u0010O\u001a\u00020\u00072\u0006\u0010L\u001a\u00020KH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ\u001d\u0010Q\u001a\u00020\u00072\u0006\u0010L\u001a\u00020KH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010NJ\u000f\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010:J\u0017\u0010S\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010=R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010YR$\u0010^\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b[\u0010\\\"\u0004\bW\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010\\R\u0016\u0010f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001f\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0080\u0001"}, m29142d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "()V", "canvas", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;)V", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "value", "d", "Z", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/OutlineResolver;", "e", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", OperatorName.FILL_NON_ZERO, "isDestroyed", OperatorName.NON_STROKING_GRAY, "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "i", "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", "Landroidx/compose/ui/graphics/CanvasHolder;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, OperatorName.LINE_TO, "Landroidx/compose/ui/platform/DeviceRenderNode;", "renderNode", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: m */
    public static final Function2 f30833m = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: a */
    public final AndroidComposeView f30834a;

    /* renamed from: b */
    public Function1 f30835b;

    /* renamed from: c */
    public Function0 f30836c;

    /* renamed from: d */
    public boolean f30837d;

    /* renamed from: e */
    public final OutlineResolver f30838e;

    /* renamed from: f */
    public boolean f30839f;

    /* renamed from: g */
    public boolean f30840g;

    /* renamed from: h */
    public Paint f30841h;

    /* renamed from: i */
    public final LayerMatrixCache f30842i;

    /* renamed from: j */
    public final CanvasHolder f30843j;

    /* renamed from: k */
    public long f30844k;

    /* renamed from: l */
    public final DeviceRenderNode f30845l;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m29142d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "()V", "getMatrix", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.RenderNodeLayer$a */
    /* loaded from: classes2.dex */
    public static final class C3552a {

        /* renamed from: a */
        public static final C3552a f30846a = new C3552a();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final long m59150a(@NotNull View view) {
            long uniqueDrawingId;
            Intrinsics.checkNotNullParameter(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    public RenderNodeLayer(@NotNull AndroidComposeView ownerView, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        DeviceRenderNode renderNodeApi23;
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f30834a = ownerView;
        this.f30835b = drawBlock;
        this.f30836c = invalidateParentLayer;
        this.f30838e = new OutlineResolver(ownerView.getDensity());
        this.f30842i = new LayerMatrixCache(f30833m);
        this.f30843j = new CanvasHolder();
        this.f30844k = TransformOrigin.Companion.m72264getCenterSzJe1aQ();
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(ownerView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(ownerView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        this.f30845l = renderNodeApi23;
    }

    /* renamed from: a */
    public final void m59153a(Canvas canvas) {
        if (this.f30845l.getClipToOutline() || this.f30845l.getClipToBounds()) {
            this.f30838e.clipToOutline(canvas);
        }
    }

    /* renamed from: b */
    public final void m59152b(boolean z) {
        if (z != this.f30837d) {
            this.f30837d = z;
            this.f30834a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    /* renamed from: c */
    public final void m59151c() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.f30834a);
        } else {
            this.f30834a.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void destroy() {
        if (this.f30845l.getHasDisplayList()) {
            this.f30845l.discardDisplayList();
        }
        this.f30835b = null;
        this.f30836c = null;
        this.f30839f = true;
        m59152b(false);
        this.f30834a.requestClearInvalidObservations();
        this.f30834a.recycle$ui_release(this);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.f30845l.getElevation() > 0.0f) {
                z = true;
            }
            this.f30840g = z;
            if (z) {
                canvas.enableZ();
            }
            this.f30845l.drawInto(nativeCanvas);
            if (this.f30840g) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.f30845l.getLeft();
        float top = this.f30845l.getTop();
        float right = this.f30845l.getRight();
        float bottom = this.f30845l.getBottom();
        if (this.f30845l.getAlpha() < 1.0f) {
            Paint paint = this.f30841h;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.f30841h = paint;
            }
            paint.setAlpha(this.f30845l.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo71783concat58bKbWc(this.f30842i.m73229calculateMatrixGrdbGEg(this.f30845l));
        m59153a(canvas);
        Function1 function1 = this.f30835b;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        m59152b(false);
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.f30845l.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f30834a;
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3552a.m59150a(this.f30834a);
        }
        return -1L;
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void invalidate() {
        if (!this.f30837d && !this.f30839f) {
            this.f30834a.invalidate();
            m59152b(true);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo73190inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] m73228calculateInverseMatrixbWbORWo = this.f30842i.m73228calculateInverseMatrixbWbORWo(this.f30845l);
        if (m73228calculateInverseMatrixbWbORWo != null) {
            Matrix.m72128timesAssign58bKbWc(matrix, m73228calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo73191isInLayerk4lQ0M(long j) {
        float m71686getXimpl = Offset.m71686getXimpl(j);
        float m71687getYimpl = Offset.m71687getYimpl(j);
        if (this.f30845l.getClipToBounds()) {
            if (0.0f <= m71686getXimpl && m71686getXimpl < this.f30845l.getWidth() && 0.0f <= m71687getYimpl && m71687getYimpl < this.f30845l.getHeight()) {
                return true;
            }
            return false;
        } else if (!this.f30845l.getClipToOutline()) {
            return true;
        } else {
            return this.f30838e.m73233isInOutlinek4lQ0M(j);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z) {
            float[] m73228calculateInverseMatrixbWbORWo = this.f30842i.m73228calculateInverseMatrixbWbORWo(this.f30845l);
            if (m73228calculateInverseMatrixbWbORWo == null) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                Matrix.m72119mapimpl(m73228calculateInverseMatrixbWbORWo, rect);
                return;
            }
        }
        Matrix.m72119mapimpl(this.f30842i.m73229calculateMatrixGrdbGEg(this.f30845l), rect);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo73192mapOffset8S9VItk(long j, boolean z) {
        if (z) {
            float[] m73228calculateInverseMatrixbWbORWo = this.f30842i.m73228calculateInverseMatrixbWbORWo(this.f30845l);
            if (m73228calculateInverseMatrixbWbORWo != null) {
                return Matrix.m72117mapMKHz9U(m73228calculateInverseMatrixbWbORWo, j);
            }
            return Offset.Companion.m71700getInfiniteF1C5BW0();
        }
        return Matrix.m72117mapMKHz9U(this.f30842i.m73229calculateMatrixGrdbGEg(this.f30845l), j);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo73193movegyyYBs(long j) {
        int left = this.f30845l.getLeft();
        int top = this.f30845l.getTop();
        int m73960getXimpl = IntOffset.m73960getXimpl(j);
        int m73961getYimpl = IntOffset.m73961getYimpl(j);
        if (left != m73960getXimpl || top != m73961getYimpl) {
            if (left != m73960getXimpl) {
                this.f30845l.offsetLeftAndRight(m73960getXimpl - left);
            }
            if (top != m73961getYimpl) {
                this.f30845l.offsetTopAndBottom(m73961getYimpl - top);
            }
            m59151c();
            this.f30842i.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo73194resizeozmzZPI(long j) {
        int m74002getWidthimpl = IntSize.m74002getWidthimpl(j);
        int m74001getHeightimpl = IntSize.m74001getHeightimpl(j);
        float f = m74002getWidthimpl;
        this.f30845l.setPivotX(TransformOrigin.m72259getPivotFractionXimpl(this.f30844k) * f);
        float f2 = m74001getHeightimpl;
        this.f30845l.setPivotY(TransformOrigin.m72260getPivotFractionYimpl(this.f30844k) * f2);
        DeviceRenderNode deviceRenderNode = this.f30845l;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.f30845l.getTop(), this.f30845l.getLeft() + m74002getWidthimpl, this.f30845l.getTop() + m74001getHeightimpl)) {
            this.f30838e.m73234updateuvyYCjk(SizeKt.Size(f, f2));
            this.f30845l.setOutline(this.f30838e.getOutline());
            invalidate();
            this.f30842i.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        m59152b(false);
        this.f30839f = false;
        this.f30840g = false;
        this.f30844k = TransformOrigin.Companion.m72264getCenterSzJe1aQ();
        this.f30835b = drawBlock;
        this.f30836c = invalidateParentLayer;
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo73195transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m72128timesAssign58bKbWc(matrix, this.f30842i.m73229calculateMatrixGrdbGEg(this.f30845l));
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void updateDisplayList() {
        Path path;
        if (this.f30837d || !this.f30845l.getHasDisplayList()) {
            m59152b(false);
            if (this.f30845l.getClipToOutline() && !this.f30838e.getOutlineClipSupported()) {
                path = this.f30838e.getClipPath();
            } else {
                path = null;
            }
            Function1<? super Canvas, Unit> function1 = this.f30835b;
            if (function1 != null) {
                this.f30845l.record(this.f30843j, path, function1);
            }
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-dDxr-wY */
    public void mo73196updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, long j2, long j3, int i, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f30844k = j;
        boolean z2 = false;
        boolean z3 = this.f30845l.getClipToOutline() && !this.f30838e.getOutlineClipSupported();
        this.f30845l.setScaleX(f);
        this.f30845l.setScaleY(f2);
        this.f30845l.setAlpha(f3);
        this.f30845l.setTranslationX(f4);
        this.f30845l.setTranslationY(f5);
        this.f30845l.setElevation(f6);
        this.f30845l.setAmbientShadowColor(ColorKt.m71972toArgb8_81llA(j2));
        this.f30845l.setSpotShadowColor(ColorKt.m71972toArgb8_81llA(j3));
        this.f30845l.setRotationZ(f9);
        this.f30845l.setRotationX(f7);
        this.f30845l.setRotationY(f8);
        this.f30845l.setCameraDistance(f10);
        this.f30845l.setPivotX(TransformOrigin.m72259getPivotFractionXimpl(j) * this.f30845l.getWidth());
        this.f30845l.setPivotY(TransformOrigin.m72260getPivotFractionYimpl(j) * this.f30845l.getHeight());
        this.f30845l.setClipToOutline(z && shape != RectangleShapeKt.getRectangleShape());
        this.f30845l.setClipToBounds(z && shape == RectangleShapeKt.getRectangleShape());
        this.f30845l.setRenderEffect(renderEffect);
        this.f30845l.mo73214setCompositingStrategyaDBOjCE(i);
        boolean update = this.f30838e.update(shape, this.f30845l.getAlpha(), this.f30845l.getClipToOutline(), this.f30845l.getElevation(), layoutDirection, density);
        this.f30845l.setOutline(this.f30838e.getOutline());
        if (this.f30845l.getClipToOutline() && !this.f30838e.getOutlineClipSupported()) {
            z2 = true;
        }
        if (z3 == z2 && (!z2 || !update)) {
            m59151c();
        } else {
            invalidate();
        }
        if (!this.f30840g && this.f30845l.getElevation() > 0.0f && (function0 = this.f30836c) != null) {
            function0.invoke();
        }
        this.f30842i.invalidate();
    }
}