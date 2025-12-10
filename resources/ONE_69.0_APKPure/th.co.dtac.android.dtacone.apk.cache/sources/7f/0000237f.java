package androidx.compose.foundation;

import androidx.compose.p003ui.draw.CacheDrawModifierNode;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.RoundRectKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Outline;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.node.DelegatingNode;
import androidx.compose.p003ui.unit.C3623Dp;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u001a\u001a\u00020\u0012*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR3\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010\u000b\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00104\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m29142d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/unit/Dp;", "widthParameter", "Landroidx/compose/ui/graphics/Brush;", "brushParameter", "Landroidx/compose/ui/graphics/Shape;", "shapeParameter", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/draw/CacheDrawScope;", "brush", "Landroidx/compose/ui/graphics/Outline$Generic;", "outline", "", "fillArea", "", "strokeWidth", "Landroidx/compose/ui/draw/DrawResult;", OperatorName.CURVE_TO, "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Generic;ZF)Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/graphics/Outline$Rounded;", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "Landroidx/compose/ui/geometry/Size;", "borderSize", "d", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "Lec;", "p", "Lec;", "borderCache", "value", OperatorName.SAVE, "F", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "width", PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", OperatorName.CLOSE_AND_STROKE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "shape", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "t", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "drawWithCacheModifierNode", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n+ 2 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,512:1\n382#2,26:513\n408#2,4:540\n417#2,6:553\n423#2:580\n424#2,2:589\n1#3:539\n558#4,9:544\n567#4,8:581\n120#5,2:559\n173#5,6:561\n261#5,11:567\n122#5,2:578\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderModifierNode\n*L\n259#1:513,26\n259#1:540,4\n259#1:553,6\n259#1:580\n259#1:589,2\n259#1:539\n259#1:544,9\n259#1:581,8\n265#1:559,2\n277#1:561,6\n277#1:567,11\n265#1:578,2\n*E\n"})
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {

    /* renamed from: p */
    public C10156ec f12886p;

    /* renamed from: q */
    public float f12887q;

    /* renamed from: r */
    public Brush f12888r;

    /* renamed from: s */
    public Shape f12889s;

    /* renamed from: t */
    public final CacheDrawModifierNode f12890t;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
        if (androidx.compose.p003ui.graphics.ImageBitmapConfig.m72097equalsimpl(r14, r4) != false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.draw.DrawResult m61561c(androidx.compose.p003ui.draw.CacheDrawScope r46, androidx.compose.p003ui.graphics.Brush r47, androidx.compose.p003ui.graphics.Outline.Generic r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.m61561c(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* renamed from: d */
    public final DrawResult m61560d(CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j, long j2, boolean z, float f) {
        Path m61565b;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$1(z, brush, rounded.getRoundRect().m71736getTopLeftCornerRadiuskKHJgLs(), f / 2, f, j, j2, new Stroke(f, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.f12886p == null) {
            this.f12886p = new C10156ec(null, null, null, null, 15, null);
        }
        C10156ec c10156ec = this.f12886p;
        Intrinsics.checkNotNull(c10156ec);
        m61565b = BorderKt.m61565b(c10156ec.m31662g(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$2(m61565b, brush));
    }

    @NotNull
    public final Brush getBrush() {
        return this.f12888r;
    }

    @NotNull
    public final Shape getShape() {
        return this.f12889s;
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m69516getWidthD9Ej5fM() {
        return this.f12887q;
    }

    public final void setBrush(@NotNull Brush value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f12888r, value)) {
            this.f12888r = value;
            this.f12890t.invalidateDrawCache();
        }
    }

    public final void setShape(@NotNull Shape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(this.f12889s, value)) {
            this.f12889s = value;
            this.f12890t.invalidateDrawCache();
        }
    }

    /* renamed from: setWidth-0680j_4  reason: not valid java name */
    public final void m69517setWidth0680j_4(float f) {
        if (!C3623Dp.m73847equalsimpl0(this.f12887q, f)) {
            this.f12887q = f;
            this.f12890t.invalidateDrawCache();
        }
    }

    public BorderModifierNode(float f, Brush brushParameter, Shape shapeParameter) {
        Intrinsics.checkNotNullParameter(brushParameter, "brushParameter");
        Intrinsics.checkNotNullParameter(shapeParameter, "shapeParameter");
        this.f12887q = f;
        this.f12888r = brushParameter;
        this.f12889s = shapeParameter;
        this.f12890t = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }
}