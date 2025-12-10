package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u001b\u0010'\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b&\u0010#R+\u0010.\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u0017R+\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b/\u0010#\"\u0004\b1\u0010\u001aR+\u00104\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u00100\u001a\u0004\b)\u0010#\"\u0004\b3\u0010\u001aR+\u00108\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u0010#\"\u0004\b7\u0010\u001aR+\u0010:\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b5\u0010#\"\u0004\b9\u0010\u001aR\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010<R\u0011\u0010?\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010#R\u0014\u0010\u0015\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010,R\u0014\u0010B\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010#R\u0014\u0010\n\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010#¨\u0006D"}, m28850d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "Lkotlinx/coroutines/CoroutineScope;", "animationScope", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "pullDelta", "onPull$material_release", "(F)F", "onPull", "velocity", "onRelease$material_release", "onRelease", "", "refreshing", "setRefreshing$material_release", "(Z)V", "setRefreshing", "setThreshold$material_release", "(F)V", "setThreshold", "setRefreshingOffset$material_release", "setRefreshingOffset", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlinx/coroutines/Job;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(F)Lkotlinx/coroutines/Job;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()F", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/runtime/State;", OperatorName.CURVE_TO, "adjustedDistancePulled", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", OperatorName.FILL_NON_ZERO, "()Z", OperatorName.NON_STROKING_CMYK, "_refreshing", "e", "Landroidx/compose/runtime/MutableFloatState;", OperatorName.SET_LINE_JOINSTYLE, "_position", "i", "distancePulled", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, OperatorName.MOVE_TO, "_threshold", OperatorName.LINE_TO, "_refreshingOffset", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;", "mutatorMutex", "getProgress", "progress", "getRefreshing$material_release", "getPosition$material_release", "position", "getThreshold$material_release", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,234:1\n81#2:235\n81#2:236\n107#2,2:237\n75#3:239\n108#3,2:240\n75#3:242\n108#3,2:243\n75#3:245\n108#3,2:246\n75#3:248\n108#3,2:249\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n122#1:235\n124#1:236\n124#1:237,2\n125#1:239\n125#1:240,2\n126#1:242\n126#1:243,2\n127#1:245\n127#1:246,2\n128#1:248\n128#1:249,2\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;

    /* renamed from: a */
    public final CoroutineScope f25446a;

    /* renamed from: b */
    public final State f25447b;

    /* renamed from: c */
    public final State f25448c;

    /* renamed from: d */
    public final MutableState f25449d;

    /* renamed from: e */
    public final MutableFloatState f25450e;

    /* renamed from: f */
    public final MutableFloatState f25451f;

    /* renamed from: g */
    public final MutableFloatState f25452g;

    /* renamed from: h */
    public final MutableFloatState f25453h;

    /* renamed from: i */
    public final MutatorMutex f25454i;

    public PullRefreshState(@NotNull CoroutineScope animationScope, @NotNull State<? extends Function0<Unit>> onRefreshState, float f, float f2) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(onRefreshState, "onRefreshState");
        this.f25446a = animationScope;
        this.f25447b = onRefreshState;
        this.f25448c = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));
        m31891g = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f25449d = m31891g;
        this.f25450e = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f25451f = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.f25452g = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.f25453h = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.f25454i = new MutatorMutex();
    }

    /* renamed from: a */
    public final Job m60742a(float f) {
        Job m65753e;
        m65753e = AbstractC1552Vc.m65753e(this.f25446a, null, null, new PullRefreshState$animateIndicatorTo$1(this, f, null), 3, null);
        return m65753e;
    }

    /* renamed from: b */
    public final float m60741b() {
        if (m60740c() <= getThreshold$material_release()) {
            return m60740c();
        }
        float coerceIn = AbstractC11719c.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (coerceIn - (((float) Math.pow(coerceIn, 2)) / 4)));
    }

    /* renamed from: c */
    public final float m60740c() {
        return ((Number) this.f25448c.getValue()).floatValue();
    }

    /* renamed from: d */
    public final float m60739d() {
        return this.f25451f.getFloatValue();
    }

    /* renamed from: e */
    public final float m60738e() {
        return this.f25450e.getFloatValue();
    }

    /* renamed from: f */
    public final boolean m60737f() {
        return ((Boolean) this.f25449d.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final float m60736g() {
        return this.f25453h.getFloatValue();
    }

    public final float getPosition$material_release() {
        return m60738e();
    }

    public final float getProgress() {
        return m60740c() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return m60737f();
    }

    public final float getThreshold$material_release() {
        return m60735h();
    }

    /* renamed from: h */
    public final float m60735h() {
        return this.f25452g.getFloatValue();
    }

    /* renamed from: i */
    public final void m60734i(float f) {
        this.f25451f.setFloatValue(f);
    }

    /* renamed from: j */
    public final void m60733j(float f) {
        this.f25450e.setFloatValue(f);
    }

    /* renamed from: k */
    public final void m60732k(boolean z) {
        this.f25449d.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void m60731l(float f) {
        this.f25453h.setFloatValue(f);
    }

    /* renamed from: m */
    public final void m60730m(float f) {
        this.f25452g.setFloatValue(f);
    }

    public final float onPull$material_release(float f) {
        if (m60737f()) {
            return 0.0f;
        }
        float coerceAtLeast = AbstractC11719c.coerceAtLeast(m60739d() + f, 0.0f);
        float m60739d = coerceAtLeast - m60739d();
        m60734i(coerceAtLeast);
        m60733j(m60741b());
        return m60739d;
    }

    public final float onRelease$material_release(float f) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (m60740c() > getThreshold$material_release()) {
            ((Function0) this.f25447b.getValue()).invoke();
        }
        m60742a(0.0f);
        if (m60739d() == 0.0f || f < 0.0f) {
            f = 0.0f;
        }
        m60734i(0.0f);
        return f;
    }

    public final void setRefreshing$material_release(boolean z) {
        if (m60737f() != z) {
            m60732k(z);
            float f = 0.0f;
            m60734i(0.0f);
            if (z) {
                f = m60736g();
            }
            m60742a(f);
        }
    }

    public final void setRefreshingOffset$material_release(float f) {
        if (m60736g() != f) {
            m60731l(f);
            if (getRefreshing$material_release()) {
                m60742a(f);
            }
        }
    }

    public final void setThreshold$material_release(float f) {
        m60730m(f);
    }
}
