package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class zzbt {

    /* renamed from: a */
    public static final Method f46259a;

    /* renamed from: b */
    public static final Method f46260b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 6
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 0
            r4 = 24
            if (r0 < r4) goto L2b
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r5 = android.app.job.JobInfo.class
            r6 = 0
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 1
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r7 = 2
            r0[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L28
            r6 = 3
            r0[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobScheduler> r5 = android.app.job.JobScheduler.class
            java.lang.String r6 = "scheduleAsPackage"
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L2c
        L28:
            android.util.Log.isLoggable(r2, r1)
        L2b:
            r0 = r3
        L2c:
            com.google.android.gms.internal.measurement.zzbt.f46259a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L3e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r4 = "myUserId"
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L3b
            goto L3e
        L3b:
            android.util.Log.isLoggable(r2, r1)
        L3e:
            com.google.android.gms.internal.measurement.zzbt.f46260b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r4, android.app.job.JobInfo r5, java.lang.String r6, java.lang.String r7) {
        /*
            r6 = 0
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r4.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.f46259a
            if (r0 == 0) goto L62
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r4 = p000.AbstractC22173sT1.m22812a(r4, r0)
            if (r4 == 0) goto L19
            goto L62
        L19:
            java.lang.reflect.Method r4 = com.google.android.gms.internal.measurement.zzbt.f46260b
            if (r4 == 0) goto L2d
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r4 = r4.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2d
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2d:
            r4 = 0
            goto L36
        L2f:
            java.lang.String r4 = "JobSchedulerCompat"
            r0 = 6
            android.util.Log.isLoggable(r4, r0)
            goto L2d
        L36:
            java.lang.reflect.Method r0 = com.google.android.gms.internal.measurement.zzbt.f46259a
            if (r0 == 0) goto L5d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L5d
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L5d
            r1[r6] = r5     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = "com.google.android.gms"
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L5d
            r2 = 2
            r1[r2] = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "UploadAlarm"
            r2 = 3
            r1[r2] = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L5d
            if (r4 == 0) goto L61
            int r6 = r4.intValue()     // Catch: java.lang.Throwable -> L5d
            goto L61
        L5d:
            int r6 = r7.schedule(r5)
        L61:
            return r6
        L62:
            int r4 = r7.schedule(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}