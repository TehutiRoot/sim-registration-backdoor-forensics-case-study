package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathMeasure;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R.\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R6\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R3\u00102\u001a\u00020+2\u0006\u0010\r\u001a\u00020+8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00106\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001c\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R*\u0010:\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001e\"\u0004\b9\u0010 R.\u0010>\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u0018R3\u0010C\u001a\u00020?2\u0006\u0010\r\u001a\u00020?8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b@\u0010-\u001a\u0004\bA\u0010/\"\u0004\bB\u00101R3\u0010H\u001a\u00020D2\u0006\u0010\r\u001a\u00020D8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/\"\u0004\bG\u00101R*\u0010L\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001c\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010 R*\u0010P\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u001c\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010 R*\u0010T\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u001c\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010 R*\u0010X\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010\u001c\u001a\u0004\bV\u0010\u001e\"\u0004\bW\u0010 R\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010`\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010gR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006q"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "value", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "name", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "setFill", "(Landroidx/compose/ui/graphics/Brush;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "setFillAlpha", "(F)V", "fillAlpha", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "e", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "setPathData", "(Ljava/util/List;)V", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", OperatorName.FILL_NON_ZERO, "I", "getPathFillType-Rg-k1Os", "()I", "setPathFillType-oQ8Xj4U", "(I)V", "pathFillType", OperatorName.NON_STROKING_GRAY, "getStrokeAlpha", "setStrokeAlpha", "strokeAlpha", OperatorName.CLOSE_PATH, "getStrokeLineWidth", "setStrokeLineWidth", "strokeLineWidth", "i", "getStroke", "setStroke", "stroke", "Landroidx/compose/ui/graphics/StrokeCap;", OperatorName.SET_LINE_JOINSTYLE, "getStrokeLineCap-KaPHkGw", "setStrokeLineCap-BeK7IIE", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", OperatorName.NON_STROKING_CMYK, "getStrokeLineJoin-LxFBmk8", "setStrokeLineJoin-Ww9F2mQ", "strokeLineJoin", OperatorName.LINE_TO, "getStrokeLineMiter", "setStrokeLineMiter", "strokeLineMiter", OperatorName.MOVE_TO, "getTrimPathStart", "setTrimPathStart", "trimPathStart", OperatorName.ENDPATH, "getTrimPathEnd", "setTrimPathEnd", "trimPathEnd", "o", "getTrimPathOffset", "setTrimPathOffset", "trimPathOffset", "", "p", "Z", "isPathDirty", OperatorName.SAVE, "isStrokeDirty", PDPageLabelRange.STYLE_ROMAN_LOWER, "isTrimPathDirty", "Landroidx/compose/ui/graphics/drawscope/Stroke;", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/graphics/drawscope/Stroke;", "strokeStyle", "Landroidx/compose/ui/graphics/Path;", "t", "Landroidx/compose/ui/graphics/Path;", ClientCookie.PATH_ATTR, "u", "renderPath", "Landroidx/compose/ui/graphics/PathMeasure;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Lkotlin/Lazy;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/ui/graphics/PathMeasure;", "pathMeasure", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,536:1\n1#2:537\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.PathComponent */
/* loaded from: classes2.dex */
public final class PathComponent extends VNode {

    /* renamed from: b */
    public String f29492b;

    /* renamed from: c */
    public Brush f29493c;

    /* renamed from: d */
    public float f29494d;

    /* renamed from: e */
    public List f29495e;

    /* renamed from: f */
    public int f29496f;

    /* renamed from: g */
    public float f29497g;

    /* renamed from: h */
    public float f29498h;

    /* renamed from: i */
    public Brush f29499i;

    /* renamed from: j */
    public int f29500j;

    /* renamed from: k */
    public int f29501k;

    /* renamed from: l */
    public float f29502l;

    /* renamed from: m */
    public float f29503m;

    /* renamed from: n */
    public float f29504n;

    /* renamed from: o */
    public float f29505o;

    /* renamed from: p */
    public boolean f29506p;

    /* renamed from: q */
    public boolean f29507q;

    /* renamed from: r */
    public boolean f29508r;

    /* renamed from: s */
    public Stroke f29509s;

    /* renamed from: t */
    public final Path f29510t;

    /* renamed from: u */
    public Path f29511u;

    /* renamed from: v */
    public final Lazy f29512v;

