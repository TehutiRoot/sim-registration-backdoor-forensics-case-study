package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;

@KeepName
@SafeParcelable.Class(creator = "CommonWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new zzc();

    /* renamed from: a */
    public String f48862a;

    /* renamed from: b */
    public String f48863b;

    /* renamed from: c */
    public String f48864c;

    /* renamed from: d */
    public String f48865d;

    /* renamed from: e */
    public String f48866e;

    /* renamed from: f */
    public String f48867f;

    /* renamed from: g */
    public String f48868g;

    /* renamed from: h */
    public String f48869h;

    /* renamed from: i */
    public int f48870i;

    /* renamed from: j */
    public ArrayList f48871j;

    /* renamed from: k */
    public TimeInterval f48872k;

    /* renamed from: l */
    public ArrayList f48873l;

    /* renamed from: m */
    public String f48874m;

    /* renamed from: n */
    public String f48875n;

    /* renamed from: o */
    public ArrayList f48876o;

    /* renamed from: p */
    public boolean f48877p;

    /* renamed from: q */
    public ArrayList f48878q;

    /* renamed from: r */
    public ArrayList f48879r;

    /* renamed from: s */
    public ArrayList f48880s;

    public CommonWalletObject() {
        this.f48871j = ArrayUtils.newArrayList();
        this.f48873l = ArrayUtils.newArrayList();
        this.f48876o = ArrayUtils.newArrayList();
        this.f48878q = ArrayUtils.newArrayList();
        this.f48879r = ArrayUtils.newArrayList();
        this.f48880s = ArrayUtils.newArrayList();
    }

    public static zzb zzb() {
        return new zzb(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48862a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48863b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48864c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48865d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48866e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48867f, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48868g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48869h, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f48870i);
        SafeParcelWriter.writeTypedList(parcel, 11, this.f48871j, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f48872k, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, this.f48873l, false);
        SafeParcelWriter.writeString(parcel, 14, this.f48874m, false);
        SafeParcelWriter.writeString(parcel, 15, this.f48875n, false);
        SafeParcelWriter.writeTypedList(parcel, 16, this.f48876o, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f48877p);
        SafeParcelWriter.writeTypedList(parcel, 18, this.f48878q, false);
        SafeParcelWriter.writeTypedList(parcel, 19, this.f48879r, false);
        SafeParcelWriter.writeTypedList(parcel, 20, this.f48880s, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.f48870i;
    }

    @NonNull
    public final TimeInterval zzc() {
        return this.f48872k;
    }

    @NonNull
    public final String zzd() {
        return this.f48866e;
    }

    @NonNull
    @Deprecated
    public final String zze() {
        return this.f48869h;
    }

    @NonNull
    public final String zzf() {
        return this.f48867f;
    }

    @NonNull
    public final String zzg() {
        return this.f48868g;
    }

    @NonNull
    public final String zzh() {
        return this.f48863b;
    }

    @NonNull
    public final String zzi() {
        return this.f48862a;
    }

    @NonNull
    @Deprecated
    public final String zzj() {
        return this.f48875n;
    }

    @NonNull
    @Deprecated
    public final String zzk() {
        return this.f48874m;
    }

    @NonNull
    public final String zzl() {
        return this.f48865d;
    }

    @NonNull
    public final String zzm() {
        return this.f48864c;
    }

    @NonNull
    public final ArrayList zzn() {
        return this.f48878q;
    }

    @NonNull
    public final ArrayList zzo() {
        return this.f48876o;
    }

    @NonNull
    public final ArrayList zzp() {
        return this.f48880s;
    }

    @NonNull
    public final ArrayList zzq() {
        return this.f48873l;
    }

    @NonNull
    public final ArrayList zzr() {
        return this.f48871j;
    }

    @NonNull
    public final ArrayList zzs() {
        return this.f48879r;
    }

    public final boolean zzt() {
        return this.f48877p;
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f48862a = str;
        this.f48863b = str2;
        this.f48864c = str3;
        this.f48865d = str4;
        this.f48866e = str5;
        this.f48867f = str6;
        this.f48868g = str7;
        this.f48869h = str8;
        this.f48870i = i;
        this.f48871j = arrayList;
        this.f48872k = timeInterval;
        this.f48873l = arrayList2;
        this.f48874m = str9;
        this.f48875n = str10;
        this.f48876o = arrayList3;
        this.f48877p = z;
        this.f48878q = arrayList4;
        this.f48879r = arrayList5;
        this.f48880s = arrayList6;
    }
}
