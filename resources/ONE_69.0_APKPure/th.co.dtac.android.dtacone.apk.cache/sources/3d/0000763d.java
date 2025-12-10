package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_change_sim.qrCode.ESimChangeSIMShowQrCodeFragment;

/* loaded from: classes2.dex */
public interface Operation {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.SUCCESS SUCCESS = new State.SUCCESS();
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final State.IN_PROGRESS IN_PROGRESS = new State.IN_PROGRESS();

    /* loaded from: classes2.dex */
    public static abstract class State {

        /* loaded from: classes2.dex */
        public static final class FAILURE extends State {

            /* renamed from: a */
            public final Throwable f38337a;

            public FAILURE(@NonNull Throwable th2) {
                this.f38337a = th2;
            }

            @NonNull
            public Throwable getThrowable() {
                return this.f38337a;
            }

            @NonNull
            public String toString() {
                return "FAILURE (" + this.f38337a.getMessage() + ")";
            }
        }

        /* loaded from: classes2.dex */
        public static final class IN_PROGRESS extends State {
            @NonNull
            public String toString() {
                return ESimChangeSIMShowQrCodeFragment.IN_PROGRESS;
            }

            public IN_PROGRESS() {
            }
        }

        /* loaded from: classes2.dex */
        public static final class SUCCESS extends State {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            public SUCCESS() {
            }
        }
    }

    @NonNull
    ListenableFuture<State.SUCCESS> getResult();

    @NonNull
    LiveData<State> getState();
}