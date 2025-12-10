package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState;", "", "Error", "Initial", "Loading", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Loading;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineExistingTMHState */
/* loaded from: classes10.dex */
public interface OneRegisterTrueOnlineExistingTMHState {

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Error;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState;", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineExistingTMHState$Error */
    /* loaded from: classes10.dex */
    public static final class Error implements OneRegisterTrueOnlineExistingTMHState {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f98363a;

        /* renamed from: b */
        public final String f98364b;

        public Error(@NotNull String message, @NotNull String code) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(code, "code");
            this.f98363a = message;
            this.f98364b = code;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.f98363a;
            }
            if ((i & 2) != 0) {
                str2 = error.f98364b;
            }
            return error.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.f98363a;
        }

        @NotNull
        public final String component2() {
            return this.f98364b;
        }

        @NotNull
        public final Error copy(@NotNull String message, @NotNull String code) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(code, "code");
            return new Error(message, code);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return Intrinsics.areEqual(this.f98363a, error.f98363a) && Intrinsics.areEqual(this.f98364b, error.f98364b);
            }
            return false;
        }

        @NotNull
        public final String getCode() {
            return this.f98364b;
        }

        @NotNull
        public final String getMessage() {
            return this.f98363a;
        }

        public int hashCode() {
            return (this.f98363a.hashCode() * 31) + this.f98364b.hashCode();
        }

        @NotNull
        public String toString() {
            String str = this.f98363a;
            String str2 = this.f98364b;
            return "Error(message=" + str + ", code=" + str2 + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Initial;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineExistingTMHState$Initial */
    /* loaded from: classes10.dex */
    public static final class Initial implements OneRegisterTrueOnlineExistingTMHState {
        public static final int $stable = 0;
        @NotNull
        public static final Initial INSTANCE = new Initial();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState$Loading;", "Lth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/state/OneRegisterTrueOnlineExistingTMHState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.OneRegisterTrueOnlineExistingTMHState$Loading */
    /* loaded from: classes10.dex */
    public static final class Loading implements OneRegisterTrueOnlineExistingTMHState {
        public static final int $stable = 0;
        @NotNull
        public static final Loading INSTANCE = new Loading();
    }
}