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

@SafeParcelable.Class(creator = "SleepSegmentEventCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new zzcc();
    public static final int STATUS_MISSING_DATA = 1;
    public static final int STATUS_NOT_DETECTED = 2;
    public static final int STATUS_SUCCESSFUL = 0;

    /* renamed from: a */
    public final long f47795a;

    /* renamed from: b */
    public final long f47796b;

    /* renamed from: c */
    public final int f47797c;

    /* renamed from: d */
    public final int f47798d;

    /* renamed from: e */
    public final int f47799e;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(m48388id = 1) long j, @SafeParcelable.Param(m48388id = 2) long j2, @SafeParcelable.Param(m48388id = 3) int i, @SafeParcelable.Param(m48388id = 4) int i2, @SafeParcelable.Param(m48388id = 5) int i3) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f47795a = j;
        this.f47796b = j2;
        this.f47797c = i;
        this.f47798d = i2;
        this.f47799e = i3;
    }

    @NonNull
    public static List<SleepSegmentEvent> extractEvents(@NonNull Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            byte[] bArr = (byte[]) arrayList.get(i);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepSegmentEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f47795a == sleepSegmentEvent.getStartTimeMillis() && this.f47796b == sleepSegmentEvent.getEndTimeMillis() && this.f47797c == sleepSegmentEvent.getStatus() && this.f47798d == sleepSegmentEvent.f47798d && this.f47799e == sleepSegmentEvent.f47799e) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.f47796b;
    }

    public long getSegmentDurationMillis() {
        return this.f47796b - this.f47795a;
    }

    public long getStartTimeMillis() {
        return this.f47795a;
    }

    public int getStatus() {
        return this.f47797c;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47795a), Long.valueOf(this.f47796b), Integer.valueOf(this.f47797c));
    }

    @NonNull
    public String toString() {
        long j = this.f47795a;
        long j2 = this.f47796b;
        int i = this.f47797c;
        StringBuilder sb = new StringBuilder(84);
        sb.append("startMillis=");
        sb.append(j);
        sb.append(", endMillis=");
        sb.append(j2);
        sb.append(", status=");
        sb.append(i);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getStartTimeMillis());
        SafeParcelWriter.writeLong(parcel, 2, getEndTimeMillis());
        SafeParcelWriter.writeInt(parcel, 3, getStatus());
        SafeParcelWriter.writeInt(parcel, 4, this.f47798d);
        SafeParcelWriter.writeInt(parcel, 5, this.f47799e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
