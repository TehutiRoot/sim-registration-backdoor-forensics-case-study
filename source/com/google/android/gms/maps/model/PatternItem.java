package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class PatternItem extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzq();

    /* renamed from: c */
    public static final String f47974c = "PatternItem";

    /* renamed from: a */
    public final int f47975a;

    /* renamed from: b */
    public final Float f47976b;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(m48388id = 2) int i, @Nullable @SafeParcelable.Param(m48388id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid PatternItem: type=" + i + " length=" + f);
        this.f47975a = i;
        this.f47976b = f;
    }

    /* renamed from: b */
    public static List m46385b(List list) {
        PatternItem dash;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem patternItem = (PatternItem) it.next();
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i = patternItem.f47975a;
                boolean z = false;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            Log.w(f47974c, "Unknown PatternItem type: " + i);
                        } else {
                            if (patternItem.f47976b != null) {
                                z = true;
                            }
                            Preconditions.checkState(z, "length must not be null.");
                            dash = new Gap(patternItem.f47976b.floatValue());
                        }
                    } else {
                        patternItem = new Dot();
                    }
                } else {
                    if (patternItem.f47976b != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    dash = new Dash(patternItem.f47976b.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.f47975a == patternItem.f47975a && Objects.equal(this.f47976b, patternItem.f47976b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47975a), this.f47976b);
    }

    @NonNull
    public String toString() {
        return "[PatternItem: type=" + this.f47975a + " length=" + this.f47976b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f47975a;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.f47976b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
