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
    public final long f47807a;

    /* renamed from: b */
    public final long f47808b;

    /* renamed from: c */
    public final int f47809c;

    /* renamed from: d */
    public final int f47810d;

    /* renamed from: e */
    public final int f47811e;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepSegmentEvent(@SafeParcelable.Param(m48385id = 1) long j, @SafeParcelable.Param(m48385id = 2) long j2, @SafeParcelable.Param(m48385id = 3) int i, @SafeParcelable.Param(m48385id = 4) int i2, @SafeParcelable.Param(m48385id = 5) int i3) {
        boolean z;
        if (j <= j2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.f47807a = j;
        this.f47808b = j2;
        this.f47809c = i;
        this.f47810d = i2;
        this.f47811e = i3;
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
            if (this.f47807a == sleepSegmentEvent.getStartTimeMillis() && this.f47808b == sleepSegmentEvent.getEndTimeMillis() && this.f47809c == sleepSegmentEvent.getStatus() && this.f47810d == sleepSegmentEvent.f47810d && this.f47811e == sleepSegmentEvent.f47811e) {
                return true;
            }
        }
        return false;
    }

    public long getEndTimeMillis() {
        return this.f47808b;
    }

    public long getSegmentDurationMillis() {
        return this.f47808b - this.f47807a;
    }

    public long getStartTimeMillis() {
        return this.f47807a;
    }

    public int getStatus() {
        return this.f47809c;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f47807a), Long.valueOf(this.f47808b), Integer.valueOf(this.f47809c));
    }

    @NonNull
    public String toString() {
        long j = this.f47807a;
        long j2 = this.f47808b;
        int i = this.f47809c;
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
        SafeParcelWriter.writeInt(parcel, 4, this.f47810d);
        SafeParcelWriter.writeInt(parcel, 5, this.f47811e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}