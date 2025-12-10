package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.disposables.CompositeDisposable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.device_sale.AdditionalPackage;
import th.p047co.dtac.android.dtacone.model.device_sale.CurrentPromotion;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.MainPackage;
import th.p047co.dtac.android.dtacone.repository.device_sale.DeviceSaleRepository;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ImeiSectionModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SubscriberPackageInfo;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0019\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0019\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0010R'\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b\u001e\u0010*R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010\u0010R'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b\u001b\u0010*R#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\r8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010\u0010¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleProfileInfoViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", "Landroidx/lifecycle/LiveData;", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ImeiSectionModel;", "showImeiSection", "()Landroidx/lifecycle/LiveData;", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "showMainPackage", "showAdditionalPackage", "", "onCleared", "()V", "Lth/co/dtac/android/dtacone/repository/device_sale/DeviceSaleRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/MrtrErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Ljava/text/SimpleDateFormat;", OperatorName.FILL_NON_ZERO, "Ljava/text/SimpleDateFormat;", "formatter", "Landroidx/lifecycle/MutableLiveData;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_imeiSectionDisplay", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getImeiSectionDisplay", "imeiSectionDisplay", "i", "_showMainPackageSection", OperatorName.SET_LINE_JOINSTYLE, "getShowMainPackageSection", "showMainPackageSection", OperatorName.NON_STROKING_CMYK, "_showAdditionalPackageSection", OperatorName.LINE_TO, "getShowAdditionalPackageSection", "showAdditionalPackageSection", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceSaleProfileInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceSaleProfileInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleProfileInfoViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n766#2:134\n857#2,2:135\n1549#2:137\n1620#2,3:138\n*S KotlinDebug\n*F\n+ 1 DeviceSaleProfileInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleProfileInfoViewModel\n*L\n100#1:134\n100#1:135,2\n100#1:137\n100#1:138,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleProfileInfoViewModel */
/* loaded from: classes9.dex */
public final class DeviceSaleProfileInfoViewModel extends BaseViewModel {
    @NotNull
    public static final String additionalPackageType = "30";

    /* renamed from: b */
    public final DeviceSaleRepository f105487b;

    /* renamed from: c */
    public final Rx2ThreadService f105488c;

    /* renamed from: d */
    public final MrtrErrorService f105489d;

    /* renamed from: e */
    public final CompositeDisposable f105490e;

    /* renamed from: f */
    public final SimpleDateFormat f105491f;

    /* renamed from: g */
    public final Lazy f105492g;

    /* renamed from: h */
    public final LiveData f105493h;

    /* renamed from: i */
    public final Lazy f105494i;

    /* renamed from: j */
    public final LiveData f105495j;

    /* renamed from: k */
    public final Lazy f105496k;

