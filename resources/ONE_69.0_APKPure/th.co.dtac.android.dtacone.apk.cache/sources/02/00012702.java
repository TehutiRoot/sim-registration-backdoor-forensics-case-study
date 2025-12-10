package th.p047co.dtac.android.dtacone.util.constant.mixpanel.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/constant/mixpanel/prepaid/PrepaidMixpanel;", "", "()V", "ACTION_CAPTURE_CUSTOMER_FACE", "", "ACTION_CAPTURE_ID_CARD", "ACTION_INPUT_ID_NO", "ACTION_REGISTER_ACTIVATE", "ACTION_REGISTER_ACTIVATE_STV", "ACTION_REGISTER_ACTIVATE_TOP_UP", "ACTION_REGISTER_ONLY", "ACTION_SCAN_SIM", "ACTION_SELECT_MSISDN", "EVENT", "FACE_RECOGNITION_FACE_MODE", "FACE_RECOGNITION_KYC_MODE", "ID_CAPTURE_TYPE_READER", "ID_CAPTURE_TYPE_TAKE_PHOTO", "SIM_TYPE_NORMAL", "SIM_TYPE_POOLING_PULL", "SIM_TYPE_POOLING_PUSH", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.constant.mixpanel.prepaid.PrepaidMixpanel */
/* loaded from: classes8.dex */
public final class PrepaidMixpanel {
    public static final int $stable = 0;
    @NotNull
    public static final String ACTION_CAPTURE_CUSTOMER_FACE = "Capture customer face";
    @NotNull
    public static final String ACTION_CAPTURE_ID_CARD = "Capture ID card";
    @NotNull
    public static final String ACTION_INPUT_ID_NO = "Input ID no";
    @NotNull
    public static final String ACTION_REGISTER_ACTIVATE = "Complete(Register -> Activate)";
    @NotNull
    public static final String ACTION_REGISTER_ACTIVATE_STV = "Complete(Register -> Activate -> STV)";
    @NotNull
    public static final String ACTION_REGISTER_ACTIVATE_TOP_UP = "Complete(Register -> Activate -> Top Up)";
    @NotNull
    public static final String ACTION_REGISTER_ONLY = "Complete(Register only)";
    @NotNull
    public static final String ACTION_SCAN_SIM = "Scan SIM";
    @NotNull
    public static final String ACTION_SELECT_MSISDN = "Select MSISDN";
    @NotNull
    public static final String EVENT = "Registration";
    @NotNull
    public static final String FACE_RECOGNITION_FACE_MODE = "Face Recognition";
    @NotNull
    public static final String FACE_RECOGNITION_KYC_MODE = "Manual KYC";
    @NotNull
    public static final String ID_CAPTURE_TYPE_READER = "Card Reader";
    @NotNull
    public static final String ID_CAPTURE_TYPE_TAKE_PHOTO = "Take Photo";
    @NotNull
    public static final PrepaidMixpanel INSTANCE = new PrepaidMixpanel();
    @NotNull
    public static final String SIM_TYPE_NORMAL = "Normal SIM";
    @NotNull
    public static final String SIM_TYPE_POOLING_PULL = "Pooling SIM(Select MSISDN)";
    @NotNull
    public static final String SIM_TYPE_POOLING_PUSH = "Pooling SIM(Auto MSISDN)";
}