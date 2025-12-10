package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import java.util.Comparator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@SafeParcelable.Class(creator = "FlagCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Parcelable.Creator<zzi> CREATOR = new zzk();

    /* renamed from: g */
    public static final Comparator f48530g = new C22026rz2();

    /* renamed from: a */
    public final long f48531a;

    /* renamed from: b */
    public final boolean f48532b;

    /* renamed from: c */
    public final double f48533c;

    /* renamed from: d */
    public final String f48534d;

    /* renamed from: e */
    public final byte[] f48535e;

    /* renamed from: f */
    public final int f48536f;
    @SafeParcelable.Field(m48389id = 2)
    public final String name;
    @SafeParcelable.Field(m48389id = 9)
    public final int zzah;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m48388id = 2) String str, @SafeParcelable.Param(m48388id = 3) long j, @SafeParcelable.Param(m48388id = 4) boolean z, @SafeParcelable.Param(m48388id = 5) double d, @SafeParcelable.Param(m48388id = 6) String str2, @SafeParcelable.Param(m48388id = 7) byte[] bArr, @SafeParcelable.Param(m48388id = 8) int i, @SafeParcelable.Param(m48388id = 9) int i2) {
        this.name = str;
        this.f48531a = j;
        this.f48532b = z;
        this.f48533c = d;
        this.f48534d = str2;
        this.f48535e = bArr;
        this.f48536f = i;
        this.zzah = i2;
    }

    /* renamed from: b */
    public static int m46060b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzi zziVar) {
        zzi zziVar2 = zziVar;
        int compareTo = this.name.compareTo(zziVar2.name);
        if (compareTo != 0) {
            return compareTo;
        }
        int m46060b = m46060b(this.f48536f, zziVar2.f48536f);
        if (m46060b != 0) {
            return m46060b;
        }
        int i = this.f48536f;
        if (i == 1) {
            int i2 = (this.f48531a > zziVar2.f48531a ? 1 : (this.f48531a == zziVar2.f48531a ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 == 0 ? 0 : 1;
        } else if (i == 2) {
            boolean z = this.f48532b;
            if (z == zziVar2.f48532b) {
                return 0;
            }
            return z ? 1 : -1;
        } else if (i != 3) {
            if (i == 4) {
                String str = this.f48534d;
                String str2 = zziVar2.f48534d;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            } else if (i != 5) {
                int i3 = this.f48536f;
                StringBuilder sb = new StringBuilder(31);
                sb.append("Invalid enum value: ");
                sb.append(i3);
                throw new AssertionError(sb.toString());
            } else {
                byte[] bArr = this.f48535e;
                byte[] bArr2 = zziVar2.f48535e;
                if (bArr == bArr2) {
                    return 0;
                }
                if (bArr == null) {
                    return -1;
                }
                if (bArr2 == null) {
                    return 1;
                }
                for (int i4 = 0; i4 < Math.min(this.f48535e.length, zziVar2.f48535e.length); i4++) {
                    int i5 = this.f48535e[i4] - zziVar2.f48535e[i4];
                    if (i5 != 0) {
                        return i5;
                    }
                }
                return m46060b(this.f48535e.length, zziVar2.f48535e.length);
            }
        } else {
            return Double.compare(this.f48533c, zziVar2.f48533c);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj instanceof zzi) {
            zzi zziVar = (zzi) obj;
            if (zzn.m46059a(this.name, zziVar.name) && (i = this.f48536f) == zziVar.f48536f && this.zzah == zziVar.zzah) {
                if (i != 1) {
                    if (i == 2) {
                        return this.f48532b == zziVar.f48532b;
                    } else if (i == 3) {
                        return this.f48533c == zziVar.f48533c;
                    } else if (i != 4) {
                        if (i == 5) {
                            return Arrays.equals(this.f48535e, zziVar.f48535e);
                        }
                        int i2 = this.f48536f;
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Invalid enum value: ");
                        sb.append(i2);
                        throw new AssertionError(sb.toString());
                    } else {
                        return zzn.m46059a(this.f48534d, zziVar.f48534d);
                    }
                } else if (this.f48531a == zziVar.f48531a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Flag(");
        sb.append(this.name);
        sb.append(", ");
        int i = this.f48536f;
        if (i == 1) {
            sb.append(this.f48531a);
        } else if (i == 2) {
            sb.append(this.f48532b);
        } else if (i != 3) {
            if (i == 4) {
                sb.append(OperatorName.SHOW_TEXT_LINE);
                str = this.f48534d;
            } else if (i != 5) {
                String str2 = this.name;
                int i2 = this.f48536f;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 27);
                sb2.append("Invalid type: ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i2);
                throw new AssertionError(sb2.toString());
            } else if (this.f48535e == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(OperatorName.SHOW_TEXT_LINE);
                str = Base64.encodeToString(this.f48535e, 3);
            }
            sb.append(str);
            sb.append(OperatorName.SHOW_TEXT_LINE);
        } else {
            sb.append(this.f48533c);
        }
        sb.append(", ");
        sb.append(this.f48536f);
        sb.append(", ");
        sb.append(this.zzah);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f48531a);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48532b);
        SafeParcelWriter.writeDouble(parcel, 5, this.f48533c);
        SafeParcelWriter.writeString(parcel, 6, this.f48534d, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f48535e, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f48536f);
        SafeParcelWriter.writeInt(parcel, 9, this.zzah);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
