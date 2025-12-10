package androidx.compose.runtime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010#\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m29142d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "", TypedValues.CycleType.S_WAVE_OFFSET, "<init>", "(Landroidx/compose/runtime/Applier;I)V", "node", "", "down", "(Ljava/lang/Object;)V", "up", "()V", FirebaseAnalytics.Param.INDEX, "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", ProductAction.ACTION_REMOVE, "(II)V", "from", TypedValues.TransitionType.S_TO, "move", "(III)V", "clear", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/runtime/Applier;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", OperatorName.CURVE_TO, "nesting", "getCurrent", "()Ljava/lang/Object;", "current", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,288:1\n4548#2,5:289\n4548#2,5:294\n*S KotlinDebug\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/OffsetApplier\n*L\n263#1:289,5\n286#1:294,5\n*E\n"})
/* loaded from: classes2.dex */
public final class OffsetApplier<N> implements Applier<N> {

    /* renamed from: a */
    public final Applier f28447a;

    /* renamed from: b */
    public final int f28448b;

    /* renamed from: c */
    public int f28449c;

    public OffsetApplier(@NotNull Applier<N> applier, int i) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f28447a = applier;
        this.f28448b = i;
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ComposerKt.composeRuntimeError("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(N n) {
        this.f28449c++;
        this.f28447a.down(n);
    }

    @Override // androidx.compose.runtime.Applier
    public N getCurrent() {
        return (N) this.f28447a.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int i, N n) {
        int i2;
        Applier applier = this.f28447a;
        if (this.f28449c == 0) {
            i2 = this.f28448b;
        } else {
            i2 = 0;
        }
        applier.insertBottomUp(i + i2, n);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int i, N n) {
        int i2;
        Applier applier = this.f28447a;
        if (this.f28449c == 0) {
            i2 = this.f28448b;
        } else {
            i2 = 0;
        }
        applier.insertTopDown(i + i2, n);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int i, int i2, int i3) {
        int i4;
        if (this.f28449c == 0) {
            i4 = this.f28448b;
        } else {
            i4 = 0;
        }
        this.f28447a.move(i + i4, i2 + i4, i3);
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onBeginChanges() {
        AbstractC12173l6.m26865a(this);
    }

    @Override // androidx.compose.runtime.Applier
    public /* synthetic */ void onEndChanges() {
        AbstractC12173l6.m26864b(this);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int i, int i2) {
        int i3;
        Applier applier = this.f28447a;
        if (this.f28449c == 0) {
            i3 = this.f28448b;
        } else {
            i3 = 0;
        }
        applier.remove(i + i3, i2);
    }

    @Override // androidx.compose.runtime.Applier
    /* renamed from: up */
    public void mo60214up() {
        boolean z;
        int i = this.f28449c;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f28449c = i - 1;
            this.f28447a.mo60214up();
            return;
        }
        ComposerKt.composeRuntimeError("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }
}