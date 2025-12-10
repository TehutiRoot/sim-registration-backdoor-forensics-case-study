package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.Schedulers;
import androidx.work.impl.background.systemalarm.SystemAlarmScheduler;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class Schedulers {
    public static final String GCM_SCHEDULER = "androidx.work.impl.background.gcm.GcmScheduler";

    /* renamed from: a */
    public static final String f38314a = Logger.tagWithPrefix("Schedulers");

    /* renamed from: a */
    public static /* synthetic */ void m52340a(Executor executor, List list, Configuration configuration, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, boolean z) {
        m52336e(executor, list, configuration, workDatabase, workGenerationalId, z);
    }

    /* renamed from: b */
    public static /* synthetic */ void m52339b(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        m52337d(list, workGenerationalId, configuration, workDatabase);
    }

    /* renamed from: c */
    public static Scheduler m52338c(Context context, WorkDatabase workDatabase, Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 23) {
            SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workDatabase, configuration);
            PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
            Logger.get().debug(f38314a, "Created SystemJobScheduler and enabled SystemJobService");
            return systemJobScheduler;
        }
        Scheduler m52334g = m52334g(context, configuration.getClock());
        if (m52334g == null) {
            SystemAlarmScheduler systemAlarmScheduler = new SystemAlarmScheduler(context);
            PackageManagerHelper.setComponentEnabled(context, SystemAlarmService.class, true);
            Logger.get().debug(f38314a, "Created SystemAlarmScheduler");
            return systemAlarmScheduler;
        }
        return m52334g;
    }

    /* renamed from: d */
    public static /* synthetic */ void m52337d(List list, WorkGenerationalId workGenerationalId, Configuration configuration, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).cancel(workGenerationalId.getWorkSpecId());
        }
        schedule(configuration, workDatabase, list);
    }

    /* renamed from: e */
    public static /* synthetic */ void m52336e(Executor executor, final List list, final Configuration configuration, final WorkDatabase workDatabase, final WorkGenerationalId workGenerationalId, boolean z) {
        executor.execute(new Runnable() { // from class: uE1
            @Override // java.lang.Runnable
            public final void run() {
                Schedulers.m52339b(list, workGenerationalId, configuration, workDatabase);
            }
        });
    }

    /* renamed from: f */
    public static void m52335f(WorkSpecDao workSpecDao, Clock clock, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = clock.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(((WorkSpec) it.next()).f38608id, currentTimeMillis);
            }
        }
    }

    /* renamed from: g */
    public static Scheduler m52334g(Context context, Clock clock) {
        try {
            Scheduler scheduler = (Scheduler) Class.forName(GCM_SCHEDULER).getConstructor(Context.class, Clock.class).newInstance(context, clock);
            Logger.get().debug(f38314a, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return scheduler;
        } catch (Throwable th2) {
            Logger.get().debug(f38314a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }

    public static void registerRescheduling(@NonNull final List<Scheduler> list, @NonNull Processor processor, @NonNull final Executor executor, @NonNull final WorkDatabase workDatabase, @NonNull final Configuration configuration) {
        processor.addExecutionListener(new ExecutionListener() { // from class: tE1
            @Override // androidx.work.impl.ExecutionListener
            public final void onExecuted(WorkGenerationalId workGenerationalId, boolean z) {
                Schedulers.m52340a(executor, list, configuration, workDatabase, workGenerationalId, z);
            }
        });
    }

    public static void schedule(@NonNull Configuration configuration, @NonNull WorkDatabase workDatabase, @Nullable List<Scheduler> list) {
        List<WorkSpec> list2;
        if (list != null && list.size() != 0) {
            WorkSpecDao workSpecDao = workDatabase.workSpecDao();
            workDatabase.beginTransaction();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    list2 = workSpecDao.getEligibleWorkForSchedulingWithContentUris();
                    m52335f(workSpecDao, configuration.getClock(), list2);
                } else {
                    list2 = null;
                }
                List<WorkSpec> eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
                m52335f(workSpecDao, configuration.getClock(), eligibleWorkForScheduling);
                if (list2 != null) {
                    eligibleWorkForScheduling.addAll(list2);
                }
                List<WorkSpec> allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (eligibleWorkForScheduling.size() > 0) {
                    WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                    for (Scheduler scheduler : list) {
                        if (scheduler.hasLimitedSchedulingSlots()) {
                            scheduler.schedule(workSpecArr);
                        }
                    }
                }
                if (allEligibleWorkSpecsForScheduling.size() > 0) {
                    WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
                    for (Scheduler scheduler2 : list) {
                        if (!scheduler2.hasLimitedSchedulingSlots()) {
                            scheduler2.schedule(workSpecArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }
}
