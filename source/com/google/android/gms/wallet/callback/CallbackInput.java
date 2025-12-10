package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "CallbackInputCreator")
/* loaded from: classes4.dex */
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CallbackInput> CREATOR = new zzh();

    /* renamed from: a */
    public int f48848a;

    /* renamed from: b */
    public byte[] f48849b;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @NonNull
        public CallbackInput build() {
            return CallbackInput.this;
        }

        @NonNull
        public Builder setCallbackType(int i) {
            CallbackInput.this.f48848a = i;
            return this;
        }

        @NonNull
        public Builder setRequestBytes(@NonNull byte[] bArr) {
            CallbackInput.this.f48849b = bArr;
            return this;
        }
    }

    private CallbackInput() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Nullable
    public <T extends AbstractSafeParcelable> T deserializeRequest(@NonNull Parcelable.Creator<T> creator) {
        byte[] bArr = this.f48849b;
        if (bArr == null) {
            return null;
        }
        return (T) SafeParcelableSerializer.deserializeFromBytes(bArr, creator);
    }

    public int getCallbackType() {
        return this.f48848a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48848a);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f48849b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CallbackInput(@SafeParcelable.Param(m48388id = 1) int i, @NonNull @SafeParcelable.Param(m48388id = 2) byte[] bArr) {
        this.f48848a = i;
        this.f48849b = bArr;
    }
}
