package androidx.compose.p003ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.geometry.MutableRect;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.CanvasHolder;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.CompositingStrategy;
import androidx.compose.p003ui.graphics.Matrix;
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
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

@Metadata(m28851d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u009c\u0001\u0012B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J¯\u0001\u00101\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u00020\"2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u001d\u0010=\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\u00020\n2\u0006\u00105\u001a\u00020>H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010<J\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010A\u001a\u00020DH\u0014¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\u0011J7\u0010M\u001a\u00020\n2\u0006\u0010H\u001a\u00020\"2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\u0006\u0010L\u001a\u00020I2\u0006\u0010\u0010\u001a\u00020IH\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\u0011J\u000f\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010\u0011J\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010\u0011J%\u0010V\u001a\u0002042\u0006\u0010R\u001a\u0002042\u0006\u0010S\u001a\u00020\"H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010UJ\u001f\u0010Y\u001a\u00020\n2\u0006\u0010X\u001a\u00020W2\u0006\u0010S\u001a\u00020\"H\u0016¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b_\u0010`J\u001d\u0010c\u001a\u00020\n2\u0006\u0010^\u001a\u00020]H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bb\u0010`R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010d\u001a\u0004\be\u0010fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010g\u001a\u0004\bh\u0010iR$\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR*\u0010{\u001a\u00020\"2\u0006\u0010y\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010s\u001a\u0004\b{\u00103\"\u0004\b|\u0010}R\u0016\u0010\u007f\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010sR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R!\u0010\u0089\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0007\n\u0005\bJ\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010sR \u0010\u0090\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u0088\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u008c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001R)\u0010\u009b\u0001\u001a\u00020\u00132\u0006\u0010y\u001a\u00020\u00138F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u009d\u0001"}, m28850d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "updateLayerProperties-dDxr-wY", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "updateLayerProperties", "hasOverlappingRendering", "()Z", "Landroidx/compose/ui/geometry/Offset;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "(J)V", "resize", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "move", "canvas", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "changed", "", OperatorName.LINE_TO, "t", PDPageLabelRange.STYLE_ROMAN_LOWER, "onLayout", "(ZIIII)V", "destroy", "updateDisplayList", "forceLayout", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "(Landroidx/compose/ui/geometry/MutableRect;Z)V", "reuseLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function1;", "d", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/OutlineResolver;", "e", "Landroidx/compose/ui/platform/OutlineResolver;", "outlineResolver", OperatorName.FILL_NON_ZERO, "Z", "clipToBounds", "Landroid/graphics/Rect;", OperatorName.NON_STROKING_GRAY, "Landroid/graphics/Rect;", "clipBoundsCache", "value", OperatorName.CLOSE_PATH, "isInvalidated", "setInvalidated", "(Z)V", "i", "drawnWithZ", "Landroidx/compose/ui/graphics/CanvasHolder;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/platform/LayerMatrixCache;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/platform/LayerMatrixCache;", "matrixCache", OperatorName.SET_LINE_CAPSTYLE, "mTransformOrigin", OperatorName.MOVE_TO, "mHasOverlappingRendering", "", OperatorName.ENDPATH, "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Companion", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.ViewLayer */
/* loaded from: classes2.dex */
public final class ViewLayer extends View implements OwnedLayer, GraphicLayerInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: o */
    public static final Function2 f30778o = ViewLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: p */
    public static final ViewOutlineProvider f30779p = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@NotNull View view, @NotNull Outline outline) {
            OutlineResolver outlineResolver;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outlineResolver = ((ViewLayer) view).f30788e;
            Outline outline2 = outlineResolver.getOutline();
            Intrinsics.checkNotNull(outline2);
            outline.set(outline2);
        }
    };

    /* renamed from: q */
    public static Method f30780q;

    /* renamed from: r */
    public static Field f30781r;

    /* renamed from: s */
    public static boolean f30782s;

    /* renamed from: t */
    public static boolean f30783t;

    /* renamed from: a */
    public final AndroidComposeView f30784a;

    /* renamed from: b */
    public final DrawChildContainer f30785b;

    /* renamed from: c */
    public Function1 f30786c;

    /* renamed from: d */
    public Function0 f30787d;

    /* renamed from: e */
    public final OutlineResolver f30788e;

    /* renamed from: f */
    public boolean f30789f;

    /* renamed from: g */
    public Rect f30790g;

    /* renamed from: h */
    public boolean f30791h;

    /* renamed from: i */
    public boolean f30792i;

    /* renamed from: j */
    public final CanvasHolder f30793j;

    /* renamed from: k */
    public final LayerMatrixCache f30794k;

    /* renamed from: l */
    public long f30795l;

    /* renamed from: m */
    public boolean f30796m;

    /* renamed from: n */
    public final long f30797n;

    @Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/platform/ViewLayer$Companion;", "", "()V", "OutlineProvider", "Landroid/view/ViewOutlineProvider;", "getOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "getMatrix", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "", "<set-?>", "", "hasRetrievedMethod", "getHasRetrievedMethod", "()Z", "recreateDisplayList", "Ljava/lang/reflect/Field;", "shouldUseDispatchDraw", "getShouldUseDispatchDraw", "setShouldUseDispatchDraw$ui_release", "(Z)V", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "updateDisplayList", Promotion.ACTION_VIEW, "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    /* renamed from: androidx.compose.ui.platform.ViewLayer$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasRetrievedMethod() {
            return ViewLayer.f30782s;
        }

        @NotNull
        public final ViewOutlineProvider getOutlineProvider() {
            return ViewLayer.f30779p;
        }

        public final boolean getShouldUseDispatchDraw() {
            return ViewLayer.f30783t;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z) {
            ViewLayer.f30783t = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void updateDisplayList(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    ViewLayer.f30782s = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f30780q = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.f30781r = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f30780q = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f30781r = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f30780q;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f30781r;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f30781r;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f30780q;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }

        public Companion() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    /* loaded from: classes2.dex */
    public static final class C3579a {

        /* renamed from: a */
        public static final C3579a f30798a = new C3579a();

        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final long m59191a(@NotNull View view) {
            long uniqueDrawingId;
            Intrinsics.checkNotNullParameter(view, "view");
            uniqueDrawingId = view.getUniqueDrawingId();
            return uniqueDrawingId;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(@NotNull AndroidComposeView ownerView, @NotNull DrawChildContainer container, @NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f30784a = ownerView;
        this.f30785b = container;
        this.f30786c = drawBlock;
        this.f30787d = invalidateParentLayer;
        this.f30788e = new OutlineResolver(ownerView.getDensity());
        this.f30793j = new CanvasHolder();
        this.f30794k = new LayerMatrixCache(f30778o);
        this.f30795l = TransformOrigin.Companion.m72080getCenterSzJe1aQ();
        this.f30796m = true;
        setWillNotDraw(false);
        container.addView(this);
        this.f30797n = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline() && !this.f30788e.getOutlineClipSupported()) {
            return this.f30788e.getClipPath();
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.f30791h) {
            this.f30791h = z;
            this.f30784a.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    /* renamed from: a */
    public final void m59193a() {
        Rect rect;
        if (this.f30789f) {
            Rect rect2 = this.f30790g;
            if (rect2 == null) {
                this.f30790g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f30790g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    /* renamed from: b */
    public final void m59192b() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f30788e.getOutline() != null) {
            viewOutlineProvider = f30779p;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.f30784a.requestClearInvalidObservations();
        this.f30786c = null;
        this.f30787d = null;
        boolean recycle$ui_release = this.f30784a.recycle$ui_release(this);
        if (Build.VERSION.SDK_INT < 23 && !f30783t && recycle$ui_release) {
            setVisibility(8);
        } else {
            this.f30785b.removeViewInLayout(this);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        CanvasHolder canvasHolder = this.f30793j;
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.f30788e.clipToOutline(androidCanvas);
            z = true;
        }
        Function1 function1 = this.f30786c;
        if (function1 != null) {
            function1.invoke(androidCanvas);
        }
        if (z) {
            androidCanvas.restore();
        }
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void drawLayer(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (getElevation() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f30792i = z;
        if (z) {
            canvas.enableZ();
        }
        this.f30785b.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.f30792i) {
            canvas.disableZ();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.f30785b;
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.f30797n;
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.f30784a;
    }

    @Override // androidx.compose.p003ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C3579a.m59191a(this.f30784a);
        }
        return -1L;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f30796m;
    }

    @Override // android.view.View, androidx.compose.p003ui.node.OwnedLayer
    public void invalidate() {
        if (!this.f30791h) {
            setInvalidated(true);
            super.invalidate();
            this.f30784a.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: inverseTransform-58bKbWc */
    public void mo73006inverseTransform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] m73044calculateInverseMatrixbWbORWo = this.f30794k.m73044calculateInverseMatrixbWbORWo(this);
        if (m73044calculateInverseMatrixbWbORWo != null) {
            Matrix.m71944timesAssign58bKbWc(matrix, m73044calculateInverseMatrixbWbORWo);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo73007isInLayerk4lQ0M(long j) {
        float m71502getXimpl = Offset.m71502getXimpl(j);
        float m71503getYimpl = Offset.m71503getYimpl(j);
        if (this.f30789f) {
            if (0.0f <= m71502getXimpl && m71502getXimpl < getWidth() && 0.0f <= m71503getYimpl && m71503getYimpl < getHeight()) {
                return true;
            }
            return false;
        } else if (!getClipToOutline()) {
            return true;
        } else {
            return this.f30788e.m73049isInOutlinek4lQ0M(j);
        }
    }

    public final boolean isInvalidated() {
        return this.f30791h;
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void mapBounds(@NotNull MutableRect rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (z) {
            float[] m73044calculateInverseMatrixbWbORWo = this.f30794k.m73044calculateInverseMatrixbWbORWo(this);
            if (m73044calculateInverseMatrixbWbORWo != null) {
                Matrix.m71935mapimpl(m73044calculateInverseMatrixbWbORWo, rect);
                return;
            } else {
                rect.set(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
        }
        Matrix.m71935mapimpl(this.f30794k.m73045calculateMatrixGrdbGEg(this), rect);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: mapOffset-8S9VItk */
    public long mo73008mapOffset8S9VItk(long j, boolean z) {
        if (z) {
            float[] m73044calculateInverseMatrixbWbORWo = this.f30794k.m73044calculateInverseMatrixbWbORWo(this);
            if (m73044calculateInverseMatrixbWbORWo != null) {
                return Matrix.m71933mapMKHz9U(m73044calculateInverseMatrixbWbORWo, j);
            }
            return Offset.Companion.m71516getInfiniteF1C5BW0();
        }
        return Matrix.m71933mapMKHz9U(this.f30794k.m73045calculateMatrixGrdbGEg(this), j);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: move--gyyYBs */
    public void mo73009movegyyYBs(long j) {
        int m73776getXimpl = IntOffset.m73776getXimpl(j);
        if (m73776getXimpl != getLeft()) {
            offsetLeftAndRight(m73776getXimpl - getLeft());
            this.f30794k.invalidate();
        }
        int m73777getYimpl = IntOffset.m73777getYimpl(j);
        if (m73777getYimpl != getTop()) {
            offsetTopAndBottom(m73777getYimpl - getTop());
            this.f30794k.invalidate();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: resize-ozmzZPI */
    public void mo73010resizeozmzZPI(long j) {
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(j);
        int m73817getHeightimpl = IntSize.m73817getHeightimpl(j);
        if (m73818getWidthimpl != getWidth() || m73817getHeightimpl != getHeight()) {
            float f = m73818getWidthimpl;
            setPivotX(TransformOrigin.m72075getPivotFractionXimpl(this.f30795l) * f);
            float f2 = m73817getHeightimpl;
            setPivotY(TransformOrigin.m72076getPivotFractionYimpl(this.f30795l) * f2);
            this.f30788e.m73050updateuvyYCjk(SizeKt.Size(f, f2));
            m59192b();
            layout(getLeft(), getTop(), getLeft() + m73818getWidthimpl, getTop() + m73817getHeightimpl);
            m59193a();
            this.f30794k.invalidate();
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void reuseLayer(@NotNull Function1<? super Canvas, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT < 23 && !f30783t) {
            setVisibility(0);
        } else {
            this.f30785b.addView(this);
        }
        this.f30789f = false;
        this.f30792i = false;
        this.f30795l = TransformOrigin.Companion.m72080getCenterSzJe1aQ();
        this.f30786c = drawBlock;
        this.f30787d = invalidateParentLayer;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: transform-58bKbWc */
    public void mo73011transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Matrix.m71944timesAssign58bKbWc(matrix, this.f30794k.m73045calculateMatrixGrdbGEg(this));
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.f30791h && !f30783t) {
            setInvalidated(false);
            Companion.updateDisplayList(this);
        }
    }

    @Override // androidx.compose.p003ui.node.OwnedLayer
    /* renamed from: updateLayerProperties-dDxr-wY */
    public void mo73012updateLayerPropertiesdDxrwY(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, long j2, long j3, int i, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f30795l = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(TransformOrigin.m72075getPivotFractionXimpl(this.f30795l) * getWidth());
        setPivotY(TransformOrigin.m72076getPivotFractionYimpl(this.f30795l) * getHeight());
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.f30789f = z && shape == RectangleShapeKt.getRectangleShape();
        m59193a();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && shape != RectangleShapeKt.getRectangleShape());
        boolean update = this.f30788e.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        m59192b();
        boolean z4 = getManualClipPath() != null;
        if (z3 != z4 || (z4 && update)) {
            invalidate();
        }
        if (!this.f30792i && getElevation() > 0.0f && (function0 = this.f30787d) != null) {
            function0.invoke();
        }
        this.f30794k.invalidate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            L22 l22 = L22.f3367a;
            l22.m67567a(this, ColorKt.m71788toArgb8_81llA(j2));
            l22.m67566b(this, ColorKt.m71788toArgb8_81llA(j3));
        }
        if (i2 >= 31) {
            N22.f3992a.m67255a(this, renderEffect);
        }
        CompositingStrategy.Companion companion = CompositingStrategy.Companion;
        if (CompositingStrategy.m71812equalsimpl0(i, companion.m71818getOffscreenNrFUSI())) {
            setLayerType(2, null);
        } else if (CompositingStrategy.m71812equalsimpl0(i, companion.m71817getModulateAlphaNrFUSI())) {
            setLayerType(0, null);
            z2 = false;
        } else {
            setLayerType(0, null);
        }
        this.f30796m = z2;
    }
}
