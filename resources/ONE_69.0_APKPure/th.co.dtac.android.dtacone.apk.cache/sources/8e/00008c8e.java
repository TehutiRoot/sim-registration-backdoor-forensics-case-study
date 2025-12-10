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
    public static final Comparator f45235e = zab.zaa;

    /* renamed from: a */
    public final List f45236a;

    /* renamed from: b */
    public final boolean f45237b;

    /* renamed from: c */
    public final String f45238c;

    /* renamed from: d */
    public final String f45239d;

    @SafeParcelable.Constructor
    public ApiFeatureRequest(@NonNull @SafeParcelable.Param(m48385id = 1) List list, @SafeParcelable.Param(m48385id = 2) boolean z, @Nullable @SafeParcelable.Param(m48385id = 3) String str, @Nullable @SafeParcelable.Param(m48385id = 4) String str2) {
        Preconditions.checkNotNull(list);
        this.f45236a = list;
        this.f45237b = z;
        this.f45238c = str;
        this.f45239d = str2;
    }

    /* renamed from: b */
    public static ApiFeatureRequest m48366b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(f45235e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((OptionalModuleApi) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    @NonNull
    @KeepForSdk
    public static ApiFeatureRequest fromModuleInstallRequest(@NonNull ModuleInstallRequest moduleInstallRequest) {
        return m48366b(moduleInstallRequest.getApis(), true);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f45237b != apiFeatureRequest.f45237b || !Objects.equal(this.f45236a, apiFeatureRequest.f45236a) || !Objects.equal(this.f45238c, apiFeatureRequest.f45238c) || !Objects.equal(this.f45239d, apiFeatureRequest.f45239d)) {
            return false;
        }
        return true;
    }

    @NonNull
    @KeepForSdk
    public List<Feature> getApiFeatures() {
        return this.f45236a;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f45237b), this.f45236a, this.f45238c, this.f45239d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getApiFeatures(), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45237b);
        SafeParcelWriter.writeString(parcel, 3, this.f45238c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f45239d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}