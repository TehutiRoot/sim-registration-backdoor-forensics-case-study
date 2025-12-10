package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {

    /* renamed from: a */
    public final AndroidWindowInsets f13310a;

    /* renamed from: b */
    public final View f13311b;

    /* renamed from: c */
    public final SideCalculator f13312c;

    /* renamed from: d */
    public final Density f13313d;

    /* renamed from: e */
    public WindowInsetsAnimationController f13314e;

    /* renamed from: f */
    public boolean f13315f;

    /* renamed from: g */
    public final CancellationSignal f13316g;

    /* renamed from: h */
    public float f13317h;

    /* renamed from: i */
    public Job f13318i;

    /* renamed from: j */
    public CancellableContinuation f13319j;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets windowInsets, View view, SideCalculator sideCalculator, Density density) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sideCalculator, "sideCalculator");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f13310a = windowInsets;
        this.f13311b = view;
        this.f13312c = sideCalculator;
        this.f13313d = density;
        this.f13316g = new CancellationSignal();
    }

    /* renamed from: h */
    public final void m61314h(float f) {
        Insets currentInsets;
        WindowInsetsAnimationController windowInsetsAnimationController = this.f13314e;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            Intrinsics.checkNotNullExpressionValue(currentInsets, "it.currentInsets");
            windowInsetsAnimationController.setInsetsAndAlpha(this.f13312c.adjustInsets(currentInsets, AbstractC21140mr0.roundToInt(f)), 1.0f, 0.0f);
        }
    }

    /* renamed from: i */
    public final void m61313i() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f13314e;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.f13314e) != null) {
                windowInsetsAnimationController.finish(this.f13310a.isVisible());
            }
        }
        this.f13314e = null;
        CancellableContinuation cancellableContinuation = this.f13319j;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(null, WindowInsetsNestedScrollConnection$animationEnded$1.INSTANCE);
        }
        this.f13319j = null;
        Job job = this.f13318i;
        if (job != null) {
            job.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
        }
        this.f13318i = null;
        this.f13317h = 0.0f;
        this.f13315f = false;
    }

    /* renamed from: j */
    public final void m61312j() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        CancellableContinuation cancellableContinuation = this.f13319j;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(null, WindowInsetsNestedScrollConnection$dispose$1.INSTANCE);
        }
        Job job = this.f13318i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f13314e;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!Intrinsics.areEqual(currentInsets, hiddenStateInsets));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m61311k(long r26, float r28, boolean r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m61311k(long, float, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: l */
    public final Object m61310l(Continuation continuation) {
        Object obj = this.f13314e;
        if (obj == null) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.f13319j = cancellableContinuationImpl;
            m61309m();
            obj = cancellableContinuationImpl.getResult();
            if (obj == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
        }
        return obj;
    }

    /* renamed from: m */
    public final void m61309m() {
        WindowInsetsController windowInsetsController;
        if (!this.f13315f) {
            this.f13315f = true;
            windowInsetsController = this.f13311b.getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.controlWindowInsetsAnimation(this.f13310a.getType$foundation_layout_release(), -1L, null, this.f13316g, AbstractC21356o52.m25969a(this));
            }
        }
    }

    /* renamed from: n */
    public final long m61308n(long j, float f) {
        boolean z;
        Insets hiddenStateInsets;
        Insets shownStateInsets;
        Insets currentInsets;
        int i;
        Job job = this.f13318i;
        if (job != null) {
            job.cancel((CancellationException) new WindowInsetsAnimationCancelledException());
            this.f13318i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f13314e;
        if (f != 0.0f) {
            boolean isVisible = this.f13310a.isVisible();
            int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (isVisible != z || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f13317h = 0.0f;
                    m61309m();
                    return this.f13312c.mo69545consumedOffsetsMKHz9U(j);
                }
                SideCalculator sideCalculator = this.f13312c;
                hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
                Intrinsics.checkNotNullExpressionValue(hiddenStateInsets, "animationController.hiddenStateInsets");
                int valueOf = sideCalculator.valueOf(hiddenStateInsets);
                SideCalculator sideCalculator2 = this.f13312c;
                shownStateInsets = windowInsetsAnimationController.getShownStateInsets();
                Intrinsics.checkNotNullExpressionValue(shownStateInsets, "animationController.shownStateInsets");
                int valueOf2 = sideCalculator2.valueOf(shownStateInsets);
                currentInsets = windowInsetsAnimationController.getCurrentInsets();
                Intrinsics.checkNotNullExpressionValue(currentInsets, "animationController.currentInsets");
                int valueOf3 = this.f13312c.valueOf(currentInsets);
                if (i2 > 0) {
                    i = valueOf2;
                } else {
                    i = valueOf;
                }
                if (valueOf3 == i) {
                    this.f13317h = 0.0f;
                    return Offset.Companion.m71518getZeroF1C5BW0();
                }
                float f2 = valueOf3 + f + this.f13317h;
                int coerceIn = AbstractC11719c.coerceIn(AbstractC21140mr0.roundToInt(f2), valueOf, valueOf2);
                this.f13317h = f2 - AbstractC21140mr0.roundToInt(f2);
                if (coerceIn != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f13312c.adjustInsets(currentInsets, coerceIn), 1.0f, 0.0f);
                }
                return this.f13312c.mo69545consumedOffsetsMKHz9U(j);
            }
        }
        return Offset.Companion.m71518getZeroF1C5BW0();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        m61313i();
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onFinished(WindowInsetsAnimationController controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        m61313i();
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return m61311k(j2, this.f13312c.showMotion(Velocity.m73883getXimpl(j2), Velocity.m73884getYimpl(j2)), true, continuation);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        return m61308n(j2, this.f13312c.showMotion(Offset.m71502getXimpl(j2), Offset.m71503getYimpl(j2)));
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo69447onPreFlingQWom1Mo(long j, Continuation continuation) {
        return m61311k(j, this.f13312c.hideMotion(Velocity.m73883getXimpl(j), Velocity.m73884getYimpl(j)), false, continuation);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo69448onPreScrollOzD1aCk(long j, int i) {
        return m61308n(j, this.f13312c.hideMotion(Offset.m71502getXimpl(j), Offset.m71503getYimpl(j)));
    }

    @Override // android.view.WindowInsetsAnimationControlListener
    public void onReady(WindowInsetsAnimationController controller, int i) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f13314e = controller;
        this.f13315f = false;
        CancellableContinuation cancellableContinuation = this.f13319j;
        if (cancellableContinuation != null) {
            cancellableContinuation.resume(controller, WindowInsetsNestedScrollConnection$onReady$1.INSTANCE);
        }
        this.f13319j = null;
    }
}
