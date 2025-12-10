package th.p047co.dtac.android.dtacone.model.mrtr_change_sim;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.change_sim.ChangeSimConfig;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.reason.response.MrtrChangeSimReasonResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010¨\u0006,"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_change_sim/MrtrChangeSimSaveStateBusinessError;", "", "isAttorney", "", "changeSimConfig", "Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "changeSimReason", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;", "requireFaceRecognition", "isCheckSimStock", "airportShop", "isAutoTransferEDMS", "(ZLth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;ZZZZ)V", "getAirportShop", "()Z", "setAirportShop", "(Z)V", "getChangeSimConfig", "()Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;", "setChangeSimConfig", "(Lth/co/dtac/android/dtacone/model/change_sim/ChangeSimConfig;)V", "getChangeSimReason", "()Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;", "setChangeSimReason", "(Lth/co/dtac/android/dtacone/model/mrtr_change_sim/reason/response/MrtrChangeSimReasonResponse;)V", "setAttorney", "setAutoTransferEDMS", "setCheckSimStock", "getRequireFaceRecognition", "setRequireFaceRecognition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_change_sim.MrtrChangeSimSaveStateBusinessError */
/* loaded from: classes8.dex */
public final class MrtrChangeSimSaveStateBusinessError {
    public static final int $stable = 8;
    private boolean airportShop;
    @Nullable
    private ChangeSimConfig changeSimConfig;
    @Nullable
    private MrtrChangeSimReasonResponse changeSimReason;
    private boolean isAttorney;
    private boolean isAutoTransferEDMS;
    private boolean isCheckSimStock;
    private boolean requireFaceRecognition;

    public MrtrChangeSimSaveStateBusinessError() {
        this(false, null, null, false, false, false, false, 127, null);
    }

