package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/MrtrPackageInfoResponse;", "", "nextPackage", "Lth/co/dtac/android/dtacone/model/customerenquiry/NextPackage;", "currentPackage", "Lth/co/dtac/android/dtacone/model/customerenquiry/CurrentPackage;", "(Lth/co/dtac/android/dtacone/model/customerenquiry/NextPackage;Lth/co/dtac/android/dtacone/model/customerenquiry/CurrentPackage;)V", "getCurrentPackage", "()Lth/co/dtac/android/dtacone/model/customerenquiry/CurrentPackage;", "getNextPackage", "()Lth/co/dtac/android/dtacone/model/customerenquiry/NextPackage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.MrtrPackageInfoResponse */
/* loaded from: classes8.dex */
public final class MrtrPackageInfoResponse {
    public static final int $stable = 8;
    @SerializedName("currentPackage")
    @Nullable
    private final CurrentPackage currentPackage;
    @SerializedName("nextPackage")
    @Nullable
    private final NextPackage nextPackage;

    public MrtrPackageInfoResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MrtrPackageInfoResponse copy$default(MrtrPackageInfoResponse mrtrPackageInfoResponse, NextPackage nextPackage, CurrentPackage currentPackage, int i, Object obj) {
        if ((i & 1) != 0) {
            nextPackage = mrtrPackageInfoResponse.nextPackage;
        }
        if ((i & 2) != 0) {
            currentPackage = mrtrPackageInfoResponse.currentPackage;
        }
        return mrtrPackageInfoResponse.copy(nextPackage, currentPackage);
    }

    @Nullable
    public final NextPackage component1() {
        return this.nextPackage;
    }

    @Nullable
    public final CurrentPackage component2() {
        return this.currentPackage;
    }

    @NotNull
    public final MrtrPackageInfoResponse copy(@Nullable NextPackage nextPackage, @Nullable CurrentPackage currentPackage) {
        return new MrtrPackageInfoResponse(nextPackage, currentPackage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPackageInfoResponse) {
            MrtrPackageInfoResponse mrtrPackageInfoResponse = (MrtrPackageInfoResponse) obj;
            return Intrinsics.areEqual(this.nextPackage, mrtrPackageInfoResponse.nextPackage) && Intrinsics.areEqual(this.currentPackage, mrtrPackageInfoResponse.currentPackage);
        }
        return false;
    }

    @Nullable
    public final CurrentPackage getCurrentPackage() {
        return this.currentPackage;
    }

    @Nullable
    public final NextPackage getNextPackage() {
        return this.nextPackage;
    }

    public int hashCode() {
        NextPackage nextPackage = this.nextPackage;
        int hashCode = (nextPackage == null ? 0 : nextPackage.hashCode()) * 31;
        CurrentPackage currentPackage = this.currentPackage;
        return hashCode + (currentPackage != null ? currentPackage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NextPackage nextPackage = this.nextPackage;
        CurrentPackage currentPackage = this.currentPackage;
        return "MrtrPackageInfoResponse(nextPackage=" + nextPackage + ", currentPackage=" + currentPackage + ")";
    }

    public MrtrPackageInfoResponse(@Nullable NextPackage nextPackage, @Nullable CurrentPackage currentPackage) {
        this.nextPackage = nextPackage;
        this.currentPackage = currentPackage;
    }

    public /* synthetic */ MrtrPackageInfoResponse(NextPackage nextPackage, CurrentPackage currentPackage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nextPackage, (i & 2) != 0 ? null : currentPackage);
    }
}