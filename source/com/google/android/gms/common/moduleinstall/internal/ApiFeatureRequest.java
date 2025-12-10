package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@KeepForSdk
@SafeParcelable.Class(creator = "ApiFeatureRequestCreator")
/* loaded from: classes3.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zac();

    /* renamed from: e */
    public static final Comparator f45223e = zab.zaa;

    /* renamed from: a */
    public final List f45224a;

    /* renamed from: b */
    public final boolean f45225b;

    /* renamed from: c */
    public final String f45226c;

    /* renamed from: d */
    public final String f45227d;

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@NonNull @SafeParcelable.Param(m48388id = 1) List list, @SafeParcelable.Param(m48388id = 2) boolean z, @Nullable @SafeParcelable.Param(m48388id = 3) String str, @Nullable @SafeParcelable.Param(m48388id = 4) String str2) {
        Preconditions.checkNotNull(list);
        this.f45224a = list;
        this.f45225b = z;
        this.f45226c = str;
        this.f45227d = str2;
    }

    /* renamed from: b */
    public static ApiFeatureRequest m48369b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(f45223e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((OptionalModuleApi) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    @NonNull
    @KeepForSdk
    public static ApiFeatureRequest fromModuleInstallRequest(@NonNull ModuleInstallRequest moduleInstallRequest) {
        return m48369b(moduleInstallRequest.getApis(), true);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f45225b != apiFeatureRequest.f45225b || !Objects.equal(this.f45224a, apiFeatureRequest.f45224a) || !Objects.equal(this.f45226c, apiFeatureRequest.f45226c) || !Objects.equal(this.f45227d, apiFeatureRequest.f45227d)) {
            return false;
        }
        return true;
    }

    @NonNull
    @KeepForSdk
    public List<Feature> getApiFeatures() {
        return this.f45224a;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f45225b), this.f45224a, this.f45226c, this.f45227d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getApiFeatures(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45225b);
        SafeParcelWriter.writeString(parcel, 3, this.f45226c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45227d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
