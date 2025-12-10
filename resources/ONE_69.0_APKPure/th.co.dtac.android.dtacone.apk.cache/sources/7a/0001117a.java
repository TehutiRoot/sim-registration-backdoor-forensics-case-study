package th.p047co.dtac.android.dtacone.app_one.viewmodel.registration;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.CheckProfileRegisterResponse;
import th.p047co.dtac.android.dtacone.app_one.model.registration.ListSIMRetailerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerRequest;
import th.p047co.dtac.android.dtacone.app_one.model.registration.OneRegisterOwnerResponse;
import th.p047co.dtac.android.dtacone.app_one.repository.OneRegistrationRepository;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneRegistrationPassWord;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010#\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b#\u0010\u001fJ\u0019\u0010$\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b$\u0010\u001cJ\u000f\u0010%\u001a\u00020\u0012H\u0014¢\u0006\u0004\b%\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R'\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020605048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000206050<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R'\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bD\u0010:R#\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B050<8\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010@R'\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:R#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B050<8\u0006¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010@R7\u0010T\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020P0Oj\b\u0012\u0004\u0012\u00020P`Q05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bS\u0010:R3\u0010W\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020P0Oj\b\u0012\u0004\u0012\u00020P`Q050<8\u0006¢\u0006\f\n\u0004\bU\u0010>\u001a\u0004\bV\u0010@R'\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\bY\u0010:R#\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B050<8\u0006¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b\\\u0010@R'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00108\u001a\u0004\b_\u0010:R#\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B050<8\u0006¢\u0006\f\n\u0004\ba\u0010>\u001a\u0004\bb\u0010@R'\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d05048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u00108\u001a\u0004\bf\u0010:R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020d050<8\u0006¢\u0006\f\n\u0004\bh\u0010>\u001a\u0004\bi\u0010@R!\u0010l\u001a\b\u0012\u0004\u0012\u00020\f048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u00108\u001a\u0004\bk\u0010:R!\u0010n\u001a\b\u0012\u0004\u0012\u00020\f048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u00108\u001a\u0004\bm\u0010:R!\u0010p\u001a\b\u0012\u0004\u0012\u00020\f048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u00108\u001a\u0004\bo\u0010:R!\u0010s\u001a\b\u0012\u0004\u0012\u00020\f048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bq\u00108\u001a\u0004\br\u0010:R1\u0010v\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020P0Oj\b\u0012\u0004\u0012\u00020P`Q048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u00108\u001a\u0004\bu\u0010:R$\u0010}\u001a\u00020w2\u0006\u0010x\u001a\u00020w8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R,\u0010\u0083\u0001\u001a\u0004\u0018\u00010~2\b\u0010x\u001a\u0004\u0018\u00010~8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R+\u0010\u0086\u0001\u001a\u0004\u0018\u00010\f2\b\u0010x\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u000e\"\u0005\b\u0085\u0001\u0010\u001fR+\u0010\u0089\u0001\u001a\u0004\u0018\u00010\f2\b\u0010x\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010\u000e\"\u0005\b\u0088\u0001\u0010\u001fR-\u0010\u008e\u0001\u001a\u0004\u0018\u00010P2\b\u0010x\u001a\u0004\u0018\u00010P8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R/\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008f\u00012\t\u0010x\u001a\u0005\u0018\u00010\u008f\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R+\u0010\u0097\u0001\u001a\u0004\u0018\u00010\f2\b\u0010x\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010\u000e\"\u0005\b\u0096\u0001\u0010\u001f¨\u0006\u0098\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/viewmodel/registration/OneRegistrationViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "temporaryCache", "<init>", "(Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/manager/TemporaryCache;)V", "", "B", "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "A", "()Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerRequest;", "", "clearNextStepRequestOtp", "()V", "clearNavigateVerifyOtp", "clearNextStepRequestOtpOnline", "clearNextStepRequestOtpOnlineRefresh", "checkProfileRegister", "", "isLoading", "requestOtp", "(Ljava/lang/Boolean;)V", "otp", "verifyOTP", "(Ljava/lang/String;)V", "getListSIMRetailer", "refresh", "requestOtpPhoneOnline", "verifyOTPOnline", "registerOwner", "onCleared", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/repository/OneRegistrationRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "e", "Lth/co/dtac/android/dtacone/manager/TemporaryCache;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.FILL_NON_ZERO, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/registration/CheckProfileRegisterResponse;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "D", "()Landroidx/lifecycle/MutableLiveData;", "_checkProfileRegisterResponse", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getCheckProfileRegisterResponse", "()Landroidx/lifecycle/LiveData;", "checkProfileRegisterResponse", "Ljava/lang/Void;", "i", OperatorName.STROKING_COLOR_GRAY, "_nextStepRequestOtpInput", OperatorName.SET_LINE_JOINSTYLE, "getNextStepRequestOtpInput", "nextStepRequestOtpInput", OperatorName.NON_STROKING_CMYK, "F", "_nextStepRequestOtp", OperatorName.LINE_TO, "getNextStepRequestOtp", "nextStepRequestOtp", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "Lkotlin/collections/ArrayList;", OperatorName.MOVE_TO, ExifInterface.LONGITUDE_EAST, "_navigateVerifyOtp", OperatorName.ENDPATH, "getNavigateVerifyOtp", "navigateVerifyOtp", "o", "H", "_nextStepRequestOtpOnline", "p", "getNextStepRequestOtpOnline", "nextStepRequestOtpOnline", OperatorName.SAVE, "I", "_nextStepRequestOtpOnlineRefresh", PDPageLabelRange.STYLE_ROMAN_LOWER, "getNextStepRequestOtpOnlineRefresh", "nextStepRequestOtpOnlineRefresh", "Lth/co/dtac/android/dtacone/app_one/model/registration/OneRegisterOwnerResponse;", OperatorName.CLOSE_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "_registerOwner", "t", "getRegisterOwner", "u", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "href", OperatorName.SET_LINE_WIDTH, "hrefOnline", "C", "verifyToken", "x", "getVerifyOnlineToken", "verifyOnlineToken", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getGetRtrCodeAndSimRList", "getRtrCodeAndSimRList", "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "value", "getRegistrationType", "()Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "setRegistrationType", "(Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;)V", "registrationType", "Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "getInputData", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;", "setInputData", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneInputInfoData;)V", "inputData", "getRtrCodeVerify", "setRtrCodeVerify", "rtrCodeVerify", "getPhoneNumberOnline", "setPhoneNumberOnline", "phoneNumberOnline", "getItemSelected", "()Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "setItemSelected", "(Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;)V", "itemSelected", "Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "getOneRegistrationPassWord", "()Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;", "setOneRegistrationPassWord", "(Lth/co/dtac/android/dtacone/app_one/util/model/OneRegistrationPassWord;)V", "oneRegistrationPassWord", "getIdCard", "setIdCard", "idCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel */
/* loaded from: classes7.dex */
public final class OneRegistrationViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneRegistrationRepository f82710b;

    /* renamed from: c */
    public final Rx2ThreadService f82711c;

    /* renamed from: d */
    public final OneErrorService f82712d;

    /* renamed from: e */
    public final TemporaryCache f82713e;

    /* renamed from: f */
    public final CompositeDisposable f82714f;

    /* renamed from: g */
    public final Lazy f82715g;

    /* renamed from: h */
    public final LiveData f82716h;

    /* renamed from: i */
    public final Lazy f82717i;

    /* renamed from: j */
    public final LiveData f82718j;

    /* renamed from: k */
    public final Lazy f82719k;

    /* renamed from: l */
    public final LiveData f82720l;

    /* renamed from: m */
    public final Lazy f82721m;

    /* renamed from: n */
    public final LiveData f82722n;

    /* renamed from: o */
    public final Lazy f82723o;

    /* renamed from: p */
    public final LiveData f82724p;

    /* renamed from: q */
    public final Lazy f82725q;

    /* renamed from: r */
    public final LiveData f82726r;

    /* renamed from: s */
    public final Lazy f82727s;

    /* renamed from: t */
    public final LiveData f82728t;

    /* renamed from: u */
    public final Lazy f82729u;

    /* renamed from: v */
    public final Lazy f82730v;

    /* renamed from: w */
    public final Lazy f82731w;

    /* renamed from: x */
    public final Lazy f82732x;

    /* renamed from: y */
    public final Lazy f82733y;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegistrationType.values().length];
            try {
                iArr[RegistrationType.RtrCodeOnlyOne.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegistrationType.RtrCodeMultiple.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegistrationType.Phone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RegistrationType.PhoneOnlyOne.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RegistrationType.PhoneMultiple.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public OneRegistrationViewModel(@NotNull OneRegistrationRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull TemporaryCache temporaryCache) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(temporaryCache, "temporaryCache");
        this.f82710b = repository;
        this.f82711c = threadService;
        this.f82712d = oneErrorService;
        this.f82713e = temporaryCache;
        this.f82714f = new CompositeDisposable();
        this.f82715g = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_checkProfileRegisterResponse$2.INSTANCE);
        this.f82716h = m20229D();
        this.f82717i = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_nextStepRequestOtpInput$2.INSTANCE);
        this.f82718j = m20226G();
        this.f82719k = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_nextStepRequestOtp$2.INSTANCE);
        this.f82720l = m20227F();
        this.f82721m = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_navigateVerifyOtp$2.INSTANCE);
        this.f82722n = m20228E();
        this.f82723o = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_nextStepRequestOtpOnline$2.INSTANCE);
        this.f82724p = m20225H();
        this.f82725q = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_nextStepRequestOtpOnlineRefresh$2.INSTANCE);
        this.f82726r = m20224I();
        this.f82727s = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$_registerOwner$2.INSTANCE);
        this.f82728t = m20223J();
        this.f82729u = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$href$2.INSTANCE);
        this.f82730v = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$hrefOnline$2.INSTANCE);
        this.f82731w = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$verifyToken$2.INSTANCE);
        this.f82732x = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$verifyOnlineToken$2.INSTANCE);
        this.f82733y = LazyKt__LazyJVMKt.lazy(OneRegistrationViewModel$getRtrCodeAndSimRList$2.INSTANCE);
    }

    /* renamed from: C */
    public final MutableLiveData m20230C() {
        return (MutableLiveData) this.f82731w.getValue();
    }

    /* renamed from: E */
    public final MutableLiveData m20228E() {
        return (MutableLiveData) this.f82721m.getValue();
    }

    /* renamed from: F */
    public final MutableLiveData m20227F() {
        return (MutableLiveData) this.f82719k.getValue();
    }

    /* renamed from: G */
    public final MutableLiveData m20226G() {
        return (MutableLiveData) this.f82717i.getValue();
    }

    /* renamed from: K */
    public static final void m20222K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m20221L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m20220M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m20219N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m20218O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m20217P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m20216Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m20215R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m20214S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m20213T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m20212U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m20211V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m20210W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m20209X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m20208Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m20207b(Function1 function1, Object obj) {
        m20218O(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m20206c(Function1 function1, Object obj) {
        m20216Q(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m20205d(Function1 function1, Object obj) {
        m20215R(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m20204e(Function1 function1, Object obj) {
        m20214S(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m20203f(Function1 function1, Object obj) {
        m20220M(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m20202g(Function1 function1, Object obj) {
        m20183z(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m20201h(Function1 function1, Object obj) {
        m20185x(function1, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m20200i(Function1 function1, Object obj) {
        m20222K(function1, obj);
    }

    /* renamed from: j */
    public static /* synthetic */ void m20199j(Function1 function1, Object obj) {
        m20211V(function1, obj);
    }

    /* renamed from: k */
    public static /* synthetic */ void m20198k(Function1 function1, Object obj) {
        m20208Y(function1, obj);
    }

    /* renamed from: l */
    public static /* synthetic */ void m20197l(Function1 function1, Object obj) {
        m20212U(function1, obj);
    }

    /* renamed from: m */
    public static /* synthetic */ void m20196m(Function1 function1, Object obj) {
        m20209X(function1, obj);
    }

    /* renamed from: n */
    public static /* synthetic */ void m20195n(Function1 function1, Object obj) {
        m20213T(function1, obj);
    }

    /* renamed from: o */
    public static /* synthetic */ void m20194o(Function1 function1, Object obj) {
        m20221L(function1, obj);
    }

    /* renamed from: p */
    public static /* synthetic */ void m20193p(Function1 function1, Object obj) {
        m20219N(function1, obj);
    }

    /* renamed from: q */
    public static /* synthetic */ void m20192q(Function1 function1, Object obj) {
        m20217P(function1, obj);
    }

    /* renamed from: r */
    public static /* synthetic */ void m20191r(Function1 function1, Object obj) {
        m20188u(function1, obj);
    }

    public static /* synthetic */ void registerOwner$default(OneRegistrationViewModel oneRegistrationViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        oneRegistrationViewModel.registerOwner(bool);
    }

    public static /* synthetic */ void requestOtp$default(OneRegistrationViewModel oneRegistrationViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.TRUE;
        }
        oneRegistrationViewModel.requestOtp(bool);
    }

    public static /* synthetic */ void requestOtpPhoneOnline$default(OneRegistrationViewModel oneRegistrationViewModel, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        oneRegistrationViewModel.requestOtpPhoneOnline(bool);
    }

    /* renamed from: s */
    public static /* synthetic */ void m20190s(Function1 function1, Object obj) {
        m20210W(function1, obj);
    }

    /* renamed from: t */
    public static /* synthetic */ void m20189t(Function1 function1, Object obj) {
        m20184y(function1, obj);
    }

    /* renamed from: u */
    public static final void m20188u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m20185x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m20184y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m20183z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final OneRegisterOwnerRequest m20232A() {
        String str;
        String str2;
        OneInputInfoData inputData = getInputData();
        String str3 = null;
        if (inputData != null) {
            str = inputData.getRtrCode();
        } else {
            str = null;
        }
        OneRegistrationRepository oneRegistrationRepository = this.f82710b;
        OneInputInfoData inputData2 = getInputData();
        if (inputData2 != null) {
            str2 = inputData2.getPhoneNumber();
        } else {
            str2 = null;
        }
        String encryptPhoneNumberString = oneRegistrationRepository.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(str2));
        OneRegistrationRepository oneRegistrationRepository2 = this.f82710b;
        OneRegistrationPassWord oneRegistrationPassWord = getOneRegistrationPassWord();
        if (oneRegistrationPassWord != null) {
            str3 = oneRegistrationPassWord.getPasswordConfirm();
        }
        String encryptCBC = oneRegistrationRepository2.encryptCBC(String.valueOf(str3));
        int i = WhenMappings.$EnumSwitchMapping$0[getRegistrationType().ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    return new OneRegisterOwnerRequest(str, encryptCBC, "", encryptPhoneNumberString, "", "");
                }
                String encryptPhoneNumberString2 = this.f82710b.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(getPhoneNumberOnline()));
                String value = getVerifyOnlineToken().getValue();
                if (value == null) {
                    value = "";
                }
                return new OneRegisterOwnerRequest(str, encryptCBC, "", encryptPhoneNumberString, encryptPhoneNumberString2, value);
            }
            return new OneRegisterOwnerRequest(str, encryptCBC, "", encryptPhoneNumberString, "", "");
        }
        return new OneRegisterOwnerRequest(str, encryptCBC, getIdCard(), encryptPhoneNumberString, "", "");
    }

    /* renamed from: B */
    public final String m20231B() {
        int i = WhenMappings.$EnumSwitchMapping$0[getRegistrationType().ordinal()];
        if (i != 1 && i != 2) {
            OneInputInfoData inputData = getInputData();
            if (inputData == null) {
                return null;
            }
            return inputData.getRtrCode();
        }
        String rtrCodeVerify = getRtrCodeVerify();
        if (rtrCodeVerify != null && rtrCodeVerify.length() != 0) {
            return getRtrCodeVerify();
        }
        OneInputInfoData inputData2 = getInputData();
        if (inputData2 == null) {
            return null;
        }
        return inputData2.getRtrCode();
    }

    /* renamed from: D */
    public final MutableLiveData m20229D() {
        return (MutableLiveData) this.f82715g.getValue();
    }

    /* renamed from: H */
    public final MutableLiveData m20225H() {
        return (MutableLiveData) this.f82723o.getValue();
    }

    /* renamed from: I */
    public final MutableLiveData m20224I() {
        return (MutableLiveData) this.f82725q.getValue();
    }

    /* renamed from: J */
    public final MutableLiveData m20223J() {
        return (MutableLiveData) this.f82727s.getValue();
    }

    public final void checkProfileRegister() {
        String str;
        OneRegistrationRepository oneRegistrationRepository = this.f82710b;
        OneInputInfoData inputData = getInputData();
        String str2 = (inputData == null || (str2 = inputData.getRtrCode()) == null) ? "" : "";
        OneRegistrationRepository oneRegistrationRepository2 = this.f82710b;
        OneInputInfoData inputData2 = getInputData();
        if (inputData2 != null) {
            str = inputData2.getPhoneNumber();
        } else {
            str = null;
        }
        Single<R> compose = oneRegistrationRepository.checkProfileRegister(new CheckProfileRegisterRequest(str2, oneRegistrationRepository2.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(str)))).compose(this.f82711c.applySingleAsync());
        final OneRegistrationViewModel$checkProfileRegister$1 oneRegistrationViewModel$checkProfileRegister$1 = new OneRegistrationViewModel$checkProfileRegister$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Yb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20191r(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun checkProfileRegister…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneRegistrationViewModel$checkProfileRegister$2(this), new OneRegistrationViewModel$checkProfileRegister$3(this)), this.f82714f);
    }

    public final void clearNavigateVerifyOtp() {
        m20228E().setValue(null);
    }

    public final void clearNextStepRequestOtp() {
        m20227F().setValue(null);
    }

    public final void clearNextStepRequestOtpOnline() {
        m20225H().setValue(null);
    }

    public final void clearNextStepRequestOtpOnlineRefresh() {
        m20224I().setValue(null);
    }

    @NotNull
    public final LiveData<Resource<CheckProfileRegisterResponse>> getCheckProfileRegisterResponse() {
        return this.f82716h;
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f82714f;
    }

    @NotNull
    public final MutableLiveData<ArrayList<SimData>> getGetRtrCodeAndSimRList() {
        return (MutableLiveData) this.f82733y.getValue();
    }

    @Nullable
    public final String getIdCard() {
        return this.f82710b.getIdCard();
    }

    @Nullable
    public final OneInputInfoData getInputData() {
        return this.f82710b.getInputData();
    }

    @Nullable
    public final SimData getItemSelected() {
        return this.f82710b.getItemSelected();
    }

    public final void getListSIMRetailer() {
        String str;
        OneRegistrationRepository oneRegistrationRepository = this.f82710b;
        OneInputInfoData inputData = getInputData();
        String str2 = (inputData == null || (str2 = inputData.getRtrCode()) == null) ? "" : "";
        OneRegistrationRepository oneRegistrationRepository2 = this.f82710b;
        OneInputInfoData inputData2 = getInputData();
        if (inputData2 != null) {
            str = inputData2.getPhoneNumber();
        } else {
            str = null;
        }
        Single<R> compose = oneRegistrationRepository.getListSIMRetailer(new ListSIMRetailerRequest(str2, oneRegistrationRepository2.encryptPhoneNumberString(PhoneNumberExtKt.toInternational(str)))).compose(this.f82711c.applySingleAsync());
        final OneRegistrationViewModel$getListSIMRetailer$1 oneRegistrationViewModel$getListSIMRetailer$1 = OneRegistrationViewModel$getListSIMRetailer$1.INSTANCE;
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Qb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20201h(Function1.this, obj);
            }
        });
        final OneRegistrationViewModel$getListSIMRetailer$2 oneRegistrationViewModel$getListSIMRetailer$2 = new OneRegistrationViewModel$getListSIMRetailer$2(this);
        Consumer consumer = new Consumer() { // from class: Rb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20189t(Function1.this, obj);
            }
        };
        final OneRegistrationViewModel$getListSIMRetailer$3 oneRegistrationViewModel$getListSIMRetailer$3 = new OneRegistrationViewModel$getListSIMRetailer$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Sb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20202g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun getListSIMRetailer()… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82714f);
    }

    @NotNull
    public final LiveData<Resource<ArrayList<SimData>>> getNavigateVerifyOtp() {
        return this.f82722n;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtp() {
        return this.f82720l;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtpInput() {
        return this.f82718j;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtpOnline() {
        return this.f82724p;
    }

    @NotNull
    public final LiveData<Resource<Void>> getNextStepRequestOtpOnlineRefresh() {
        return this.f82726r;
    }

    @Nullable
    public final OneRegistrationPassWord getOneRegistrationPassWord() {
        return this.f82710b.getOneRegistrationPassWord();
    }

    @Nullable
    public final String getPhoneNumberOnline() {
        return this.f82710b.getPhoneNumberOnline();
    }

    @NotNull
    public final LiveData<Resource<OneRegisterOwnerResponse>> getRegisterOwner() {
        return this.f82728t;
    }

    @NotNull
    public final RegistrationType getRegistrationType() {
        return this.f82710b.getRegistrationType();
    }

    @Nullable
    public final String getRtrCodeVerify() {
        return this.f82710b.getRtrCodeVerify();
    }

    @NotNull
    public final MutableLiveData<String> getVerifyOnlineToken() {
        return (MutableLiveData) this.f82732x.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f82714f.clear();
        this.f82710b.clear();
    }

    public final void registerOwner(@Nullable Boolean bool) {
        String m20231B = m20231B();
        OneRegisterOwnerRequest m20232A = m20232A();
        if (m20232A != null) {
            Single<R> compose = this.f82710b.registerOwner(m20231B, m20232A).compose(this.f82711c.applySingleAsync());
            final OneRegistrationViewModel$registerOwner$1$1 oneRegistrationViewModel$registerOwner$1$1 = new OneRegistrationViewModel$registerOwner$1$1(bool, this);
            Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Kb1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneRegistrationViewModel.m20200i(Function1.this, obj);
                }
            });
            final OneRegistrationViewModel$registerOwner$1$2 oneRegistrationViewModel$registerOwner$1$2 = new OneRegistrationViewModel$registerOwner$1$2(this);
            Consumer consumer = new Consumer() { // from class: Lb1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneRegistrationViewModel.m20194o(Function1.this, obj);
                }
            };
            final OneRegistrationViewModel$registerOwner$1$3 oneRegistrationViewModel$registerOwner$1$3 = new OneRegistrationViewModel$registerOwner$1$3(this);
            Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Mb1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OneRegistrationViewModel.m20203f(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "fun registerOwner(isLoad…sposable)\n        }\n    }");
            DisposableKt.addTo(subscribe, this.f82714f);
        }
    }

    public final void requestOtp(@Nullable Boolean bool) {
        String str;
        OneRegistrationRepository oneRegistrationRepository = this.f82710b;
        OneInputInfoData inputData = getInputData();
        if (inputData != null) {
            str = inputData.getPhoneNumber();
        } else {
            str = null;
        }
        Observable<R> compose = oneRegistrationRepository.requestOtp(new RequestOtpBody(PhoneNumberExtKt.toInternational(str), "REGISTER")).compose(this.f82711c.applyAsync());
        final OneRegistrationViewModel$requestOtp$1 oneRegistrationViewModel$requestOtp$1 = new OneRegistrationViewModel$requestOtp$1(bool, this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Nb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20193p(Function1.this, obj);
            }
        });
        final OneRegistrationViewModel$requestOtp$2 oneRegistrationViewModel$requestOtp$2 = new OneRegistrationViewModel$requestOtp$2(this, bool);
        Consumer consumer = new Consumer() { // from class: Ob1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20207b(Function1.this, obj);
            }
        };
        final OneRegistrationViewModel$requestOtp$3 oneRegistrationViewModel$requestOtp$3 = new OneRegistrationViewModel$requestOtp$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Pb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20192q(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun requestOtp(isLoading… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82714f);
    }

    public final void requestOtpPhoneOnline(@Nullable Boolean bool) {
        Observable<R> compose = this.f82710b.requestOtp(new RequestOtpBody(PhoneNumberExtKt.toInternational(getPhoneNumberOnline()), "REGISTER")).compose(this.f82711c.applyAsync());
        final OneRegistrationViewModel$requestOtpPhoneOnline$1 oneRegistrationViewModel$requestOtpPhoneOnline$1 = new OneRegistrationViewModel$requestOtpPhoneOnline$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Vb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20206c(Function1.this, obj);
            }
        });
        final OneRegistrationViewModel$requestOtpPhoneOnline$2 oneRegistrationViewModel$requestOtpPhoneOnline$2 = new OneRegistrationViewModel$requestOtpPhoneOnline$2(this, bool);
        Consumer consumer = new Consumer() { // from class: Wb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20205d(Function1.this, obj);
            }
        };
        final OneRegistrationViewModel$requestOtpPhoneOnline$3 oneRegistrationViewModel$requestOtpPhoneOnline$3 = new OneRegistrationViewModel$requestOtpPhoneOnline$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Xb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20204e(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun requestOtpPhoneOnlin… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82714f);
    }

    public final void setIdCard(@Nullable String str) {
        this.f82710b.setIdCard(str);
    }

    public final void setInputData(@Nullable OneInputInfoData oneInputInfoData) {
        this.f82710b.setInputData(oneInputInfoData);
    }

    public final void setItemSelected(@Nullable SimData simData) {
        this.f82710b.setItemSelected(simData);
    }

    public final void setOneRegistrationPassWord(@Nullable OneRegistrationPassWord oneRegistrationPassWord) {
        this.f82710b.setOneRegistrationPassWord(oneRegistrationPassWord);
    }

    public final void setPhoneNumberOnline(@Nullable String str) {
        this.f82710b.setPhoneNumberOnline(str);
    }

    public final void setRegistrationType(@NotNull RegistrationType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f82710b.setRegistrationType(value);
    }

    public final void setRtrCodeVerify(@Nullable String str) {
        this.f82710b.setRtrCodeVerify(str);
    }

    /* renamed from: v */
    public final MutableLiveData m20187v() {
        return (MutableLiveData) this.f82729u.getValue();
    }

    public final void verifyOTP(@NotNull String otp) {
        String str;
        Intrinsics.checkNotNullParameter(otp, "otp");
        OneRegistrationRepository oneRegistrationRepository = this.f82710b;
        OneInputInfoData inputData = getInputData();
        if (inputData != null) {
            str = inputData.getPhoneNumber();
        } else {
            str = null;
        }
        Observable<R> compose = oneRegistrationRepository.verifyOTP(new VerifyOtpRequest(PhoneNumberExtKt.toInternational(str), otp, (String) m20187v().getValue(), "REGISTER")).compose(this.f82711c.applyAsync());
        final OneRegistrationViewModel$verifyOTP$1 oneRegistrationViewModel$verifyOTP$1 = new OneRegistrationViewModel$verifyOTP$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Zb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20195n(Function1.this, obj);
            }
        });
        final OneRegistrationViewModel$verifyOTP$2 oneRegistrationViewModel$verifyOTP$2 = new OneRegistrationViewModel$verifyOTP$2(this);
        Consumer consumer = new Consumer() { // from class: ac1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20197l(Function1.this, obj);
            }
        };
        final OneRegistrationViewModel$verifyOTP$3 oneRegistrationViewModel$verifyOTP$3 = new OneRegistrationViewModel$verifyOTP$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: bc1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20199j(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyOTP(otp: Strin… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f82714f);
    }

    public final void verifyOTPOnline(@NotNull String otp) {
        Intrinsics.checkNotNullParameter(otp, "otp");
        String value = getVerifyOnlineToken().getValue();
        if (value != null && value.length() != 0) {
            registerOwner(Boolean.FALSE);
            return;
        }
        Observable<R> compose = this.f82710b.verifyOTP(new VerifyOtpRequest(PhoneNumberExtKt.toInternational(getPhoneNumberOnline()), otp, (String) m20186w().getValue(), "REGISTER")).compose(this.f82711c.applyAsync());
        final OneRegistrationViewModel$verifyOTPOnline$1 oneRegistrationViewModel$verifyOTPOnline$1 = new OneRegistrationViewModel$verifyOTPOnline$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Jb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20190s(Function1.this, obj);
            }
        });
        final OneRegistrationViewModel$verifyOTPOnline$2 oneRegistrationViewModel$verifyOTPOnline$2 = new OneRegistrationViewModel$verifyOTPOnline$2(this);
        Consumer consumer = new Consumer() { // from class: Tb1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20196m(Function1.this, obj);
            }
        };
        final OneRegistrationViewModel$verifyOTPOnline$3 oneRegistrationViewModel$verifyOTPOnline$3 = new OneRegistrationViewModel$verifyOTPOnline$3(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: Ub1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneRegistrationViewModel.m20198k(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun verifyOTPOnline(otp:…egisterOwner(false)\n    }");
        DisposableKt.addTo(subscribe, this.f82714f);
    }

    /* renamed from: w */
    public final MutableLiveData m20186w() {
        return (MutableLiveData) this.f82730v.getValue();
    }
}