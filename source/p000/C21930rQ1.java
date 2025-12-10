package p000;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.Clock;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;

/* renamed from: rQ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C21930rQ1 {

    /* renamed from: c */
    public static final String f77270c = Logger.tagWithPrefix("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f77271a;

    /* renamed from: b */
    public final Clock f77272b;

    /* renamed from: rQ1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C13254a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77273a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f77273a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77273a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77273a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77273a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77273a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C21930rQ1(Context context, Clock clock) {
        this.f77272b = clock;
        this.f77271a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    public static JobInfo.TriggerContentUri m23331b(Constraints.ContentUriTrigger contentUriTrigger) {
        boolean isTriggeredForDescendants = contentUriTrigger.isTriggeredForDescendants();
        AbstractC21758qQ1.m23501a();
        return AbstractC21586pQ1.m23692a(contentUriTrigger.getUri(), isTriggeredForDescendants ? 1 : 0);
    }

    /* renamed from: c */
    public static int m23330c(NetworkType networkType) {
        int i = C13254a.f77273a[networkType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                return 3;
            }
            Logger logger = Logger.get();
            String str = f77270c;
            logger.debug(str, "API version too low. Cannot convert network type value " + networkType);
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    public static void m23329d(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(m23330c(networkType));
        }
    }

    /* renamed from: a */
    public JobInfo m23332a(WorkSpec workSpec, int i) {
        boolean z;
        int i2;
        Constraints constraints = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.f38608id);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.isPeriodic());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f77271a).setRequiresCharging(constraints.requiresCharging()).setRequiresDeviceIdle(constraints.requiresDeviceIdle()).setExtras(persistableBundle);
        m23329d(extras, constraints.getRequiredNetworkType());
        boolean z2 = false;
        if (!constraints.requiresDeviceIdle()) {
            if (workSpec.backoffPolicy == BackoffPolicy.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, i2);
        }
        long max = Math.max(workSpec.calculateNextRunTime() - this.f77272b.currentTimeMillis(), 0L);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.expedited) {
            extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24 && constraints.hasContentUriTriggers()) {
            for (Constraints.ContentUriTrigger contentUriTrigger : constraints.getContentUriTriggers()) {
                extras.addTriggerContentUri(m23331b(contentUriTrigger));
            }
            extras.setTriggerContentUpdateDelay(constraints.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(constraints.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(constraints.requiresBatteryNotLow());
            extras.setRequiresStorageNotLow(constraints.requiresStorageNotLow());
        }
        if (workSpec.runAttemptCount > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (i4 >= 31 && workSpec.expedited && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
