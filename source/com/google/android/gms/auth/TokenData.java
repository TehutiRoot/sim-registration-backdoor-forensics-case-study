package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class(creator = "TokenDataCreator")
/* loaded from: classes3.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new zzk();

    /* renamed from: a */
    public final int f44439a;

    /* renamed from: b */
    public final String f44440b;

    /* renamed from: c */
    public final Long f44441c;

    /* renamed from: d */
    public final boolean f44442d;

    /* renamed from: e */
    public final boolean f44443e;

    /* renamed from: f */
    public final List f44444f;

    /* renamed from: g */
    public final String f44445g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.f44439a = i;
        this.f44440b = Preconditions.checkNotEmpty(str);
        this.f44441c = l;
        this.f44442d = z;
        this.f44443e = z2;
        this.f44444f = list;
        this.f44445g = str2;
    }

    @Nullable
    public static TokenData zza(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f44440b, tokenData.f44440b) || !Objects.equal(this.f44441c, tokenData.f44441c) || this.f44442d != tokenData.f44442d || this.f44443e != tokenData.f44443e || !Objects.equal(this.f44444f, tokenData.f44444f) || !Objects.equal(this.f44445g, tokenData.f44445g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hashCode(this.f44440b, this.f44441c, Boolean.valueOf(this.f44442d), Boolean.valueOf(this.f44443e), this.f44444f, this.f44445g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44439a);
        SafeParcelWriter.writeString(parcel, 2, this.f44440b, false);
        SafeParcelWriter.writeLongObject(parcel, 3, this.f44441c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f44442d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f44443e);
        SafeParcelWriter.writeStringList(parcel, 6, this.f44444f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f44445g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zzb() {
        return this.f44440b;
    }
}
