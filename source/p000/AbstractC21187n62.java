package p000;

import androidx.work.WorkInfo;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC21187n62 {
    /* renamed from: a */
    public static void m26162a(WorkLauncher workLauncher, StartStopToken workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.startWork(workSpecId, null);
    }

    /* renamed from: b */
    public static void m26161b(WorkLauncher workLauncher, StartStopToken workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, WorkInfo.STOP_REASON_UNKNOWN);
    }

    /* renamed from: c */
    public static void m26160c(WorkLauncher workLauncher, StartStopToken workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        workLauncher.stopWork(workSpecId, i);
    }
}
