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
public class C5238a {

    /* renamed from: f */
    public static final String f38472f = Logger.tagWithPrefix("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f38473a;

    /* renamed from: b */
    public final Clock f38474b;

    /* renamed from: c */
    public final int f38475c;

    /* renamed from: d */
    public final SystemAlarmDispatcher f38476d;

    /* renamed from: e */
    public final WorkConstraintsTracker f38477e;

    public C5238a(Context context, Clock clock, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f38473a = context;
        this.f38474b = clock;
        this.f38475c = i;
        this.f38476d = systemAlarmDispatcher;
        this.f38477e = new WorkConstraintsTracker(systemAlarmDispatcher.m52253e().getTrackers());
    }

    /* renamed from: a */
    public void m52244a() {
        List<WorkSpec> scheduledWork = this.f38476d.m52253e().getWorkDatabase().workSpecDao().getScheduledWork();
        ConstraintProxy.m52265a(this.f38473a, scheduledWork);
        ArrayList<WorkSpec> arrayList = new ArrayList(scheduledWork.size());
        long currentTimeMillis = this.f38474b.currentTimeMillis();
        for (WorkSpec workSpec : scheduledWork) {
            if (currentTimeMillis >= workSpec.calculateNextRunTime() && (!workSpec.hasConstraints() || this.f38477e.areAllConstraintsMet(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.f38608id;
            Intent m52282b = CommandHandler.m52282b(this.f38473a, WorkSpecKt.generationalId(workSpec2));
            Logger logger = Logger.get();
            String str2 = f38472f;
            logger.debug(str2, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f38476d.m52254d().getMainThreadExecutor().execute(new SystemAlarmDispatcher.RunnableC5235b(this.f38476d, m52282b, this.f38475c));
        }
    }
}
