package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class AlarmManagerScheduler implements WorkScheduler {

    /* renamed from: a */
    public final Context f44174a;

    /* renamed from: b */
    public final EventStore f44175b;

    /* renamed from: c */
    public AlarmManager f44176c;

    /* renamed from: d */
    public final SchedulerConfig f44177d;

    /* renamed from: e */
    public final Clock f44178e;

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        this(context, eventStore, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), clock, schedulerConfig);
    }

    /* renamed from: a */
    public boolean m49101a(Intent intent) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 603979776;
        } else {
            i = PKIFailureInfo.duplicateCertReq;
        }
        if (PendingIntent.getBroadcast(this.f44174a, 0, intent, i) == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i) {
        schedule(transportContext, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", transportContext.getBackendName());
        builder.appendQueryParameter(LogFactory.PRIORITY_KEY, String.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        if (transportContext.getExtras() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        Intent intent = new Intent(this.f44174a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m49101a(intent)) {
            Logging.m49113d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f44175b.getNextCallTime(transportContext);
        long scheduleDelay = this.f44177d.getScheduleDelay(transportContext.getPriority(), nextCallTime, i);
        Logging.m49111d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i));
        this.f44176c.set(3, this.f44178e.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.f44174a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    public AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.f44174a = context;
        this.f44175b = eventStore;
        this.f44176c = alarmManager;
        this.f44178e = clock;
        this.f44177d = schedulerConfig;
    }
}