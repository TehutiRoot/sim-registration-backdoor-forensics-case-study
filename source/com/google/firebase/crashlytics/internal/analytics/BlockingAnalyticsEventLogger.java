package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* renamed from: a */
    public final CrashlyticsOriginAnalyticsEventLogger f54766a;

    /* renamed from: b */
    public final int f54767b;

    /* renamed from: c */
    public final TimeUnit f54768c;

    /* renamed from: e */
    public CountDownLatch f54770e;

    /* renamed from: d */
    public final Object f54769d = new Object();

    /* renamed from: f */
    public boolean f54771f = false;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.f54766a = crashlyticsOriginAnalyticsEventLogger;
        this.f54767b = i;
        this.f54768c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.f54769d) {
            try {
                Logger logger = Logger.getLogger();
                logger.m39134v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f54770e = new CountDownLatch(1);
                this.f54771f = false;
                this.f54766a.logEvent(str, bundle);
                Logger.getLogger().m39134v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f54770e.await(this.f54767b, this.f54768c)) {
                        this.f54771f = true;
                        Logger.getLogger().m39134v("App exception callback received from Analytics listener.");
                    } else {
                        Logger.getLogger().m39132w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.getLogger().m39138e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f54770e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f54770e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
