package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes3.dex */
public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    /* renamed from: g */
    public static final ArrayMap f44480g;

    /* renamed from: a */
    public final int f44481a;

    /* renamed from: b */
    public List f44482b;

    /* renamed from: c */
    public List f44483c;

    /* renamed from: d */
    public List f44484d;

    /* renamed from: e */
    public List f44485e;

    /* renamed from: f */
    public List f44486f;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f44480g = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        arrayMap.put(FirebaseAnalytics.Param.SUCCESS, FastJsonResponse.Field.forStrings(FirebaseAnalytics.Param.SUCCESS, 4));
        arrayMap.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzo() {
        this.f44481a = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return f44480g;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.f44481a);
            case 2:
                return this.f44482b;
            case 3:
                return this.f44483c;
            case 4:
                return this.f44484d;
            case 5:
                return this.f44485e;
            case 6:
                return this.f44486f;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(safeParcelableFieldId);
                throw new IllegalStateException(sb.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId != 4) {
                    if (safeParcelableFieldId != 5) {
                        if (safeParcelableFieldId == 6) {
                            this.f44486f = arrayList;
                            return;
                        }
                        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
                    }
                    this.f44485e = arrayList;
                    return;
                }
                this.f44484d = arrayList;
                return;
            }
            this.f44483c = arrayList;
            return;
        }
        this.f44482b = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44481a);
        SafeParcelWriter.writeStringList(parcel, 2, this.f44482b, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.f44483c, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.f44484d, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f44485e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f44486f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzo(int i, List list, List list2, List list3, List list4, List list5) {
        this.f44481a = i;
        this.f44482b = list;
        this.f44483c = list2;
        this.f44484d = list3;
        this.f44485e = list4;
        this.f44486f = list5;
    }
}
