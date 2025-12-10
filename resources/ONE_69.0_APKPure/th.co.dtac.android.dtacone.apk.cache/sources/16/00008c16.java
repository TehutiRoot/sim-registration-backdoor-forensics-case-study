package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.InlineMe;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes3.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();

    /* renamed from: a */
    public final int f45115a;

    /* renamed from: b */
    public final int f45116b;

    /* renamed from: c */
    public final int f45117c;

    /* renamed from: d */
    public final long f45118d;

    /* renamed from: e */
    public final long f45119e;

    /* renamed from: f */
    public final String f45120f;

    /* renamed from: g */
    public final String f45121g;

    /* renamed from: h */
    public final int f45122h;

    /* renamed from: i */
    public final int f45123i;

    @InlineMe(replacement = "this(methodKey, resultStatusCode, connectionResultStatusCode, startTimeMillis, endTimeMillis, callingModuleId, callingEntryPoint, serviceId, -1)")
    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f45115a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f45116b);
        SafeParcelWriter.writeInt(parcel, 3, this.f45117c);
        SafeParcelWriter.writeLong(parcel, 4, this.f45118d);
        SafeParcelWriter.writeLong(parcel, 5, this.f45119e);
        SafeParcelWriter.writeString(parcel, 6, this.f45120f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f45121g, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f45122h);
        SafeParcelWriter.writeInt(parcel, 9, this.f45123i);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(m48385id = 1) int i, @SafeParcelable.Param(m48385id = 2) int i2, @SafeParcelable.Param(m48385id = 3) int i3, @SafeParcelable.Param(m48385id = 4) long j, @SafeParcelable.Param(m48385id = 5) long j2, @Nullable @SafeParcelable.Param(m48385id = 6) String str, @Nullable @SafeParcelable.Param(m48385id = 7) String str2, @SafeParcelable.Param(m48385id = 8) int i4, @SafeParcelable.Param(m48385id = 9) int i5) {
        this.f45115a = i;
        this.f45116b = i2;
        this.f45117c = i3;
        this.f45118d = j;
        this.f45119e = j2;
        this.f45120f = str;
        this.f45121g = str2;
        this.f45122h = i4;
        this.f45123i = i5;
    }
}