package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "LabelValueRowCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new zzf();

    /* renamed from: a */
    public String f48883a;

    /* renamed from: b */
    public String f48884b;

    /* renamed from: c */
    public ArrayList f48885c;

    /* loaded from: classes4.dex */
    public final class Builder {
        public /* synthetic */ Builder(zze zzeVar) {
        }

        @NonNull
        public Builder addColumn(@NonNull LabelValue labelValue) {
            LabelValueRow.this.f48885c.add(labelValue);
            return this;
        }

        @NonNull
        public Builder addColumns(@NonNull Collection<LabelValue> collection) {
            LabelValueRow.this.f48885c.addAll(collection);
            return this;
        }

        @NonNull
        public LabelValueRow build() {
            return LabelValueRow.this;
        }

        @NonNull
        @Deprecated
        public Builder setHexBackgroundColor(@NonNull String str) {
            LabelValueRow.this.f48884b = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setHexFontColor(@NonNull String str) {
            LabelValueRow.this.f48883a = str;
            return this;
        }
    }

    public LabelValueRow() {
        this.f48885c = ArrayUtils.newArrayList();
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public ArrayList<LabelValue> getColumns() {
        return this.f48885c;
    }

    @NonNull
    @Deprecated
    public String getHexBackgroundColor() {
        return this.f48884b;
    }

    @NonNull
    @Deprecated
    public String getHexFontColor() {
        return this.f48883a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48883a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48884b, false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.f48885c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.f48883a = str;
        this.f48884b = str2;
        this.f48885c = arrayList;
    }
}
