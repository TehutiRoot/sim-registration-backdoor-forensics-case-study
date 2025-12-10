package androidx.compose.p003ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.PointMode;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSize;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010\u001eJ\u001d\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J=\u00103\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J%\u00108\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00100\u001a\u00020/H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0017\u0010<\u001a\u000209*\u00020/ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J-\u0010A\u001a\u00020\t2\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J7\u0010B\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bB\u0010CJG\u0010F\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\u001a2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010GJ7\u0010H\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010CJ-\u0010M\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJO\u0010R\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010UJ-\u0010[\u001a\u00020\t2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJE\u0010d\u001a\u00020\t2\u0006\u0010W\u001a\u00020V2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020\\2\u0006\u0010a\u001a\u00020^2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ3\u0010i\u001a\u00020\t2\u0006\u0010f\u001a\u00020e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u00020\tH\u0016¢\u0006\u0004\bj\u0010\u0003J\u000f\u0010k\u001a\u00020\tH\u0016¢\u0006\u0004\bk\u0010\u0003J-\u0010n\u001a\u00020\t2\u0006\u0010f\u001a\u00020e2\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ-\u0010u\u001a\u00020\t2\u0006\u0010p\u001a\u00020o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010tR,\u0010~\u001a\u00060vj\u0002`w8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010x\u0012\u0004\b}\u0010\u0003\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u0016\u0010\u0081\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010\u0080\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0083\u0001"}, m29142d2 = {"Landroidx/compose/ui/graphics/AndroidCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "<init>", "()V", "", "Landroidx/compose/ui/geometry/Offset;", "points", "Landroidx/compose/ui/graphics/Paint;", "paint", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "", "stepBy", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Landroidx/compose/ui/graphics/Paint;I)V", "", "d", "([FLandroidx/compose/ui/graphics/Paint;I)V", OperatorName.CURVE_TO, "save", "restore", "Landroidx/compose/ui/geometry/Rect;", "bounds", "saveLayer", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Paint;)V", "", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "concat-58bKbWc", "([F)V", "concat", OneNadOutboundSearchFragment.POSITION_LEFT, "top", OneNadOutboundSearchFragment.POSITION_RIGHT, "bottom", "Landroidx/compose/ui/graphics/ClipOp;", "clipOp", "clipRect-N_I0leg", "(FFFFI)V", "clipRect", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipPath", "Landroid/graphics/Region$Op;", "toRegionOp--7u2Bmg", "(I)Landroid/graphics/Region$Op;", "toRegionOp", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "drawRect", "(FFFFLandroidx/compose/ui/graphics/Paint;)V", "radiusX", "radiusY", "drawRoundRect", "(FFFFFFLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "center", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawCircle", "startAngle", "sweepAngle", "", "useCenter", "drawArc", "(FFFFFFZLandroidx/compose/ui/graphics/Paint;)V", "drawPath", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawPoints", "enableZ", "disableZ", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "Landroidx/compose/ui/graphics/Vertices;", "vertices", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "drawVertices", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroid/graphics/Canvas;", "getInternalCanvas", "()Landroid/graphics/Canvas;", "setInternalCanvas", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,431:1\n35#2,5:432\n35#2,5:437\n33#3,6:442\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:432,5\n242#1:437,5\n315#1:442,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas */
/* loaded from: classes2.dex */
public final class AndroidCanvas implements Canvas {

    /* renamed from: a */
    public Canvas f29057a;

    /* renamed from: b */
    public final Rect f29058b;

    /* renamed from: c */
    public final Rect f29059c;

    public AndroidCanvas() {
        Canvas canvas;
        canvas = AndroidCanvas_androidKt.f29060a;
        this.f29057a = canvas;
        this.f29058b = new Rect();
        this.f29059c = new Rect();
    }

    @PublishedApi
    public static /* synthetic */ void getInternalCanvas$annotations() {
    }

    /* renamed from: a */
    public final void m59714a(List list, Paint paint, int i) {
        if (list.size() >= 2) {
            Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i2 = 0;
            while (i2 < list.size() - 1) {
                long m71696unboximpl = ((Offset) list.get(i2)).m71696unboximpl();
                long m71696unboximpl2 = ((Offset) list.get(i2 + 1)).m71696unboximpl();
                this.f29057a.drawLine(Offset.m71686getXimpl(m71696unboximpl), Offset.m71687getYimpl(m71696unboximpl), Offset.m71686getXimpl(m71696unboximpl2), Offset.m71687getYimpl(m71696unboximpl2), asFrameworkPaint);
                i2 += i;
            }
        }
    }

    /* renamed from: b */
    public final void m59713b(List list, Paint paint) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long m71696unboximpl = ((Offset) list.get(i)).m71696unboximpl();
            this.f29057a.drawPoint(Offset.m71686getXimpl(m71696unboximpl), Offset.m71687getYimpl(m71696unboximpl), paint.asFrameworkPaint());
        }
    }

    /* renamed from: c */
    public final void m59712c(float[] fArr, Paint paint, int i) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i2 = 0;
            while (i2 < fArr.length - 3) {
                this.f29057a.drawLine(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], asFrameworkPaint);
                i2 += i * 2;
            }
        }
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    public void mo71780clipPathmtrdDE(@NotNull Path path, int i) {
        Intrinsics.checkNotNullParameter(path, "path");
        Canvas canvas = this.f29057a;
        if (path instanceof AndroidPath) {
            canvas.clipPath(((AndroidPath) path).getInternalPath(), m71791toRegionOp7u2Bmg(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    public void mo71781clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
        this.f29057a.clipRect(f, f2, f3, f4, m71791toRegionOp7u2Bmg(i));
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: clipRect-mtrdD-E  reason: not valid java name */
    public /* synthetic */ void mo71782clipRectmtrdDE(androidx.compose.p003ui.geometry.Rect rect, int i) {
        AbstractC16859ul.m1067a(this, rect, i);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: concat-58bKbWc  reason: not valid java name */
    public void mo71783concat58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!MatrixKt.m72134isIdentity58bKbWc(matrix)) {
            Matrix matrix2 = new Matrix();
            AndroidMatrixConversions_androidKt.m71798setFromEL8BTi8(matrix2, matrix);
            this.f29057a.concat(matrix2);
        }
    }

    /* renamed from: d */
    public final void m59711d(float[] fArr, Paint paint, int i) {
        if (fArr.length % 2 == 0) {
            Paint asFrameworkPaint = paint.asFrameworkPaint();
            int i2 = 0;
            while (i2 < fArr.length - 1) {
                this.f29057a.drawPoint(fArr[i2], fArr[i2 + 1], asFrameworkPaint);
                i2 += i;
            }
        }
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void disableZ() {
        CanvasUtils.INSTANCE.enableZ(this.f29057a, false);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public /* synthetic */ void drawArc(androidx.compose.p003ui.geometry.Rect rect, float f, float f2, boolean z, Paint paint) {
        AbstractC16859ul.m1066b(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public /* synthetic */ void drawArcRad(androidx.compose.p003ui.geometry.Rect rect, float f, float f2, boolean z, Paint paint) {
        AbstractC16859ul.m1065c(this, rect, f, f2, z, paint);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawCircle-9KIMszo  reason: not valid java name */
    public void mo71784drawCircle9KIMszo(long j, float f, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawCircle(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), f, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawImage-d-4ec7I  reason: not valid java name */
    public void mo71785drawImaged4ec7I(@NotNull ImageBitmap image, long j, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawBitmap(AndroidImageBitmap_androidKt.asAndroidBitmap(image), Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawImageRect-HPBpro0  reason: not valid java name */
    public void mo71786drawImageRectHPBpro0(@NotNull ImageBitmap image, long j, long j2, long j3, long j4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f29057a;
        Bitmap asAndroidBitmap = AndroidImageBitmap_androidKt.asAndroidBitmap(image);
        Rect rect = this.f29058b;
        rect.left = IntOffset.m73960getXimpl(j);
        rect.top = IntOffset.m73961getYimpl(j);
        rect.right = IntOffset.m73960getXimpl(j) + IntSize.m74002getWidthimpl(j2);
        rect.bottom = IntOffset.m73961getYimpl(j) + IntSize.m74001getHeightimpl(j2);
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.f29059c;
        rect2.left = IntOffset.m73960getXimpl(j3);
        rect2.top = IntOffset.m73961getYimpl(j3);
        rect2.right = IntOffset.m73960getXimpl(j3) + IntSize.m74002getWidthimpl(j4);
        rect2.bottom = IntOffset.m73961getYimpl(j3) + IntSize.m74001getHeightimpl(j4);
        canvas.drawBitmap(asAndroidBitmap, rect, rect2, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawLine-Wko1d7g  reason: not valid java name */
    public void mo71787drawLineWko1d7g(long j, long j2, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawLine(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), Offset.m71686getXimpl(j2), Offset.m71687getYimpl(j2), paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public /* synthetic */ void drawOval(androidx.compose.p003ui.geometry.Rect rect, Paint paint) {
        AbstractC16859ul.m1064d(this, rect, paint);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Canvas canvas = this.f29057a;
        if (path instanceof AndroidPath) {
            canvas.drawPath(((AndroidPath) path).getInternalPath(), paint.asFrameworkPaint());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawPoints-O7TthRY  reason: not valid java name */
    public void mo71788drawPointsO7TthRY(int i, @NotNull List<Offset> points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        PointMode.Companion companion = PointMode.Companion;
        if (PointMode.m72177equalsimpl0(i, companion.m72181getLinesr_lszbg())) {
            m59714a(points, paint, 2);
        } else if (PointMode.m72177equalsimpl0(i, companion.m72183getPolygonr_lszbg())) {
            m59714a(points, paint, 1);
        } else if (PointMode.m72177equalsimpl0(i, companion.m72182getPointsr_lszbg())) {
            m59713b(points, paint);
        }
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawRawPoints-O7TthRY  reason: not valid java name */
    public void mo71789drawRawPointsO7TthRY(int i, @NotNull float[] points, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (points.length % 2 == 0) {
            PointMode.Companion companion = PointMode.Companion;
            if (PointMode.m72177equalsimpl0(i, companion.m72181getLinesr_lszbg())) {
                m59712c(points, paint, 2);
                return;
            } else if (PointMode.m72177equalsimpl0(i, companion.m72183getPolygonr_lszbg())) {
                m59712c(points, paint, 1);
                return;
            } else if (PointMode.m72177equalsimpl0(i, companion.m72182getPointsr_lszbg())) {
                m59711d(points, paint, 2);
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException("points must have an even number of values");
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public /* synthetic */ void drawRect(androidx.compose.p003ui.geometry.Rect rect, Paint paint) {
        AbstractC16859ul.m1063e(this, rect, paint);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawRoundRect(f, f2, f3, f4, f5, f6, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    /* renamed from: drawVertices-TPEHhCM  reason: not valid java name */
    public void mo71790drawVerticesTPEHhCM(@NotNull Vertices vertices, int i, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawVertices(AndroidVertexMode_androidKt.m71834toAndroidVertexModeJOOmi9M(vertices.m72275getVertexModec2xauaI()), vertices.getPositions().length, vertices.getPositions(), 0, vertices.getTextureCoordinates(), 0, vertices.getColors(), 0, vertices.getIndices(), 0, vertices.getIndices().length, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void enableZ() {
        CanvasUtils.INSTANCE.enableZ(this.f29057a, true);
    }

    @NotNull
    public final Canvas getInternalCanvas() {
        return this.f29057a;
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void restore() {
        this.f29057a.restore();
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void rotate(float f) {
        this.f29057a.rotate(f);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void save() {
        this.f29057a.save();
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void saveLayer(@NotNull androidx.compose.p003ui.geometry.Rect bounds, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), paint.asFrameworkPaint(), 31);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void scale(float f, float f2) {
        this.f29057a.scale(f, f2);
    }

    public final void setInternalCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.f29057a = canvas;
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void skew(float f, float f2) {
        this.f29057a.skew(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public /* synthetic */ void skewRad(float f, float f2) {
        AbstractC16859ul.m1062f(this, f, f2);
    }

    @NotNull
    /* renamed from: toRegionOp--7u2Bmg  reason: not valid java name */
    public final Region.Op m71791toRegionOp7u2Bmg(int i) {
        if (ClipOp.m71903equalsimpl0(i, ClipOp.Companion.m71907getDifferencertfAjoo())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void translate(float f, float f2) {
        this.f29057a.translate(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawArc(f, f2, f3, f4, f5, f6, z, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void drawOval(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawOval(f, f2, f3, f4, paint.asFrameworkPaint());
    }

    @Override // androidx.compose.p003ui.graphics.Canvas
    public void drawRect(float f, float f2, float f3, float f4, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f29057a.drawRect(f, f2, f3, f4, paint.asFrameworkPaint());
    }
}