package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.constant.PermissionConstant;

@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/OneFeatureType;", "", "featureName", "", "consentDomain", "titleCondition", "", "descCondition", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", "getConsentDomain", "()Ljava/lang/String;", "getDescCondition", "()I", "getFeatureName", "getTitleCondition", "PREPAID_REGISTER", "POSTPAID_REGISTER", "POSTPAID_WITH_DEVICE", "MNP", Constant.ConsentDomain.CHANGE_SIM, "PRE2_POST", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.OneFeatureType */
/* loaded from: classes10.dex */
public enum OneFeatureType {
    PREPAID_REGISTER(PermissionConstant.M_REGS_PRE, Constant.ConsentDomain.PREPAID_REGISTRATION, R.string.one_unify_condition_postpaid_title, R.string.one_unify_condition_postpaid),
    POSTPAID_REGISTER(PermissionConstant.M_REGS_POST, Constant.ConsentDomain.POSTPAID_REGISTRATION, R.string.one_unify_condition_postpaid_title, R.string.one_unify_condition_postpaid),
    POSTPAID_WITH_DEVICE("M_REGS_POST_WITH_DEVICE", Constant.ConsentDomain.POSTPAID_REGISTRATION, R.string.one_unify_condition_postpaid_with_device_title, R.string.one_unify_condition_postpaid),
    MNP(PermissionConstant.M_XNTL_MNP, "PORTIN", R.string.one_unify_condition_postpaid_title, R.string.one_unify_condition_postpaid),
    CHANGE_SIM(PermissionConstant.M_CHNG_SIM, Constant.ConsentDomain.CHANGE_SIM, R.string.one_unify_condition_change_title, R.string.one_unify_condition_change_sim),
    PRE2_POST(PermissionConstant.M_PRE2_POST, "PRE2POST", R.string.one_unify_condition_postpaid_title, R.string.one_unify_condition_postpaid);
    
    @NotNull
    private final String consentDomain;
    private final int descCondition;
    @NotNull
    private final String featureName;
    private final int titleCondition;

    OneFeatureType(String str, String str2, int i, int i2) {
        this.featureName = str;
        this.consentDomain = str2;
        this.titleCondition = i;
        this.descCondition = i2;
    }

    @NotNull
    public final String getConsentDomain() {
        return this.consentDomain;
    }

    public final int getDescCondition() {
        return this.descCondition;
    }

    @NotNull
    public final String getFeatureName() {
        return this.featureName;
    }

    public final int getTitleCondition() {
        return this.titleCondition;
    }
}