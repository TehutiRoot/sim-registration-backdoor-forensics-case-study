package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.current_sim.request.MrtrChangeSimGetCurrentSimRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.current_sim.response.MrtrChangeSimGetCurrentSimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_change_to_esi.ExistingChangeToESIMRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_change_to_esi.ExistingChangeToESIMResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.request.MrtrChangeSimExistingProfileRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.MrtrChangeSimExistingProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.request.MrtrChangeSimVerifyRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.verify.response.MrtrChangeSimVerifyResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.response.CheckSimStockResponse;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010\u0013J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b!\u0010\u0013J\r\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010\u0015J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020504098\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R#\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>04098\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00107R#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D04098\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00107R#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J04098\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00107R#\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P04098\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u00107R#\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f04098\u0006¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bY\u0010<R \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00107R#\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[04098\u0006¢\u0006\f\n\u0004\b^\u0010:\u001a\u0004\b_\u0010<R'\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f04038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bG\u0010cR#\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f04098\u0006¢\u0006\f\n\u0004\be\u0010:\u001a\u0004\bf\u0010<R\u0011\u0010h\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010k\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bj\u0010$¨\u0006l"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_change_sim/MrtrChangeSimValidateViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_change_sim/MrtrChangeSimRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_change_sim/MrtrChangeSimRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "data", OperatorName.CLOSE_PATH, "(Ljava/lang/String;)Ljava/lang/String;", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "", "getCurrentSim", "(Ljava/lang/String;)V", "existingChangeToESIM", "()V", "idCardNumber", "", "isSmartCard", "checkOwner", "(Ljava/lang/String;Z)V", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "cardInformation", "getPostCodeInfo", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "newSimCardNumber", "verifyChangeSim", "checkSimStock", "getExistingProfile", HintConstants.AUTOFILL_HINT_USERNAME, "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_change_sim/MrtrChangeSimRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/current_sim/response/MrtrChangeSimGetCurrentSimResponse;", OperatorName.NON_STROKING_GRAY, "Landroidx/lifecycle/MutableLiveData;", "_getCurrentSimResponse", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getGetCurrentSimResponse", "()Landroidx/lifecycle/LiveData;", "getCurrentSimResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_change_to_esi/ExistingChangeToESIMResponse;", "i", "_getExistingChangeToESIResponse", OperatorName.SET_LINE_JOINSTYLE, "getGetExistingChangeToESIMResponse", "getExistingChangeToESIMResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/verify/response/MrtrChangeSimVerifyResponse;", OperatorName.NON_STROKING_CMYK, "_verifyResponse", OperatorName.LINE_TO, "getVerifyResponse", "verifyResponse", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/check_sim_stock/response/CheckSimStockResponse;", OperatorName.MOVE_TO, "_checkSimStockResponse", OperatorName.ENDPATH, "getCheckSimStockResponse", "checkSimStockResponse", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;", "o", "_existingProfileResponse", "p", "getExistingProfileResponse", "existingProfileResponse", OperatorName.SAVE, "_checkOwnerResponse", PDPageLabelRange.STYLE_ROMAN_LOWER, "getCheckOwnerResponse", "checkOwnerResponse", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.CLOSE_AND_STROKE, "_checkOwnerErrorResponse", "t", "getCheckOwnerErrorResponse", "checkOwnerErrorResponse", "u", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_showDialogConfirm", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getShowDialogConfirm", "showDialogConfirm", "isSaveESIMOrder", "()Z", "getPhoneNumber", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrChangeSimRepository f106213b;

    /* renamed from: c */
    public final ConfigurationRepository f106214c;

    /* renamed from: d */
    public final Rx2ThreadService f106215d;

    /* renamed from: e */
    public final MrtrErrorService f106216e;

    /* renamed from: f */
    public final CompositeDisposable f106217f;

    /* renamed from: g */
    public final MutableLiveData f106218g;

    /* renamed from: h */
    public final LiveData f106219h;

    /* renamed from: i */
    public final MutableLiveData f106220i;

    /* renamed from: j */
    public final LiveData f106221j;

    /* renamed from: k */
    public final MutableLiveData f106222k;

    /* renamed from: l */
    public final LiveData f106223l;

    /* renamed from: m */
    public final MutableLiveData f106224m;

    /* renamed from: n */
    public final LiveData f106225n;

    /* renamed from: o */
    public final MutableLiveData f106226o;

    /* renamed from: p */
    public final LiveData f106227p;

    /* renamed from: q */
    public final MutableLiveData f106228q;

    /* renamed from: r */
    public final LiveData f106229r;

    /* renamed from: s */
    public final MutableLiveData f106230s;

    /* renamed from: t */
    public final LiveData f106231t;

    /* renamed from: u */
    public final Lazy f106232u;

    /* renamed from: v */
    public final LiveData f106233v;

    @Inject
    public MrtrChangeSimValidateViewModel(@NotNull MrtrChangeSimRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f106213b = repository;
        this.f106214c = configurationRepository;
        this.f106215d = threadService;
        this.f106216e = errorService;
        this.f106217f = new CompositeDisposable();
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f106218g = mutableLiveData;
        this.f106219h = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f106220i = mutableLiveData2;
        this.f106221j = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f106222k = mutableLiveData3;
        this.f106223l = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f106224m = mutableLiveData4;
        this.f106225n = mutableLiveData4;
        MutableLiveData mutableLiveData5 = new MutableLiveData();
        this.f106226o = mutableLiveData5;
        this.f106227p = mutableLiveData5;
        MutableLiveData mutableLiveData6 = new MutableLiveData();
        this.f106228q = mutableLiveData6;
        this.f106229r = mutableLiveData6;
        MutableLiveData mutableLiveData7 = new MutableLiveData();
        this.f106230s = mutableLiveData7;
        this.f106231t = mutableLiveData7;
        this.f106232u = LazyKt__LazyJVMKt.lazy(MrtrChangeSimValidateViewModel$_showDialogConfirm$2.INSTANCE);
        this.f106233v = m2418l();
    }

    /* renamed from: g */
    public static final void m2423g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public final String m2422h(String str) {
        return AESCryptUtil.decryptCBC(str, this.f106214c.dataPrivacyEncryptionAES256CBCKey());
    }

    /* renamed from: i */
    public static final void m2421i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m2420j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m2419k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public final MutableLiveData m2418l() {
        return (MutableLiveData) this.f106232u.getValue();
    }

    /* renamed from: m */
    public static final void m2417m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkOwner(@org.jetbrains.annotations.NotNull java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "idCardNumber"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r0 = r4.f106213b
            r0.setSmartCard(r6)
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r0 = r4.f106213b
            r0.setOwnerIdCardNumber(r5)
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r5 = r4.f106213b
            th.co.dtac.android.dtacone.model.mrtr_change_sim.check_owner.request.MrtrChangeSimCheckOwnerRequest r0 = new th.co.dtac.android.dtacone.model.mrtr_change_sim.check_owner.request.MrtrChangeSimCheckOwnerRequest
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r1 = r4.f106213b
            java.lang.String r1 = r1.getPhoneNumber()
            java.lang.String r1 = th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat.removeAllSpecialCharacter(r1)
            java.lang.String r2 = "removeAllSpecialCharacter(repository.phoneNumber)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            th.co.dtac.android.dtacone.repository.ConfigurationRepository r2 = r4.f106214c
            java.lang.String r2 = r2.dataPrivacyEncryptionAES256CBCKey()
            java.lang.String r1 = th.p047co.dtac.android.dtacone.util.AESCryptUtil.encryptCBC(r1, r2)
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r2 = r4.f106213b
            boolean r2 = r2.isSmartCard()
            java.lang.String r3 = ""
            if (r2 == 0) goto L51
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r2 = r4.f106213b
            th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection r2 = r2.getCardInformation()
            if (r2 == 0) goto L51
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r2 = r4.f106213b
            th.co.dtac.android.dtacone.model.mnp.IdCardInformationCollection r2 = r2.getCardInformation()
            if (r2 == 0) goto L4b
            java.lang.String r2 = r2.getIdCard()
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 != 0) goto L4f
            goto L59
        L4f:
            r3 = r2
            goto L59
        L51:
            th.co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository r2 = r4.f106213b
            java.lang.String r2 = r2.getOwnerIdCardNumber()
            if (r2 != 0) goto L4f
        L59:
            th.co.dtac.android.dtacone.repository.ConfigurationRepository r2 = r4.f106214c
            java.lang.String r2 = r2.dataPrivacyEncryptionAES256CBCKey()
            java.lang.String r2 = th.p047co.dtac.android.dtacone.util.AESCryptUtil.encryptCBC(r3, r2)
            r0.<init>(r1, r2)
            io.reactivex.Single r5 = r5.mrtrChangeSimCheckOwner(r0)
            th.co.dtac.android.dtacone.manager.service.Rx2ThreadService r0 = r4.f106215d
            io.reactivex.SingleTransformer r0 = r0.applySingleAsync()
            io.reactivex.Single r5 = r5.compose(r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$1 r0 = new th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$1
            r0.<init>(r4)
            jv0 r1 = new jv0
            r1.<init>()
            io.reactivex.Single r5 = r5.doOnSubscribe(r1)
            java.lang.String r0 = "fun checkOwner(idCardNum… .addTo(disposable)\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$2 r0 = new th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$2
            r0.<init>(r4)
            th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$3 r1 = new th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$checkOwner$3
            r1.<init>(r6, r4)
            io.reactivex.disposables.Disposable r5 = io.reactivex.rxkotlin.SubscribersKt.subscribeBy(r5, r0, r1)
            io.reactivex.disposables.CompositeDisposable r6 = r4.f106217f
            io.reactivex.rxkotlin.DisposableKt.addTo(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel.checkOwner(java.lang.String, boolean):void");
    }

    public final void checkSimStock(@NotNull String newSimCardNumber) {
        Intrinsics.checkNotNullParameter(newSimCardNumber, "newSimCardNumber");
        Single<R> compose = this.f106213b.checkSimStock(new CheckSimStockRequest(newSimCardNumber, this.f106213b.getUser().getUserLan(), this.f106213b.getUser().getLocationCode(), this.f106213b.getPriceLevel(), this.f106213b.getUser().getUserCode(), this.f106213b.isESimReasonCode())).compose(this.f106215d.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "repository.checkSimStock…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new MrtrChangeSimValidateViewModel$checkSimStock$1(this), new MrtrChangeSimValidateViewModel$checkSimStock$2(this)), this.f106217f);
    }

    public final void existingChangeToESIM() {
        String str;
        MrtrChangeSimRepository mrtrChangeSimRepository = this.f106213b;
        String userFormatType = mrtrChangeSimRepository.getUserFormatType();
        String userLan = this.f106213b.getUserLan();
        String userCode = this.f106213b.getUser().getUserCode();
        MrtrChangeSimGetCurrentSimResponse getCurrentSimResponse = this.f106213b.getGetCurrentSimResponse();
        if (getCurrentSimResponse != null) {
            str = getCurrentSimResponse.getCustomerNumber();
        } else {
            str = null;
        }
        String str2 = str;
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(this.f106213b.getPhoneNumber());
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(repository.phoneNumber)");
        Single<R> compose = mrtrChangeSimRepository.existingChangeToESIM(new ExistingChangeToESIMRequest(userLan, userFormatType, AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106214c.dataPrivacyEncryptionAES256CBCKey()), str2, userCode)).compose(this.f106215d.applySingleAsync());
        final MrtrChangeSimValidateViewModel$existingChangeToESIM$1 mrtrChangeSimValidateViewModel$existingChangeToESIM$1 = new MrtrChangeSimValidateViewModel$existingChangeToESIM$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: fv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrChangeSimValidateViewModel.m2421i(mrtrChangeSimValidateViewModel$existingChangeToESIM$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun existingChangeToESIM… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrChangeSimValidateViewModel$existingChangeToESIM$2(this), new MrtrChangeSimValidateViewModel$existingChangeToESIM$3(this)), this.f106217f);
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getCheckOwnerErrorResponse() {
        return this.f106231t;
    }

    @NotNull
    public final LiveData<Resource<String>> getCheckOwnerResponse() {
        return this.f106229r;
    }

    @NotNull
    public final LiveData<Resource<CheckSimStockResponse>> getCheckSimStockResponse() {
        return this.f106225n;
    }

    public final void getCurrentSim(@NotNull String subscriberNumber) {
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        this.f106213b.setPhoneNumber(subscriberNumber);
        MrtrChangeSimRepository mrtrChangeSimRepository = this.f106213b;
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(this.f106213b.getPhoneNumber());
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(repository.phoneNumber)");
        Single<R> compose = mrtrChangeSimRepository.getMrtrChangeSimCurrentSim(new MrtrChangeSimGetCurrentSimRequest(AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106214c.dataPrivacyEncryptionAES256CBCKey()), this.f106213b.getUser().getUserCode())).compose(this.f106215d.applySingleAsync());
        final MrtrChangeSimValidateViewModel$getCurrentSim$1 mrtrChangeSimValidateViewModel$getCurrentSim$1 = new MrtrChangeSimValidateViewModel$getCurrentSim$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: gv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrChangeSimValidateViewModel.m2420j(mrtrChangeSimValidateViewModel$getCurrentSim$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getCurrentSim(subscr… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrChangeSimValidateViewModel$getCurrentSim$2(this), new MrtrChangeSimValidateViewModel$getCurrentSim$3(this)), this.f106217f);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106217f;
    }

    public final void getExistingProfile() {
        MrtrChangeSimRepository mrtrChangeSimRepository = this.f106213b;
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(this.f106213b.getPhoneNumber());
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(repository.phoneNumber)");
        String encryptCBC = AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106214c.dataPrivacyEncryptionAES256CBCKey());
        MrtrChangeSimGetCurrentSimResponse getCurrentSimResponse = this.f106213b.getGetCurrentSimResponse();
        Single<R> compose = mrtrChangeSimRepository.mrtrChangeSimExistingProfile(new MrtrChangeSimExistingProfileRequest(encryptCBC, (getCurrentSimResponse == null || (r3 = getCurrentSimResponse.getCustomerNumber()) == null) ? "" : "", this.f106213b.getUser().getUserCode())).compose(this.f106215d.applySingleAsync());
        final MrtrChangeSimValidateViewModel$getExistingProfile$1 mrtrChangeSimValidateViewModel$getExistingProfile$1 = new MrtrChangeSimValidateViewModel$getExistingProfile$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: hv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrChangeSimValidateViewModel.m2419k(mrtrChangeSimValidateViewModel$getExistingProfile$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getExistingProfile()… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrChangeSimValidateViewModel$getExistingProfile$2(this), new MrtrChangeSimValidateViewModel$getExistingProfile$3(this)), this.f106217f);
    }

    @NotNull
    public final LiveData<Resource<MrtrChangeSimExistingProfileResponse>> getExistingProfileResponse() {
        return this.f106227p;
    }

    @NotNull
    public final LiveData<Resource<MrtrChangeSimGetCurrentSimResponse>> getGetCurrentSimResponse() {
        return this.f106219h;
    }

    @NotNull
    public final LiveData<Resource<ExistingChangeToESIMResponse>> getGetExistingChangeToESIMResponse() {
        return this.f106221j;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.f106213b.getPhoneNumber();
    }

    public final void getPostCodeInfo(@Nullable IdCardInformationCollection idCardInformationCollection) {
        if (idCardInformationCollection != null) {
            MrtrChangeSimRepository mrtrChangeSimRepository = this.f106213b;
            String district = idCardInformationCollection.getDistrict();
            Intrinsics.checkNotNullExpressionValue(district, "it.district");
            String province = idCardInformationCollection.getProvince();
            Intrinsics.checkNotNullExpressionValue(province, "it.province");
            Single<R> compose = mrtrChangeSimRepository.getPostCodeInfo(new GetPostCodeInfoRequest(district, province), true).compose(this.f106215d.applySingleAsync());
            Intrinsics.checkNotNullExpressionValue(compose, "repository.getPostCodeIn…rvice.applySingleAsync())");
            DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new MrtrChangeSimValidateViewModel$getPostCodeInfo$1$1(this), new MrtrChangeSimValidateViewModel$getPostCodeInfo$1$2(this)), this.f106217f);
        }
    }

    @NotNull
    public final LiveData<Resource<String>> getShowDialogConfirm() {
        return this.f106233v;
    }

    @NotNull
    public final LiveData<Resource<MrtrChangeSimVerifyResponse>> getVerifyResponse() {
        return this.f106223l;
    }

    public final boolean isSaveESIMOrder() {
        return this.f106213b.isSaveESIMOrder();
    }

    @NotNull
    public final String username() {
        return this.f106213b.getUserName();
    }

    public final void verifyChangeSim(@NotNull String newSimCardNumber) {
        String str;
        Intrinsics.checkNotNullParameter(newSimCardNumber, "newSimCardNumber");
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(this.f106213b.getPhoneNumber());
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacter(repository.phoneNumber)");
        String encryptCBC = AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106214c.dataPrivacyEncryptionAES256CBCKey());
        MrtrChangeSimGetCurrentSimResponse getCurrentSimResponse = this.f106213b.getGetCurrentSimResponse();
        if (getCurrentSimResponse != null) {
            str = getCurrentSimResponse.getCurrentSIMCardNumber();
        } else {
            str = null;
        }
        MrtrChangeSimVerifyRequest mrtrChangeSimVerifyRequest = new MrtrChangeSimVerifyRequest(encryptCBC, str, newSimCardNumber, this.f106213b.getUser().getUserCode());
        this.f106213b.setVerifyRequest(mrtrChangeSimVerifyRequest);
        Single<R> compose = this.f106213b.mrtrChangeSimVerify(mrtrChangeSimVerifyRequest).compose(this.f106215d.applySingleAsync());
        final MrtrChangeSimValidateViewModel$verifyChangeSim$1 mrtrChangeSimValidateViewModel$verifyChangeSim$1 = new MrtrChangeSimValidateViewModel$verifyChangeSim$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: iv0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrChangeSimValidateViewModel.m2417m(mrtrChangeSimValidateViewModel$verifyChangeSim$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun verifyChangeSim(newS… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrChangeSimValidateViewModel$verifyChangeSim$2(this), new MrtrChangeSimValidateViewModel$verifyChangeSim$3(this, newSimCardNumber)), this.f106217f);
    }
}