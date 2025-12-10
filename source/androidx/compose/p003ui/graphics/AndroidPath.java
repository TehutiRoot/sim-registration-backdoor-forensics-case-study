package androidx.compose.p003ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.graphics.PathOperation;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u001bJ?\u0010#\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J/\u0010+\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010.J'\u00103\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J%\u0010?\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00012\u0006\u0010<\u001a\u00020;H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020\u000eH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bC\u0010AJ\u001d\u0010F\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020;H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u001d\u0010K\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020GH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0016¢\u0006\u0004\bL\u0010MJ-\u0010T\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u00012\u0006\u0010O\u001a\u00020\u00012\u0006\u0010Q\u001a\u00020PH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010SR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\u00020\b8VX\u0096\u0004¢\u0006\f\u0012\u0004\bf\u0010A\u001a\u0004\bd\u0010eR-\u0010m\u001a\u00020g2\u0006\u0010h\u001a\u00020g8V@VX\u0096\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006o"}, m28850d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/geometry/Rect;)Z", "", "x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "startAngleDegrees", "sweepAngleDegrees", "forceMoveTo", "arcTo", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "oval", "addOval", "startAngleRadians", "sweepAngleRadians", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", ClientCookie.PATH_ATTR, "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/graphics/RectF;", "rectF", "", OperatorName.CURVE_TO, "[F", "radii", "Landroid/graphics/Matrix;", "d", "Landroid/graphics/Matrix;", "mMatrix", "isConvex", "()Z", "isConvex$annotations", "Landroidx/compose/ui/graphics/PathFillType;", "value", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isEmpty", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,244:1\n35#2,5:245\n35#2,5:250\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:245,5\n220#1:250,5\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidPath */
/* loaded from: classes2.dex */
public final class AndroidPath implements Path {

    /* renamed from: a */
    public final Path f28979a;

    /* renamed from: b */
    public final RectF f28980b;

    /* renamed from: c */
    public final float[] f28981c;

    /* renamed from: d */
    public final Matrix f28982d;

    public AndroidPath() {
        this(null, 1, null);
    }

    public static /* synthetic */ void isConvex$annotations() {
    }

