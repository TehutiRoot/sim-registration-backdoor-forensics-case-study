package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0018\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tR+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006R+\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010!\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\fR#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\"8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010%R4\u0010*\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "placementAnimationSpec", "<init>", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "", "cancelAnimation", "()V", "delta", "animatePlacementDelta--gyyYBs", "(J)V", "animatePlacementDelta", "onDetach", OperatorName.ENDPATH, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getPlacementAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setPlacementAnimationSpec", "", "<set-?>", "o", "Landroidx/compose/runtime/MutableState;", "isAnimationInProgress", "()Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Z)V", "p", OperatorName.SET_LINE_CAPSTYLE, "getRawOffset-nOcc-ac", "()J", "setRawOffset--gyyYBs", "rawOffset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", OperatorName.SAVE, "Landroidx/compose/animation/core/Animatable;", "placementDeltaAnimation", PDPageLabelRange.STYLE_ROMAN_LOWER, "getPlacementDelta-nOcc-ac", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "placementDelta", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutAnimateItemModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,135:1\n81#2:136\n107#2,2:137\n81#2:139\n107#2,2:140\n79#3:142\n*S KotlinDebug\n*F\n+ 1 LazyLayoutAnimateItemModifierNode.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode\n*L\n42#1:136\n42#1:137,2\n60#1:139\n60#1:140,2\n80#1:142\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemModifierNode extends Modifier.Node {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: s */
    public static final long f13611s = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: n */
    public FiniteAnimationSpec f13612n;

    /* renamed from: o */
    public final MutableState f13613o;

    /* renamed from: p */
    public long f13614p;

    /* renamed from: q */
    public final Animatable f13615q;

    /* renamed from: r */
    public final MutableState f13616r;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemModifierNode$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", OperatorName.SET_LINE_CAPSTYLE, "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac  reason: not valid java name */
        public final long m69637getNotInitializednOccac() {
            return LazyLayoutAnimateItemModifierNode.f13611s;
        }

        public Companion() {
        }
    }

    public LazyLayoutAnimateItemModifierNode(@NotNull FiniteAnimationSpec<IntOffset> placementAnimationSpec) {
        MutableState m31891g;
        MutableState m31891g2;
        Intrinsics.checkNotNullParameter(placementAnimationSpec, "placementAnimationSpec");
        this.f13612n = placementAnimationSpec;
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f13613o = m31891g;
        this.f13614p = f13611s;
        IntOffset.Companion companion = IntOffset.Companion;
        this.f13615q = new Animatable(IntOffset.m73767boximpl(companion.m73786getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, null, 12, null);
        m31891g2 = AbstractC19508dK1.m31891g(IntOffset.m73767boximpl(companion.m73786getZeronOccac()), null, 2, null);
        this.f13616r = m31891g2;
    }

    /* renamed from: a */
    public final void m61218a(boolean z) {
        this.f13613o.setValue(Boolean.valueOf(z));
    }

    /* renamed from: animatePlacementDelta--gyyYBs  reason: not valid java name */
    public final void m69633animatePlacementDeltagyyYBs(long j) {
        long m69634getPlacementDeltanOccac = m69634getPlacementDeltanOccac();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m73776getXimpl(m69634getPlacementDeltanOccac) - IntOffset.m73776getXimpl(j), IntOffset.m73777getYimpl(m69634getPlacementDeltanOccac) - IntOffset.m73777getYimpl(j));
        m61217b(IntOffset);
        m61218a(true);
        AbstractC1552Vc.m65753e(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1(this, IntOffset, null), 3, null);
    }

    /* renamed from: b */
    public final void m61217b(long j) {
        this.f13616r.setValue(IntOffset.m73767boximpl(j));
    }

    public final void cancelAnimation() {
        if (isAnimationInProgress()) {
            AbstractC1552Vc.m65753e(getCoroutineScope(), null, null, new LazyLayoutAnimateItemModifierNode$cancelAnimation$1(this, null), 3, null);
        }
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getPlacementAnimationSpec() {
        return this.f13612n;
    }

    /* renamed from: getPlacementDelta-nOcc-ac  reason: not valid java name */
    public final long m69634getPlacementDeltanOccac() {
        return ((IntOffset) this.f13616r.getValue()).m73785unboximpl();
    }

    /* renamed from: getRawOffset-nOcc-ac  reason: not valid java name */
    public final long m69635getRawOffsetnOccac() {
        return this.f13614p;
    }

    public final boolean isAnimationInProgress() {
        return ((Boolean) this.f13613o.getValue()).booleanValue();
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public void onDetach() {
        m61217b(IntOffset.Companion.m73786getZeronOccac());
        m61218a(false);
        this.f13614p = f13611s;
    }

    public final void setPlacementAnimationSpec(@NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        Intrinsics.checkNotNullParameter(finiteAnimationSpec, "<set-?>");
        this.f13612n = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs  reason: not valid java name */
    public final void m69636setRawOffsetgyyYBs(long j) {
        this.f13614p = j;
    }
}
