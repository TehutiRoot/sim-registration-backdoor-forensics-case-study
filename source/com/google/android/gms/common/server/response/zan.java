package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* loaded from: classes3.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();

    /* renamed from: a */
    public final int f45277a;

    /* renamed from: b */
    public final HashMap f45278b;

    /* renamed from: c */
    public final String f45279c;

    public zan(int i, ArrayList arrayList, String str) {
        this.f45277a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = (zal) arrayList.get(i2);
            String str2 = zalVar.f45272b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.checkNotNull(zalVar.f45273c)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = (zam) zalVar.f45273c.get(i3);
                hashMap2.put(zamVar.f45275b, zamVar.f45276c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f45278b = hashMap;
        this.f45279c = (String) Preconditions.checkNotNull(str);
        zad();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f45278b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f45278b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45277a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f45278b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f45278b.get(str)));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.writeString(parcel, 3, this.f45279c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zaa() {
        return this.f45279c;
    }

    @Nullable
    public final Map zab(String str) {
        return (Map) this.f45278b.get(str);
    }

    public final void zac() {
        for (String str : this.f45278b.keySet()) {
            Map map = (Map) this.f45278b.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.f45278b.put(str, hashMap);
        }
    }

    public final void zad() {
        for (String str : this.f45278b.keySet()) {
            Map map = (Map) this.f45278b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).zai(this);
            }
        }
    }

    public final void zae(Class cls, Map map) {
        this.f45278b.put((String) Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(Class cls) {
        return this.f45278b.containsKey(Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(Class cls) {
        this.f45277a = 1;
        this.f45278b = new HashMap();
        this.f45279c = (String) Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
