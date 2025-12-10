package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* loaded from: classes3.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();

    /* renamed from: a */
    public final int f45233a;

    /* renamed from: b */
    public final HashMap f45234b;

    /* renamed from: c */
    public final SparseArray f45235c;

    @KeepForSdk
    public StringToIntConverter() {
        this.f45233a = 1;
        this.f45234b = new HashMap();
        this.f45235c = new SparseArray();
    }

    @NonNull
    @CanIgnoreReturnValue
    @KeepForSdk
    public StringToIntConverter add(@NonNull String str, int i) {
        this.f45234b.put(str, Integer.valueOf(i));
        this.f45235c.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f45233a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f45234b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f45234b.get(str)).intValue()));
        }
        SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @Nullable
    public final /* bridge */ /* synthetic */ Object zac(@NonNull Object obj) {
        Integer num = (Integer) this.f45234b.get((String) obj);
        if (num == null) {
            return (Integer) this.f45234b.get("gms_unknown");
        }
        return num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @NonNull
    public final /* bridge */ /* synthetic */ Object zad(@NonNull Object obj) {
        String str = (String) this.f45235c.get(((Integer) obj).intValue());
        if (str == null && this.f45234b.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.f45233a = i;
        this.f45234b = new HashMap();
        this.f45235c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = (zac) arrayList.get(i2);
            add(zacVar.f45239b, zacVar.f45240c);
        }
    }
}
