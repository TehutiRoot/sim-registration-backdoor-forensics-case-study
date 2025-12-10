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
    public final Context f44162a;

    /* renamed from: b */
    public final EventStore f44163b;

    /* renamed from: c */
    public AlarmManager f44164c;

    /* renamed from: d */
    public final SchedulerConfig f44165d;

    /* renamed from: e */
    public final Clock f44166e;

    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) {
        this(context, eventStore, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), clock, schedulerConfig);
    }

    /* renamed from: a */
    public boolean m49104a(Intent intent) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 603979776;
        } else {
            i = PKIFailureInfo.duplicateCertReq;
        }
        if (PendingIntent.getBroadcast(this.f44162a, 0, intent, i) == null) {
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
        Intent intent = new Intent(this.f44162a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m49104a(intent)) {
            Logging.m49116d("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long nextCallTime = this.f44163b.getNextCallTime(transportContext);
        long scheduleDelay = this.f44165d.getScheduleDelay(transportContext.getPriority(), nextCallTime, i);
        Logging.m49114d("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i));
        this.f44164c.set(3, this.f44166e.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.f44162a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    public AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.f44162a = context;
        this.f44163b = eventStore;
        this.f44164c = alarmManager;
        this.f44166e = clock;
        this.f44165d = schedulerConfig;
    }
}