    public static /* synthetic */ MrtrChangeSimSaveStateBusinessError copy$default(MrtrChangeSimSaveStateBusinessError mrtrChangeSimSaveStateBusinessError, boolean z, ChangeSimConfig changeSimConfig, MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mrtrChangeSimSaveStateBusinessError.isAttorney;
        }
        if ((i & 2) != 0) {
            changeSimConfig = mrtrChangeSimSaveStateBusinessError.changeSimConfig;
        }
        ChangeSimConfig changeSimConfig2 = changeSimConfig;
        if ((i & 4) != 0) {
            mrtrChangeSimReasonResponse = mrtrChangeSimSaveStateBusinessError.changeSimReason;
        }
        MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse2 = mrtrChangeSimReasonResponse;
        if ((i & 8) != 0) {
            z2 = mrtrChangeSimSaveStateBusinessError.requireFaceRecognition;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = mrtrChangeSimSaveStateBusinessError.isCheckSimStock;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = mrtrChangeSimSaveStateBusinessError.airportShop;
        }
        boolean z8 = z4;
        if ((i & 64) != 0) {
            z5 = mrtrChangeSimSaveStateBusinessError.isAutoTransferEDMS;
        }
        return mrtrChangeSimSaveStateBusinessError.copy(z, changeSimConfig2, mrtrChangeSimReasonResponse2, z6, z7, z8, z5);
    }

    public final boolean component1() {
        return this.isAttorney;
    }

    @Nullable
    public final ChangeSimConfig component2() {
        return this.changeSimConfig;
    }

    @Nullable
    public final MrtrChangeSimReasonResponse component3() {
        return this.changeSimReason;
    }

    public final boolean component4() {
        return this.requireFaceRecognition;
    }

    public final boolean component5() {
        return this.isCheckSimStock;
    }

    public final boolean component6() {
        return this.airportShop;
    }

    public final boolean component7() {
        return this.isAutoTransferEDMS;
    }

    @NotNull
    public final MrtrChangeSimSaveStateBusinessError copy(boolean z, @Nullable ChangeSimConfig changeSimConfig, @Nullable MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new MrtrChangeSimSaveStateBusinessError(z, changeSimConfig, mrtrChangeSimReasonResponse, z2, z3, z4, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrChangeSimSaveStateBusinessError) {
            MrtrChangeSimSaveStateBusinessError mrtrChangeSimSaveStateBusinessError = (MrtrChangeSimSaveStateBusinessError) obj;
            return this.isAttorney == mrtrChangeSimSaveStateBusinessError.isAttorney && Intrinsics.areEqual(this.changeSimConfig, mrtrChangeSimSaveStateBusinessError.changeSimConfig) && Intrinsics.areEqual(this.changeSimReason, mrtrChangeSimSaveStateBusinessError.changeSimReason) && this.requireFaceRecognition == mrtrChangeSimSaveStateBusinessError.requireFaceRecognition && this.isCheckSimStock == mrtrChangeSimSaveStateBusinessError.isCheckSimStock && this.airportShop == mrtrChangeSimSaveStateBusinessError.airportShop && this.isAutoTransferEDMS == mrtrChangeSimSaveStateBusinessError.isAutoTransferEDMS;
        }
        return false;
    }

    public final boolean getAirportShop() {
        return this.airportShop;
    }

    @Nullable
    public final ChangeSimConfig getChangeSimConfig() {
        return this.changeSimConfig;
    }

    @Nullable
    public final MrtrChangeSimReasonResponse getChangeSimReason() {
        return this.changeSimReason;
    }

    public final boolean getRequireFaceRecognition() {
        return this.requireFaceRecognition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.isAttorney;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ChangeSimConfig changeSimConfig = this.changeSimConfig;
        int hashCode = (i + (changeSimConfig == null ? 0 : changeSimConfig.hashCode())) * 31;
        MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse = this.changeSimReason;
        int hashCode2 = (hashCode + (mrtrChangeSimReasonResponse != null ? mrtrChangeSimReasonResponse.hashCode() : 0)) * 31;
        ?? r2 = this.requireFaceRecognition;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        ?? r22 = this.isCheckSimStock;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.airportShop;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z2 = this.isAutoTransferEDMS;
        return i7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isAttorney() {
        return this.isAttorney;
    }

    public final boolean isAutoTransferEDMS() {
        return this.isAutoTransferEDMS;
    }

    public final boolean isCheckSimStock() {
        return this.isCheckSimStock;
    }

    public final void setAirportShop(boolean z) {
        this.airportShop = z;
    }

    public final void setAttorney(boolean z) {
        this.isAttorney = z;
    }

    public final void setAutoTransferEDMS(boolean z) {
        this.isAutoTransferEDMS = z;
    }

    public final void setChangeSimConfig(@Nullable ChangeSimConfig changeSimConfig) {
        this.changeSimConfig = changeSimConfig;
    }

    public final void setChangeSimReason(@Nullable MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse) {
        this.changeSimReason = mrtrChangeSimReasonResponse;
    }

    public final void setCheckSimStock(boolean z) {
        this.isCheckSimStock = z;
    }

    public final void setRequireFaceRecognition(boolean z) {
        this.requireFaceRecognition = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.isAttorney;
        ChangeSimConfig changeSimConfig = this.changeSimConfig;
        MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse = this.changeSimReason;
        boolean z2 = this.requireFaceRecognition;
        boolean z3 = this.isCheckSimStock;
        boolean z4 = this.airportShop;
        boolean z5 = this.isAutoTransferEDMS;
        return "MrtrChangeSimSaveStateBusinessError(isAttorney=" + z + ", changeSimConfig=" + changeSimConfig + ", changeSimReason=" + mrtrChangeSimReasonResponse + ", requireFaceRecognition=" + z2 + ", isCheckSimStock=" + z3 + ", airportShop=" + z4 + ", isAutoTransferEDMS=" + z5 + ")";
    }

    public MrtrChangeSimSaveStateBusinessError(boolean z, @Nullable ChangeSimConfig changeSimConfig, @Nullable MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isAttorney = z;
        this.changeSimConfig = changeSimConfig;
        this.changeSimReason = mrtrChangeSimReasonResponse;
        this.requireFaceRecognition = z2;
        this.isCheckSimStock = z3;
        this.airportShop = z4;
        this.isAutoTransferEDMS = z5;
    }

    public /* synthetic */ MrtrChangeSimSaveStateBusinessError(boolean z, ChangeSimConfig changeSimConfig, MrtrChangeSimReasonResponse mrtrChangeSimReasonResponse, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : changeSimConfig, (i & 4) == 0 ? mrtrChangeSimReasonResponse : null, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5);
    }
}