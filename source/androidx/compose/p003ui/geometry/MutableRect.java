package androidx.compose.p003ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u0012\u0010%\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0012\u0010'\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u001a\u0010+\u001a\u00020(8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006."}, m28850d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "", "intersect", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "", "contains-k-4lQ0M", "(J)Z", "contains", "set", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getLeft", "()F", "setLeft", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop", "setTop", OperatorName.CURVE_TO, "getRight", "setRight", "d", "getBottom", "setBottom", "getWidth", "width", "getHeight", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "size", "isEmpty", "()Z", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,101:1\n40#1,5:102\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:102,5\n*E\n"})
/* renamed from: androidx.compose.ui.geometry.MutableRect */
/* loaded from: classes2.dex */
public final class MutableRect {
    public static final int $stable = 8;

    /* renamed from: a */
    public float f28943a;

    /* renamed from: b */
    public float f28944b;

    /* renamed from: c */
    public float f28945c;

    /* renamed from: d */
    public float f28946d;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.f28943a = f;
        this.f28944b = f2;
        this.f28945c = f3;
        this.f28946d = f4;
    }

    /* renamed from: contains-k-4lQ0M  reason: not valid java name */
    public final boolean m71489containsk4lQ0M(long j) {
        if (Offset.m71502getXimpl(j) >= this.f28943a && Offset.m71502getXimpl(j) < this.f28945c && Offset.m71503getYimpl(j) >= this.f28944b && Offset.m71503getYimpl(j) < this.f28946d) {
            return true;
        }
        return false;
    }

    public final float getBottom() {
        return this.f28946d;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.f28943a;
    }

    public final float getRight() {
        return this.f28945c;
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public final long m71490getSizeNHjbRc() {
        return SizeKt.Size(getRight() - getLeft(), getBottom() - getTop());
    }

    public final float getTop() {
        return this.f28944b;
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    @Stable
    public final void intersect(float f, float f2, float f3, float f4) {
        this.f28943a = Math.max(f, this.f28943a);
        this.f28944b = Math.max(f2, this.f28944b);
        this.f28945c = Math.min(f3, this.f28945c);
        this.f28946d = Math.min(f4, this.f28946d);
    }

    public final boolean isEmpty() {
        if (this.f28943a < this.f28945c && this.f28944b < this.f28946d) {
            return false;
        }
        return true;
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.f28943a = f;
        this.f28944b = f2;
        this.f28945c = f3;
        this.f28946d = f4;
    }

    public final void setBottom(float f) {
        this.f28946d = f;
    }

    public final void setLeft(float f) {
        this.f28943a = f;
    }

    public final void setRight(float f) {
        this.f28945c = f;
    }

    public final void setTop(float f) {
        this.f28944b = f;
    }

    @NotNull
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.f28943a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28944b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28945c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28946d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
