package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CallbackOutputCreator")
/* loaded from: classes4.dex */
public class CallbackOutput extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CallbackOutput> CREATOR = new zzk();

    /* renamed from: a */
    public int f48851a;

    /* renamed from: b */
    public int f48852b;

    /* renamed from: c */
    public byte[] f48853c;

    /* renamed from: d */
    public String f48854d;

    private CallbackOutput() {
    }

    public static zzj zza() {
        return new zzj(new CallbackOutput(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48851a);
        SafeParcelWriter.writeInt(parcel, 2, this.f48852b);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f48853c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48854d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public CallbackOutput(int i, int i2, byte[] bArr, String str) {
        this.f48851a = i;
        this.f48852b = i2;
        this.f48853c = bArr;
        this.f48854d = str;
    }
}
