package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/Subscriber;", "", "offers", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Offers;", "productCharacteristic", "", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/ProductCharacteristicItem;", "(Lth/co/dtac/android/dtacone/model/appOne/prepaid/Offers;Ljava/util/List;)V", "getOffers", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Offers;", "getProductCharacteristic", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.Subscriber */
/* loaded from: classes8.dex */
public final class Subscriber {
    public static final int $stable = 8;
    @SerializedName("offers")
    @Nullable
    private final Offers offers;
    @SerializedName("productCharacteristic")
    @Nullable
    private final List<ProductCharacteristicItem> productCharacteristic;

    public Subscriber() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Subscriber copy$default(Subscriber subscriber, Offers offers, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            offers = subscriber.offers;
        }
        if ((i & 2) != 0) {
            list = subscriber.productCharacteristic;
        }
        return subscriber.copy(offers, list);
    }

    @Nullable
    public final Offers component1() {
        return this.offers;
    }

    @Nullable
    public final List<ProductCharacteristicItem> component2() {
        return this.productCharacteristic;
    }

    @NotNull
    public final Subscriber copy(@Nullable Offers offers, @Nullable List<ProductCharacteristicItem> list) {
        return new Subscriber(offers, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subscriber) {
            Subscriber subscriber = (Subscriber) obj;
            return Intrinsics.areEqual(this.offers, subscriber.offers) && Intrinsics.areEqual(this.productCharacteristic, subscriber.productCharacteristic);
        }
        return false;
    }

    @Nullable
    public final Offers getOffers() {
        return this.offers;
    }

    @Nullable
    public final List<ProductCharacteristicItem> getProductCharacteristic() {
        return this.productCharacteristic;
    }

    public int hashCode() {
        Offers offers = this.offers;
        int hashCode = (offers == null ? 0 : offers.hashCode()) * 31;
        List<ProductCharacteristicItem> list = this.productCharacteristic;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Offers offers = this.offers;
        List<ProductCharacteristicItem> list = this.productCharacteristic;
        return "Subscriber(offers=" + offers + ", productCharacteristic=" + list + ")";
    }

    public Subscriber(@Nullable Offers offers, @Nullable List<ProductCharacteristicItem> list) {
        this.offers = offers;
        this.productCharacteristic = list;
    }

    public /* synthetic */ Subscriber(Offers offers, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : offers, (i & 2) != 0 ? null : list);
    }
}