package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.PathFillType;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.runtime.Immutable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B\u009e\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b9\u00102\u001a\u0004\b:\u00104R \u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010!R \u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u00104R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u00104R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bE\u00102\u001a\u0004\bF\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", "name", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getPathData", "()Ljava/util/List;", OperatorName.CURVE_TO, "I", "getPathFillType-Rg-k1Os", "d", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "e", "F", "getFillAlpha", "()F", OperatorName.FILL_NON_ZERO, "getStroke", OperatorName.NON_STROKING_GRAY, "getStrokeAlpha", OperatorName.CLOSE_PATH, "getStrokeLineWidth", "i", "getStrokeLineCap-KaPHkGw", OperatorName.SET_LINE_JOINSTYLE, "getStrokeLineJoin-LxFBmk8", OperatorName.NON_STROKING_CMYK, "getStrokeLineMiter", OperatorName.LINE_TO, "getTrimPathStart", OperatorName.MOVE_TO, "getTrimPathEnd", OperatorName.ENDPATH, "getTrimPathOffset", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPath */
/* loaded from: classes2.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f29612a;

    /* renamed from: b */
    public final List f29613b;

    /* renamed from: c */
    public final int f29614c;

    /* renamed from: d */
    public final Brush f29615d;

    /* renamed from: e */
    public final float f29616e;

    /* renamed from: f */
    public final Brush f29617f;

    /* renamed from: g */
    public final float f29618g;

    /* renamed from: h */
    public final float f29619h;

    /* renamed from: i */
    public final int f29620i;

    /* renamed from: j */
    public final int f29621j;

    /* renamed from: k */
    public final float f29622k;

    /* renamed from: l */
    public final float f29623l;

    /* renamed from: m */
    public final float f29624m;

    /* renamed from: n */
    public final float f29625n;

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, brush, f, brush2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VectorPath.class == obj.getClass()) {
            VectorPath vectorPath = (VectorPath) obj;
            if (Intrinsics.areEqual(this.f29612a, vectorPath.f29612a) && Intrinsics.areEqual(this.f29615d, vectorPath.f29615d) && this.f29616e == vectorPath.f29616e && Intrinsics.areEqual(this.f29617f, vectorPath.f29617f) && this.f29618g == vectorPath.f29618g && this.f29619h == vectorPath.f29619h && StrokeCap.m72223equalsimpl0(this.f29620i, vectorPath.f29620i) && StrokeJoin.m72233equalsimpl0(this.f29621j, vectorPath.f29621j) && this.f29622k == vectorPath.f29622k && this.f29623l == vectorPath.f29623l && this.f29624m == vectorPath.f29624m && this.f29625n == vectorPath.f29625n && PathFillType.m72155equalsimpl0(this.f29614c, vectorPath.f29614c) && Intrinsics.areEqual(this.f29613b, vectorPath.f29613b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Nullable
    public final Brush getFill() {
        return this.f29615d;
    }

    public final float getFillAlpha() {
        return this.f29616e;
    }

    @NotNull
    public final String getName() {
        return this.f29612a;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.f29613b;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m72450getPathFillTypeRgk1Os() {
        return this.f29614c;
    }

    @Nullable
    public final Brush getStroke() {
        return this.f29617f;
    }

    public final float getStrokeAlpha() {
        return this.f29618g;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m72451getStrokeLineCapKaPHkGw() {
        return this.f29620i;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m72452getStrokeLineJoinLxFBmk8() {
        return this.f29621j;
    }

    public final float getStrokeLineMiter() {
        return this.f29622k;
    }

    public final float getStrokeLineWidth() {
        return this.f29619h;
    }

    public final float getTrimPathEnd() {
        return this.f29624m;
    }

    public final float getTrimPathOffset() {
        return this.f29625n;
    }

    public final float getTrimPathStart() {
        return this.f29623l;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f29612a.hashCode() * 31) + this.f29613b.hashCode()) * 31;
        Brush brush = this.f29615d;
        int i2 = 0;
        if (brush != null) {
            i = brush.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((hashCode + i) * 31) + Float.floatToIntBits(this.f29616e)) * 31;
        Brush brush2 = this.f29617f;
        if (brush2 != null) {
            i2 = brush2.hashCode();
        }
        return ((((((((((((((((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.f29618g)) * 31) + Float.floatToIntBits(this.f29619h)) * 31) + StrokeCap.m72224hashCodeimpl(this.f29620i)) * 31) + StrokeJoin.m72234hashCodeimpl(this.f29621j)) * 31) + Float.floatToIntBits(this.f29622k)) * 31) + Float.floatToIntBits(this.f29623l)) * 31) + Float.floatToIntBits(this.f29624m)) * 31) + Float.floatToIntBits(this.f29625n)) * 31) + PathFillType.m72156hashCodeimpl(this.f29614c);
    }

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, list, i, (i4 & 8) != 0 ? null : brush, (i4 & 16) != 0 ? 1.0f : f, (i4 & 32) != 0 ? null : brush2, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? 0.0f : f3, (i4 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2, (i4 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3, (i4 & 1024) != 0 ? 4.0f : f4, (i4 & 2048) != 0 ? 0.0f : f5, (i4 & 4096) != 0 ? 1.0f : f6, (i4 & 8192) != 0 ? 0.0f : f7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPath(String name, List pathData, int i, Brush brush, float f, Brush brush2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathData, "pathData");
        this.f29612a = name;
        this.f29613b = pathData;
        this.f29614c = i;
        this.f29615d = brush;
        this.f29616e = f;
        this.f29617f = brush2;
        this.f29618g = f2;
        this.f29619h = f3;
        this.f29620i = i2;
        this.f29621j = i3;
        this.f29622k = f4;
        this.f29623l = f5;
        this.f29624m = f6;
        this.f29625n = f7;
    }
}