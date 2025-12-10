package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

@RequiresApi(21)
/* loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {

    /* renamed from: a */
    public final boolean f11535a;

    /* renamed from: b */
    public long f11536b;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    /* renamed from: a */
    public final void m62591a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f11536b;
        while (true) {
            long j2 = elapsedRealtime - j;
            if (j2 < 100) {
                long j3 = 100 - j2;
                try {
                    Logger.m63230d("OnEnableDisableSessionDurationCheck", "onDisableSession too soon, wait " + j3 + " ms");
                    Thread.sleep(j3);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j = this.f11536b;
                } catch (InterruptedException unused) {
                    Logger.m63228e("OnEnableDisableSessionDurationCheck", "sleep interrupted");
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.f11535a) {
            m62591a();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.f11535a) {
            this.f11536b = SystemClock.elapsedRealtime();
        }
    }

    public OnEnableDisableSessionDurationCheck(boolean z) {
        this.f11536b = 0L;
        this.f11535a = z;
    }
}
