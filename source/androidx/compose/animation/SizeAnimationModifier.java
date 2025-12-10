package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* renamed from: a */
    public final AnimationSpec f12389a;

    /* renamed from: b */
    public final CoroutineScope f12390b;

    /* renamed from: c */
    public Function2 f12391c;

    /* renamed from: d */
    public final MutableState f12392d;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\nR+\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m28850d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "anim", "startSize", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2-YbymL2g", "()J", "component2", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Animatable;", "getAnim", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class AnimData {
        public static final int $stable = 8;

        /* renamed from: a */
        public final Animatable f12393a;

        /* renamed from: b */
        public long f12394b;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
        public static /* synthetic */ AnimData m69243copyO0kMr_c$default(AnimData animData, Animatable animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.f12393a;
            }
            if ((i & 2) != 0) {
                j = animData.f12394b;
            }
            return animData.m69245copyO0kMr_c(animatable, j);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.f12393a;
        }

        /* renamed from: component2-YbymL2g  reason: not valid java name */
        public final long m69244component2YbymL2g() {
            return this.f12394b;
        }

        @NotNull
        /* renamed from: copy-O0kMr_c  reason: not valid java name */
        public final AnimData m69245copyO0kMr_c(@NotNull Animatable<IntSize, AnimationVector2D> anim, long j) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            return new AnimData(anim, j, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AnimData) {
                AnimData animData = (AnimData) obj;
                return Intrinsics.areEqual(this.f12393a, animData.f12393a) && IntSize.m73816equalsimpl0(this.f12394b, animData.f12394b);
            }
            return false;
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.f12393a;
        }

        /* renamed from: getStartSize-YbymL2g  reason: not valid java name */
        public final long m69246getStartSizeYbymL2g() {
            return this.f12394b;
        }

        public int hashCode() {
            return (this.f12393a.hashCode() * 31) + IntSize.m73819hashCodeimpl(this.f12394b);
        }

        /* renamed from: setStartSize-ozmzZPI  reason: not valid java name */
        public final void m69247setStartSizeozmzZPI(long j) {
            this.f12394b = j;
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.f12393a + ", startSize=" + ((Object) IntSize.m73821toStringimpl(this.f12394b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public AnimData(Animatable anim, long j) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            this.f12393a = anim;
            this.f12394b = j;
        }
    }

    public SizeAnimationModifier(AnimationSpec animSpec, CoroutineScope scope) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f12389a = animSpec;
        this.f12390b = scope;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f12392d = m31891g;
    }

    /* renamed from: c */
    public final long m61723c(long j) {
        AnimData m61722d = m61722d();
        if (m61722d != null) {
            if (!IntSize.m73816equalsimpl0(j, m61722d.getAnim().getTargetValue().m73822unboximpl())) {
                m61722d.m69247setStartSizeozmzZPI(m61722d.getAnim().getValue().m73822unboximpl());
                AbstractC1552Vc.m65753e(this.f12390b, null, null, new SizeAnimationModifier$animateTo$data$1$1(m61722d, j, this, null), 3, null);
            }
        } else {
            m61722d = new AnimData(new Animatable(IntSize.m73810boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m73810boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), j, null);
        }
        m61719g(m61722d);
        return m61722d.getAnim().getValue().m73822unboximpl();
    }

    /* renamed from: d */
    public final AnimData m61722d() {
        return (AnimData) this.f12392d.getValue();
    }

    /* renamed from: e */
    public final AnimationSpec m61721e() {
        return this.f12389a;
    }

    /* renamed from: f */
    public final Function2 m61720f() {
        return this.f12391c;
    }

    /* renamed from: g */
    public final void m61719g(AnimData animData) {
        this.f12392d.setValue(animData);
    }

    /* renamed from: h */
    public final void m61718h(Function2 function2) {
        this.f12391c = function2;
    }

    @Override // androidx.compose.p003ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69160measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        long m61723c = m61723c(IntSizeKt.IntSize(mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight()));
        return MeasureScope.CC.m59532q(measure, IntSize.m73818getWidthimpl(m61723c), IntSize.m73817getHeightimpl(m61723c), null, new SizeAnimationModifier$measure$1(mo72811measureBRTryo0), 4, null);
    }
}