    /* renamed from: a */
    public final boolean m59760a(Rect rect) {
        if (!Float.isNaN(rect.getLeft())) {
            if (!Float.isNaN(rect.getTop())) {
                if (!Float.isNaN(rect.getRight())) {
                    if (!Float.isNaN(rect.getBottom())) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void addArc(@NotNull Rect oval, float f, float f2) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        if (m59760a(oval)) {
            this.f28980b.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
            this.f28979a.addArc(this.f28980b, f, f2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void addArcRad(@NotNull Rect oval, float f, float f2) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        addArc(oval, DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void addOval(@NotNull Rect oval) {
        Intrinsics.checkNotNullParameter(oval, "oval");
        this.f28980b.set(oval.getLeft(), oval.getTop(), oval.getRight(), oval.getBottom());
        this.f28979a.addOval(this.f28980b, Path.Direction.CCW);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: addPath-Uv8p0NA  reason: not valid java name */
    public void mo71634addPathUv8p0NA(@NotNull Path path, long j) {
        Intrinsics.checkNotNullParameter(path, "path");
        Path path2 = this.f28979a;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void addRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (m59760a(rect)) {
            this.f28980b.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
            this.f28979a.addRect(this.f28980b, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void addRoundRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "roundRect");
        this.f28980b.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        this.f28981c[0] = CornerRadius.m71477getXimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs());
        this.f28981c[1] = CornerRadius.m71478getYimpl(roundRect.m71552getTopLeftCornerRadiuskKHJgLs());
        this.f28981c[2] = CornerRadius.m71477getXimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs());
        this.f28981c[3] = CornerRadius.m71478getYimpl(roundRect.m71553getTopRightCornerRadiuskKHJgLs());
        this.f28981c[4] = CornerRadius.m71477getXimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs());
        this.f28981c[5] = CornerRadius.m71478getYimpl(roundRect.m71551getBottomRightCornerRadiuskKHJgLs());
        this.f28981c[6] = CornerRadius.m71477getXimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs());
        this.f28981c[7] = CornerRadius.m71478getYimpl(roundRect.m71550getBottomLeftCornerRadiuskKHJgLs());
        this.f28979a.addRoundRect(this.f28980b, this.f28981c, Path.Direction.CCW);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void arcTo(@NotNull Rect rect, float f, float f2, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f28980b.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.f28979a.arcTo(this.f28980b, f, f2, z);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public /* synthetic */ void arcToRad(Rect rect, float f, float f2, boolean z) {
        AbstractC18371Rh1.m66431a(this, rect, f, f2, z);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void close() {
        this.f28979a.close();
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28979a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    @NotNull
    public Rect getBounds() {
        this.f28979a.computeBounds(this.f28980b, true);
        RectF rectF = this.f28980b;
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: getFillType-Rg-k1Os  reason: not valid java name */
    public int mo71635getFillTypeRgk1Os() {
        if (this.f28979a.getFillType() == Path.FillType.EVEN_ODD) {
            return PathFillType.Companion.m71975getEvenOddRgk1Os();
        }
        return PathFillType.Companion.m71976getNonZeroRgk1Os();
    }

    @NotNull
    public final Path getInternalPath() {
        return this.f28979a;
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public boolean isConvex() {
        return this.f28979a.isConvex();
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public boolean isEmpty() {
        return this.f28979a.isEmpty();
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void lineTo(float f, float f2) {
        this.f28979a.lineTo(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void moveTo(float f, float f2) {
        this.f28979a.moveTo(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: op-N5in7k0  reason: not valid java name */
    public boolean mo71636opN5in7k0(@NotNull Path path1, @NotNull Path path2, int i) {
        Path.Op op;
        Intrinsics.checkNotNullParameter(path1, "path1");
        Intrinsics.checkNotNullParameter(path2, "path2");
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m71980equalsimpl0(i, companion.m71984getDifferenceb3I0S0c())) {
            op = Path.Op.DIFFERENCE;
        } else if (PathOperation.m71980equalsimpl0(i, companion.m71985getIntersectb3I0S0c())) {
            op = Path.Op.INTERSECT;
        } else if (PathOperation.m71980equalsimpl0(i, companion.m71986getReverseDifferenceb3I0S0c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (PathOperation.m71980equalsimpl0(i, companion.m71987getUnionb3I0S0c())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f28979a;
        if (path1 instanceof AndroidPath) {
            Path internalPath = ((AndroidPath) path1).getInternalPath();
            if (path2 instanceof AndroidPath) {
                return path.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.f28979a.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f28979a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void relativeLineTo(float f, float f2) {
        this.f28979a.rLineTo(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void relativeMoveTo(float f, float f2) {
        this.f28979a.rMoveTo(f, f2);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.f28979a.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void reset() {
        this.f28979a.reset();
    }

    @Override // androidx.compose.p003ui.graphics.Path
    public void rewind() {
        this.f28979a.rewind();
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: setFillType-oQ8Xj4U  reason: not valid java name */
    public void mo71637setFillTypeoQ8Xj4U(int i) {
        Path.FillType fillType;
        Path path = this.f28979a;
        if (PathFillType.m71971equalsimpl0(i, PathFillType.Companion.m71975getEvenOddRgk1Os())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: transform-58bKbWc  reason: not valid java name */
    public void mo71638transform58bKbWc(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        AndroidMatrixConversions_androidKt.m71614setFromEL8BTi8(this.f28982d, matrix);
        this.f28979a.transform(this.f28982d);
    }

    @Override // androidx.compose.p003ui.graphics.Path
    /* renamed from: translate-k-4lQ0M  reason: not valid java name */
    public void mo71639translatek4lQ0M(long j) {
        this.f28982d.reset();
        this.f28982d.setTranslate(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j));
        this.f28979a.transform(this.f28982d);
    }

    public AndroidPath(@NotNull Path internalPath) {
        Intrinsics.checkNotNullParameter(internalPath, "internalPath");
        this.f28979a = internalPath;
        this.f28980b = new RectF();
        this.f28981c = new float[8];
        this.f28982d = new Matrix();
    }

    public /* synthetic */ AndroidPath(Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Path() : path);
    }
}
