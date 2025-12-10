package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.repository.OneChangeOwnerRepository;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J-\u0010)\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*J-\u0010,\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010+0+0&2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0012H\u0002¢\u0006\u0004\b,\u0010*J\u001d\u0010-\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b/\u0010.J\u001d\u00100\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b0\u0010.J%\u00101\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b3\u00102J%\u00104\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b4\u00102J\u0015\u00106\u001a\u00020\"2\u0006\u00105\u001a\u00020\u0012¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0014¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\"¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010O\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR#\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0X8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010VR#\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q0X8\u0006¢\u0006\f\n\u0004\ba\u0010Z\u001a\u0004\bb\u0010\\R'\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120Q0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010T\u001a\u0004\be\u0010VR#\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120Q0X8\u0006¢\u0006\f\n\u0004\bg\u0010Z\u001a\u0004\bh\u0010\\R'\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0j0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010T\u001a\u0004\bl\u0010VR#\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0j0X8\u0006¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bn\u0010\\R'\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0j0P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010T\u001a\u0004\bq\u0010VR#\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0j0X8\u0006¢\u0006\f\n\u0004\bs\u0010Z\u001a\u0004\bt\u0010\\¨\u0006v"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/change_owner/viewModel/OneChangeOwnerValidateViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/change_owner/repository/OneChangeOwnerRepository;", "oneChangeOwnerRepository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/change_owner/repository/OneChangeOwnerRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;)V", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "card", "", "oldIdCardNumber", "", OperatorName.SAVE, "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;)Z", "date", "D", "(Ljava/lang/String;)Z", "Lkotlin/Triple;", "", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Ljava/lang/String;)Lkotlin/Triple;", "amphur", "province", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "bitmap", "", "p", "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;)V", "identityType", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "kotlin.jvm.PlatformType", PDPageLabelRange.STYLE_ROMAN_LOWER, "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;)Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;", "t", "validateCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;)V", "validateCardTrue", "validateCardDtac", "validateSmartCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;)V", "validateSmartCardTrue", "validateSmartCardDtac", "msisdn", "isAllowCamera", "(Ljava/lang/String;)V", "isFaceRecognition", "()Z", "clearNavigateForUpPass", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/change_owner/repository/OneChangeOwnerRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "e", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.CLOSE_PATH, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Lokhttp3/MediaType;", "i", "Lokhttp3/MediaType;", "MEDIA_TEXT_PLAIN", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", OperatorName.SET_LINE_JOINSTYLE, "Lkotlin/Lazy;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "()Landroidx/lifecycle/MutableLiveData;", "_navigateTakeIdentityPhoto", "Landroidx/lifecycle/LiveData;", OperatorName.NON_STROKING_CMYK, "Landroidx/lifecycle/LiveData;", "getNavigateTakeIdentityPhoto", "()Landroidx/lifecycle/LiveData;", "navigateTakeIdentityPhoto", OperatorName.LINE_TO, "x", "_navigateTakeCustomerPhoto", OperatorName.MOVE_TO, "getNavigateTakeCustomerPhoto", "navigateTakeCustomerPhoto", OperatorName.ENDPATH, "z", "_navigateTakeMorePhoto", "o", "getNavigateTakeMorePhoto", "navigateTakeMorePhoto", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", OperatorName.SET_LINE_WIDTH, "_errorCardExpire", "getErrorCardExpire", "errorCardExpire", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", "A", "_onErrorService", OperatorName.CLOSE_AND_STROKE, "getOnErrorServiceFromORCCommon", "onErrorServiceFromORCCommon", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerValidateViewModel */
/* loaded from: classes10.dex */
public final class OneChangeOwnerValidateViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneChangeOwnerRepository f89344b;

    /* renamed from: c */
    public final ConfigurationRepository f89345c;

    /* renamed from: d */
    public final PreferencesViewModel f89346d;

    /* renamed from: e */
    public final BitmapUtil f89347e;

    /* renamed from: f */
    public final Rx2ThreadService f89348f;

    /* renamed from: g */
    public final OneErrorService f89349g;

    /* renamed from: h */
    public final CompositeDisposable f89350h;

    /* renamed from: i */
    public final MediaType f89351i;

    /* renamed from: j */
    public final Lazy f89352j;

    /* renamed from: k */
    public final LiveData f89353k;

    /* renamed from: l */
    public final Lazy f89354l;

    /* renamed from: m */
    public final LiveData f89355m;

    /* renamed from: n */
    public final Lazy f89356n;

    /* renamed from: o */
    public final LiveData f89357o;

    /* renamed from: p */
    public final Lazy f89358p;

    /* renamed from: q */
    public final LiveData f89359q;

    /* renamed from: r */
    public final Lazy f89360r;

    /* renamed from: s */
    public final LiveData f89361s;

    @Inject
    public OneChangeOwnerValidateViewModel(@NotNull OneChangeOwnerRepository oneChangeOwnerRepository, @NotNull ConfigurationRepository configurationRepository, @NotNull PreferencesViewModel pfViewModel, @NotNull BitmapUtil bitmapUtil, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService) {
        Intrinsics.checkNotNullParameter(oneChangeOwnerRepository, "oneChangeOwnerRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f89344b = oneChangeOwnerRepository;
        this.f89345c = configurationRepository;
        this.f89346d = pfViewModel;
        this.f89347e = bitmapUtil;
        this.f89348f = threadService;
        this.f89349g = errorService;
        this.f89350h = new CompositeDisposable();
        this.f89351i = MediaType.Companion.parse(HTTP.PLAIN_TEXT_TYPE);
        this.f89352j = LazyKt__LazyJVMKt.lazy(OneChangeOwnerValidateViewModel$_navigateTakeIdentityPhoto$2.INSTANCE);
        this.f89353k = m15321y();
        this.f89354l = LazyKt__LazyJVMKt.lazy(OneChangeOwnerValidateViewModel$_navigateTakeCustomerPhoto$2.INSTANCE);
        this.f89355m = m15322x();
        this.f89356n = LazyKt__LazyJVMKt.lazy(OneChangeOwnerValidateViewModel$_navigateTakeMorePhoto$2.INSTANCE);
        this.f89357o = m15320z();
        this.f89358p = LazyKt__LazyJVMKt.lazy(OneChangeOwnerValidateViewModel$_errorCardExpire$2.INSTANCE);
        this.f89359q = m15323w();
        this.f89360r = LazyKt__LazyJVMKt.lazy(OneChangeOwnerValidateViewModel$_onErrorService$2.INSTANCE);
        this.f89361s = m15358A();
    }

    /* renamed from: B */
    public static final String m15357B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final SingleSource m15356C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final SingleSource m15354E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m15353F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final SingleSource m15352G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m15351H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final SingleSource m15350I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final ValidateCardResponse m15349J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ValidateCardResponse) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m15348K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final SingleSource m15347L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final OneChangeOwnerValidateProfileResponse m15346M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OneChangeOwnerValidateProfileResponse) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m15345N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ String m15344b(Function1 function1, Object obj) {
        return m15357B(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m15343c(Function1 function1, Object obj) {
        m15345N(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ SingleSource m15341e(Function1 function1, Object obj) {
        return m15352G(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ SingleSource m15340f(Function1 function1, Object obj) {
        return m15354E(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m15339g(Function1 function1, Object obj) {
        m15351H(function1, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ OneChangeOwnerValidateProfileResponse m15337i(Function1 function1, Object obj) {
        return m15346M(function1, obj);
    }

    /* renamed from: k */
    public static /* synthetic */ SingleSource m15335k(Function1 function1, Object obj) {
        return m15347L(function1, obj);
    }

    /* renamed from: l */
    public static /* synthetic */ void m15334l(Function1 function1, Object obj) {
        m15353F(function1, obj);
    }

    /* renamed from: m */
    public static /* synthetic */ SingleSource m15333m(Function1 function1, Object obj) {
        return m15350I(function1, obj);
    }

    /* renamed from: n */
    public static /* synthetic */ void m15332n(Function1 function1, Object obj) {
        m15348K(function1, obj);
    }

    /* renamed from: s */
    public static final ValidateCardRequest m15327s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ValidateCardRequest) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final OneChangeOwnerValidateProfileRequest m15325u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OneChangeOwnerValidateProfileRequest) tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final MutableLiveData m15358A() {
        return (MutableLiveData) this.f89360r.getValue();
    }

    /* renamed from: D */
    public final boolean m15355D(String str) {
        if (str != null && str.length() != 0) {
            Triple m15324v = m15324v(str);
            int intValue = ((Number) m15324v.component1()).intValue();
            int intValue2 = ((Number) m15324v.component2()).intValue();
            int intValue3 = ((Number) m15324v.component3()).intValue();
            Calendar calendar = Calendar.getInstance(Locale.US);
            calendar.set(intValue - 543, intValue2 - 1, intValue3);
            return calendar.getTime().before(new Date());
        }
        return false;
    }

    public final void clearNavigateForUpPass() {
        m15321y().setValue(null);
        m15322x().setValue(null);
    }

    @NotNull
    public final LiveData<Resource<Void>> getErrorCardExpire() {
        return this.f89359q;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeCustomerPhoto() {
        return this.f89355m;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeIdentityPhoto() {
        return this.f89353k;
    }

    @NotNull
    public final LiveData<Event<String>> getNavigateTakeMorePhoto() {
        return this.f89357o;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getOnErrorServiceFromORCCommon() {
        return this.f89361s;
    }

    public final void isAllowCamera(@NotNull String msisdn) {
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        Single just = Single.just(msisdn);
        final OneChangeOwnerValidateViewModel$isAllowCamera$1 oneChangeOwnerValidateViewModel$isAllowCamera$1 = OneChangeOwnerValidateViewModel$isAllowCamera$1.INSTANCE;
        Single map = just.map(new Function() { // from class: uN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15344b(Function1.this, obj);
            }
        });
        final OneChangeOwnerValidateViewModel$isAllowCamera$2 oneChangeOwnerValidateViewModel$isAllowCamera$2 = new OneChangeOwnerValidateViewModel$isAllowCamera$2(this);
        Single compose = map.flatMap(new Function() { // from class: zN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m15356C;
                m15356C = OneChangeOwnerValidateViewModel.m15356C(Function1.this, obj);
                return m15356C;
            }
        }).compose(this.f89348f.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "fun isAllowCamera(msisdn…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new OneChangeOwnerValidateViewModel$isAllowCamera$3(this), OneChangeOwnerValidateViewModel$isAllowCamera$4.INSTANCE), this.f89350h);
    }

    public final boolean isFaceRecognition() {
        return this.f89344b.getRequireFaceRecognition();
    }

    /* renamed from: p */
    public final void m15330p(String str, String str2, BitmapCollection bitmapCollection) {
        Single<R> compose = this.f89344b.getPostCodeInfo(new GetPostCodeInfoRequest(str, str2)).compose(this.f89348f.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "oneChangeOwnerRepository…rvice.applySingleAsync())");
        SubscribersKt.subscribeBy(compose, new OneChangeOwnerValidateViewModel$callGetPostCode$1(this), new OneChangeOwnerValidateViewModel$callGetPostCode$2(this, bitmapCollection));
    }

    /* renamed from: q */
    public final boolean m15329q(CardCollection cardCollection, String str) {
        return !Intrinsics.areEqual(cardCollection.getIdentityNumber(), str);
    }

    /* renamed from: r */
    public final Single m15328r(CardCollection cardCollection, String str) {
        Single just = Single.just(cardCollection);
        final OneChangeOwnerValidateViewModel$encryptCard$1 oneChangeOwnerValidateViewModel$encryptCard$1 = new OneChangeOwnerValidateViewModel$encryptCard$1(str, this);
        Single map = just.map(new Function() { // from class: xN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ValidateCardRequest m15327s;
                m15327s = OneChangeOwnerValidateViewModel.m15327s(Function1.this, obj);
                return m15327s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun encryptCard(…m\n            )\n        }");
        return map;
    }

    /* renamed from: t */
    public final Single m15326t(CardCollection cardCollection, String str) {
        Single just = Single.just(cardCollection);
        final OneChangeOwnerValidateViewModel$encryptCardTrue$1 oneChangeOwnerValidateViewModel$encryptCardTrue$1 = new OneChangeOwnerValidateViewModel$encryptCardTrue$1(this, str);
        Single map = just.map(new Function() { // from class: yN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                OneChangeOwnerValidateProfileRequest m15325u;
                m15325u = OneChangeOwnerValidateViewModel.m15325u(Function1.this, obj);
                return m15325u;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun encryptCardT… flow = \"CHANGE_OWNER\") }");
        return map;
    }

    /* renamed from: v */
    public final Triple m15324v(String str) {
        int i;
        int i2 = 1999;
        if (str.length() >= 4) {
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            i2 = StringExtKt.toIntOrDefault(substring, 1999);
        }
        int i3 = 1;
        if (str.length() >= 6) {
            String substring2 = str.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i = StringExtKt.toIntOrDefault(substring2, 1);
        } else {
            i = 1;
        }
        if (str.length() >= 8) {
            String substring3 = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            i3 = StringExtKt.toIntOrDefault(substring3, 1);
        }
        return new Triple(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3));
    }

    public final void validateCard(@NotNull CardCollection card, @NotNull String identityType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        if (Intrinsics.areEqual(this.f89346d.getCompany(), "TRUE")) {
            validateCardTrue(card, identityType);
        } else {
            validateCardDtac(card, identityType);
        }
    }

    public final void validateCardDtac(@NotNull CardCollection card, @NotNull String identityType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Single m15328r = m15328r(card, identityType);
        final OneChangeOwnerValidateViewModel$validateCardDtac$1 oneChangeOwnerValidateViewModel$validateCardDtac$1 = new OneChangeOwnerValidateViewModel$validateCardDtac$1(this);
        Single compose = m15328r.flatMap(new Function() { // from class: FN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15340f(Function1.this, obj);
            }
        }).compose(this.f89348f.applySingleAsync());
        final OneChangeOwnerValidateViewModel$validateCardDtac$2 oneChangeOwnerValidateViewModel$validateCardDtac$2 = new OneChangeOwnerValidateViewModel$validateCardDtac$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: GN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneChangeOwnerValidateViewModel.m15334l(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateCardDtac(car…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneChangeOwnerValidateViewModel$validateCardDtac$3(this), new OneChangeOwnerValidateViewModel$validateCardDtac$4(this, identityType, card)), this.f89350h);
    }

    public final void validateCardTrue(@NotNull CardCollection card, @NotNull String identityType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Single m15326t = m15326t(card, identityType);
        final OneChangeOwnerValidateViewModel$validateCardTrue$1 oneChangeOwnerValidateViewModel$validateCardTrue$1 = new OneChangeOwnerValidateViewModel$validateCardTrue$1(this);
        Single compose = m15326t.flatMap(new Function() { // from class: DN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15341e(Function1.this, obj);
            }
        }).compose(this.f89348f.applySingleAsync());
        final OneChangeOwnerValidateViewModel$validateCardTrue$2 oneChangeOwnerValidateViewModel$validateCardTrue$2 = new OneChangeOwnerValidateViewModel$validateCardTrue$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: EN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneChangeOwnerValidateViewModel.m15339g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateCardTrue(car…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneChangeOwnerValidateViewModel$validateCardTrue$3(this), new OneChangeOwnerValidateViewModel$validateCardTrue$4(this, card, identityType)), this.f89350h);
    }

    public final void validateSmartCard(@NotNull CardCollection card, @NotNull String identityType, @NotNull BitmapCollection bitmap) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (Intrinsics.areEqual(this.f89346d.getCompany(), "TRUE")) {
            validateSmartCardTrue(card, identityType, bitmap);
        } else {
            validateSmartCardDtac(card, identityType, bitmap);
        }
    }

    public final void validateSmartCardDtac(@NotNull CardCollection card, @NotNull String identityType, @NotNull BitmapCollection bitmap) {
        String str;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        IdCardInformationCollection cardInformationCollection = this.f89344b.getCardInformationCollection();
        if (cardInformationCollection != null) {
            str = cardInformationCollection.getExpire();
        } else {
            str = null;
        }
        if (m15355D(str)) {
            m15323w().setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
            return;
        }
        Single m15328r = m15328r(card, identityType);
        final OneChangeOwnerValidateViewModel$validateSmartCardDtac$1 oneChangeOwnerValidateViewModel$validateSmartCardDtac$1 = new OneChangeOwnerValidateViewModel$validateSmartCardDtac$1(this);
        Single flatMap = m15328r.flatMap(new Function() { // from class: HN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15333m(Function1.this, obj);
            }
        });
        final OneChangeOwnerValidateViewModel$validateSmartCardDtac$2 oneChangeOwnerValidateViewModel$validateSmartCardDtac$2 = new OneChangeOwnerValidateViewModel$validateSmartCardDtac$2(this, bitmap);
        Single compose = flatMap.map(new Function() { // from class: vN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ValidateCardResponse m15349J;
                m15349J = OneChangeOwnerValidateViewModel.m15349J(Function1.this, obj);
                return m15349J;
            }
        }).compose(this.f89348f.applySingleAsync());
        final OneChangeOwnerValidateViewModel$validateSmartCardDtac$3 oneChangeOwnerValidateViewModel$validateSmartCardDtac$3 = new OneChangeOwnerValidateViewModel$validateSmartCardDtac$3(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: wN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneChangeOwnerValidateViewModel.m15332n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSmartCardDta…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneChangeOwnerValidateViewModel$validateSmartCardDtac$4(this), new OneChangeOwnerValidateViewModel$validateSmartCardDtac$5(this, card, bitmap, identityType)), this.f89350h);
    }

    public final void validateSmartCardTrue(@NotNull CardCollection card, @NotNull String identityType, @NotNull BitmapCollection bitmap) {
        String str;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        IdCardInformationCollection cardInformationCollection = this.f89344b.getCardInformationCollection();
        if (cardInformationCollection != null) {
            str = cardInformationCollection.getExpire();
        } else {
            str = null;
        }
        if (m15355D(str)) {
            m15323w().setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
            return;
        }
        Single m15326t = m15326t(card, identityType);
        final OneChangeOwnerValidateViewModel$validateSmartCardTrue$1 oneChangeOwnerValidateViewModel$validateSmartCardTrue$1 = new OneChangeOwnerValidateViewModel$validateSmartCardTrue$1(this);
        Single flatMap = m15326t.flatMap(new Function() { // from class: AN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15335k(Function1.this, obj);
            }
        });
        final OneChangeOwnerValidateViewModel$validateSmartCardTrue$2 oneChangeOwnerValidateViewModel$validateSmartCardTrue$2 = new OneChangeOwnerValidateViewModel$validateSmartCardTrue$2(this, bitmap);
        Single compose = flatMap.map(new Function() { // from class: BN0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneChangeOwnerValidateViewModel.m15337i(Function1.this, obj);
            }
        }).compose(this.f89348f.applySingleAsync());
        final OneChangeOwnerValidateViewModel$validateSmartCardTrue$3 oneChangeOwnerValidateViewModel$validateSmartCardTrue$3 = new OneChangeOwnerValidateViewModel$validateSmartCardTrue$3(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: CN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneChangeOwnerValidateViewModel.m15343c(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSmartCardTru…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneChangeOwnerValidateViewModel$validateSmartCardTrue$4(this), new OneChangeOwnerValidateViewModel$validateSmartCardTrue$5(this, card, bitmap, identityType)), this.f89350h);
    }

    /* renamed from: w */
    public final MutableLiveData m15323w() {
        return (MutableLiveData) this.f89358p.getValue();
    }

    /* renamed from: x */
    public final MutableLiveData m15322x() {
        return (MutableLiveData) this.f89354l.getValue();
    }

    /* renamed from: y */
    public final MutableLiveData m15321y() {
        return (MutableLiveData) this.f89352j.getValue();
    }

    /* renamed from: z */
    public final MutableLiveData m15320z() {
        return (MutableLiveData) this.f89356n.getValue();
    }
}