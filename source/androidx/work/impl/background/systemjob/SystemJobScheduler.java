package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobScheduler implements Scheduler {

    /* renamed from: f */
    public static final String f38478f = Logger.tagWithPrefix("SystemJobScheduler");

    /* renamed from: a */
    public final Context f38479a;

    /* renamed from: b */
    public final JobScheduler f38480b;

    /* renamed from: c */
    public final C21930rQ1 f38481c;

    /* renamed from: d */
    public final WorkDatabase f38482d;

    /* renamed from: e */
    public final Configuration f38483e;

    public SystemJobScheduler(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull Configuration configuration) {
        this(context, workDatabase, configuration, (JobScheduler) context.getSystemService("jobscheduler"), new C21930rQ1(context, configuration.getClock()));
    }

    /* renamed from: a */
    public static void m52243a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th2) {
            Logger.get().error(f38478f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th2);
        }
    }

    /* renamed from: b */
    public static List m52242b(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m52241c = m52241c(context, jobScheduler);
        if (m52241c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m52241c) {
            WorkGenerationalId m52240d = m52240d(jobInfo);
            if (m52240d != null && str.equals(m52240d.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List m52241c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            Logger.get().error(f38478f, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void cancelAll(@NonNull Context context) {
        List<JobInfo> m52241c;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (m52241c = m52241c(context, jobScheduler)) != null && !m52241c.isEmpty()) {
            for (JobInfo jobInfo : m52241c) {
                m52243a(jobScheduler, jobInfo.getId());
            }
        }
    }

    /* renamed from: d */
    public static WorkGenerationalId m52240d(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean reconcileJobs(@NonNull Context context, @NonNull WorkDatabase workDatabase) {
        int i;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m52241c = m52241c(context, jobScheduler);
        List<String> workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        boolean z = false;
        if (m52241c != null) {
            i = m52241c.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (m52241c != null && !m52241c.isEmpty()) {
            for (JobInfo jobInfo : m52241c) {
                WorkGenerationalId m52240d = m52240d(jobInfo);
                if (m52240d != null) {
                    hashSet.add(m52240d.getWorkSpecId());
                } else {
                    m52243a(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    Logger.get().debug(f38478f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                for (String str : workSpecIds) {
                    workSpecDao.markWorkSpecScheduled(str, -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
        return z;
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        List<Integer> m52242b = m52242b(this.f38479a, this.f38480b, str);
        if (m52242b != null && !m52242b.isEmpty()) {
            for (Integer num : m52242b) {
                m52243a(this.f38480b, num.intValue());
            }
            this.f38482d.systemIdInfoDao().removeSystemIdInfo(str);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        int nextJobSchedulerIdWithRange;
        List m52242b;
        int nextJobSchedulerIdWithRange2;
        IdGenerator idGenerator = new IdGenerator(this.f38482d);
        for (WorkSpec workSpec : workSpecArr) {
            this.f38482d.beginTransaction();
            try {
                WorkSpec workSpec2 = this.f38482d.workSpecDao().getWorkSpec(workSpec.f38608id);
                if (workSpec2 == null) {
                    Logger.get().warning(f38478f, "Skipping scheduling " + workSpec.f38608id + " because it's no longer in the DB");
                    this.f38482d.setTransactionSuccessful();
                } else if (workSpec2.state != WorkInfo.State.ENQUEUED) {
                    Logger.get().warning(f38478f, "Skipping scheduling " + workSpec.f38608id + " because it is no longer enqueued");
                    this.f38482d.setTransactionSuccessful();
                } else {
                    WorkGenerationalId generationalId = WorkSpecKt.generationalId(workSpec);
                    SystemIdInfo systemIdInfo = this.f38482d.systemIdInfoDao().getSystemIdInfo(generationalId);
                    if (systemIdInfo != null) {
                        nextJobSchedulerIdWithRange = systemIdInfo.systemId;
                    } else {
                        nextJobSchedulerIdWithRange = idGenerator.nextJobSchedulerIdWithRange(this.f38483e.getMinJobSchedulerId(), this.f38483e.getMaxJobSchedulerId());
                    }
                    if (systemIdInfo == null) {
                        this.f38482d.systemIdInfoDao().insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(generationalId, nextJobSchedulerIdWithRange));
                    }
                    scheduleInternal(workSpec, nextJobSchedulerIdWithRange);
                    if (Build.VERSION.SDK_INT == 23 && (m52242b = m52242b(this.f38479a, this.f38480b, workSpec.f38608id)) != null) {
                        int indexOf = m52242b.indexOf(Integer.valueOf(nextJobSchedulerIdWithRange));
                        if (indexOf >= 0) {
                            m52242b.remove(indexOf);
                        }
                        if (!m52242b.isEmpty()) {
                            nextJobSchedulerIdWithRange2 = ((Integer) m52242b.get(0)).intValue();
                        } else {
                            nextJobSchedulerIdWithRange2 = idGenerator.nextJobSchedulerIdWithRange(this.f38483e.getMinJobSchedulerId(), this.f38483e.getMaxJobSchedulerId());
                        }
                        scheduleInternal(workSpec, nextJobSchedulerIdWithRange2);
                    }
                    this.f38482d.setTransactionSuccessful();
                }
            } finally {
                this.f38482d.endTransaction();
            }
        }
    }

    @VisibleForTesting
    public void scheduleInternal(@NonNull WorkSpec workSpec, int i) {
        int i2;
        JobInfo m23332a = this.f38481c.m23332a(workSpec, i);
        Logger logger = Logger.get();
        String str = f38478f;
        logger.debug(str, "Scheduling work ID " + workSpec.f38608id + "Job ID " + i);
        try {
            if (this.f38480b.schedule(m23332a) == 0) {
                Logger logger2 = Logger.get();
                logger2.warning(str, "Unable to schedule work ID " + workSpec.f38608id);
                if (workSpec.expedited && workSpec.outOfQuotaPolicy == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.expedited = false;
                    Logger.get().debug(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f38608id));
                    scheduleInternal(workSpec, i);
                }
            }
        } catch (IllegalStateException e) {
            List m52241c = m52241c(this.f38479a, this.f38480b);
            if (m52241c != null) {
                i2 = m52241c.size();
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i2), Integer.valueOf(this.f38482d.workSpecDao().getScheduledWork().size()), Integer.valueOf(this.f38483e.getMaxSchedulerLimit()));
            Logger.get().error(f38478f, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e);
            Consumer<Throwable> schedulingExceptionHandler = this.f38483e.getSchedulingExceptionHandler();
            if (schedulingExceptionHandler != null) {
                schedulingExceptionHandler.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th2) {
            Logger logger3 = Logger.get();
            String str2 = f38478f;
            logger3.error(str2, "Unable to schedule " + workSpec, th2);
        }
    }

    @VisibleForTesting
    public SystemJobScheduler(@NonNull Context context, @NonNull WorkDatabase workDatabase, @NonNull Configuration configuration, @NonNull JobScheduler jobScheduler, @NonNull C21930rQ1 c21930rQ1) {
        this.f38479a = context;
        this.f38480b = jobScheduler;
        this.f38481c = c21930rQ1;
        this.f38482d = workDatabase;
        this.f38483e = configuration;
    }
}
