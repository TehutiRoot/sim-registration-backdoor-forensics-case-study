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
@Metadata(m28851d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u007f2\u00020\u00012\u00020\u0002:\u0002\u007fSB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ¯\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001d\u00100\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020,H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001d\u00105\u001a\u00020\u00072\u0006\u00102\u001a\u000201H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u00072\u0006\u0010-\u001a\u000206H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00104J\u000f\u00109\u001a\u00020\u0007H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0007H\u0016¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010:J%\u0010D\u001a\u00020,2\u0006\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020\u001cH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ1\u0010I\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016¢\u0006\u0004\bI\u0010JJ\u001d\u0010O\u001a\u00020\u00072\u0006\u0010L\u001a\u00020KH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bM\u0010NJ\u001d\u0010Q\u001a\u00020\u00072\u0006\u0010L\u001a\u00020KH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010NJ\u000f\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bR\u0010:J\u0017\u0010S\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\bS\u0010=R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR$\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010YR$\u0010^\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b[\u0010\\\"\u0004\bW\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010\\R\u0016\u0010f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001f\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0080\u0001"}, m28850d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "invalidate", "()V", "canvas", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;)V", "updateDisplayList", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "value", "d", "Z", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/OutlineResolver;", "e", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", OperatorName.FILL_NON_ZERO, "isDestroyed", OperatorName.NON_STROKING_GRAY, "drawnWithZ", "Landroidx/compose/ui/graphics/Paint;", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/graphics/Paint;", "softwareLayerPaint", "Landroidx/compose/ui/platform/LayerMatrixCache;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "i", "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", "Landroidx/compose/ui/graphics/CanvasHolder;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, OperatorName.LINE_TO, "Landroidx/compose/ui/platform/DeviceRenderNode;", "renderNode", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,382:1\n1#2:383\n*E\n"})
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
/* loaded from: classes2.dex */
public final class RenderNodeLayer implements OwnedLayer, GraphicLayerInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: m */
    public static final Function2 f30745m = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: a */
    public final AndroidComposeView f30746a;

    /* renamed from: b */
    public Function1 f30747b;

    /* renamed from: c */
    public Function0 f30748c;

    /* renamed from: d */
    public boolean f30749d;

    /* renamed from: e */
    public final OutlineResolver f30750e;

    /* renamed from: f */
    public boolean f30751f;

    /* renamed from: g */
    public boolean f30752g;

    /* renamed from: h */
    public Paint f30753h;

    /* renamed from: i */
    public final LayerMatrixCache f30754i;

    /* renamed from: j */
    public final CanvasHolder f30755j;

    /* renamed from: k */
    public long f30756k;

    /* renamed from: l */
    public final DeviceRenderNode f30757l;

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$Companion;", "", "()V", "getMatrix", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "Landroid/graphics/Matrix;", "", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
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
    public static final class C3570a {

        /* renamed from: a */
        public static final C3570a f30758a = new C3570a();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final long m59200a(@NotNull View view) {
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
        this.f30746a = ownerView;
        this.f30747b = drawBlock;
        this.f30748c = invalidateParentLayer;
        this.f30750e = new OutlineResolver(ownerView.getDensity());
        this.f30754i = new LayerMatrixCache(f30745m);
        this.f30755j = new CanvasHolder();
        this.f30756k = TransformOrigin.Companion.m72080getCenterSzJe1aQ();
        if (Build.VERSION.SDK_INT >= 29) {
            renderNodeApi23 = new RenderNodeApi29(ownerView);
        } else {
            renderNodeApi23 = new RenderNodeApi23(ownerView);
        }
        renderNodeApi23.setHasOverlappingRendering(true);
        this.f30757l = renderNodeApi23;
    }

    /* renamed from: a */
    public final void m59203a(Canvas canvas) {
        if (this.f30757l.getClipToOutline() || this.f30757l.getClipToBounds()) {
            this.f30750e.clipToOutline(canvas);
        }
    }

    /* renamed from: b */
    public final void m59202b(boolean z) {
        if (z != this.f30749d) {
            this.f30749d = z;
            this.f30746a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    /* renamed from: c */
    public final void m59201c() {
        if (Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.f30746a);
        } else {
            this.f30746a.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void destroy() {
        if (this.f30757l.getHasDisplayList()) {
            this.f30757l.discardDisplayList();
        }
        this.f30747b = null;
        this.f30748c = null;
        this.f30751f = true;
        m59202b(false);
        this.f30746a.requestClearInvalidObservations();
        this.f30746a.recycle$ui_release(this);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.f30757l.getElevation() > 0.0f) {
                z = true;
            }
            this.f30752g = z;
            if (z) {
                canvas.enableZ();
            }
            this.f30757l.drawInto(nativeCanvas);
            if (this.f30752g) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = this.f30757l.getLeft();
        float top = this.f30757l.getTop();
        float right = this.f30757l.getRight();
        float bottom = this.f30757l.getBottom();
        if (this.f30757l.getAlpha() < 1.0f) {
            Paint paint = this.f30753h;
            if (paint == null) {
                paint = AndroidPaint_androidKt.Paint();
                this.f30753h = paint;
            }
            paint.setAlpha(this.f30757l.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, paint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo71599concat58bKbWc(this.f30754i.m73045calculateMatrixGrdbGEg(this.f30757l));
        m59203a(canvas);
        Function1 function1 = this.f30747b;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.restore();
        m59202b(false);
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.f30757l.getUniqueId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f30746a;
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3570a.m59200a(this.f30746a);
        }
        return -1L;
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void invalidate() {
        if (!this.f30749d && !this.f30751f) {
            this.f30746a.invalidate();
            m59202b(true);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo73006inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] m73044calculateInverseMatrixbWbORWo = this.f30754i.m73044calculateInverseMatrixbWbORWo(this.f30757l);
        if (m73044calculateInverseMatrixbWbORWo != null) {
            Matrix.m71944timesAssign58bKbWc(matrix, m73044calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo73007isInLayerk4lQ0M(long j) {
        float m71502getXimpl = Offset.m71502getXimpl(j);
        float m71503getYimpl = Offset.m71503getYimpl(j);
        if (this.f30757l.getClipToBounds()) {
            if (0.0f <= m71502getXimpl && m71502getXimpl < this.f30757l.getWidth() && 0.0f <= m71503getYimpl && m71503getYimpl < this.f30757l.getHeight()) {
                return true;
            }
            return false;
        } else if (!this.f30757l.getClipToOutline()) {
            return true;
        } else {
            return this.f30750e.m73049isInOutlinek4lQ0M(j);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z) {
            float[] m73044calculateInverseMatrixbWbORWo = this.f30754i.m73044calculateInverseMatrixbWbORWo(this.f30757l);
            if (m73044calculateInverseMatrixbWbORWo == null) {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                Matrix.m71935mapimpl(m73044calculateInverseMatrixbWbORWo, rect);
                return;
            }
        }
        Matrix.m71935mapimpl(this.f30754i.m73045calculateMatrixGrdbGEg(this.f30757l), rect);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo73008mapOffset8S9VItk(long j, boolean z) {
        if (z) {
            float[] m73044calculateInverseMatrixbWbORWo = this.f30754i.m73044calculateInverseMatrixbWbORWo(this.f30757l);
            if (m73044calculateInverseMatrixbWbORWo != null) {
                return Matrix.m71933mapMKHz9U(m73044calculateInverseMatrixbWbORWo, j);
            }
            return Offset.Companion.m71516getInfiniteF1C5BW0();
        }
        return Matrix.m71933mapMKHz9U(this.f30754i.m73045calculateMatrixGrdbGEg(this.f30757l), j);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo73009movegyyYBs(long j) {
        int left = this.f30757l.getLeft();
        int top = this.f30757l.getTop();
        int m73776getXimpl = IntOffset.m73776getXimpl(j);
        int m73777getYimpl = IntOffset.m73777getYimpl(j);
        if (left != m73776getXimpl || top != m73777getYimpl) {
            if (left != m73776getXimpl) {
                this.f30757l.offsetLeftAndRight(m73776getXimpl - left);
            }
            if (top != m73777getYimpl) {
                this.f30757l.offsetTopAndBottom(m73777getYimpl - top);
            }
            m59201c();
            this.f30754i.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo73010resizeozmzZPI(long j) {
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(j);
        int m73817getHeightimpl = IntSize.m73817getHeightimpl(j);
        float f = m73818getWidthimpl;
        this.f30757l.setPivotX(TransformOrigin.m72075getPivotFractionXimpl(this.f30756k) * f);
        float f2 = m73817getHeightimpl;
        this.f30757l.setPivotY(TransformOrigin.m72076getPivotFractionYimpl(this.f30756k) * f2);
        DeviceRenderNode deviceRenderNode = this.f30757l;
        if (deviceRenderNode.setPosition(deviceRenderNode.getLeft(), this.f30757l.getTop(), this.f30757l.getLeft() + m73818getWidthimpl, this.f30757l.getTop() + m73817getHeightimpl)) {
            this.f30750e.m73050updateuvyYCjk(SizeKt.Size(f, f2));
            this.f30757l.setOutline(this.f30750e.getOutline());
            invalidate();
            this.f30754i.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        m59202b(false);
        this.f30751f = false;
        this.f30752g = false;
        this.f30756k = TransformOrigin.Companion.m72080getCenterSzJe1aQ();
        this.f30747b = drawBlock;
        this.f30748c = invalidateParentLayer;
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo73011transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m71944timesAssign58bKbWc(matrix, this.f30754i.m73045calculateMatrixGrdbGEg(this.f30757l));
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void updateDisplayList() {
        Path path;
        if (this.f30749d || !this.f30757l.getHasDisplayList()) {
            m59202b(false);
            if (this.f30757l.getClipToOutline() && !this.f30750e.getOutlineClipSupported()) {
                path = this.f30750e.getClipPath();
            } else {
                path = null;
            }
            Function1<? super Canvas, Unit> function1 = this.f30747b;
            if (function1 != null) {
                this.f30757l.record(this.f30755j, path, function1);
            }
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-dDxr-wY */
    public void mo73012updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, long j2, long j3, int i, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f30756k = j;
        boolean z2 = false;
        boolean z3 = this.f30757l.getClipToOutline() && !this.f30750e.getOutlineClipSupported();
        this.f30757l.setScaleX(f);
        this.f30757l.setScaleY(f2);
        this.f30757l.setAlpha(f3);
        this.f30757l.setTranslationX(f4);
        this.f30757l.setTranslationY(f5);
        this.f30757l.setElevation(f6);
        this.f30757l.setAmbientShadowColor(ColorKt.m71788toArgb8_81llA(j2));
        this.f30757l.setSpotShadowColor(ColorKt.m71788toArgb8_81llA(j3));
        this.f30757l.setRotationZ(f9);
        this.f30757l.setRotationX(f7);
        this.f30757l.setRotationY(f8);
        this.f30757l.setCameraDistance(f10);
        this.f30757l.setPivotX(TransformOrigin.m72075getPivotFractionXimpl(j) * this.f30757l.getWidth());
        this.f30757l.setPivotY(TransformOrigin.m72076getPivotFractionYimpl(j) * this.f30757l.getHeight());
        this.f30757l.setClipToOutline(z && shape != RectangleShapeKt.getRectangleShape());
        this.f30757l.setClipToBounds(z && shape == RectangleShapeKt.getRectangleShape());
        this.f30757l.setRenderEffect(renderEffect);
        this.f30757l.mo73030setCompositingStrategyaDBOjCE(i);
        boolean update = this.f30750e.update(shape, this.f30757l.getAlpha(), this.f30757l.getClipToOutline(), this.f30757l.getElevation(), layoutDirection, density);
        this.f30757l.setOutline(this.f30750e.getOutline());
        if (this.f30757l.getClipToOutline() && !this.f30750e.getOutlineClipSupported()) {
            z2 = true;
        }
        if (z3 == z2 && (!z2 || !update)) {
            m59201c();
        } else {
            invalidate();
        }
        if (!this.f30752g && this.f30757l.getElevation() > 0.0f && (function0 = this.f30748c) != null) {
            function0.invoke();
        }
        this.f30754i.invalidate();
    }
}
