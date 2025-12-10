package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\\\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R5\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m29142d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "alignment", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "size", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "", "clip", "<init>", "(Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "component1", "()Landroidx/compose/ui/Alignment;", "component2", "()Lkotlin/jvm/functions/Function1;", "component3", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "component4", "()Z", "copy", "(Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)Landroidx/compose/animation/ChangeSize;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/Alignment;", "getAlignment", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getSize", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "d", "Z", "getClip", "animation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ChangeSize {

    /* renamed from: a */
    public final Alignment f12441a;

    /* renamed from: b */
    public final Function1 f12442b;

    /* renamed from: c */
    public final FiniteAnimationSpec f12443c;

    /* renamed from: d */
    public final boolean f12444d;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.animation.ChangeSize$1 */
    /* loaded from: classes.dex */
    public static final class C27101 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C27101 INSTANCE = new C27101();

        public C27101() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m73994boximpl(m69401invokemzRDjE0(intSize.m74006unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0  reason: not valid java name */
        public final long m69401invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    public ChangeSize(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f12441a = alignment;
        this.f12442b = size;
        this.f12443c = animationSpec;
        this.f12444d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = changeSize.f12441a;
        }
        if ((i & 2) != 0) {
            function1 = changeSize.f12442b;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = changeSize.f12443c;
        }
        if ((i & 8) != 0) {
            z = changeSize.f12444d;
        }
        return changeSize.copy(alignment, function1, finiteAnimationSpec, z);
    }

    @NotNull
    public final Alignment component1() {
        return this.f12441a;
    }

    @NotNull
    public final Function1<IntSize, IntSize> component2() {
        return this.f12442b;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.f12443c;
    }

    public final boolean component4() {
        return this.f12444d;
    }

    @NotNull
    public final ChangeSize copy(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ChangeSize(alignment, size, animationSpec, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeSize) {
            ChangeSize changeSize = (ChangeSize) obj;
            return Intrinsics.areEqual(this.f12441a, changeSize.f12441a) && Intrinsics.areEqual(this.f12442b, changeSize.f12442b) && Intrinsics.areEqual(this.f12443c, changeSize.f12443c) && this.f12444d == changeSize.f12444d;
        }
        return false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.f12441a;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.f12443c;
    }

    public final boolean getClip() {
        return this.f12444d;
    }

    @NotNull
    public final Function1<IntSize, IntSize> getSize() {
        return this.f12442b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f12441a.hashCode() * 31) + this.f12442b.hashCode()) * 31) + this.f12443c.hashCode()) * 31;
        boolean z = this.f12444d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "ChangeSize(alignment=" + this.f12441a + ", size=" + this.f12442b + ", animationSpec=" + this.f12443c + ", clip=" + this.f12444d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ChangeSize(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (i & 2) != 0 ? C27101.INSTANCE : function1, finiteAnimationSpec, (i & 8) != 0 ? true : z);
    }
}