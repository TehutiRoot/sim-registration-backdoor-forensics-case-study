package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/Ou;", "", "subscriber", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Subscriber;", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/Subscriber;)V", "getSubscriber", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Subscriber;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.Ou */
/* loaded from: classes8.dex */
public final class C14235Ou {
    public static final int $stable = 8;
    @SerializedName("subscriber")
    @Nullable
    private final Subscriber subscriber;

    public C14235Ou() {
        this(null, 1, null);
    }

    public static /* synthetic */ C14235Ou copy$default(C14235Ou c14235Ou, Subscriber subscriber, int i, Object obj) {
        if ((i & 1) != 0) {
            subscriber = c14235Ou.subscriber;
        }
        return c14235Ou.copy(subscriber);
    }

    @Nullable
    public final Subscriber component1() {
        return this.subscriber;
    }

    @NotNull
    public final C14235Ou copy(@Nullable Subscriber subscriber) {
        return new C14235Ou(subscriber);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14235Ou) && Intrinsics.areEqual(this.subscriber, ((C14235Ou) obj).subscriber);
    }

    @Nullable
    public final Subscriber getSubscriber() {
        return this.subscriber;
    }

    public int hashCode() {
        Subscriber subscriber = this.subscriber;
        if (subscriber == null) {
            return 0;
        }
        return subscriber.hashCode();
    }

    @NotNull
    public String toString() {
        Subscriber subscriber = this.subscriber;
        return "Ou(subscriber=" + subscriber + ")";
    }

    public C14235Ou(@Nullable Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public /* synthetic */ C14235Ou(Subscriber subscriber, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : subscriber);
    }
}
