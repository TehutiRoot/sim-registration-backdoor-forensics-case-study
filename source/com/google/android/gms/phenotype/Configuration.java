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
    public final int f48486a;

    /* renamed from: b */
    public final zzi[] f48487b;

    /* renamed from: c */
    public final String[] f48488c;

    /* renamed from: d */
    public final Map f48489d = new TreeMap();

    @SafeParcelable.Constructor
    public Configuration(@SafeParcelable.Param(m48388id = 2) int i, @SafeParcelable.Param(m48388id = 3) zzi[] zziVarArr, @SafeParcelable.Param(m48388id = 4) String[] strArr) {
        this.f48486a = i;
        this.f48487b = zziVarArr;
        for (zzi zziVar : zziVarArr) {
            this.f48489d.put(zziVar.name, zziVar);
        }
        this.f48488c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Configuration configuration) {
        return this.f48486a - configuration.f48486a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            if (this.f48486a == configuration.f48486a && zzn.m46059a(this.f48489d, configuration.f48489d) && Arrays.equals(this.f48488c, configuration.f48488c)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f48486a);
        sb.append(", ");
        sb.append("(");
        for (zzi zziVar : this.f48489d.values()) {
            sb.append(zziVar);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.f48488c;
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
        SafeParcelWriter.writeInt(parcel, 2, this.f48486a);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.f48487b, i, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f48488c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
