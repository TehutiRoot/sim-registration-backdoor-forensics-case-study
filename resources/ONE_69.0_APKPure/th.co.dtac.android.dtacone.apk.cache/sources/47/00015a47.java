package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist;

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
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_reregist.MrtrPrepaidReregistRepository;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010&\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u000e¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u001b¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u0004\u0018\u00010?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR'\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0K8\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR'\u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010G\u001a\u0004\bP\u0010IR#\u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0K8\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010NR'\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bU\u0010IR#\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0D0K8\u0006¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010NR'\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bW\u0010IR#\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0Z0K8\u0006¢\u0006\f\n\u0004\bH\u0010L\u001a\u0004\b]\u0010NR'\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0Z0C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010G\u001a\u0004\b`\u0010IR#\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0Z0K8\u0006¢\u0006\f\n\u0004\b`\u0010L\u001a\u0004\bb\u0010N¨\u0006d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_reregist/MrtrPrepaidReregistValidateCardViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;", "mrtrPrepaidReregistRepository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "bitmapUtil", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", "date", "", "u", "(Ljava/lang/String;)Z", "Lkotlin/Triple;", "", OperatorName.MOVE_TO, "(Ljava/lang/String;)Lkotlin/Triple;", "amphur", "province", "Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;", "bitmap", "", OperatorName.SET_LINE_JOINSTYLE, "(Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;)V", "Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;", "card", "identityType", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "kotlin.jvm.PlatformType", OperatorName.NON_STROKING_CMYK, "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;)Lio/reactivex/Single;", "validateCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;)V", "validateSmartCard", "(Lth/co/dtac/android/dtacone/model/prepaid/CardCollection;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/bitmap/BitmapCollection;)V", "msisdn", "isAllowCamera", "(Ljava/lang/String;)V", "isFaceRecognition", "()Z", "clearNavigateForUpPass", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/repository/mrtr_prepaid_reregist/MrtrPrepaidReregistRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/util/bitmap/BitmapUtil;", "e", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Lokhttp3/MediaType;", OperatorName.CLOSE_PATH, "Lokhttp3/MediaType;", "MEDIA_TEXT_PLAIN", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", "i", "Lkotlin/Lazy;", "p", "()Landroidx/lifecycle/MutableLiveData;", "_navigateTakeIdentityPhoto", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getNavigateTakeIdentityPhoto", "()Landroidx/lifecycle/LiveData;", "navigateTakeIdentityPhoto", "o", "_navigateTakeCustomerPhoto", OperatorName.LINE_TO, "getNavigateTakeCustomerPhoto", "navigateTakeCustomerPhoto", OperatorName.SAVE, "_navigateTakeMorePhoto", OperatorName.ENDPATH, "getNavigateTakeMorePhoto", "navigateTakeMorePhoto", "Lth/co/dtac/android/dtacone/model/Resource;", "Ljava/lang/Void;", "_errorCardExpire", "getErrorCardExpire", "errorCardExpire", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", PDPageLabelRange.STYLE_ROMAN_LOWER, "_onErrorService", "getOnErrorServiceFromORCCommon", "onErrorServiceFromORCCommon", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistValidateCardViewModel */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistValidateCardViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final MrtrPrepaidReregistRepository f106836b;

    /* renamed from: c */
    public final ConfigurationRepository f106837c;

    /* renamed from: d */
    public final BitmapUtil f106838d;

    /* renamed from: e */
    public final Rx2ThreadService f106839e;

    /* renamed from: f */
    public final MrtrErrorService f106840f;

    /* renamed from: g */
    public final CompositeDisposable f106841g;

    /* renamed from: h */
    public final MediaType f106842h;

    /* renamed from: i */
    public final Lazy f106843i;

    /* renamed from: j */
    public final LiveData f106844j;

    /* renamed from: k */
    public final Lazy f106845k;

    /* renamed from: l */
    public final LiveData f106846l;

    /* renamed from: m */
    public final Lazy f106847m;

    /* renamed from: n */
    public final LiveData f106848n;

    /* renamed from: o */
    public final Lazy f106849o;

    /* renamed from: p */
    public final LiveData f106850p;

    /* renamed from: q */
    public final Lazy f106851q;

    /* renamed from: r */
    public final LiveData f106852r;

    @Inject
    public MrtrPrepaidReregistValidateCardViewModel(@NotNull MrtrPrepaidReregistRepository mrtrPrepaidReregistRepository, @NotNull ConfigurationRepository configurationRepository, @NotNull BitmapUtil bitmapUtil, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(mrtrPrepaidReregistRepository, "mrtrPrepaidReregistRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(bitmapUtil, "bitmapUtil");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f106836b = mrtrPrepaidReregistRepository;
        this.f106837c = configurationRepository;
        this.f106838d = bitmapUtil;
        this.f106839e = threadService;
        this.f106840f = errorService;
        this.f106841g = new CompositeDisposable();
        this.f106842h = MediaType.Companion.parse(HTTP.PLAIN_TEXT_TYPE);
        this.f106843i = LazyKt__LazyJVMKt.lazy(C16674x95609d06.INSTANCE);
        this.f106844j = m1980p();
        this.f106845k = LazyKt__LazyJVMKt.lazy(C16673x14ce49e6.INSTANCE);
        this.f106846l = m1981o();
        this.f106847m = LazyKt__LazyJVMKt.lazy(C16675xf1845c8f.INSTANCE);
        this.f106848n = m1979q();
        this.f106849o = LazyKt__LazyJVMKt.lazy(MrtrPrepaidReregistValidateCardViewModel$_errorCardExpire$2.INSTANCE);
        this.f106850p = m1982n();
        this.f106851q = LazyKt__LazyJVMKt.lazy(MrtrPrepaidReregistValidateCardViewModel$_onErrorService$2.INSTANCE);
        this.f106852r = m1978r();
    }

    /* renamed from: j */
    public final void m1986j(String str, String str2, BitmapCollection bitmapCollection) {
        Single<R> compose = this.f106836b.getPostCodeInfo(new GetPostCodeInfoRequest(str, str2)).compose(this.f106839e.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "mrtrPrepaidReregistRepos…rvice.applySingleAsync())");
        SubscribersKt.subscribeBy(compose, new MrtrPrepaidReregistValidateCardViewModel$callGetPostCode$1(this), new MrtrPrepaidReregistValidateCardViewModel$callGetPostCode$2(this, bitmapCollection));
    }

    /* renamed from: k */
    private final Single m1985k(CardCollection cardCollection, String str) {
        Single just = Single.just(cardCollection);
        final MrtrPrepaidReregistValidateCardViewModel$encryptCard$1 mrtrPrepaidReregistValidateCardViewModel$encryptCard$1 = new MrtrPrepaidReregistValidateCardViewModel$encryptCard$1(str, this);
        Single map = just.map(new Function() { // from class: rF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ValidateCardRequest m1984l;
                m1984l = MrtrPrepaidReregistValidateCardViewModel.m1984l(mrtrPrepaidReregistValidateCardViewModel$encryptCard$1, obj);
                return m1984l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "private fun encryptCard(…m\n            )\n        }");
        return map;
    }

    /* renamed from: l */
    public static final ValidateCardRequest m1984l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ValidateCardRequest) tmp0.invoke(obj);
    }

    /* renamed from: m */
    private final Triple m1983m(String str) {
        int i;
        int i2;
        if (str.length() >= 4) {
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            i = Integer.parseInt(substring);
        } else {
            i = 1999;
        }
        int i3 = 1;
        if (str.length() >= 6) {
            String substring2 = str.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i2 = Integer.parseInt(substring2);
        } else {
            i2 = 1;
        }
        if (str.length() >= 8) {
            String substring3 = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            i3 = Integer.parseInt(substring3);
        }
        return new Triple(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: n */
    private final MutableLiveData m1982n() {
        return (MutableLiveData) this.f106849o.getValue();
    }

    /* renamed from: o */
    public final MutableLiveData m1981o() {
        return (MutableLiveData) this.f106845k.getValue();
    }

    /* renamed from: p */
    public final MutableLiveData m1980p() {
        return (MutableLiveData) this.f106843i.getValue();
    }

    /* renamed from: q */
    public final MutableLiveData m1979q() {
        return (MutableLiveData) this.f106847m.getValue();
    }

    /* renamed from: r */
    public final MutableLiveData m1978r() {
        return (MutableLiveData) this.f106851q.getValue();
    }

    /* renamed from: s */
    public static final String m1977s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final SingleSource m1976t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: u */
    private final boolean m1975u(String str) {
        if (str != null && str.length() != 0) {
            Triple m1983m = m1983m(str);
            int intValue = ((Number) m1983m.component1()).intValue();
            int intValue2 = ((Number) m1983m.component2()).intValue();
            int intValue3 = ((Number) m1983m.component3()).intValue();
            Calendar calendar = Calendar.getInstance(Locale.US);
            calendar.set(intValue - 543, intValue2 - 1, intValue3);
            return calendar.getTime().before(new Date());
        }
        return false;
    }

    /* renamed from: v */
    public static final SingleSource m1974v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m1973w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final SingleSource m1972x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (SingleSource) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final ValidateCardResponse m1971y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ValidateCardResponse) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m1970z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void clearNavigateForUpPass() {
        m1980p().setValue(null);
        m1981o().setValue(null);
    }

    @NotNull
    public final LiveData<Resource<Void>> getErrorCardExpire() {
        return this.f106850p;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeCustomerPhoto() {
        return this.f106846l;
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateTakeIdentityPhoto() {
        return this.f106844j;
    }

    @NotNull
    public final LiveData<Event<String>> getNavigateTakeMorePhoto() {
        return this.f106848n;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getOnErrorServiceFromORCCommon() {
        return this.f106852r;
    }

    public final void isAllowCamera(@NotNull String msisdn) {
        Intrinsics.checkNotNullParameter(msisdn, "msisdn");
        Single just = Single.just(msisdn);
        final MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$1 mrtrPrepaidReregistValidateCardViewModel$isAllowCamera$1 = MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$1.INSTANCE;
        Single map = just.map(new Function() { // from class: pF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String m1977s;
                m1977s = MrtrPrepaidReregistValidateCardViewModel.m1977s(mrtrPrepaidReregistValidateCardViewModel$isAllowCamera$1, obj);
                return m1977s;
            }
        });
        final MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2 mrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2 = new MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2(this);
        Single compose = map.flatMap(new Function() { // from class: qF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m1976t;
                m1976t = MrtrPrepaidReregistValidateCardViewModel.m1976t(mrtrPrepaidReregistValidateCardViewModel$isAllowCamera$2, obj);
                return m1976t;
            }
        }).compose(this.f106839e.applySingleAsync());
        Intrinsics.checkNotNullExpressionValue(compose, "fun isAllowCamera(msisdn…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(compose, new MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$3(this), MrtrPrepaidReregistValidateCardViewModel$isAllowCamera$4.INSTANCE), this.f106841g);
    }

    public final boolean isFaceRecognition() {
        return this.f106836b.getRequireFaceRecognition();
    }

    public final void validateCard(@NotNull CardCollection card, @NotNull String identityType) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Single m1985k = m1985k(card, identityType);
        final MrtrPrepaidReregistValidateCardViewModel$validateCard$1 mrtrPrepaidReregistValidateCardViewModel$validateCard$1 = new MrtrPrepaidReregistValidateCardViewModel$validateCard$1(this);
        Single compose = m1985k.flatMap(new Function() { // from class: nF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m1974v;
                m1974v = MrtrPrepaidReregistValidateCardViewModel.m1974v(mrtrPrepaidReregistValidateCardViewModel$validateCard$1, obj);
                return m1974v;
            }
        }).compose(this.f106839e.applySingleAsync());
        final MrtrPrepaidReregistValidateCardViewModel$validateCard$2 mrtrPrepaidReregistValidateCardViewModel$validateCard$2 = new MrtrPrepaidReregistValidateCardViewModel$validateCard$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: oF0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPrepaidReregistValidateCardViewModel.m1973w(mrtrPrepaidReregistValidateCardViewModel$validateCard$2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateCard(card: C…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPrepaidReregistValidateCardViewModel$validateCard$3(this), new MrtrPrepaidReregistValidateCardViewModel$validateCard$4(this, identityType, card)), this.f106841g);
    }

    public final void validateSmartCard(@NotNull CardCollection card, @NotNull String identityType, @NotNull BitmapCollection bitmap) {
        String str;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(identityType, "identityType");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        IdCardInformationCollection cardInformationCollection = this.f106836b.getCardInformationCollection();
        if (cardInformationCollection != null) {
            str = cardInformationCollection.getExpire();
        } else {
            str = null;
        }
        if (m1975u(str)) {
            m1982n().setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
            return;
        }
        Single m1985k = m1985k(card, identityType);
        final MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$1 mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$1 = new MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$1(this);
        Single flatMap = m1985k.flatMap(new Function() { // from class: kF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SingleSource m1972x;
                m1972x = MrtrPrepaidReregistValidateCardViewModel.m1972x(mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$1, obj);
                return m1972x;
            }
        });
        final MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$2 mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$2 = new MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$2(this, bitmap);
        Single compose = flatMap.map(new Function() { // from class: lF0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ValidateCardResponse m1971y;
                m1971y = MrtrPrepaidReregistValidateCardViewModel.m1971y(mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$2, obj);
                return m1971y;
            }
        }).compose(this.f106839e.applySingleAsync());
        final MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$3 mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$3 = new MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$3(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: mF0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MrtrPrepaidReregistValidateCardViewModel.m1970z(mrtrPrepaidReregistValidateCardViewModel$validateSmartCard$3, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validateSmartCard(ca…).addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$4(this), new MrtrPrepaidReregistValidateCardViewModel$validateSmartCard$5(this, card, bitmap, identityType)), this.f106841g);
    }
}