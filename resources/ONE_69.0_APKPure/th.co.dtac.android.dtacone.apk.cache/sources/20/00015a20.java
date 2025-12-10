package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.check_sim_stock.request.CheckSimStockRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.family_sim.ValidateFamilySimRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.permission_activation.MrtrPermissionActivationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.request.MrtrPrepaidValidateBarcodeRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.format.PhoneNumberFormat;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020403028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b(\u00107R#\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020403098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\b5\u00107R#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?098\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=R'\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\b:\u00107R#\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?098\u0006¢\u0006\f\n\u0004\bH\u0010;\u001a\u0004\bI\u0010=R'\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u00106\u001a\u0004\b*\u00107R#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?098\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u0010=R'\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\b-\u00107R#\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0?098\u0006¢\u0006\f\n\u0004\bR\u0010;\u001a\u0004\bS\u0010=R\u0016\u0010W\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006X"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_registration/MrtrPrepaidValidateBarcodeViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid/MrtrPrepaidRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "cardReaderService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_prepaid/MrtrPrepaidRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;)V", "", "navigateNext", "()V", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;", "response", "e", "(Lth/co/dtac/android/dtacone/model/mrtr_prepaid/validate_barcode/response/MrtrPrepaidValidateBarcodeResponse;)V", "", "value", "setCounter", "(I)V", "", OptionalModuleUtils.BARCODE, "OcrMobileNumber", "validateBarcode", "(Ljava/lang/String;Ljava/lang/String;)V", "validateFamilySim", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid/MrtrPrepaidRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/cardreader/CardReaderService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_PATH, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "i", "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_navigateTakeIdentity", "Landroidx/lifecycle/LiveData;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/lifecycle/LiveData;", "getNavigateTakeIdentity", "()Landroidx/lifecycle/LiveData;", "navigateTakeIdentity", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.NON_STROKING_CMYK, "_showErrorMessage", OperatorName.LINE_TO, "getShowErrorMessage", "showErrorMessage", OperatorName.MOVE_TO, "_showWarningMessage", OperatorName.ENDPATH, "getShowWarningMessage", "showWarningMessage", "o", "_showDialogConfirm", "p", "getShowDialogConfirm", "showDialogConfirm", OperatorName.SAVE, "_showDialogConfirmForOCR", PDPageLabelRange.STYLE_ROMAN_LOWER, "getShowDialogConfirmForOCR", "showDialogConfirmForOCR", OperatorName.CLOSE_AND_STROKE, "I", "counter", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateBarcodeViewModel */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateBarcodeViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrPrepaidRepository f106764b;

    /* renamed from: c */
    public final ConfigurationRepository f106765c;

    /* renamed from: d */
    public final Rx2ThreadService f106766d;

    /* renamed from: e */
    public final MrtrErrorService f106767e;

    /* renamed from: f */
    public final BitmapUtil f106768f;

    /* renamed from: g */
    public final CardReaderService f106769g;

    /* renamed from: h */
    public final CompositeDisposable f106770h;

    /* renamed from: i */
    public final Lazy f106771i;

    /* renamed from: j */
    public final LiveData f106772j;

    /* renamed from: k */
    public final Lazy f106773k;

    /* renamed from: l */
    public final LiveData f106774l;

    /* renamed from: m */
    public final Lazy f106775m;

    /* renamed from: n */
    public final LiveData f106776n;

    /* renamed from: o */
    public final Lazy f106777o;

    /* renamed from: p */
    public final LiveData f106778p;

    /* renamed from: q */
    public final Lazy f106779q;

    /* renamed from: r */
    public final LiveData f106780r;

    /* renamed from: s */
    public int f106781s;

    @Inject
    public MrtrPrepaidValidateBarcodeViewModel(@NotNull MrtrPrepaidRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService, @NotNull BitmapUtil bitmapUtil, @NotNull CardReaderService cardReaderService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(cardReaderService, "cardReaderService");
        this.f106764b = repository;
        this.f106765c = configurationRepository;
        this.f106766d = threadService;
        this.f106767e = errorService;
        this.f106768f = bitmapUtil;
        this.f106769g = cardReaderService;
        this.f106770h = new CompositeDisposable();
        this.f106771i = LazyKt__LazyJVMKt.lazy(MrtrPrepaidValidateBarcodeViewModel$_navigateTakeIdentity$2.INSTANCE);
        this.f106772j = m2009f();
        this.f106773k = LazyKt__LazyJVMKt.lazy(MrtrPrepaidValidateBarcodeViewModel$_showErrorMessage$2.INSTANCE);
        this.f106774l = m2006i();
        this.f106775m = LazyKt__LazyJVMKt.lazy(MrtrPrepaidValidateBarcodeViewModel$_showWarningMessage$2.INSTANCE);
        this.f106776n = m2005j();
        this.f106777o = LazyKt__LazyJVMKt.lazy(MrtrPrepaidValidateBarcodeViewModel$_showDialogConfirm$2.INSTANCE);
        this.f106778p = m2008g();
        this.f106779q = LazyKt__LazyJVMKt.lazy(MrtrPrepaidValidateBarcodeViewModel$_showDialogConfirmForOCR$2.INSTANCE);
        this.f106780r = m2007h();
    }

    /* renamed from: e */
    public final void m2010e(MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        Single<R> compose = this.f106764b.checkSimStock(new CheckSimStockRequest(mrtrPrepaidValidateBarcodeResponse.getSimcardNumber(), this.f106764b.getUserSession().getUserLan(), this.f106764b.getUserSession().getLocationCode(), Constant.MrtrPriceLevel.POS_GUEST, this.f106764b.getUserSession().getUserCode(), false, 32, null)).compose(this.f106766d.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "repository.checkSimStock…rvice.applySingleAsync())");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new MrtrPrepaidValidateBarcodeViewModel$checkSimStock$1(this), new MrtrPrepaidValidateBarcodeViewModel$checkSimStock$2(this)), this.f106770h);
    }

    /* renamed from: f */
    private final MutableLiveData m2009f() {
        return (MutableLiveData) this.f106771i.getValue();
    }

    /* renamed from: g */
    public final MutableLiveData m2008g() {
        return (MutableLiveData) this.f106777o.getValue();
    }

    /* renamed from: h */
    public final MutableLiveData m2007h() {
        return (MutableLiveData) this.f106779q.getValue();
    }

    /* renamed from: i */
    public final MutableLiveData m2006i() {
        return (MutableLiveData) this.f106773k.getValue();
    }

    /* renamed from: j */
    public final MutableLiveData m2005j() {
        return (MutableLiveData) this.f106775m.getValue();
    }

    /* renamed from: k */
    public static final Pair m2004k(MrtrPrepaidValidateBarcodeResponse b1, MrtrPermissionActivationResponse b2) {
        Intrinsics.checkNotNullParameter(b1, "b1");
        Intrinsics.checkNotNullParameter(b2, "b2");
        return new Pair(b1, b2);
    }

    /* renamed from: l */
    public static final void m2003l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m2002m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void navigateNext() {
        getLiveDataState().setValue(StatusResource.DISMISS);
        m2009f().setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f106770h;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeIdentity() {
        return this.f106772j;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowDialogConfirm() {
        return this.f106778p;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowDialogConfirmForOCR() {
        return this.f106780r;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f106774l;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowWarningMessage() {
        return this.f106776n;
    }

    public final void setCounter(int i) {
        this.f106781s = i;
    }

    public final void validateBarcode(@NotNull String barcode, @NotNull String OcrMobileNumber) {
        String encryptCBC;
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        Intrinsics.checkNotNullParameter(OcrMobileNumber, "OcrMobileNumber");
        int prepaidRegistrationValidateMsisdnMax = this.f106765c.prepaidRegistrationValidateMsisdnMax();
        MrtrPrepaidRepository mrtrPrepaidRepository = this.f106764b;
        if (OcrMobileNumber.length() == 0) {
            encryptCBC = "";
        } else {
            String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(PhoneNumberExtKt.toInternational(OcrMobileNumber));
            Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacte…Number.toInternational())");
            encryptCBC = AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106765c.dataPrivacyEncryptionAES256CBCKey());
        }
        Single compose = Observable.zip(mrtrPrepaidRepository.validateBarcode(new MrtrPrepaidValidateBarcodeRequest(barcode, encryptCBC)).toObservable(), this.f106764b.getPrepaidPremission(new MrtrPermissionActivationRequest(this.f106764b.getUserCode(), null)).onErrorResumeNext(Single.just(new MrtrPermissionActivationResponse(CollectionsKt__CollectionsKt.emptyList()))).toObservable(), new BiFunction() { // from class: WF0
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Pair m2004k;
                m2004k = MrtrPrepaidValidateBarcodeViewModel.m2004k((MrtrPrepaidValidateBarcodeResponse) obj, (MrtrPermissionActivationResponse) obj2);
                return m2004k;
            }
        }).single(new Pair(new MrtrPrepaidValidateBarcodeResponse("", "", "", "", "", "", Boolean.FALSE), new MrtrPermissionActivationResponse(CollectionsKt__CollectionsKt.emptyList()))).compose(this.f106766d.applySingleAsync());
        final MrtrPrepaidValidateBarcodeViewModel$validateBarcode$2 mrtrPrepaidValidateBarcodeViewModel$validateBarcode$2 = new MrtrPrepaidValidateBarcodeViewModel$validateBarcode$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: XF0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPrepaidValidateBarcodeViewModel.m2003l(mrtrPrepaidValidateBarcodeViewModel$validateBarcode$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateBarcode(barc… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPrepaidValidateBarcodeViewModel$validateBarcode$3(this, prepaidRegistrationValidateMsisdnMax), new MrtrPrepaidValidateBarcodeViewModel$validateBarcode$4(this)), this.f106770h);
    }

    public final void validateFamilySim() {
        String str;
        MrtrPrepaidRepository mrtrPrepaidRepository = this.f106764b;
        String userFormatType = this.f106764b.getUserFormatType();
        MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = this.f106764b.getMrtrPrepaidValidateBarcodeResponse();
        if (mrtrPrepaidValidateBarcodeResponse != null) {
            str = mrtrPrepaidValidateBarcodeResponse.getSubscriberNumber();
        } else {
            str = null;
        }
        String userCode = this.f106764b.getUserCode();
        String removeAllSpecialCharacter = PhoneNumberFormat.removeAllSpecialCharacter(this.f106764b.getFamilySimPostpaidNumber());
        Intrinsics.checkNotNullExpressionValue(removeAllSpecialCharacter, "removeAllSpecialCharacte….familySimPostpaidNumber)");
        Single<R> compose = mrtrPrepaidRepository.validateFamilySim(new ValidateFamilySimRequest(userFormatType, str, userCode, AESCryptUtil.encryptCBC(removeAllSpecialCharacter, this.f106765c.dataPrivacyEncryptionAES256CBCKey()))).compose(this.f106766d.applySingleAsync());
        final MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$1 mrtrPrepaidValidateBarcodeViewModel$validateFamilySim$1 = new MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: VF0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPrepaidValidateBarcodeViewModel.m2002m(mrtrPrepaidValidateBarcodeViewModel$validateFamilySim$1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateFamilySim() …).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$2(this), new MrtrPrepaidValidateBarcodeViewModel$validateFamilySim$3(this)), this.f106770h);
    }
}