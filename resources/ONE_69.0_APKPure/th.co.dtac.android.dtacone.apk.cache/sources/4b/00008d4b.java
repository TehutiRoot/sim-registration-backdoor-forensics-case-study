package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class(creator = "UserAddressRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class UserAddressRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<UserAddressRequest> CREATOR = new zze();

    /* renamed from: a */
    public List f45411a;

    /* loaded from: classes3.dex */
    public final class Builder {
        public /* synthetic */ Builder(AbstractC23077xi2 abstractC23077xi2) {
        }

        @NonNull
        public Builder addAllowedCountrySpecification(@NonNull CountrySpecification countrySpecification) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.f45411a == null) {
                userAddressRequest.f45411a = new ArrayList();
            }
            UserAddressRequest.this.f45411a.add(countrySpecification);
            return this;
        }

        @NonNull
        public Builder addAllowedCountrySpecifications(@NonNull Collection<CountrySpecification> collection) {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            if (userAddressRequest.f45411a == null) {
                userAddressRequest.f45411a = new ArrayList();
            }
            UserAddressRequest.this.f45411a.addAll(collection);
            return this;
        }

        @NonNull
        public UserAddressRequest build() {
            UserAddressRequest userAddressRequest = UserAddressRequest.this;
            List list = userAddressRequest.f45411a;
            if (list != null) {
                userAddressRequest.f45411a = Collections.unmodifiableList(list);
            }
            return UserAddressRequest.this;
        }
    }

    public UserAddressRequest() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 2, this.f45411a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public UserAddressRequest(List list) {
        this.f45411a = list;
    }
}