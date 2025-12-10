package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C8564a();

    /* renamed from: a */
    public final String f56187a;

    /* renamed from: b */
    public final AtomicLong f56188b;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    /* loaded from: classes4.dex */
    public class C8564a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    public /* synthetic */ Counter(Parcel parcel, C8564a c8564a) {
        this(parcel);
    }

    /* renamed from: a */
    public long m38244a() {
        return this.f56188b.get();
    }

    /* renamed from: b */
    public String m38243b() {
        return this.f56187a;
    }

    /* renamed from: c */
    public void m38242c(long j) {
        this.f56188b.set(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void increment(long j) {
        this.f56188b.addAndGet(j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56187a);
        parcel.writeLong(this.f56188b.get());
    }

    public Counter(@NonNull String str) {
        this.f56187a = str;
        this.f56188b = new AtomicLong(0L);
    }

    public Counter(Parcel parcel) {
        this.f56187a = parcel.readString();
        this.f56188b = new AtomicLong(parcel.readLong());
    }
}