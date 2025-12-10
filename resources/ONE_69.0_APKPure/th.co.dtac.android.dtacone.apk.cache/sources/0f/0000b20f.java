package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C8576a();

    /* renamed from: a */
    public long f56296a;

    /* renamed from: b */
    public long f56297b;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    /* loaded from: classes4.dex */
    public class C8576a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C8576a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public /* synthetic */ Timer(Parcel parcel, C8576a c8576a) {
        this(parcel);
    }

    /* renamed from: a */
    public static long m38147a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: b */
    public static long m38146b() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static Timer ofElapsedRealtime(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(m38146b() + (micros - m38147a()), micros);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return this.f56296a + getDurationMicros();
    }

    public long getDurationMicros() {
        return getDurationMicros(new Timer());
    }

    public long getMicros() {
        return this.f56296a;
    }

    public void reset() {
        this.f56296a = m38146b();
        this.f56297b = m38147a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f56296a);
        parcel.writeLong(this.f56297b);
    }

    public Timer() {
        this(m38146b(), m38147a());
    }

    public long getDurationMicros(@NonNull Timer timer) {
        return timer.f56297b - this.f56297b;
    }

    public Timer(long j, long j2) {
        this.f56296a = j;
        this.f56297b = j2;
    }

    @VisibleForTesting
    public Timer(long j) {
        this(j, j);
    }

    public Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}