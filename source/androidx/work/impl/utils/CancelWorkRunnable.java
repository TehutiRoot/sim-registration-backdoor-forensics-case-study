package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.LinkedList;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class CancelWorkRunnable implements Runnable {

    /* renamed from: a */
    public final OperationImpl f38689a = new OperationImpl();

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$a */
    /* loaded from: classes.dex */
    public class C5296a extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38690b;

        /* renamed from: c */
        public final /* synthetic */ UUID f38691c;

        public C5296a(WorkManagerImpl workManagerImpl, UUID uuid) {
            this.f38690b = workManagerImpl;
            this.f38691c = uuid;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52179d() {
            WorkDatabase workDatabase = this.f38690b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                m52182a(this.f38690b, this.f38691c.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m52180c(this.f38690b);
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$b */
    /* loaded from: classes.dex */
    public class C5297b extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38692b;

        /* renamed from: c */
        public final /* synthetic */ String f38693c;

        public C5297b(WorkManagerImpl workManagerImpl, String str) {
            this.f38692b = workManagerImpl;
            this.f38693c = str;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52179d() {
            WorkDatabase workDatabase = this.f38692b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getUnfinishedWorkWithTag(this.f38693c)) {
                    m52182a(this.f38692b, str);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m52180c(this.f38692b);
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$c */
    /* loaded from: classes.dex */
    public class C5298c extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38694b;

        /* renamed from: c */
        public final /* synthetic */ String f38695c;

        /* renamed from: d */
        public final /* synthetic */ boolean f38696d;

        public C5298c(WorkManagerImpl workManagerImpl, String str, boolean z) {
            this.f38694b = workManagerImpl;
            this.f38695c = str;
            this.f38696d = z;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52179d() {
            WorkDatabase workDatabase = this.f38694b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getUnfinishedWorkWithName(this.f38695c)) {
                    m52182a(this.f38694b, str);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (this.f38696d) {
                    m52180c(this.f38694b);
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$d */
    /* loaded from: classes.dex */
    public class C5299d extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38697b;

        public C5299d(WorkManagerImpl workManagerImpl) {
            this.f38697b = workManagerImpl;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52179d() {
            WorkDatabase workDatabase = this.f38697b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getAllUnfinishedWork()) {
                    m52182a(this.f38697b, str);
                }
                new PreferenceUtils(this.f38697b.getWorkDatabase()).setLastCancelAllTimeMillis(this.f38697b.getConfiguration().getClock().currentTimeMillis());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    @NonNull
    public static CancelWorkRunnable forAll(@NonNull WorkManagerImpl workManagerImpl) {
        return new C5299d(workManagerImpl);
    }

    @NonNull
    public static CancelWorkRunnable forId(@NonNull UUID uuid, @NonNull WorkManagerImpl workManagerImpl) {
        return new C5296a(workManagerImpl, uuid);
    }

    @NonNull
    public static CancelWorkRunnable forName(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl, boolean z) {
        return new C5298c(workManagerImpl, str, z);
    }

    @NonNull
    public static CancelWorkRunnable forTag(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl) {
        return new C5297b(workManagerImpl, str);
    }

    /* renamed from: a */
    public void m52182a(WorkManagerImpl workManagerImpl, String str) {
        m52181b(workManagerImpl.getWorkDatabase(), str);
        workManagerImpl.getProcessor().stopAndCancelWork(str, 1);
        for (Scheduler scheduler : workManagerImpl.getSchedulers()) {
            scheduler.cancel(str);
        }
    }

    /* renamed from: b */
    public final void m52181b(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* renamed from: c */
    public void m52180c(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    /* renamed from: d */
    public abstract void mo52179d();

    @NonNull
    public Operation getOperation() {
        return this.f38689a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo52179d();
            this.f38689a.markState(Operation.SUCCESS);
        } catch (Throwable th2) {
            this.f38689a.markState(new Operation.State.FAILURE(th2));
        }
    }
}
