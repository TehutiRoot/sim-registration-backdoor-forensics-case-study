package th.p047co.dtac.android.dtacone.model.take_photo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.constant.mixpanel.buy_dol.BuyDolMixpanel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "", "()V", "Capture", BuyDolMixpanel.ACTION_CONFIRM_PAYMENT, "Idle", "Preview", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Capture;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Confirm;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Idle;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Preview;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraPreviewState */
/* loaded from: classes8.dex */
public abstract class CameraPreviewState {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Capture;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraPreviewState$Capture */
    /* loaded from: classes8.dex */
    public static final class Capture extends CameraPreviewState {
        public static final int $stable = 0;
        @NotNull
        public static final Capture INSTANCE = new Capture();

        private Capture() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Confirm;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraPreviewState$Confirm */
    /* loaded from: classes8.dex */
    public static final class Confirm extends CameraPreviewState {
        public static final int $stable = 0;
        @NotNull
        public static final Confirm INSTANCE = new Confirm();

        private Confirm() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Idle;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraPreviewState$Idle */
    /* loaded from: classes8.dex */
    public static final class Idle extends CameraPreviewState {
        public static final int $stable = 0;
        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState$Preview;", "Lth/co/dtac/android/dtacone/model/take_photo/CameraPreviewState;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.take_photo.CameraPreviewState$Preview */
    /* loaded from: classes8.dex */
    public static final class Preview extends CameraPreviewState {
        public static final int $stable = 0;
        @NotNull
        public static final Preview INSTANCE = new Preview();

        private Preview() {
            super(null);
        }
    }

    public /* synthetic */ CameraPreviewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CameraPreviewState() {
    }
}