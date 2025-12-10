package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

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
import javax.inject.Inject;
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
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.device_sale.AdditionalPackage;
import th.p047co.dtac.android.dtacone.model.device_sale.CurrentPromotion;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.device_sale.MainPackage;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.ImeiSectionModel;
import th.p047co.dtac.android.dtacone.viewmodel.device_sale.model.SubscriberPackageInfo;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0019\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\rR'\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b\u001e\u0010*R#\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n8\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010\rR'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b\u001b\u0010*R#\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010\r¨\u0006;"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSaleProfileInfoViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;", "repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;)V", "Landroidx/lifecycle/LiveData;", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/ImeiSectionModel;", "showImeiSection", "()Landroidx/lifecycle/LiveData;", "", "Lth/co/dtac/android/dtacone/viewmodel/device_sale/model/SubscriberPackageInfo;", "showMainPackage", "showAdditionalPackage", "", "onCleared", "()V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "d", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "Lio/reactivex/disposables/CompositeDisposable;", "e", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Ljava/text/SimpleDateFormat;", OperatorName.FILL_NON_ZERO, "Ljava/text/SimpleDateFormat;", "formatter", "Landroidx/lifecycle/MutableLiveData;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", "()Landroidx/lifecycle/MutableLiveData;", "_imeiSectionDisplay", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getImeiSectionDisplay", "imeiSectionDisplay", "i", "_showMainPackageSection", OperatorName.SET_LINE_JOINSTYLE, "getShowMainPackageSection", "showMainPackageSection", OperatorName.NON_STROKING_CMYK, "_showAdditionalPackageSection", OperatorName.LINE_TO, "getShowAdditionalPackageSection", "showAdditionalPackageSection", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneDeviceSaleProfileInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDeviceSaleProfileInfoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSaleProfileInfoViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n766#2:137\n857#2,2:138\n1549#2:140\n1620#2,3:141\n*S KotlinDebug\n*F\n+ 1 OneDeviceSaleProfileInfoViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSaleProfileInfoViewModel\n*L\n104#1:137\n104#1:138,2\n104#1:140\n104#1:141,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleProfileInfoViewModel */
/* loaded from: classes10.dex */
public final class OneDeviceSaleProfileInfoViewModel extends BaseViewModel {
    @NotNull
    public static final String additionalPackageType = "30";

    /* renamed from: b */
    public final OneDeviceSaleRepository f90631b;

    /* renamed from: c */
    public final Rx2ThreadService f90632c;

    /* renamed from: d */
    public final OneErrorService f90633d;

    /* renamed from: e */
    public final CompositeDisposable f90634e;

    /* renamed from: f */
    public final SimpleDateFormat f90635f;

    /* renamed from: g */
    public final Lazy f90636g;

    /* renamed from: h */
    public final LiveData f90637h;

    /* renamed from: i */
    public final Lazy f90638i;

    /* renamed from: j */
    public final LiveData f90639j;

    /* renamed from: k */
    public final Lazy f90640k;

    /* renamed from: l */
    public final LiveData f90641l;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSaleProfileInfoViewModel$Companion;", "", "()V", "additionalPackageType", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleProfileInfoViewModel$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Inject
    public OneDeviceSaleProfileInfoViewModel(@NotNull OneDeviceSaleRepository repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        this.f90631b = repository;
        this.f90632c = threadService;
        this.f90633d = errorService;
        this.f90634e = new CompositeDisposable();
        this.f90635f = new SimpleDateFormat("dd/MM/yyyy");
        this.f90636g = LazyKt__LazyJVMKt.lazy(OneDeviceSaleProfileInfoViewModel$_imeiSectionDisplay$2.INSTANCE);
        this.f90637h = m14422c();
        this.f90638i = LazyKt__LazyJVMKt.lazy(OneDeviceSaleProfileInfoViewModel$_showMainPackageSection$2.INSTANCE);
        this.f90639j = m14420e();
        this.f90640k = LazyKt__LazyJVMKt.lazy(C14642xad02b5bc.INSTANCE);
        this.f90641l = m14421d();
    }

    /* renamed from: b */
    public final String m14423b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String currentDateServer = this.f90631b.getCurrentDateServer();
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
        String format = this.f90635f.format(calendar.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(c.time)");
        return format;
    }

    /* renamed from: c */
    public final MutableLiveData m14422c() {
        return (MutableLiveData) this.f90636g.getValue();
    }

    /* renamed from: d */
    public final MutableLiveData m14421d() {
        return (MutableLiveData) this.f90640k.getValue();
    }

    /* renamed from: e */
    public final MutableLiveData m14420e() {
        return (MutableLiveData) this.f90638i.getValue();
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f90634e;
    }

    @NotNull
    public final LiveData<ImeiSectionModel> getImeiSectionDisplay() {
        return this.f90637h;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> getShowAdditionalPackageSection() {
        return this.f90641l;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> getShowMainPackageSection() {
        return this.f90639j;
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f90634e.dispose();
        super.onCleared();
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> showAdditionalPackage() {
        List list;
        CurrentPromotion currentPromotion;
        List<AdditionalPackage> additionalPackages;
        MutableLiveData m14421d = m14421d();
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f90631b.getVerifySubrResponse();
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
        m14421d.setValue(list);
        return this.f90641l;
    }

    @NotNull
    public final LiveData<ImeiSectionModel> showImeiSection() {
        Unit unit;
        GetNewIMEIResponse newIMEIResponse = this.f90631b.getNewIMEIResponse();
        if (newIMEIResponse != null) {
            m14422c().setValue(new ImeiSectionModel(newIMEIResponse.getHardwareNumber(), new C14643x74bd9a6e(newIMEIResponse).invoke()));
            return this.f90637h;
        }
        C14644x5a6af11b c14644x5a6af11b = new C14644x5a6af11b(this);
        OneDeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 oneDeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1 = new OneDeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1(this);
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f90631b.getVerifySubrResponse();
        if (verifySubrResponse != null) {
            MutableLiveData m14422c = m14422c();
            String imeiNumber = verifySubrResponse.getCustomerProfile().getSubscriber().getImeiNumber();
            if (imeiNumber == null) {
                imeiNumber = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            m14422c.setValue(new ImeiSectionModel(imeiNumber, c14644x5a6af11b.invoke()));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            oneDeviceSaleProfileInfoViewModel$showImeiSection$showEmpty$1.invoke();
        }
        return this.f90637h;
    }

    @NotNull
    public final LiveData<List<SubscriberPackageInfo>> showMainPackage() {
        ArrayList arrayList = new ArrayList();
        DeviceSaleVerifySubrResponse verifySubrResponse = this.f90631b.getVerifySubrResponse();
        if (verifySubrResponse != null) {
            List<MainPackage> mainPackages = verifySubrResponse.getCurrentPromotion().getMainPackages();
            arrayList.add(new SubscriberPackageInfo(mainPackages.get(0).getCode(), mainPackages.get(0).getDescription(), null, 4, null));
            String m14423b = m14423b();
            this.f90631b.setNextDay(m14423b);
            this.f90631b.getVerifySubrResponse();
            if (mainPackages.size() > 1) {
                String code = mainPackages.get(1).getCode();
                String description = mainPackages.get(1).getDescription();
                String substring = mainPackages.get(1).getStartDateTime().substring(0, m14423b.length());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                arrayList.add(new SubscriberPackageInfo(code, description, substring));
            }
        }
        m14420e().setValue(CollectionsKt___CollectionsKt.toList(arrayList));
        return this.f90639j;
    }
}