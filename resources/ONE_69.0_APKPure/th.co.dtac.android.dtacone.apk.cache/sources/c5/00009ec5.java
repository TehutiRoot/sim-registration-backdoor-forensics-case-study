package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@KeepForSdk
@SafeParcelable.Class(creator = "ConfigurationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class Configuration extends AbstractSafeParcelable implements Comparable<Configuration> {
    @KeepForSdk
    public static final Parcelable.Creator<Configuration> CREATOR = new zzc();

    /* renamed from: a */
    public final int f48498a;

    /* renamed from: b */
    public final zzi[] f48499b;

    /* renamed from: c */
    public final String[] f48500c;

    /* renamed from: d */
    public final Map f48501d = new TreeMap();

    @SafeParcelable.Constructor
    public Configuration(@SafeParcelable.Param(m48385id = 2) int i, @SafeParcelable.Param(m48385id = 3) zzi[] zziVarArr, @SafeParcelable.Param(m48385id = 4) String[] strArr) {
        this.f48498a = i;
        this.f48499b = zziVarArr;
        for (zzi zziVar : zziVarArr) {
            this.f48501d.put(zziVar.name, zziVar);
        }
        this.f48500c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Configuration configuration) {
        return this.f48498a - configuration.f48498a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f48498a == configuration.f48498a && zzn.m46044a(this.f48501d, configuration.f48501d) && Arrays.equals(this.f48500c, configuration.f48500c)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f48498a);
        sb.append(", ");
        sb.append("(");
        for (zzi zziVar : this.f48501d.values()) {
            sb.append(zziVar);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.f48500c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append(AbstractJsonLexerKt.NULL);
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48498a);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.f48499b, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f48500c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}