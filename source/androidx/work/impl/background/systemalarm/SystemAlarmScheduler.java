package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmScheduler implements Scheduler {

    /* renamed from: b */
    public static final String f38467b = Logger.tagWithPrefix("SystemAlarmScheduler");

    /* renamed from: a */
    public final Context f38468a;

    public SystemAlarmScheduler(@NonNull Context context) {
        this.f38468a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m52246a(WorkSpec workSpec) {
        Logger logger = Logger.get();
        String str = f38467b;
        logger.debug(str, "Scheduling work with workSpecId " + workSpec.f38608id);
        this.f38468a.startService(CommandHandler.m52279e(this.f38468a, WorkSpecKt.generationalId(workSpec)));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        this.f38468a.startService(CommandHandler.m52277g(this.f38468a, str));
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            m52246a(workSpec);
        }
    }
}
