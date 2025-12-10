package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();

    /* renamed from: a */
    public String f48904a;

    /* renamed from: b */
    public String f48905b;

    /* renamed from: c */
    public TimeInterval f48906c;

    /* renamed from: d */
    public UriData f48907d;

    /* renamed from: e */
    public UriData f48908e;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zzn zznVar) {
        }

        @NonNull
        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @NonNull
        @Deprecated
        public Builder setActionUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.f48907d = uriData;
            return this;
        }

        @NonNull
        public Builder setBody(@NonNull String str) {
            WalletObjectMessage.this.f48905b = str;
            return this;
        }

        @NonNull
        public Builder setDisplayInterval(@NonNull TimeInterval timeInterval) {
            WalletObjectMessage.this.f48906c = timeInterval;
            return this;
        }

        @NonNull
        public Builder setHeader(@NonNull String str) {
            WalletObjectMessage.this.f48904a = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageUri(@NonNull UriData uriData) {
            WalletObjectMessage.this.f48908e = uriData;
            return this;
        }
    }

    public WalletObjectMessage() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    @Deprecated
    public UriData getActionUri() {
        return this.f48907d;
    }

    @NonNull
    public String getBody() {
        return this.f48905b;
    }

    @NonNull
    public TimeInterval getDisplayInterval() {
        return this.f48906c;
    }

    @NonNull
    public String getHeader() {
        return this.f48904a;
    }

    @NonNull
    @Deprecated
    public UriData getImageUri() {
        return this.f48908e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48904a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48905b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48906c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48907d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48908e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f48904a = str;
        this.f48905b = str2;
        this.f48906c = timeInterval;
        this.f48907d = uriData;
        this.f48908e = uriData2;
    }
}
