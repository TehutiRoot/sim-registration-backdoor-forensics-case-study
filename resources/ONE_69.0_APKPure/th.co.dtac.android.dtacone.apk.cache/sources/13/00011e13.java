package th.p047co.dtac.android.dtacone.model.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/device_sale/CustomerProfile;", "", Scopes.PROFILE, "Lth/co/dtac/android/dtacone/model/device_sale/Profile;", "subscriber", "Lth/co/dtac/android/dtacone/model/device_sale/Subscriber;", "(Lth/co/dtac/android/dtacone/model/device_sale/Profile;Lth/co/dtac/android/dtacone/model/device_sale/Subscriber;)V", "getProfile", "()Lth/co/dtac/android/dtacone/model/device_sale/Profile;", "setProfile", "(Lth/co/dtac/android/dtacone/model/device_sale/Profile;)V", "getSubscriber", "()Lth/co/dtac/android/dtacone/model/device_sale/Subscriber;", "setSubscriber", "(Lth/co/dtac/android/dtacone/model/device_sale/Subscriber;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.device_sale.CustomerProfile */
/* loaded from: classes8.dex */
public final class CustomerProfile {
    public static final int $stable = 8;
    @SerializedName(Scopes.PROFILE)
    @NotNull
    private Profile profile;
    @SerializedName("subscriber")
    @NotNull
    private Subscriber subscriber;

    public CustomerProfile(@NotNull Profile profile, @NotNull Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.profile = profile;
        this.subscriber = subscriber;
    }

    public static /* synthetic */ CustomerProfile copy$default(CustomerProfile customerProfile, Profile profile, Subscriber subscriber, int i, Object obj) {
        if ((i & 1) != 0) {
            profile = customerProfile.profile;
        }
        if ((i & 2) != 0) {
            subscriber = customerProfile.subscriber;
        }
        return customerProfile.copy(profile, subscriber);
    }

    @NotNull
    public final Profile component1() {
        return this.profile;
    }

    @NotNull
    public final Subscriber component2() {
        return this.subscriber;
    }

    @NotNull
    public final CustomerProfile copy(@NotNull Profile profile, @NotNull Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        return new CustomerProfile(profile, subscriber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerProfile) {
            CustomerProfile customerProfile = (CustomerProfile) obj;
            return Intrinsics.areEqual(this.profile, customerProfile.profile) && Intrinsics.areEqual(this.subscriber, customerProfile.subscriber);
        }
        return false;
    }

    @NotNull
    public final Profile getProfile() {
        return this.profile;
    }

    @NotNull
    public final Subscriber getSubscriber() {
        return this.subscriber;
    }

    public int hashCode() {
        return (this.profile.hashCode() * 31) + this.subscriber.hashCode();
    }

    public final void setProfile(@NotNull Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "<set-?>");
        this.profile = profile;
    }

    public final void setSubscriber(@NotNull Subscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "<set-?>");
        this.subscriber = subscriber;
    }

    @NotNull
    public String toString() {
        Profile profile = this.profile;
        Subscriber subscriber = this.subscriber;
        return "CustomerProfile(profile=" + profile + ", subscriber=" + subscriber + ")";
    }
}