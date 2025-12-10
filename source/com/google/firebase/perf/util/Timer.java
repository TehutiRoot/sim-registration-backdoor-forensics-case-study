package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C8587a();

    /* renamed from: a */
    public long f56284a;

    /* renamed from: b */
    public long f56285b;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    /* loaded from: classes4.dex */
    public class C8587a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C8587a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    public /* synthetic */ Timer(Parcel parcel, C8587a c8587a) {
        this(parcel);
    }

    /* renamed from: a */
    public static long m38155a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: b */
    public static long m38154b() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static Timer ofElapsedRealtime(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(m38154b() + (micros - m38155a()), micros);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrentTimestampMicros() {
        return this.f56284a + getDurationMicros();
    }

    public long getDurationMicros() {
        return getDurationMicros(new Timer());
    }

    public long getMicros() {
        return this.f56284a;
    }

    public void reset() {
        this.f56284a = m38154b();
        this.f56285b = m38155a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f56284a);
        parcel.writeLong(this.f56285b);
    }

    public Timer() {
        this(m38154b(), m38155a());
    }

    public long getDurationMicros(@NonNull Timer timer) {
        return timer.f56285b - this.f56285b;
    }

    public Timer(long j, long j2) {
        this.f56284a = j;
        this.f56285b = j2;
    }

    @VisibleForTesting
    public Timer(long j) {
        this(j, j);
    }

    public Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
