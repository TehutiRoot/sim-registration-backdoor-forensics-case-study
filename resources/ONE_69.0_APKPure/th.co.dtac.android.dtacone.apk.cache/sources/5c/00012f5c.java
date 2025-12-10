package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.preference.PreferencesViewModel;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackageName;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackagePaginate;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidRetailerAllPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidRetailerPackageDetailRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidBrandedSearchPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidRetailerSearchPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidRetailerSearchPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidatePackageGroupCodeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidatePackageGroupCodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateSimBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.ValidateSimBarcodeData;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.postpaid_validation.SpecialPackageItem;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.Package;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.repository.OneDeviceSaleRepository;
import th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0017¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0013H\u0014¢\u0006\u0004\b$\u0010 J\u001f\u0010&\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b0\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R'\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR#\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR'\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010E\u001a\u0004\bQ\u0010GR#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0I8\u0006¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010MR'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020U0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010E\u001a\u0004\bV\u0010GR'\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010GR'\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010E\u001a\u0004\b]\u0010GR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0B0I8\u0006¢\u0006\f\n\u0004\b]\u0010K\u001a\u0004\b_\u0010MR'\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010E\u001a\u0004\b\\\u0010GR#\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0B0I8\u0006¢\u0006\f\n\u0004\bb\u0010K\u001a\u0004\bc\u0010MR'\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010E\u001a\u0004\bb\u0010GR#\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0B0I8\u0006¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bf\u0010MR'\u0010h\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010E\u001a\u0004\b`\u0010GR#\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0B0I8\u0006¢\u0006\f\n\u0004\b*\u0010K\u001a\u0004\bi\u0010MR'\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0B0A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010E\u001a\u0004\bY\u0010GR#\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0B0I8\u0006¢\u0006\f\n\u0004\bn\u0010K\u001a\u0004\bo\u0010MR\u0011\u0010q\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bq\u0010\u0010R$\u0010v\u001a\u00020\u00172\u0006\u0010r\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010\u001aR$\u0010w\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010\u0010\"\u0004\bx\u0010yR(\u0010}\u001a\u0004\u0018\u00010\u00112\b\u0010r\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010\u0015R,\u0010\u0083\u0001\u001a\u0004\u0018\u00010~2\b\u0010r\u001a\u0004\u0018\u00010~8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010r\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0005\b\u0086\u0001\u0010\u001eR/\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0088\u00012\t\u0010r\u001a\u0005\u0018\u00010\u0088\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R/\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008e\u00012\t\u0010r\u001a\u0005\u0018\u00010\u008e\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R-\u0010\u0098\u0001\u001a\u0004\u0018\u00010k2\b\u0010r\u001a\u0004\u0018\u00010k8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010\u0099\u0001\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010\u0010\"\u0005\b\u009a\u0001\u0010y¨\u0006\u009b\u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/device_sale/viewmodel/OneDeviceSalePackagesViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", "isDefaultPackage", "()Z", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "validateBarcodeResponse", "", "getAllPackageGroup", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;)V", "refreshPackage", "", "keyword", "searchOneDeviceSalePackageGroupRetailer", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "pack", "validatePackageGroupCode", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;)V", "navigateNext", "()V", "isSpecialPackage", "packageCode", "callPackageDetail", "onCleared", "isRefresh", OperatorName.SET_LINE_JOINSTYLE, "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;Z)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "packages", "u", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)V", "t", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)Z", "z", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", OperatorName.CLOSE_AND_STROKE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/device_sale/repository/OneDeviceSaleRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Landroidx/lifecycle/MutableLiveData;", "_showErrorMessage", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getShowErrorMessage", "()Landroidx/lifecycle/LiveData;", "showErrorMessage", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", OperatorName.LINE_TO, "_navigateNext", OperatorName.NON_STROKING_CMYK, "getNavigateNext", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidViewAllPackageGroupResponse;", "get_viewAllPackageGroupBrandedResponse", "_viewAllPackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/OnePostpaidBrandedSearchPackageGroupResponse;", OperatorName.MOVE_TO, "get_searchPackageGroupBrandedResponse", "_searchPackageGroupBrandedResponse", OperatorName.ENDPATH, "o", "_refreshPackage", "getRefreshPackage", "p", "_packageDetailRetailerResponse", OperatorName.SAVE, "getGetPackageDetailRetailerResponse", "getPackageDetailRetailerResponse", "_searchOnePackageRetailerResponse", "getGetSearchOnePackageRetailerResponse", "getSearchOnePackageRetailerResponse", "_searchOnePackageGroupBrandedResponse", "getGetSearchOnePackageGroupBrandedResponse", "getSearchOnePackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "_oneAllPackageGroupRetailerResponse", OperatorName.SET_LINE_WIDTH, "getOneGetAllPackageGroupRetailerResponse", "oneGetAllPackageGroupRetailerResponse", "isUserLan", "value", "getSimBarcode", "()Ljava/lang/String;", "setSimBarcode", "simBarcode", "isWithContract", "setWithContract", "(Z)V", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "validateSimBarcodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "mPackage", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "setPackageSetRetailer", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;)V", "packageGroupCodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "getSpecialPackageItem", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "setSpecialPackageItem", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;)V", "specialPackageItem", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;)V", "postpaidPackageSetRetailerResponse", "isDefaultPackageRetailer", "setDefaultPackageRetailer", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModel */
/* loaded from: classes10.dex */
public final class OneDeviceSalePackagesViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneDeviceSaleRepository f90591b;

    /* renamed from: c */
    public final ConfigurationRepository f90592c;

    /* renamed from: d */
    public final Rx2ThreadService f90593d;

    /* renamed from: e */
    public final OneErrorService f90594e;

    /* renamed from: f */
    public final PreferencesViewModel f90595f;

    /* renamed from: g */
    public final CompositeDisposable f90596g;

    /* renamed from: h */
    public final Lazy f90597h;

    /* renamed from: i */
    public final LiveData f90598i;

    /* renamed from: j */
    public final Lazy f90599j;

    /* renamed from: k */
    public final LiveData f90600k;

    /* renamed from: l */
    public final Lazy f90601l;

    /* renamed from: m */
    public final Lazy f90602m;

    /* renamed from: n */
    public final Lazy f90603n;

    /* renamed from: o */
    public final LiveData f90604o;

    /* renamed from: p */
    public final Lazy f90605p;

    /* renamed from: q */
    public final LiveData f90606q;

    /* renamed from: r */
    public final Lazy f90607r;

    /* renamed from: s */
    public final LiveData f90608s;

    /* renamed from: t */
    public final Lazy f90609t;

    /* renamed from: u */
    public final LiveData f90610u;

    /* renamed from: v */
    public final Lazy f90611v;

    /* renamed from: w */
    public final LiveData f90612w;

    @Inject
    public OneDeviceSalePackagesViewModel(@NotNull OneDeviceSaleRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f90591b = repository;
        this.f90592c = configurationRepository;
        this.f90593d = threadService;
        this.f90594e = errorService;
        this.f90595f = pfViewModel;
        this.f90596g = new CompositeDisposable();
        this.f90597h = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackagesViewModel$_showErrorMessage$2.INSTANCE);
        this.f90598i = m14432r();
        this.f90599j = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackagesViewModel$_navigateNext$2.INSTANCE);
        this.f90600k = m14438l();
        this.f90601l = LazyKt__LazyJVMKt.lazy(C14632xab3f044f.INSTANCE);
        this.f90602m = LazyKt__LazyJVMKt.lazy(C14631xc163c325.INSTANCE);
        this.f90603n = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackagesViewModel$_refreshPackage$2.INSTANCE);
        this.f90604o = m14435o();
        this.f90605p = LazyKt__LazyJVMKt.lazy(OneDeviceSalePackagesViewModel$_packageDetailRetailerResponse$2.INSTANCE);
        this.f90606q = m14436n();
        this.f90607r = LazyKt__LazyJVMKt.lazy(C14630x8b49bf36.INSTANCE);
        this.f90608s = m14433q();
        this.f90609t = LazyKt__LazyJVMKt.lazy(C14629x936540ed.INSTANCE);
        this.f90610u = m14434p();
        this.f90611v = LazyKt__LazyJVMKt.lazy(C14628x556cf882.INSTANCE);
        this.f90612w = m14437m();
    }

    /* renamed from: A */
    public static final void m14449A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14448b(Function1 function1, Object obj) {
        m14449A(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m14447c(Function1 function1, Object obj) {
        m14425y(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m14446d(Function1 function1, Object obj) {
        m14426x(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ OnePostpaidSearchPackage m14445e(Function1 function1, Object obj) {
        return m14428v(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m14444f(Function1 function1, Object obj) {
        m14439k(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m14443g(Function1 function1, Object obj) {
        m14441i(function1, obj);
    }

    /* renamed from: h */
    public static /* synthetic */ void m14442h(Function1 function1, Object obj) {
        m14427w(function1, obj);
    }

    /* renamed from: i */
    public static final void m14441i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final boolean isDefaultPackageRetailer() {
        return this.f90591b.isDefaultPackage();
    }

    /* renamed from: k */
    public static final void m14439k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    private final MutableLiveData m14438l() {
        return (MutableLiveData) this.f90599j.getValue();
    }

    public final void setDefaultPackageRetailer(boolean z) {
        this.f90591b.setDefaultPackage(z);
    }

    /* renamed from: v */
    public static final OnePostpaidSearchPackage m14428v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OnePostpaidSearchPackage) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m14427w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m14426x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m14425y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void callPackageDetail(@NotNull String packageCode) {
        Integer num;
        ValidateSimBarcodeData data;
        ValidateSimBarcodeData data2;
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        OneDeviceSaleRepository oneDeviceSaleRepository = this.f90591b;
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        String str = (validateSimBarcodeResponse == null || (data2 = validateSimBarcodeResponse.getData()) == null || (r1 = data2.getSimType()) == null) ? "" : "";
        boolean withDevice = this.f90591b.getWithDevice();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 != null && (data = validateSimBarcodeResponse2.getData()) != null) {
            num = data.getMinPrice();
        } else {
            num = null;
        }
        Single<R> compose = oneDeviceSaleRepository.oneDeviceSalePostpaidRetailerPackageDetail(new OnePostpaidRetailerPackageDetailRequest(str, "POSTPAID", num, packageCode, Boolean.valueOf(withDevice))).compose(this.f90593d.applySingleAsync());
        final OneDeviceSalePackagesViewModel$callPackageDetail$1 oneDeviceSalePackagesViewModel$callPackageDetail$1 = new OneDeviceSalePackagesViewModel$callPackageDetail$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: bQ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14443g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callPackageDetail(pa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneDeviceSalePackagesViewModel$callPackageDetail$2(this), new OneDeviceSalePackagesViewModel$callPackageDetail$3(this)), this.f90596g);
    }

    public final void getAllPackageGroup(@NotNull OnePostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        m14440j(validateBarcodeResponse, false);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f90596g;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidPackageSet>> getGetPackageDetailRetailerResponse() {
        return this.f90606q;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidBrandedSearchPackageGroupResponse>> getGetSearchOnePackageGroupBrandedResponse() {
        return this.f90610u;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidSearchPackage>> getGetSearchOnePackageRetailerResponse() {
        return this.f90608s;
    }

    @Nullable
    public final Package getMPackage() {
        return this.f90591b.getMPackage();
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateNext() {
        return this.f90600k;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidPackageSetResponse>> getOneGetAllPackageGroupRetailerResponse() {
        return this.f90612w;
    }

    @Nullable
    public final OnePostpaidValidatePackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.f90591b.getPackageGroupCodeResponse();
    }

    @Nullable
    public final OnePostpaidPackageSet getPackageSetRetailer() {
        return this.f90591b.getPackageSetRetailer();
    }

    @Nullable
    public final OnePostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.f90591b.getPostpaidPackageSetRetailerResponse();
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getRefreshPackage() {
        return this.f90604o;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f90598i;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f90591b.getSimBarcode();
    }

    @Nullable
    public final SpecialPackageItem getSpecialPackageItem() {
        return this.f90591b.getSpecialPackageItem();
    }

    @Nullable
    public final OnePostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f90591b.getValidateSimBarcodeResponse();
    }

    public final boolean isDefaultPackage() {
        ValidateSimBarcodeData data;
        String packageGroupCode;
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = this.f90591b.getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (data = validateSimBarcodeResponse.getData()) == null || (packageGroupCode = data.getPackageGroupCode()) == null || packageGroupCode.length() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isSpecialPackage() {
        if (this.f90591b.getSpecialPackageItem() != null) {
            return true;
        }
        return false;
    }

    public final boolean isUserLan() {
        return this.f90591b.isUserLan();
    }

    public final boolean isWithContract() {
        return this.f90591b.getWithContract();
    }

    /* renamed from: j */
    public final void m14440j(OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse, boolean z) {
        String str;
        Integer num;
        OneDeviceSaleRepository oneDeviceSaleRepository = this.f90591b;
        ValidateSimBarcodeData data = onePostpaidValidateSimBarcodeResponse.getData();
        String str2 = null;
        if (data != null) {
            str = data.getSimType();
        } else {
            str = null;
        }
        boolean withDevice = this.f90591b.getWithDevice();
        ValidateSimBarcodeData data2 = onePostpaidValidateSimBarcodeResponse.getData();
        if (data2 != null) {
            num = data2.getMinPrice();
        } else {
            num = null;
        }
        ValidateSimBarcodeData data3 = onePostpaidValidateSimBarcodeResponse.getData();
        if (data3 != null) {
            str2 = data3.getPackageGroupCode();
        }
        Single<R> compose = oneDeviceSaleRepository.oneDeviceSalePostpaidRetailerAllPackageGroup(new OnePostpaidRetailerAllPackageGroupRequest(str, null, num, str2, Boolean.valueOf(withDevice), 2, null)).compose(this.f90593d.applySingleAsync());
        final C14633xde26d7ae c14633xde26d7ae = new C14633xde26d7ae(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: cQ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14444f(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun getOneDevice… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new C14634xde26d7af(this), new C14636xde26d7b0(this, z)), this.f90596g);
    }

    /* renamed from: m */
    public final MutableLiveData m14437m() {
        return (MutableLiveData) this.f90611v.getValue();
    }

    /* renamed from: n */
    public final MutableLiveData m14436n() {
        return (MutableLiveData) this.f90605p.getValue();
    }

    public final void navigateNext() {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (isDefaultPackage() && isDefaultPackageRetailer()) {
            m14438l().setValue(new Event(new FragmentNavEvent(OnePostpaidDefaultPackageFragment.class, null, null, 4, null)));
        } else {
            m14438l().setValue(new Event(new FragmentNavEvent(OnePostpaidAllPackageFragment.class, null, null, 4, null)));
        }
    }

    /* renamed from: o */
    public final MutableLiveData m14435o() {
        return (MutableLiveData) this.f90603n.getValue();
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f90596g.clear();
    }

    /* renamed from: p */
    public final MutableLiveData m14434p() {
        return (MutableLiveData) this.f90609t.getValue();
    }

    /* renamed from: q */
    public final MutableLiveData m14433q() {
        return (MutableLiveData) this.f90607r.getValue();
    }

    /* renamed from: r */
    public final MutableLiveData m14432r() {
        return (MutableLiveData) this.f90597h.getValue();
    }

    public final void refreshPackage(@NotNull OnePostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        m14440j(validateBarcodeResponse, true);
    }

    /* renamed from: s */
    public final boolean m14431s(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        OnePostpaidSearchPackagePaginate paginate = onePostpaidSearchPackage.getPaginate();
        if (paginate == null || paginate.getTotalItem() != 0) {
            return false;
        }
        return true;
    }

    public final void searchOneDeviceSalePackageGroupRetailer(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Single<OnePostpaidRetailerSearchPackageGroupResponse> searchOneDeviceSalePackageGroupRetailer = this.f90591b.searchOneDeviceSalePackageGroupRetailer(new OnePostpaidRetailerSearchPackageGroupRequest(PDLayoutAttributeObject.LINE_HEIGHT_NORMAL, "POSTPAID", 0, "", Boolean.TRUE, keyword));
        final C14637x1e8ac021 c14637x1e8ac021 = new C14637x1e8ac021(this);
        Single compose = searchOneDeviceSalePackageGroupRetailer.map(new Function() { // from class: XP0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneDeviceSalePackagesViewModel.m14445e(Function1.this, obj);
            }
        }).compose(this.f90593d.applySingleAsync());
        final C14638x1e8ac022 c14638x1e8ac022 = new C14638x1e8ac022(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: YP0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14442h(Function1.this, obj);
            }
        });
        final C14639x1e8ac023 c14639x1e8ac023 = new C14639x1e8ac023(this);
        Consumer consumer = new Consumer() { // from class: ZP0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14446d(Function1.this, obj);
            }
        };
        final C14640x1e8ac024 c14640x1e8ac024 = new C14640x1e8ac024(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: aQ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14447c(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun searchOneDeviceSaleP… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f90596g);
    }

    public final void setMPackage(@Nullable Package r2) {
        this.f90591b.setMPackage(r2);
    }

    public final void setPackageGroupCodeResponse(@Nullable OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse) {
        this.f90591b.setPackageGroupCodeResponse(onePostpaidValidatePackageGroupCodeResponse);
    }

    public final void setPackageSetRetailer(@Nullable OnePostpaidPackageSet onePostpaidPackageSet) {
        this.f90591b.setPackageSetRetailer(onePostpaidPackageSet);
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse) {
        this.f90591b.setPostpaidPackageSetRetailerResponse(onePostpaidPackageSetResponse);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f90591b.setSimBarcode(value);
    }

    public final void setSpecialPackageItem(@Nullable SpecialPackageItem specialPackageItem) {
        this.f90591b.setSpecialPackageItem(specialPackageItem);
    }

    public final void setValidateSimBarcodeResponse(@Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        this.f90591b.setValidateSimBarcodeResponse(onePostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f90591b.setWithContract(z);
    }

    /* renamed from: t */
    public final boolean m14430t(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        int i;
        int i2;
        OnePostpaidSearchPackagePaginate paginate = onePostpaidSearchPackage.getPaginate();
        if (paginate != null) {
            i = paginate.getTotalItem();
        } else {
            i = 0;
        }
        OnePostpaidSearchPackagePaginate paginate2 = onePostpaidSearchPackage.getPaginate();
        if (paginate2 != null) {
            i2 = paginate2.getItemPerPage();
        } else {
            i2 = 0;
        }
        if (i <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final void m14429u(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (m14430t(onePostpaidSearchPackage)) {
            m14433q().postValue(Resource.Companion.success(onePostpaidSearchPackage));
        } else {
            m14433q().postValue(Resource.Companion.success(onePostpaidSearchPackage));
        }
    }

    public final void validatePackageGroupCode(@NotNull OnePostpaidPackageSet pack) {
        String str;
        String str2;
        ValidateSimBarcodeData data;
        GetNewIMEIResponse hardwareNumberResponse;
        String hardwareNumber;
        ValidateSimBarcodeData data2;
        Intrinsics.checkNotNullParameter(pack, "pack");
        OneDeviceSaleRepository oneDeviceSaleRepository = this.f90591b;
        String userCode = oneDeviceSaleRepository.getUserCode();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        Boolean bool = null;
        if (validateSimBarcodeResponse != null && (data2 = validateSimBarcodeResponse.getData()) != null) {
            str = data2.getSubscriberNumber();
        } else {
            str = null;
        }
        GetNewIMEIResponse hardwareNumberResponse2 = this.f90591b.getHardwareNumberResponse();
        if (hardwareNumberResponse2 != null) {
            bool = Boolean.valueOf(hardwareNumberResponse2.isDtacDevice());
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || (hardwareNumberResponse = this.f90591b.getHardwareNumberResponse()) == null || (hardwareNumber = hardwareNumberResponse.getHardwareNumber()) == null) {
            str2 = "";
        } else {
            str2 = hardwareNumber;
        }
        String packageCode = pack.getPackageCode();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        Single<R> compose = oneDeviceSaleRepository.oneDeviceSalePostpaidValidatePackageGroupCode(new OnePostpaidValidatePackageGroupCodeRequest((validateSimBarcodeResponse2 == null || (data = validateSimBarcodeResponse2.getData()) == null || (r1 = data.getPackageGroupType()) == null) ? "10" : "10", packageCode, str, str2, userCode)).compose(this.f90593d.applySingleAsync());
        final OneDeviceSalePackagesViewModel$validatePackageGroupCode$1 oneDeviceSalePackagesViewModel$validatePackageGroupCode$1 = new OneDeviceSalePackagesViewModel$validatePackageGroupCode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: WP0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneDeviceSalePackagesViewModel.m14448b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validatePackageGroup… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OneDeviceSalePackagesViewModel$validatePackageGroupCode$2(this), new OneDeviceSalePackagesViewModel$validatePackageGroupCode$3(this, pack)), this.f90596g);
    }

    /* renamed from: z */
    public final OnePostpaidSearchPackage m14424z(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        int i;
        List<OnePostpaidSearchPackageName> packages = onePostpaidSearchPackage.getPackages();
        if (packages != null) {
            packages.add(new OnePostpaidSearchPackageName(null, null));
        }
        OnePostpaidSearchPackagePaginate paginate = onePostpaidSearchPackage.getPaginate();
        if (paginate != null) {
            i = paginate.getItemPerPage();
        } else {
            i = 0;
        }
        return new OnePostpaidSearchPackage(packages, onePostpaidSearchPackage.getPaginate(), "ค้นพบแพ็กเกจมากกว่า " + i + " รายการ ใส่คำค้นหาเพิ่มเติม หรือใส่รหัสแพ็กเกจที่ต้องการดูนะคะ");
    }
}