    /* renamed from: l */
    public final LiveData f105497l;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/viewmodel/device_sale/DeviceSaleProfileInfoViewModel$Companion;", "", "()V", "additionalPackageType", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleProfileInfoViewModel$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public DeviceSaleProfileInfoViewModel(@NotNull DeviceSaleRepository repository, @NotNull Rx2ThreadService threadService, @NotNull MrtrErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f105487b = repository;
        this.f105488c = threadService;
        this.f105489d = errorService;
        this.f105490e = new CompositeDisposable();
        this.f105491f = new SimpleDateFormat("dd/MM/yyyy");
        this.f105492g = LazyKt__LazyJVMKt.lazy(DeviceSaleProfileInfoViewModel$_imeiSectionDisplay$2.INSTANCE);
        this.f105493h = m3020c();
        this.f105494i = LazyKt__LazyJVMKt.lazy(DeviceSaleProfileInfoViewModel$_showMainPackageSection$2.INSTANCE);
        this.f105495j = m3018e();
        this.f105496k = LazyKt__LazyJVMKt.lazy(DeviceSaleProfileInfoViewModel$_showAdditionalPackageSection$2.INSTANCE);
        this.f105497l = m3019d();
    }

    /* renamed from: b */
    private final String m3021b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String currentDateServer = this.f105487b.getCurrentDateServer();
        if (currentDateServer == null) {
            currentDateServer = simpleDateFormat.format(new Date());
        }
        Calendar calendar = Calendar.getInstance();
        try {
            Date parse = simpleDateFormat.parse(currentDateServer);
            if (parse == null) {
                parse = new Date();
            }
            calendar.setTime(parse);
        } catch (Exception unused) {
            calendar.setTime(new Date());
        }
        calendar.add(5, 1);
        String format = this.f105491f.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(c.time)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final MutableLiveData m3020c() {
        return (MutableLiveData) this.f105492g.getValue();
    }

    /* renamed from: d */
    private final MutableLiveData m3019d() {
        return (MutableLiveData) this.f105496k.getValue();
    }

    /* renamed from: e */
    private final MutableLiveData m3018e() {
        return (MutableLiveData) this.f105494i.getValue();
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f105490e;
    }

    @NotNull
    public final LiveData<ImeiSectionModel> getImeiSectionDisplay() {
        return this.f105493h;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> getShowAdditionalPackageSection() {
        return this.f105497l;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> getShowMainPackageSection() {
        return this.f105495j;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f105490e.dispose();
        super.onCleared();
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> showAdditionalPackage() {
        List list;
        CurrentPromotion currentPromotion;
        List<AdditionalPackage> additionalPackages;
        MutableLiveData m3019d = m3019d();
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f105487b.getVerifySubrResponse();
        if (verifySubrResponse != null && (currentPromotion = verifySubrResponse.getCurrentPromotion()) != null && (additionalPackages = currentPromotion.getAdditionalPackages()) != null) {
            ArrayList<AdditionalPackage> arrayList = new ArrayList();
            for (Object obj : additionalPackages) {
                if (Intrinsics.areEqual(((AdditionalPackage) obj).getType(), "30")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arrayList, 10));
            for (AdditionalPackage additionalPackage : arrayList) {
                arrayList2.add(new SubscriberPackageInfo(additionalPackage.getCode(), additionalPackage.getDescription(), null, 4, null));
            }
            list = CollectionsKt___CollectionsKt.toList(arrayList2);
        } else {
            list = null;
        }
        m3019d.setValue(list);
        return this.f105497l;
    }

    @NotNull
    public final LiveData<ImeiSectionModel> showImeiSection() {
        Unit unit;
        GetNewIMEIResponse newIMEIResponse = this.f105487b.getNewIMEIResponse();
        if (newIMEIResponse != null) {
            m3020c().setValue(new ImeiSectionModel(newIMEIResponse.getHardwareNumber(), new C16524x7f0f8e74(newIMEIResponse).invoke()));
            return this.f105493h;
        }
        C16525xc2962ea1 c16525xc2962ea1 = new C16525xc2962ea1(this);
        DeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 deviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 = new DeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1(this);
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f105487b.getVerifySubrResponse();
        if (verifySubrResponse != null) {
            MutableLiveData m3020c = m3020c();
            String imeiNumber = verifySubrResponse.getCustomerProfile().getSubscriber().getImeiNumber();
            if (imeiNumber == null) {
                imeiNumber = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            m3020c.setValue(new ImeiSectionModel(imeiNumber, c16525xc2962ea1.invoke()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            deviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1.invoke();
        }
        return this.f105493h;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> showMainPackage() {
        ArrayList arrayList = new ArrayList();
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f105487b.getVerifySubrResponse();
        if (verifySubrResponse != null) {
            List<MainPackage> mainPackages = verifySubrResponse.getCurrentPromotion().getMainPackages();
            arrayList.add(new SubscriberPackageInfo(mainPackages.get(0).getCode(), mainPackages.get(0).getDescription(), null, 4, null));
            String m3021b = m3021b();
            this.f105487b.setNextDay(m3021b);
            this.f105487b.getVerifySubrResponse();
            if (mainPackages.size() > 1) {
                String code = mainPackages.get(1).getCode();
                String description = mainPackages.get(1).getDescription();
                String substring = mainPackages.get(1).getStartDateTime().substring(0, m3021b.length());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                arrayList.add(new SubscriberPackageInfo(code, description, substring));
            }
        }
        m3018e().setValue(CollectionsKt___CollectionsKt.toList(arrayList));
        return this.f105495j;
    }
}