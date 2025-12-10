package th.p047co.dtac.android.dtacone.viewmodel.upPass.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState;", "", "Cancelled", "Open", "Pending", "Verified", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Cancelled;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Open;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Pending;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Verified;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState */
/* loaded from: classes9.dex */
public interface Kyc2ndLineStatusState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Cancelled;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState$Cancelled */
    /* loaded from: classes9.dex */
    public static final class Cancelled implements Kyc2ndLineStatusState {
        public static final int $stable = 0;
        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Open;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState$Open */
    /* loaded from: classes9.dex */
    public static final class Open implements Kyc2ndLineStatusState {
        public static final int $stable = 0;
        @NotNull
        public static final Open INSTANCE = new Open();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Pending;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState$Pending */
    /* loaded from: classes9.dex */
    public static final class Pending implements Kyc2ndLineStatusState {
        public static final int $stable = 0;
        @NotNull
        public static final Pending INSTANCE = new Pending();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0003\u0010\u0007¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Verified;", "Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState;", "", "isApprove", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lth/co/dtac/android/dtacone/viewmodel/upPass/state/Kyc2ndLineStatusState$Verified;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineStatusState$Verified */
    /* loaded from: classes9.dex */
    public static final class Verified implements Kyc2ndLineStatusState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final boolean f107174a;

        public Verified() {
            this(false, 1, null);
        }

        public static /* synthetic */ Verified copy$default(Verified verified, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = verified.f107174a;
            }
            return verified.copy(z);
        }

        public final boolean component1() {
            return this.f107174a;
        }

        @NotNull
        public final Verified copy(boolean z) {
            return new Verified(z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verified) && this.f107174a == ((Verified) obj).f107174a;
        }

        public int hashCode() {
            boolean z = this.f107174a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isApprove() {
            return this.f107174a;
        }

        @NotNull
        public String toString() {
            boolean z = this.f107174a;
            return "Verified(isApprove=" + z + ")";
        }

        public Verified(boolean z) {
            this.f107174a = z;
        }

        public /* synthetic */ Verified(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}