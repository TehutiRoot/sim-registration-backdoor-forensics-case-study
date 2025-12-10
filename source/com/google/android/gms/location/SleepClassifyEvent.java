package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
/* loaded from: classes3.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzcb();

    /* renamed from: a */
    public final int f47786a;

    /* renamed from: b */
    public final int f47787b;

    /* renamed from: c */
    public final int f47788c;

    /* renamed from: d */
    public final int f47789d;

    /* renamed from: e */
    public final int f47790e;

    /* renamed from: f */
    public final int f47791f;

    /* renamed from: g */
    public final int f47792g;

    /* renamed from: h */
    public final boolean f47793h;

    /* renamed from: i */
    public final int f47794i;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(m48388id = 1) int i, @SafeParcelable.Param(m48388id = 2) int i2, @SafeParcelable.Param(m48388id = 3) int i3, @SafeParcelable.Param(m48388id = 4) int i4, @SafeParcelable.Param(m48388id = 5) int i5, @SafeParcelable.Param(m48388id = 6) int i6, @SafeParcelable.Param(m48388id = 7) int i7, @SafeParcelable.Param(m48388id = 8) boolean z, @SafeParcelable.Param(m48388id = 9) int i8) {
        this.f47786a = i;
        this.f47787b = i2;
        this.f47788c = i3;
        this.f47789d = i4;
        this.f47790e = i5;
        this.f47791f = i6;
        this.f47792g = i7;
        this.f47793h = z;
        this.f47794i = i8;
    }

    @NonNull
    public static List<SleepClassifyEvent> extractEvents(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.f47786a == sleepClassifyEvent.f47786a && this.f47787b == sleepClassifyEvent.f47787b) {
            return true;
        }
        return false;
    }

    public int getConfidence() {
        return this.f47787b;
    }

    public int getLight() {
        return this.f47789d;
    }

    public int getMotion() {
        return this.f47788c;
    }

    public long getTimestampMillis() {
        return this.f47786a * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47786a), Integer.valueOf(this.f47787b));
    }

    @NonNull
    public String toString() {
        int i = this.f47786a;
        int i2 = this.f47787b;
        int i3 = this.f47788c;
        int i4 = this.f47789d;
        StringBuilder sb = new StringBuilder(65);
        sb.append(i);
        sb.append(" Conf:");
        sb.append(i2);
        sb.append(" Motion:");
        sb.append(i3);
        sb.append(" Light:");
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47786a);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.f47790e);
        SafeParcelWriter.writeInt(parcel, 6, this.f47791f);
        SafeParcelWriter.writeInt(parcel, 7, this.f47792g);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f47793h);
        SafeParcelWriter.writeInt(parcel, 9, this.f47794i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
