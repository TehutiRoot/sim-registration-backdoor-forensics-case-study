package co.omise.android.config;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m28850d2 = {"Lco/omise/android/config/ToolbarCustomization;", "Landroid/os/Parcelable;", "toolbarCustomization", "Lcom/netcetera/threeds/sdk/api/ui/logic/ToolbarCustomization;", "(Lcom/netcetera/threeds/sdk/api/ui/logic/ToolbarCustomization;)V", "getToolbarCustomization$sdk_productionRelease", "()Lcom/netcetera/threeds/sdk/api/ui/logic/ToolbarCustomization;", "component1", "component1$sdk_productionRelease", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class ToolbarCustomization implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<ToolbarCustomization> CREATOR = new Creator();
    @NotNull
    private final com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization;

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<ToolbarCustomization> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ToolbarCustomization createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ToolbarCustomization((com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ToolbarCustomization[] newArray(int i) {
            return new ToolbarCustomization[i];
        }
    }

    public ToolbarCustomization(@NotNull com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
        this.toolbarCustomization = toolbarCustomization;
    }

    public static /* synthetic */ ToolbarCustomization copy$default(ToolbarCustomization toolbarCustomization, com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization2, int i, Object obj) {
        if ((i & 1) != 0) {
            toolbarCustomization2 = toolbarCustomization.toolbarCustomization;
        }
        return toolbarCustomization.copy(toolbarCustomization2);
    }

    @NotNull
    public final com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization component1$sdk_productionRelease() {
        return this.toolbarCustomization;
    }

    @NotNull
    public final ToolbarCustomization copy(@NotNull com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization toolbarCustomization) {
        Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
        return new ToolbarCustomization(toolbarCustomization);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolbarCustomization) && Intrinsics.areEqual(this.toolbarCustomization, ((ToolbarCustomization) obj).toolbarCustomization);
    }

    @NotNull
    public final com.netcetera.threeds.sdk.api.p018ui.logic.ToolbarCustomization getToolbarCustomization$sdk_productionRelease() {
        return this.toolbarCustomization;
    }

    public int hashCode() {
        return this.toolbarCustomization.hashCode();
    }

    @NotNull
    public String toString() {
        return "ToolbarCustomization(toolbarCustomization=" + this.toolbarCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeSerializable(this.toolbarCustomization);
    }
}
