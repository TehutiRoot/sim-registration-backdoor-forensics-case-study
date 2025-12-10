package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.Class(creator = "GeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new zzbb();
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;

    /* renamed from: a */
    public final List f47741a;

    /* renamed from: b */
    public final int f47742b;

    /* renamed from: c */
    public final String f47743c;

    /* renamed from: d */
    public final String f47744d;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f47745a = new ArrayList();

        /* renamed from: b */
        public int f47746b = 5;

        /* renamed from: c */
        public String f47747c = "";

        @NonNull
        public Builder addGeofence(@NonNull Geofence geofence) {
            Preconditions.checkNotNull(geofence, "geofence can't be null.");
            Preconditions.checkArgument(geofence instanceof com.google.android.gms.internal.location.zzbj, "Geofence must be created using Geofence.Builder.");
            this.f47745a.add((com.google.android.gms.internal.location.zzbj) geofence);
            return this;
        }

        @NonNull
        public Builder addGeofences(@NonNull List<Geofence> list) {
            if (list != null && !list.isEmpty()) {
                for (Geofence geofence : list) {
                    if (geofence != null) {
                        addGeofence(geofence);
                    }
                }
            }
            return this;
        }

        @NonNull
        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.f47745a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f47745a, this.f47746b, this.f47747c, null);
        }

        @NonNull
        public Builder setInitialTrigger(@InitialTrigger int i) {
            this.f47746b = i & 7;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public @interface InitialTrigger {
    }

    public GeofencingRequest(List list, int i, String str, String str2) {
        this.f47741a = list;
        this.f47742b = i;
        this.f47743c = str;
        this.f47744d = str2;
    }

    @NonNull
    public List<Geofence> getGeofences() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f47741a);
        return arrayList;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.f47742b;
    }

    @NonNull
    public String toString() {
        return "GeofencingRequest[geofences=" + this.f47741a + ", initialTrigger=" + this.f47742b + ", tag=" + this.f47743c + ", attributionTag=" + this.f47744d + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f47741a, false);
        SafeParcelWriter.writeInt(parcel, 2, getInitialTrigger());
        SafeParcelWriter.writeString(parcel, 3, this.f47743c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f47744d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @NonNull
    public final GeofencingRequest zza(@Nullable String str) {
        return new GeofencingRequest(this.f47741a, this.f47742b, this.f47743c, str);
    }
}
