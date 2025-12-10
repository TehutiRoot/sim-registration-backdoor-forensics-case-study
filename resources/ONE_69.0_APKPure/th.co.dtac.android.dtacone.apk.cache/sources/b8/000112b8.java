package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicy;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\u00020\u000f*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonContentMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/AnimationSpec;)V", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", OperatorName.CURVE_TO, "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "()Landroidx/compose/animation/core/Animatable;", "setAnimatable", "(Landroidx/compose/animation/core/Animatable;)V", "animatable", "d", "Ljava/lang/Integer;", "initialOffset", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSegmentedButtonRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonContentMeasurePolicy\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,643:1\n1549#2:644\n1620#2,3:645\n1940#2,14:648\n1549#2:662\n1620#2,3:663\n1940#2,14:666\n1940#2,14:680\n1#3:694\n*S KotlinDebug\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonContentMeasurePolicy\n*L\n245#1:644\n245#1:645,3\n246#1:648,14\n247#1:662\n247#1:663,3\n248#1:666,14\n249#1:680,14\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonContentMeasurePolicy */
/* loaded from: classes7.dex */
public final class SegmentedButtonContentMeasurePolicy implements MultiContentMeasurePolicy {

    /* renamed from: a */
    public final CoroutineScope f82991a;

    /* renamed from: b */
    public final AnimationSpec f82992b;

    /* renamed from: c */
    public Animatable f82993c;

    /* renamed from: d */
    public Integer f82994d;

    public SegmentedButtonContentMeasurePolicy(@NotNull CoroutineScope scope, @NotNull AnimationSpec<Integer> animationSpec) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f82991a = scope;
        this.f82992b = animationSpec;
    }

    @Nullable
    public final Animatable<Integer, AnimationVector1D> getAnimatable() {
        return this.f82993c;
    }

    @NotNull
    public final AnimationSpec<Integer> getAnimationSpec() {
        return this.f82992b;
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.f82991a;
    }

    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC20755kG0.m29233a(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC20755kG0.m29232b(this, intrinsicMeasureScope, list, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[LOOP:2: B:18:0x008b->B:20:0x0091, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    @org.jetbrains.annotations.NotNull
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.p003ui.layout.MeasureResult mo73026measure3p2s80s(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.layout.MeasureScope r20, @org.jetbrains.annotations.NotNull java.util.List<? extends java.util.List<? extends androidx.compose.p003ui.layout.Measurable>> r21, long r22) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonContentMeasurePolicy.mo73026measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC20755kG0.m29231c(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC20755kG0.m29230d(this, intrinsicMeasureScope, list, i);
    }

    public final void setAnimatable(@Nullable Animatable<Integer, AnimationVector1D> animatable) {
        this.f82993c = animatable;
    }
}