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
    public final boolean f11623a;

    /* renamed from: b */
    public long f11624b;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    /* renamed from: a */
    public final void m62539a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f11624b;
        while (true) {
            long j2 = elapsedRealtime - j;
            if (j2 < 100) {
                long j3 = 100 - j2;
                try {
                    Logger.m63178d("OnEnableDisableSessionDurationCheck", "onDisableSession too soon, wait " + j3 + " ms");
                    Thread.sleep(j3);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j = this.f11624b;
                } catch (InterruptedException unused) {
                    Logger.m63176e("OnEnableDisableSessionDurationCheck", "sleep interrupted");
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.f11623a) {
            m62539a();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.f11623a) {
            this.f11624b = SystemClock.elapsedRealtime();
        }
    }

    public OnEnableDisableSessionDurationCheck(boolean z) {
        this.f11624b = 0L;
        this.f11623a = z;
    }
}