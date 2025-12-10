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
    public final OperationImpl f38777a = new OperationImpl();

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$a */
    /* loaded from: classes.dex */
    public class C5278a extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38778b;

        /* renamed from: c */
        public final /* synthetic */ UUID f38779c;

        public C5278a(WorkManagerImpl workManagerImpl, UUID uuid) {
            this.f38778b = workManagerImpl;
            this.f38779c = uuid;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52131d() {
            WorkDatabase workDatabase = this.f38778b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                m52134a(this.f38778b, this.f38779c.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m52132c(this.f38778b);
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$b */
    /* loaded from: classes.dex */
    public class C5279b extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38780b;

        /* renamed from: c */
        public final /* synthetic */ String f38781c;

        public C5279b(WorkManagerImpl workManagerImpl, String str) {
            this.f38780b = workManagerImpl;
            this.f38781c = str;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52131d() {
            WorkDatabase workDatabase = this.f38780b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getUnfinishedWorkWithTag(this.f38781c)) {
                    m52134a(this.f38780b, str);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m52132c(this.f38780b);
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$c */
    /* loaded from: classes.dex */
    public class C5280c extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38782b;

        /* renamed from: c */
        public final /* synthetic */ String f38783c;

        /* renamed from: d */
        public final /* synthetic */ boolean f38784d;

        public C5280c(WorkManagerImpl workManagerImpl, String str, boolean z) {
            this.f38782b = workManagerImpl;
            this.f38783c = str;
            this.f38784d = z;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52131d() {
            WorkDatabase workDatabase = this.f38782b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getUnfinishedWorkWithName(this.f38783c)) {
                    m52134a(this.f38782b, str);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (this.f38784d) {
                    m52132c(this.f38782b);
                }
            } catch (Throwable th2) {
                workDatabase.endTransaction();
                throw th2;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$d */
    /* loaded from: classes.dex */
    public class C5281d extends CancelWorkRunnable {

        /* renamed from: b */
        public final /* synthetic */ WorkManagerImpl f38785b;

        public C5281d(WorkManagerImpl workManagerImpl) {
            this.f38785b = workManagerImpl;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        /* renamed from: d */
        public void mo52131d() {
            WorkDatabase workDatabase = this.f38785b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                for (String str : workDatabase.workSpecDao().getAllUnfinishedWork()) {
                    m52134a(this.f38785b, str);
                }
                new PreferenceUtils(this.f38785b.getWorkDatabase()).setLastCancelAllTimeMillis(this.f38785b.getConfiguration().getClock().currentTimeMillis());
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
        return new C5281d(workManagerImpl);
    }

    @NonNull
    public static CancelWorkRunnable forId(@NonNull UUID uuid, @NonNull WorkManagerImpl workManagerImpl) {
        return new C5278a(workManagerImpl, uuid);
    }

    @NonNull
    public static CancelWorkRunnable forName(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl, boolean z) {
        return new C5280c(workManagerImpl, str, z);
    }

    @NonNull
    public static CancelWorkRunnable forTag(@NonNull String str, @NonNull WorkManagerImpl workManagerImpl) {
        return new C5279b(workManagerImpl, str);
    }

    /* renamed from: a */
    public void m52134a(WorkManagerImpl workManagerImpl, String str) {
        m52133b(workManagerImpl.getWorkDatabase(), str);
        workManagerImpl.getProcessor().stopAndCancelWork(str, 1);
        for (Scheduler scheduler : workManagerImpl.getSchedulers()) {
            scheduler.cancel(str);
        }
    }

    /* renamed from: b */
    public final void m52133b(WorkDatabase workDatabase, String str) {
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
    public void m52132c(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    /* renamed from: d */
    public abstract void mo52131d();

    @NonNull
    public Operation getOperation() {
        return this.f38777a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo52131d();
            this.f38777a.markState(Operation.SUCCESS);
        } catch (Throwable th2) {
            this.f38777a.markState(new Operation.State.FAILURE(th2));
        }
    }
}