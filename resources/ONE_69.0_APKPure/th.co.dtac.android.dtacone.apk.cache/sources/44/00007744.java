package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.p005os.UserManagerCompat;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final String f38789e = Logger.tagWithPrefix("ForceStopRunnable");

    /* renamed from: f */
    public static final long f38790f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    public final Context f38791a;

    /* renamed from: b */
    public final WorkManagerImpl f38792b;

    /* renamed from: c */
    public final PreferenceUtils f38793c;

    /* renamed from: d */
    public int f38794d = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f38795a = Logger.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                Logger.get().verbose(f38795a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.m52124c(context);
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull WorkManagerImpl workManagerImpl) {
        this.f38791a = context.getApplicationContext();
        this.f38792b = workManagerImpl;
        this.f38793c = workManagerImpl.getPreferenceUtils();
    }

    /* renamed from: a */
    public static Intent m52126a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: b */
    public static PendingIntent m52125b(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m52126a(context), i);
    }

    /* renamed from: c */
    public static void m52124c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent m52125b = m52125b(context, i);
        long currentTimeMillis = System.currentTimeMillis() + f38790f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, m52125b);
        }
    }

    @VisibleForTesting
    public boolean cleanUp() {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            z = SystemJobScheduler.reconcileJobs(this.f38791a, this.f38792b.getWorkDatabase());
        } else {
            z = false;
        }
        WorkDatabase workDatabase = this.f38792b.getWorkDatabase();
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkProgressDao workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<WorkSpec> runningWork = workSpecDao.getRunningWork();
            if (runningWork != null && !runningWork.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (WorkSpec workSpec : runningWork) {
                    workSpecDao.setState(WorkInfo.State.ENQUEUED, workSpec.f38696id);
                    workSpecDao.setStopReason(workSpec.f38696id, WorkInfo.STOP_REASON_UNKNOWN);
                    workSpecDao.markWorkSpecScheduled(workSpec.f38696id, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (!z2 && !z) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    @VisibleForTesting
    public void forceStopRunnable() {
        boolean cleanUp = cleanUp();
        if (shouldRescheduleWorkers()) {
            Logger.get().debug(f38789e, "Rescheduling Workers.");
            this.f38792b.rescheduleEligibleWork();
            this.f38792b.getPreferenceUtils().setNeedsReschedule(false);
        } else if (isForceStopped()) {
            Logger.get().debug(f38789e, "Application was force-stopped, rescheduling.");
            this.f38792b.rescheduleEligibleWork();
            this.f38793c.setLastForceStopEventMillis(this.f38792b.getConfiguration().getClock().currentTimeMillis());
        } else if (cleanUp) {
            Logger.get().debug(f38789e, "Found unfinished work, scheduling it.");
            Schedulers.schedule(this.f38792b.getConfiguration(), this.f38792b.getWorkDatabase(), this.f38792b.getSchedulers());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean isForceStopped() {
        int i;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                i = 570425344;
            } else {
                i = PKIFailureInfo.duplicateCertReq;
            }
            PendingIntent m52125b = m52125b(this.f38791a, i);
            if (i2 >= 30) {
                if (m52125b != null) {
                    m52125b.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f38791a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long lastForceStopEventMillis = this.f38793c.getLastForceStopEventMillis();
                    for (int i3 = 0; i3 < historicalProcessExitReasons.size(); i3++) {
                        ApplicationExitInfo m610a = AbstractC22968x40.m610a(historicalProcessExitReasons.get(i3));
                        reason = m610a.getReason();
                        if (reason == 10) {
                            timestamp = m610a.getTimestamp();
                            if (timestamp >= lastForceStopEventMillis) {
                                return true;
                            }
                        }
                    }
                }
            } else if (m52125b == null) {
                m52124c(this.f38791a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            e = e;
            Logger.get().warning(f38789e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e2) {
            e = e2;
            Logger.get().warning(f38789e, "Ignoring exception", e);
            return true;
        }
    }

    @VisibleForTesting
    public boolean multiProcessChecks() {
        Configuration configuration = this.f38792b.getConfiguration();
        if (TextUtils.isEmpty(configuration.getDefaultProcessName())) {
            Logger.get().debug(f38789e, "The default process name was not specified.");
            return true;
        }
        boolean isDefaultProcess = ProcessUtils.isDefaultProcess(this.f38791a, configuration);
        Logger logger = Logger.get();
        String str = f38789e;
        logger.debug(str, "Is default app process = " + isDefaultProcess);
        return isDefaultProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        String str;
        try {
            if (!multiProcessChecks()) {
                return;
            }
            while (true) {
                try {
                    WorkDatabasePathHelper.migrateDatabase(this.f38791a);
                    Logger.get().debug(f38789e, "Performing cleanup operations.");
                    try {
                        forceStopRunnable();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        i = this.f38794d + 1;
                        this.f38794d = i;
                        if (i >= 3) {
                            if (UserManagerCompat.isUserUnlocked(this.f38791a)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            Logger logger = Logger.get();
                            String str2 = f38789e;
                            logger.error(str2, str, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            Consumer<Throwable> initializationExceptionHandler = this.f38792b.getConfiguration().getInitializationExceptionHandler();
                            if (initializationExceptionHandler != null) {
                                Logger.get().debug(str2, "Routing exception to the specified exception handler", illegalStateException);
                                initializationExceptionHandler.accept(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            Logger logger2 = Logger.get();
                            String str3 = f38789e;
                            logger2.debug(str3, "Retrying after " + (i * 300), e);
                            sleep(((long) this.f38794d) * 300);
                        }
                    }
                    Logger logger22 = Logger.get();
                    String str32 = f38789e;
                    logger22.debug(str32, "Retrying after " + (i * 300), e);
                    sleep(((long) this.f38794d) * 300);
                } catch (SQLiteException e2) {
                    Logger.get().error(f38789e, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    Consumer<Throwable> initializationExceptionHandler2 = this.f38792b.getConfiguration().getInitializationExceptionHandler();
                    if (initializationExceptionHandler2 != null) {
                        initializationExceptionHandler2.accept(illegalStateException2);
                    } else {
                        throw illegalStateException2;
                    }
                }
            }
        } finally {
            this.f38792b.onForceStopRunnableCompleted();
        }
    }

    @VisibleForTesting
    public boolean shouldRescheduleWorkers() {
        return this.f38792b.getPreferenceUtils().getNeedsReschedule();
    }

    @VisibleForTesting
    public void sleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }
}