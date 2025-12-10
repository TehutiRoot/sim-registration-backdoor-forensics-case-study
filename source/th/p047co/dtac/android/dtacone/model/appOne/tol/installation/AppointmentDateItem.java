package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDateItem;", "", "date", "", "morningAvailable", "", "afternoonAvailable", "(Ljava/lang/String;ZZ)V", "getAfternoonAvailable", "()Z", "getDate", "()Ljava/lang/String;", "getMorningAvailable", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem */
/* loaded from: classes8.dex */
public final class AppointmentDateItem {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("afternoonAvailable")
    private final boolean afternoonAvailable;
    @SerializedName("date")
    @NotNull
    private final String date;
    @SerializedName("morningAvailable")
    private final boolean morningAvailable;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDateItem$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentDateItem;", "date", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppointmentDateItem mock(@NotNull String date) {
            boolean z;
            Intrinsics.checkNotNullParameter(date, "date");
            boolean z2 = false;
            IntRange intRange = new IntRange(0, 1);
            Random.Default r4 = Random.Default;
            if (AbstractC11719c.random(intRange, r4) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (AbstractC11719c.random(new IntRange(0, 1), r4) == 1) {
                z2 = true;
            }
            return new AppointmentDateItem(date, z, z2);
        }

        private Companion() {
        }
    }

    public AppointmentDateItem(@NotNull String date, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
        this.morningAvailable = z;
        this.afternoonAvailable = z2;
    }

    public static /* synthetic */ AppointmentDateItem copy$default(AppointmentDateItem appointmentDateItem, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appointmentDateItem.date;
        }
        if ((i & 2) != 0) {
            z = appointmentDateItem.morningAvailable;
        }
        if ((i & 4) != 0) {
            z2 = appointmentDateItem.afternoonAvailable;
        }
        return appointmentDateItem.copy(str, z, z2);
    }

    @NotNull
    public final String component1() {
        return this.date;
    }

    public final boolean component2() {
        return this.morningAvailable;
    }

    public final boolean component3() {
        return this.afternoonAvailable;
    }

    @NotNull
    public final AppointmentDateItem copy(@NotNull String date, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new AppointmentDateItem(date, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppointmentDateItem) {
            AppointmentDateItem appointmentDateItem = (AppointmentDateItem) obj;
            return Intrinsics.areEqual(this.date, appointmentDateItem.date) && this.morningAvailable == appointmentDateItem.morningAvailable && this.afternoonAvailable == appointmentDateItem.afternoonAvailable;
        }
        return false;
    }

    public final boolean getAfternoonAvailable() {
        return this.afternoonAvailable;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final boolean getMorningAvailable() {
        return this.morningAvailable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.date.hashCode() * 31;
        boolean z = this.morningAvailable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.afternoonAvailable;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        String str = this.date;
        boolean z = this.morningAvailable;
        boolean z2 = this.afternoonAvailable;
        return "AppointmentDateItem(date=" + str + ", morningAvailable=" + z + ", afternoonAvailable=" + z2 + ")";
    }
}
