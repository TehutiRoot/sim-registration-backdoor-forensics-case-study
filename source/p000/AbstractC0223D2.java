package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.core.app.NotificationCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.CommandHandler;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: D2 */
/* loaded from: classes.dex */
public abstract class AbstractC0223D2 {

    /* renamed from: a */
    public static final String f890a = Logger.tagWithPrefix("Alarms");

    /* renamed from: D2$a */
    /* loaded from: classes.dex */
    public static class C0224a {
        @DoNotInline
        /* renamed from: a */
        public static void m68699a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m68703a(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            m68702b(context, workGenerationalId, systemIdInfo.systemId);
            Logger logger = Logger.get();
            String str = f890a;
            logger.debug(str, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
            systemIdInfoDao.removeSystemIdInfo(workGenerationalId);
        }
    }

    /* renamed from: b */
    public static void m68702b(Context context, WorkGenerationalId workGenerationalId, int i) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent m52282b = CommandHandler.m52282b(context, workGenerationalId);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = PKIFailureInfo.duplicateCertReq;
        }
        PendingIntent service = PendingIntent.getService(context, i, m52282b, i2);
        if (service != null && alarmManager != null) {
            Logger logger = Logger.get();
            String str = f890a;
            logger.debug(str, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m68701c(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j) {
        SystemIdInfoDao systemIdInfoDao = workDatabase.systemIdInfoDao();
        SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(workGenerationalId);
        if (systemIdInfo != null) {
            m68702b(context, workGenerationalId, systemIdInfo.systemId);
            m68700d(context, workGenerationalId, systemIdInfo.systemId, j);
            return;
        }
        int nextAlarmManagerId = new IdGenerator(workDatabase).nextAlarmManagerId();
        systemIdInfoDao.insertSystemIdInfo(SystemIdInfoKt.systemIdInfo(workGenerationalId, nextAlarmManagerId));
        m68700d(context, workGenerationalId, nextAlarmManagerId, j);
    }

    /* renamed from: d */
    public static void m68700d(Context context, WorkGenerationalId workGenerationalId, int i, long j) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, CommandHandler.m52282b(context, workGenerationalId), i2);
        if (alarmManager != null) {
            C0224a.m68699a(alarmManager, 0, j, service);
        }
    }
}
