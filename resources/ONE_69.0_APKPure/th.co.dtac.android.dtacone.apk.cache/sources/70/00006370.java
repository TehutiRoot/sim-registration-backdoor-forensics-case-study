package androidx.compose.p003ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.p003ui.geometry.CornerRadius;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidPath;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u000b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u000b\u0010\u0019J\u001b\u0010\u000f\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J3\u0010.\u001a\u00020\n*\u0004\u0018\u00010$2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00100R\u0016\u00102\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104R\u001f\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u00106R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00101R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00101R\u0018\u0010B\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00109R\u0018\u0010E\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001f\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bI\u00106R\u001f\u0010L\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\bK\u00106R\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00101R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u00109R\u0018\u0010T\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00109R\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0013\u0010[\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0011\u0010^\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010a\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006b"}, m29142d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "alpha", "", "clipToOutline", "elevation", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "update", "(Landroidx/compose/ui/graphics/Shape;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Z", "Landroidx/compose/ui/geometry/Offset;", "position", "isInOutline-k-4lQ0M", "(J)Z", "isInOutline", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/geometry/Size;", "size", "update-uvyYCjk", "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroidx/compose/ui/geometry/Rect;", "rect", "d", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "e", "(Landroidx/compose/ui/geometry/RoundRect;)V", "Landroidx/compose/ui/graphics/Path;", "composePath", OperatorName.CURVE_TO, "(Landroidx/compose/ui/graphics/Path;)V", TypedValues.CycleType.S_WAVE_OFFSET, "radius", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "Landroidx/compose/ui/unit/Density;", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "Landroid/graphics/Outline;", "cachedOutline", OperatorName.SET_LINE_CAPSTYLE, "Landroidx/compose/ui/graphics/Shape;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/graphics/Path;", "cachedRrectPath", OperatorName.NON_STROKING_GRAY, "outlinePath", OperatorName.CLOSE_PATH, "cacheIsDirty", "i", "usePathForClip", OperatorName.SET_LINE_JOINSTYLE, "tmpPath", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/ui/geometry/RoundRect;", "tmpRoundRect", OperatorName.LINE_TO, "F", "roundedCornerRadius", OperatorName.MOVE_TO, "rectTopLeft", OperatorName.ENDPATH, "rectSize", "o", "outlineNeeded", "p", "Landroidx/compose/ui/unit/LayoutDirection;", OperatorName.SAVE, "tmpTouchPointPath", PDPageLabelRange.STYLE_ROMAN_LOWER, "tmpOpPath", "Landroidx/compose/ui/graphics/Outline;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/graphics/Outline;", "calculatedOutline", "getOutline", "()Landroid/graphics/Outline;", "outline", "getOutlineClipSupported", "()Z", "outlineClipSupported", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
/* renamed from: androidx.compose.ui.platform.OutlineResolver */
/* loaded from: classes2.dex */
public final class OutlineResolver {

    /* renamed from: a */
    public Density f30799a;

    /* renamed from: b */
    public boolean f30800b;

    /* renamed from: c */
    public final Outline f30801c;

    /* renamed from: d */
    public long f30802d;

    /* renamed from: e */
    public Shape f30803e;

    /* renamed from: f */
    public Path f30804f;

    /* renamed from: g */
    public Path f30805g;

    /* renamed from: h */
    public boolean f30806h;

    /* renamed from: i */
    public boolean f30807i;

    /* renamed from: j */
    public Path f30808j;

    /* renamed from: k */
    public RoundRect f30809k;

    /* renamed from: l */
    public float f30810l;

    /* renamed from: m */
    public long f30811m;

    /* renamed from: n */
    public long f30812n;

    /* renamed from: o */
    public boolean f30813o;

    /* renamed from: p */
    public LayoutDirection f30814p;

    /* renamed from: q */
    public Path f30815q;

    /* renamed from: r */
    public Path f30816r;

    /* renamed from: s */
    public androidx.compose.p003ui.graphics.Outline f30817s;

    public OutlineResolver(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f30799a = density;
        this.f30800b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f30801c = outline;
        Size.Companion companion = Size.Companion;
        this.f30802d = companion.m71764getZeroNHjbRc();
        this.f30803e = RectangleShapeKt.getRectangleShape();
        this.f30811m = Offset.Companion.m71702getZeroF1C5BW0();
        this.f30812n = companion.m71764getZeroNHjbRc();
        this.f30814p = LayoutDirection.Ltr;
    }

    /* renamed from: a */
    public final boolean m59160a(RoundRect roundRect, long j, long j2, float f) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect) || roundRect.getLeft() != Offset.m71686getXimpl(j) || roundRect.getTop() != Offset.m71687getYimpl(j) || roundRect.getRight() != Offset.m71686getXimpl(j) + Size.m71755getWidthimpl(j2) || roundRect.getBottom() != Offset.m71687getYimpl(j) + Size.m71752getHeightimpl(j2) || CornerRadius.m71661getXimpl(roundRect.m71736getTopLeftCornerRadiuskKHJgLs()) != f) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void m59159b() {
        if (this.f30806h) {
            this.f30811m = Offset.Companion.m71702getZeroF1C5BW0();
            long j = this.f30802d;
            this.f30812n = j;
            this.f30810l = 0.0f;
            this.f30805g = null;
            this.f30806h = false;
            this.f30807i = false;
            if (this.f30813o && Size.m71755getWidthimpl(j) > 0.0f && Size.m71752getHeightimpl(this.f30802d) > 0.0f) {
                this.f30800b = true;
                androidx.compose.p003ui.graphics.Outline mo69543createOutlinePq9zytI = this.f30803e.mo69543createOutlinePq9zytI(this.f30802d, this.f30814p, this.f30799a);
                this.f30817s = mo69543createOutlinePq9zytI;
                if (mo69543createOutlinePq9zytI instanceof Outline.Rectangle) {
                    m59157d(((Outline.Rectangle) mo69543createOutlinePq9zytI).getRect());
                    return;
                } else if (mo69543createOutlinePq9zytI instanceof Outline.Rounded) {
                    m59156e(((Outline.Rounded) mo69543createOutlinePq9zytI).getRoundRect());
                    return;
                } else if (mo69543createOutlinePq9zytI instanceof Outline.Generic) {
                    m59158c(((Outline.Generic) mo69543createOutlinePq9zytI).getPath());
                    return;
                } else {
                    return;
                }
            }
            this.f30801c.setEmpty();
        }
    }

    /* renamed from: c */
    public final void m59158c(Path path) {
        if (Build.VERSION.SDK_INT <= 28 && !path.isConvex()) {
            this.f30800b = false;
            this.f30801c.setEmpty();
            this.f30807i = true;
        } else {
            android.graphics.Outline outline = this.f30801c;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.f30807i = !this.f30801c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f30805g = path;
    }

    public final void clipToOutline(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            AbstractC16859ul.m1055m(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.f30810l;
        if (f > 0.0f) {
            Path path = this.f30808j;
            RoundRect roundRect = this.f30809k;
            if (path == null || !m59160a(roundRect, this.f30811m, this.f30812n, f)) {
                RoundRect m71740RoundRectgG7oq9Y = RoundRectKt.m71740RoundRectgG7oq9Y(Offset.m71686getXimpl(this.f30811m), Offset.m71687getYimpl(this.f30811m), Offset.m71686getXimpl(this.f30811m) + Size.m71755getWidthimpl(this.f30812n), Offset.m71687getYimpl(this.f30811m) + Size.m71752getHeightimpl(this.f30812n), CornerRadiusKt.CornerRadius$default(this.f30810l, 0.0f, 2, null));
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m71740RoundRectgG7oq9Y);
                this.f30809k = m71740RoundRectgG7oq9Y;
                this.f30808j = path;
            }
            AbstractC16859ul.m1055m(canvas, path, 0, 2, null);
            return;
        }
        AbstractC16859ul.m1054n(canvas, Offset.m71686getXimpl(this.f30811m), Offset.m71687getYimpl(this.f30811m), Offset.m71686getXimpl(this.f30811m) + Size.m71755getWidthimpl(this.f30812n), Offset.m71687getYimpl(this.f30811m) + Size.m71752getHeightimpl(this.f30812n), 0, 16, null);
    }

    /* renamed from: d */
    public final void m59157d(Rect rect) {
        this.f30811m = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.f30812n = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.f30801c.setRect(AbstractC22237sr0.roundToInt(rect.getLeft()), AbstractC22237sr0.roundToInt(rect.getTop()), AbstractC22237sr0.roundToInt(rect.getRight()), AbstractC22237sr0.roundToInt(rect.getBottom()));
    }

    /* renamed from: e */
    public final void m59156e(RoundRect roundRect) {
        float m71661getXimpl = CornerRadius.m71661getXimpl(roundRect.m71736getTopLeftCornerRadiuskKHJgLs());
        this.f30811m = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.f30812n = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.f30801c.setRoundRect(AbstractC22237sr0.roundToInt(roundRect.getLeft()), AbstractC22237sr0.roundToInt(roundRect.getTop()), AbstractC22237sr0.roundToInt(roundRect.getRight()), AbstractC22237sr0.roundToInt(roundRect.getBottom()), m71661getXimpl);
            this.f30810l = m71661getXimpl;
            return;
        }
        Path path = this.f30804f;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.f30804f = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        m59158c(path);
    }

    @Nullable
    public final Path getClipPath() {
        m59159b();
        return this.f30805g;
    }

    @Nullable
    public final android.graphics.Outline getOutline() {
        m59159b();
        if (this.f30813o && this.f30800b) {
            return this.f30801c;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.f30807i;
    }

    /* renamed from: isInOutline-k-4lQ0M  reason: not valid java name */
    public final boolean m73233isInOutlinek4lQ0M(long j) {
        androidx.compose.p003ui.graphics.Outline outline;
        if (!this.f30813o || (outline = this.f30817s) == null) {
            return true;
        }
        return ShapeContainingUtilKt.isInOutline(outline, Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), this.f30815q, this.f30816r);
    }

    public final boolean update(@NotNull Shape shape, float f, boolean z, float f2, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
        boolean z2;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f30801c.setAlpha(f);
        boolean z3 = !Intrinsics.areEqual(this.f30803e, shape);
        if (z3) {
            this.f30803e = shape;
            this.f30806h = true;
        }
        if (!z && f2 <= 0.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f30813o != z2) {
            this.f30813o = z2;
            this.f30806h = true;
        }
        if (this.f30814p != layoutDirection) {
            this.f30814p = layoutDirection;
            this.f30806h = true;
        }
        if (!Intrinsics.areEqual(this.f30799a, density)) {
            this.f30799a = density;
            this.f30806h = true;
        }
        return z3;
    }

    /* renamed from: update-uvyYCjk  reason: not valid java name */
    public final void m73234updateuvyYCjk(long j) {
        if (!Size.m71751equalsimpl0(this.f30802d, j)) {
            this.f30802d = j;
            this.f30806h = true;
        }
    }
}