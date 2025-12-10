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
    public final int f44425a;

    /* renamed from: b */
    public final long f44426b;

    /* renamed from: c */
    public final String f44427c;

    /* renamed from: d */
    public final int f44428d;

    /* renamed from: e */
    public final int f44429e;

    /* renamed from: f */
    public final String f44430f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f44425a = i;
        this.f44426b = j;
        this.f44427c = (String) Preconditions.checkNotNull(str);
        this.f44428d = i2;
        this.f44429e = i3;
        this.f44430f = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            if (this.f44425a == accountChangeEvent.f44425a && this.f44426b == accountChangeEvent.f44426b && Objects.equal(this.f44427c, accountChangeEvent.f44427c) && this.f44428d == accountChangeEvent.f44428d && this.f44429e == accountChangeEvent.f44429e && Objects.equal(this.f44430f, accountChangeEvent.f44430f)) {
                return true;
            }
        }
        return false;
    }

    public String getAccountName() {
        return this.f44427c;
    }

    public String getChangeData() {
        return this.f44430f;
    }

    public int getChangeType() {
        return this.f44428d;
    }

    public int getEventIndex() {
        return this.f44429e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f44425a), Long.valueOf(this.f44426b), this.f44427c, Integer.valueOf(this.f44428d), Integer.valueOf(this.f44429e), this.f44430f);
    }

    public String toString() {
        String str;
        int i = this.f44428d;
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
        String str2 = this.f44427c;
        String str3 = this.f44430f;
        int i2 = this.f44429e;
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
        SafeParcelWriter.writeInt(parcel, 1, this.f44425a);
        SafeParcelWriter.writeLong(parcel, 2, this.f44426b);
        SafeParcelWriter.writeString(parcel, 3, this.f44427c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f44428d);
        SafeParcelWriter.writeInt(parcel, 5, this.f44429e);
        SafeParcelWriter.writeString(parcel, 6, this.f44430f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f44425a = 1;
        this.f44426b = j;
        this.f44427c = (String) Preconditions.checkNotNull(str);
        this.f44428d = i;
        this.f44429e = i2;
        this.f44430f = str2;
    }
}
