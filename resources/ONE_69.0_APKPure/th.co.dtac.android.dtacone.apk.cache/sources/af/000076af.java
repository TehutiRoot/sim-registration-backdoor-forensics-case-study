package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public class C5220a {

    /* renamed from: f */
    public static final String f38560f = Logger.tagWithPrefix("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f38561a;

    /* renamed from: b */
    public final Clock f38562b;

    /* renamed from: c */
    public final int f38563c;

    /* renamed from: d */
    public final SystemAlarmDispatcher f38564d;

    /* renamed from: e */
    public final WorkConstraintsTracker f38565e;

    public C5220a(Context context, Clock clock, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f38561a = context;
        this.f38562b = clock;
        this.f38563c = i;
        this.f38564d = systemAlarmDispatcher;
        this.f38565e = new WorkConstraintsTracker(systemAlarmDispatcher.m52205e().getTrackers());
    }

    /* renamed from: a */
    public void m52196a() {
        List<WorkSpec> scheduledWork = this.f38564d.m52205e().getWorkDatabase().workSpecDao().getScheduledWork();
        ConstraintProxy.m52217a(this.f38561a, scheduledWork);
        ArrayList<WorkSpec> arrayList = new ArrayList(scheduledWork.size());
        long currentTimeMillis = this.f38562b.currentTimeMillis();
        for (WorkSpec workSpec : scheduledWork) {
            if (currentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || this.f38565e.areAllConstraintsMet(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.f38696id;
            Intent m52234b = CommandHandler.m52234b(this.f38561a, WorkSpecKt.generationalId(workSpec2));
            Logger logger = Logger.get();
            String str2 = f38560f;
            logger.debug(str2, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f38564d.m52206d().getMainThreadExecutor().execute(new SystemAlarmDispatcher.RunnableC5217b(this.f38564d, m52234b, this.f38563c));
        }
    }
}