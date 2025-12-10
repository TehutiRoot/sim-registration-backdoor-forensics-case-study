package co.omise.android.config;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÀ\u0003¢\u0006\u0002\b\nJ\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m28850d2 = {"Lco/omise/android/config/UiCustomization;", "Landroid/os/Parcelable;", "uiCustomizationMap", "", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization$UiCustomizationType;", "Lcom/netcetera/threeds/sdk/api/ui/logic/UiCustomization;", "(Ljava/util/Map;)V", "getUiCustomizationMap$sdk_productionRelease", "()Ljava/util/Map;", "component1", "component1$sdk_productionRelease", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes.dex */
public final class UiCustomization implements Parcelable {
    @NotNull
    private final Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> uiCustomizationMap;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<UiCustomization> CREATOR = new Creator();
    @NotNull

    /* renamed from: default  reason: not valid java name */
    private static final UiCustomization f109310default = new UiCustomization(AbstractC11687a.emptyMap());

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lco/omise/android/config/UiCustomization$Companion;", "", "()V", "default", "Lco/omise/android/config/UiCustomization;", "getDefault", "()Lco/omise/android/config/UiCustomization;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UiCustomization getDefault() {
            return UiCustomization.f109310default;
        }

        private Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<UiCustomization> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UiCustomization createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(UiCustomization.UiCustomizationType.valueOf(parcel.readString()), parcel.readSerializable());
            }
            return new UiCustomization(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UiCustomization[] newArray(int i) {
            return new UiCustomization[i];
        }
    }

    public UiCustomization(@NotNull Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> uiCustomizationMap) {
        Intrinsics.checkNotNullParameter(uiCustomizationMap, "uiCustomizationMap");
        this.uiCustomizationMap = uiCustomizationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiCustomization copy$default(UiCustomization uiCustomization, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = uiCustomization.uiCustomizationMap;
        }
        return uiCustomization.copy(map);
    }

    @NotNull
    public final Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> component1$sdk_productionRelease() {
        return this.uiCustomizationMap;
    }

    @NotNull
    public final UiCustomization copy(@NotNull Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> uiCustomizationMap) {
        Intrinsics.checkNotNullParameter(uiCustomizationMap, "uiCustomizationMap");
        return new UiCustomization(uiCustomizationMap);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UiCustomization) && Intrinsics.areEqual(this.uiCustomizationMap, ((UiCustomization) obj).uiCustomizationMap);
    }

    @NotNull
    public final Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> getUiCustomizationMap$sdk_productionRelease() {
        return this.uiCustomizationMap;
    }

    public int hashCode() {
        return this.uiCustomizationMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "UiCustomization(uiCustomizationMap=" + this.uiCustomizationMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> map = this.uiCustomizationMap;
        out.writeInt(map.size());
        for (Map.Entry<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization> entry : map.entrySet()) {
            out.writeString(entry.getKey().name());
            out.writeSerializable(entry.getValue());
        }
    }
}
