package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R/\u0010.\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00106\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010:\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001f\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b<\u0010=R%\u0010C\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0?¢\u0006\u0002\b@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010G\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "<init>", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/graphics/vector/GroupComponent;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "", OperatorName.CURVE_TO, "Z", "isDirty", "Landroidx/compose/ui/graphics/vector/DrawCache;", "d", "Landroidx/compose/ui/graphics/vector/DrawCache;", "cacheDrawScope", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateCallback$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", OperatorName.FILL_NON_ZERO, "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "value", OperatorName.NON_STROKING_GRAY, "F", "getViewportWidth", "()F", "setViewportWidth", "(F)V", "viewportWidth", OperatorName.CLOSE_PATH, "getViewportHeight", "setViewportHeight", "viewportHeight", "Landroidx/compose/ui/geometry/Size;", "i", OperatorName.SET_LINE_CAPSTYLE, "previousDrawSize", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/jvm/functions/Function1;", "drawVectorBlock", "getName", "setName", "(Ljava/lang/String;)V", "name", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,536:1\n81#2:537\n107#2,2:538\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n115#1:537\n115#1:538,2\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorComponent */
/* loaded from: classes2.dex */
public final class VectorComponent extends VNode {

    /* renamed from: b */
    public final GroupComponent f29578b;

    /* renamed from: c */
    public boolean f29579c;

    /* renamed from: d */
    public final DrawCache f29580d;

    /* renamed from: e */
    public Function0 f29581e;

    /* renamed from: f */
    public final MutableState f29582f;

    /* renamed from: g */
    public float f29583g;

    /* renamed from: h */
    public float f29584h;

    /* renamed from: i */
    public long f29585i;

    /* renamed from: j */
    public final Function1 f29586j;

    public VectorComponent() {
        super(null);
        MutableState m65148g;
        GroupComponent groupComponent = new GroupComponent();
        groupComponent.setPivotX(0.0f);
        groupComponent.setPivotY(0.0f);
        groupComponent.setInvalidateListener$ui_release(new VectorComponent$root$1$1(this));
        this.f29578b = groupComponent;
        this.f29579c = true;
        this.f29580d = new DrawCache();
        this.f29581e = VectorComponent$invalidateCallback$1.INSTANCE;
        m65148g = AbstractC19036aL1.m65148g(null, null, 2, null);
        this.f29582f = m65148g;
        this.f29585i = Size.Companion.m71763getUnspecifiedNHjbRc();
        this.f29586j = new VectorComponent$drawVectorBlock$1(this);
    }

    /* renamed from: a */
    public final void m59596a() {
        this.f29579c = true;
        this.f29581e.invoke();
    }

    public final void draw(@NotNull DrawScope drawScope, float f, @Nullable ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release();
        }
        if (this.f29579c || !Size.m71751equalsimpl0(this.f29585i, drawScope.mo72328getSizeNHjbRc())) {
            this.f29578b.setScaleX(Size.m71755getWidthimpl(drawScope.mo72328getSizeNHjbRc()) / this.f29583g);
            this.f29578b.setScaleY(Size.m71752getHeightimpl(drawScope.mo72328getSizeNHjbRc()) / this.f29584h);
            this.f29580d.m72427drawCachedImageCJJARo(IntSizeKt.IntSize((int) Math.ceil(Size.m71755getWidthimpl(drawScope.mo72328getSizeNHjbRc())), (int) Math.ceil(Size.m71752getHeightimpl(drawScope.mo72328getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.f29586j);
            this.f29579c = false;
            this.f29585i = drawScope.mo72328getSizeNHjbRc();
        }
        this.f29580d.drawInto(drawScope, f, colorFilter);
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.f29582f.getValue();
    }

    @NotNull
    public final Function0<Unit> getInvalidateCallback$ui_release() {
        return this.f29581e;
    }

    @NotNull
    public final String getName() {
        return this.f29578b.getName();
    }

    @NotNull
    public final GroupComponent getRoot() {
        return this.f29578b;
    }

    public final float getViewportHeight() {
        return this.f29584h;
    }

    public final float getViewportWidth() {
        return this.f29583g;
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.f29582f.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f29581e = function0;
    }

    public final void setName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f29578b.setName(value);
    }

    public final void setViewportHeight(float f) {
        if (this.f29584h != f) {
            this.f29584h = f;
            m59596a();
        }
    }

    public final void setViewportWidth(float f) {
        if (this.f29583g != f) {
            this.f29583g = f;
            m59596a();
        }
    }

    @NotNull
    public String toString() {
        String str = "Params: \tname: " + getName() + "\n\tviewportWidth: " + this.f29583g + "\n\tviewportHeight: " + this.f29584h + "\n";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Override // androidx.compose.p003ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        draw(drawScope, 1.0f, null);
    }
}