    public PathComponent() {
        super(null);
        this.f29492b = "";
        this.f29494d = 1.0f;
        this.f29495e = VectorKt.getEmptyPath();
        this.f29496f = VectorKt.getDefaultFillType();
        this.f29497g = 1.0f;
        this.f29500j = VectorKt.getDefaultStrokeLineCap();
        this.f29501k = VectorKt.getDefaultStrokeLineJoin();
        this.f29502l = 4.0f;
        this.f29504n = 1.0f;
        this.f29506p = true;
        this.f29507q = true;
        Path Path = AndroidPath_androidKt.Path();
        this.f29510t = Path;
        this.f29511u = Path;
        this.f29512v = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) PathComponent$pathMeasure$2.INSTANCE);
    }

    /* renamed from: a */
    public final PathMeasure m59602a() {
        return (PathMeasure) this.f29512v.getValue();
    }

    /* renamed from: b */
    public final void m59601b() {
        PathParserKt.toPath(this.f29495e, this.f29510t);
        m59600c();
    }

    /* renamed from: c */
    public final void m59600c() {
        if (this.f29503m == 0.0f && this.f29504n == 1.0f) {
            this.f29511u = this.f29510t;
            return;
        }
        if (Intrinsics.areEqual(this.f29511u, this.f29510t)) {
            this.f29511u = AndroidPath_androidKt.Path();
        } else {
            int mo71819getFillTypeRgk1Os = this.f29511u.mo71819getFillTypeRgk1Os();
            this.f29511u.rewind();
            this.f29511u.mo71821setFillTypeoQ8Xj4U(mo71819getFillTypeRgk1Os);
        }
        m59602a().setPath(this.f29510t, false);
        float length = m59602a().getLength();
        float f = this.f29503m;
        float f2 = this.f29505o;
        float f3 = ((f + f2) % 1.0f) * length;
        float f4 = ((this.f29504n + f2) % 1.0f) * length;
        if (f3 > f4) {
            m59602a().getSegment(f3, length, this.f29511u, true);
            m59602a().getSegment(0.0f, f4, this.f29511u, true);
            return;
        }
        m59602a().getSegment(f3, f4, this.f29511u, true);
    }

    @Override // androidx.compose.p003ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (this.f29506p) {
            m59601b();
        } else if (this.f29508r) {
            m59600c();
        }
        this.f29506p = false;
        this.f29508r = false;
        Brush brush = this.f29493c;
        if (brush != null) {
            AbstractC12264mK.m26710F(drawScope, this.f29511u, brush, this.f29494d, null, null, 0, 56, null);
        }
        Brush brush2 = this.f29499i;
        if (brush2 != null) {
            Stroke stroke = this.f29509s;
            if (this.f29507q || stroke == null) {
                stroke = new Stroke(this.f29498h, this.f29502l, this.f29500j, this.f29501k, null, 16, null);
                this.f29509s = stroke;
                this.f29507q = false;
            }
            AbstractC12264mK.m26710F(drawScope, this.f29511u, brush2, this.f29497g, stroke, null, 0, 48, null);
        }
    }

    @Nullable
    public final Brush getFill() {
        return this.f29493c;
    }

    public final float getFillAlpha() {
        return this.f29494d;
    }

    @NotNull
    public final String getName() {
        return this.f29492b;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.f29495e;
    }

    /* renamed from: getPathFillType-Rg-k1Os  reason: not valid java name */
    public final int m72436getPathFillTypeRgk1Os() {
        return this.f29496f;
    }

    @Nullable
    public final Brush getStroke() {
        return this.f29499i;
    }

    public final float getStrokeAlpha() {
        return this.f29497g;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw  reason: not valid java name */
    public final int m72437getStrokeLineCapKaPHkGw() {
        return this.f29500j;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8  reason: not valid java name */
    public final int m72438getStrokeLineJoinLxFBmk8() {
        return this.f29501k;
    }

    public final float getStrokeLineMiter() {
        return this.f29502l;
    }

    public final float getStrokeLineWidth() {
        return this.f29498h;
    }

    public final float getTrimPathEnd() {
        return this.f29504n;
    }

    public final float getTrimPathOffset() {
        return this.f29505o;
    }

    public final float getTrimPathStart() {
        return this.f29503m;
    }

    public final void setFill(@Nullable Brush brush) {
        this.f29493c = brush;
        invalidate();
    }

    public final void setFillAlpha(float f) {
        this.f29494d = f;
        invalidate();
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29492b = value;
        invalidate();
    }

    public final void setPathData(@NotNull List<? extends PathNode> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29495e = value;
        this.f29506p = true;
        invalidate();
    }

    /* renamed from: setPathFillType-oQ8Xj4U  reason: not valid java name */
    public final void m72439setPathFillTypeoQ8Xj4U(int i) {
        this.f29496f = i;
        this.f29511u.mo71821setFillTypeoQ8Xj4U(i);
        invalidate();
    }

    public final void setStroke(@Nullable Brush brush) {
        this.f29499i = brush;
        invalidate();
    }

    public final void setStrokeAlpha(float f) {
        this.f29497g = f;
        invalidate();
    }

    /* renamed from: setStrokeLineCap-BeK7IIE  reason: not valid java name */
    public final void m72440setStrokeLineCapBeK7IIE(int i) {
        this.f29500j = i;
        this.f29507q = true;
        invalidate();
    }

    /* renamed from: setStrokeLineJoin-Ww9F2mQ  reason: not valid java name */
    public final void m72441setStrokeLineJoinWw9F2mQ(int i) {
        this.f29501k = i;
        this.f29507q = true;
        invalidate();
    }

    public final void setStrokeLineMiter(float f) {
        this.f29502l = f;
        this.f29507q = true;
        invalidate();
    }

    public final void setStrokeLineWidth(float f) {
        this.f29498h = f;
        invalidate();
    }

    public final void setTrimPathEnd(float f) {
        if (this.f29504n != f) {
            this.f29504n = f;
            this.f29508r = true;
            invalidate();
        }
    }

    public final void setTrimPathOffset(float f) {
        if (this.f29505o != f) {
            this.f29505o = f;
            this.f29508r = true;
            invalidate();
        }
    }

    public final void setTrimPathStart(float f) {
        if (this.f29503m != f) {
            this.f29503m = f;
            this.f29508r = true;
            invalidate();
        }
    }

    @NotNull
    public String toString() {
        return this.f29510t.toString();
    }
}