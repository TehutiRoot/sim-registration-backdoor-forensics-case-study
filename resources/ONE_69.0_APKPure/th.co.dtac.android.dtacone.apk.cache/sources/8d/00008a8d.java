package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AccountChangeEventCreator")
/* loaded from: classes3.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* renamed from: a */
    public final int f44437a;

    /* renamed from: b */
    public final long f44438b;

    /* renamed from: c */
    public final String f44439c;

    /* renamed from: d */
    public final int f44440d;

    /* renamed from: e */
    public final int f44441e;

    /* renamed from: f */
    public final String f44442f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f44437a = i;
        this.f44438b = j;
        this.f44439c = (String) Preconditions.checkNotNull(str);
        this.f44440d = i2;
        this.f44441e = i3;
        this.f44442f = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f44437a == accountChangeEvent.f44437a && this.f44438b == accountChangeEvent.f44438b && Objects.equal(this.f44439c, accountChangeEvent.f44439c) && this.f44440d == accountChangeEvent.f44440d && this.f44441e == accountChangeEvent.f44441e && Objects.equal(this.f44442f, accountChangeEvent.f44442f)) {
                return true;
            }
        }
        return false;
    }

    public String getAccountName() {
        return this.f44439c;
    }

    public String getChangeData() {
        return this.f44442f;
    }

    public int getChangeType() {
        return this.f44440d;
    }

    public int getEventIndex() {
        return this.f44441e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f44437a), Long.valueOf(this.f44438b), this.f44439c, Integer.valueOf(this.f44440d), Integer.valueOf(this.f44441e), this.f44442f);
    }

    public String toString() {
        String str;
        int i = this.f44440d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        String str2 = this.f44439c;
        String str3 = this.f44442f;
        int i2 = this.f44441e;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44437a);
        SafeParcelWriter.writeLong(parcel, 2, this.f44438b);
        SafeParcelWriter.writeString(parcel, 3, this.f44439c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f44440d);
        SafeParcelWriter.writeInt(parcel, 5, this.f44441e);
        SafeParcelWriter.writeString(parcel, 6, this.f44442f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f44437a = 1;
        this.f44438b = j;
        this.f44439c = (String) Preconditions.checkNotNull(str);
        this.f44440d = i;
        this.f44441e = i2;
        this.f44442f = str2;
    }
}