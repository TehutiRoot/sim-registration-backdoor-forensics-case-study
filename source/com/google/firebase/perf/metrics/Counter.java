package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C8575a();

    /* renamed from: a */
    public final String f56175a;

    /* renamed from: b */
    public final AtomicLong f56176b;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    /* loaded from: classes4.dex */
    public class C8575a implements Parcelable.Creator {
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

    public /* synthetic */ Counter(Parcel parcel, C8575a c8575a) {
        this(parcel);
    }

    /* renamed from: a */
    public long m38252a() {
        return this.f56176b.get();
    }

    /* renamed from: b */
    public String m38251b() {
        return this.f56175a;
    }

    /* renamed from: c */
    public void m38250c(long j) {
        this.f56176b.set(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void increment(long j) {
        this.f56176b.addAndGet(j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56175a);
        parcel.writeLong(this.f56176b.get());
    }

    public Counter(@NonNull String str) {
        this.f56175a = str;
        this.f56176b = new AtomicLong(0L);
    }

    public Counter(Parcel parcel) {
        this.f56175a = parcel.readString();
        this.f56176b = new AtomicLong(parcel.readLong());
    }
}
