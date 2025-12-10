package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
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
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidViewAllPackageGroupRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.search.OnePostpaidBrandedSearchPackageGroupRequest;
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
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidAllPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.packages.OnePostpaidDefaultPackageFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0010J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001aJ\u0015\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u00020\u0013H\u0014¢\u0006\u0004\b%\u0010 J\u001f\u0010'\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b4\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR'\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR#\u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR'\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\bV\u0010KR#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0S0M8\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\bY\u0010QR'\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010I\u001a\u0004\b[\u0010KR'\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010I\u001a\u0004\b_\u0010KR'\u0010c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010KR#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0F0M8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bd\u0010QR'\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010I\u001a\u0004\bf\u0010KR#\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0F0M8\u0006¢\u0006\f\n\u0004\bf\u0010O\u001a\u0004\bh\u0010QR'\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010I\u001a\u0004\bj\u0010KR#\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0F0M8\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR'\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010I\u001a\u0004\bl\u0010KR#\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0F0M8\u0006¢\u0006\f\n\u0004\b_\u0010O\u001a\u0004\bp\u0010QR'\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0F0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010I\u001a\u0004\be\u0010KR#\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0F0M8\u0006¢\u0006\f\n\u0004\b[\u0010O\u001a\u0004\bt\u0010QR\u0011\u0010v\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bv\u0010\u0010R$\u0010{\u001a\u00020\u00172\u0006\u0010w\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010y\"\u0004\bz\u0010\u001aR$\u0010|\u001a\u00020\u000e2\u0006\u0010w\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010\u0010\"\u0004\b}\u0010~R+\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010w\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0005\b\u0081\u0001\u0010\u0015R/\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0083\u00012\t\u0010w\u001a\u0005\u0018\u00010\u0083\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010w\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010\u001eR/\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00012\t\u0010w\u001a\u0005\u0018\u00010\u008d\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R/\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00012\t\u0010w\u001a\u0005\u0018\u00010\u0093\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R-\u0010\u009d\u0001\u001a\u0004\u0018\u00010r2\b\u0010w\u001a\u0004\u0018\u00010r8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R'\u0010\u009e\u0001\u001a\u00020\u000e2\u0006\u0010w\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010\u0010\"\u0005\b\u009f\u0001\u0010~¨\u0006 \u0001"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/viewmodel/OnePostpaidPackagesViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;", "repository", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "errorService", "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "pfViewModel", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;)V", "", "isDefaultPackage", "()Z", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "validateBarcodeResponse", "", "getAllPackageGroup", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;)V", "refreshPackage", "", "keyword", "searchOnePackageGroupRetailer", "(Ljava/lang/String;)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "pack", "validatePackageGroupCode", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;)V", "navigateNext", "()V", "isSpecialPackage", "searchOnePackageGroupBranded", "packageCode", "callPackageDetail", "onCleared", "isRefresh", OperatorName.LINE_TO, "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;Z)V", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "packages", "z", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)V", "packageGroupRefNo", "getViewAllPackageGroupBranded", "(Ljava/lang/String;Z)V", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)Z", "F", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "x", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/postpaid_registration/repository/OnePostpaidRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/viewmodel/preference/PreferencesViewModel;", "Lio/reactivex/disposables/CompositeDisposable;", OperatorName.NON_STROKING_GRAY, "Lio/reactivex/disposables/CompositeDisposable;", "getDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "disposable", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/error/ErrorCollection;", OperatorName.CLOSE_PATH, "Lkotlin/Lazy;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "()Landroidx/lifecycle/MutableLiveData;", "_showErrorMessage", "Landroidx/lifecycle/LiveData;", "i", "Landroidx/lifecycle/LiveData;", "getShowErrorMessage", "()Landroidx/lifecycle/LiveData;", "showErrorMessage", "Lth/co/dtac/android/dtacone/model/Event;", "Lth/co/dtac/android/dtacone/model/livedata/FragmentNavEvent;", OperatorName.SET_LINE_JOINSTYLE, "o", "_navigateNext", OperatorName.NON_STROKING_CMYK, "getNavigateNext", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidViewAllPackageGroupResponse;", OperatorName.SET_LINE_WIDTH, "_viewAllPackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/search/OnePostpaidBrandedSearchPackageGroupResponse;", OperatorName.MOVE_TO, "u", "_searchPackageGroupBrandedResponse", OperatorName.ENDPATH, PDPageLabelRange.STYLE_ROMAN_LOWER, "_refreshPackage", "getRefreshPackage", "p", OperatorName.SAVE, "_packageDetailRetailerResponse", "getGetPackageDetailRetailerResponse", "getPackageDetailRetailerResponse", "t", "_searchOnePackageRetailerResponse", OperatorName.CLOSE_AND_STROKE, "getGetSearchOnePackageRetailerResponse", "getSearchOnePackageRetailerResponse", "_searchOnePackageGroupBrandedResponse", "getGetSearchOnePackageGroupBrandedResponse", "getSearchOnePackageGroupBrandedResponse", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "_oneAllPackageGroupRetailerResponse", "getOneGetAllPackageGroupRetailerResponse", "oneGetAllPackageGroupRetailerResponse", "isUserLan", "value", "getSimBarcode", "()Ljava/lang/String;", "setSimBarcode", "simBarcode", "isWithContract", "setWithContract", "(Z)V", "getValidateSimBarcodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateSimBarcodeResponse;", "setValidateSimBarcodeResponse", "validateSimBarcodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "getMPackage", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;", "setMPackage", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/Package;)V", "mPackage", "getPackageSetRetailer", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSet;", "setPackageSetRetailer", "packageSetRetailer", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "getPackageGroupCodeResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "setPackageGroupCodeResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;)V", "packageGroupCodeResponse", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "getSpecialPackageItem", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;", "setSpecialPackageItem", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/postpaid_validation/SpecialPackageItem;)V", "specialPackageItem", "getPostpaidPackageSetRetailerResponse", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;", "setPostpaidPackageSetRetailerResponse", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidPackageSetResponse;)V", "postpaidPackageSetRetailerResponse", "isDefaultPackageRetailer", "setDefaultPackageRetailer", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OnePostpaidRepository f94517b;

    /* renamed from: c */
    public final ConfigurationRepository f94518c;

    /* renamed from: d */
    public final Rx2ThreadService f94519d;

    /* renamed from: e */
    public final OneErrorService f94520e;

    /* renamed from: f */
    public final PreferencesViewModel f94521f;

    /* renamed from: g */
    public final CompositeDisposable f94522g;

    /* renamed from: h */
    public final Lazy f94523h;

    /* renamed from: i */
    public final LiveData f94524i;

    /* renamed from: j */
    public final Lazy f94525j;

    /* renamed from: k */
    public final LiveData f94526k;

    /* renamed from: l */
    public final Lazy f94527l;

    /* renamed from: m */
    public final Lazy f94528m;

    /* renamed from: n */
    public final Lazy f94529n;

    /* renamed from: o */
    public final LiveData f94530o;

    /* renamed from: p */
    public final Lazy f94531p;

    /* renamed from: q */
    public final LiveData f94532q;

    /* renamed from: r */
    public final Lazy f94533r;

    /* renamed from: s */
    public final LiveData f94534s;

    /* renamed from: t */
    public final Lazy f94535t;

    /* renamed from: u */
    public final LiveData f94536u;

    /* renamed from: v */
    public final Lazy f94537v;

    /* renamed from: w */
    public final LiveData f94538w;

    @Inject
    public OnePostpaidPackagesViewModel(@NotNull OnePostpaidRepository repository, @NotNull ConfigurationRepository configurationRepository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService errorService, @NotNull PreferencesViewModel pfViewModel) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(errorService, "errorService");
        Intrinsics.checkNotNullParameter(pfViewModel, "pfViewModel");
        this.f94517b = repository;
        this.f94518c = configurationRepository;
        this.f94519d = threadService;
        this.f94520e = errorService;
        this.f94521f = pfViewModel;
        this.f94522g = new CompositeDisposable();
        this.f94523h = LazyKt__LazyJVMKt.lazy(OnePostpaidPackagesViewModel$_showErrorMessage$2.INSTANCE);
        this.f94524i = m11746v();
        this.f94525j = LazyKt__LazyJVMKt.lazy(OnePostpaidPackagesViewModel$_navigateNext$2.INSTANCE);
        this.f94526k = m11753o();
        this.f94527l = LazyKt__LazyJVMKt.lazy(C14981x5fe0a640.INSTANCE);
        this.f94528m = LazyKt__LazyJVMKt.lazy(C14980xdffd9f14.INSTANCE);
        this.f94529n = LazyKt__LazyJVMKt.lazy(OnePostpaidPackagesViewModel$_refreshPackage$2.INSTANCE);
        this.f94530o = m11750r();
        this.f94531p = LazyKt__LazyJVMKt.lazy(OnePostpaidPackagesViewModel$_packageDetailRetailerResponse$2.INSTANCE);
        this.f94532q = m11751q();
        this.f94533r = LazyKt__LazyJVMKt.lazy(OnePostpaidPackagesViewModel$_searchOnePackageRetailerResponse$2.INSTANCE);
        this.f94534s = m11748t();
        this.f94535t = LazyKt__LazyJVMKt.lazy(C14979xa6262a9e.INSTANCE);
        this.f94536u = m11749s();
        this.f94537v = LazyKt__LazyJVMKt.lazy(C14978xa0e9a73.INSTANCE);
        this.f94538w = m11752p();
    }

    /* renamed from: A */
    public static final void m11773A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final OnePostpaidSearchPackage m11772B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (OnePostpaidSearchPackage) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m11771C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m11770D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m11769E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public final OnePostpaidSearchPackage m11768F(OnePostpaidSearchPackage onePostpaidSearchPackage) {
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

    /* renamed from: G */
    public static final void m11767G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ void m11766b(Function1 function1, Object obj) {
        m11755m(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m11765c(Function1 function1, Object obj) {
        m11769E(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ OnePostpaidSearchPackage m11764d(Function1 function1, Object obj) {
        return m11772B(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ void m11763e(Function1 function1, Object obj) {
        m11754n(function1, obj);
    }

    /* renamed from: f */
    public static /* synthetic */ void m11762f(Function1 function1, Object obj) {
        m11771C(function1, obj);
    }

    /* renamed from: g */
    public static /* synthetic */ void m11761g(Function1 function1, Object obj) {
        m11773A(function1, obj);
    }

    public final void getViewAllPackageGroupBranded(String str, boolean z) {
        Single<R> compose = this.f94517b.onePostpaidBrandedViewAllPackageGroup(new OnePostpaidViewAllPackageGroupRequest(str)).compose(this.f94519d.applySingleAsync());
        final OnePostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 onePostpaidPackagesViewModel$getViewAllPackageGroupBranded$1 = new OnePostpaidPackagesViewModel$getViewAllPackageGroupBranded$1(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: n31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11763e(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun getViewAllPa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidPackagesViewModel$getViewAllPackageGroupBranded$2(this), new OnePostpaidPackagesViewModel$getViewAllPackageGroupBranded$3(this, z)), this.f94522g);
    }

    /* renamed from: h */
    public static /* synthetic */ void m11760h(Function1 function1, Object obj) {
        m11770D(function1, obj);
    }

    /* renamed from: i */
    public static /* synthetic */ void m11759i(Function1 function1, Object obj) {
        m11767G(function1, obj);
    }

    private final boolean isDefaultPackageRetailer() {
        return this.f94517b.isDefaultPackage();
    }

    /* renamed from: j */
    public static /* synthetic */ void m11758j(Function1 function1, Object obj) {
        m11757k(function1, obj);
    }

    /* renamed from: k */
    public static final void m11757k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m11755m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m11754n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    private final MutableLiveData m11753o() {
        return (MutableLiveData) this.f94525j.getValue();
    }

    /* renamed from: p */
    public final MutableLiveData m11752p() {
        return (MutableLiveData) this.f94537v.getValue();
    }

    /* renamed from: q */
    public final MutableLiveData m11751q() {
        return (MutableLiveData) this.f94531p.getValue();
    }

    /* renamed from: r */
    public final MutableLiveData m11750r() {
        return (MutableLiveData) this.f94529n.getValue();
    }

    /* renamed from: s */
    private final MutableLiveData m11749s() {
        return (MutableLiveData) this.f94535t.getValue();
    }

    public final void setDefaultPackageRetailer(boolean z) {
        this.f94517b.setDefaultPackage(z);
    }

    /* renamed from: t */
    private final MutableLiveData m11748t() {
        return (MutableLiveData) this.f94533r.getValue();
    }

    /* renamed from: v */
    public final MutableLiveData m11746v() {
        return (MutableLiveData) this.f94523h.getValue();
    }

    /* renamed from: x */
    public final boolean m11744x(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        OnePostpaidSearchPackagePaginate paginate = onePostpaidSearchPackage.getPaginate();
        if (paginate == null || paginate.getTotalItem() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m11743y(OnePostpaidSearchPackage onePostpaidSearchPackage) {
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

    /* renamed from: z */
    public final void m11742z(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (m11743y(onePostpaidSearchPackage)) {
            m11748t().postValue(Resource.Companion.success(onePostpaidSearchPackage));
        } else {
            m11748t().postValue(Resource.Companion.success(onePostpaidSearchPackage));
        }
    }

    public final void callPackageDetail(@NotNull String packageCode) {
        Integer num;
        ValidateSimBarcodeData data;
        ValidateSimBarcodeData data2;
        Intrinsics.checkNotNullParameter(packageCode, "packageCode");
        OnePostpaidRepository onePostpaidRepository = this.f94517b;
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        String str = (validateSimBarcodeResponse == null || (data2 = validateSimBarcodeResponse.getData()) == null || (r1 = data2.getSimType()) == null) ? "" : "";
        boolean isWithDevice = this.f94517b.isWithDevice();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 != null && (data = validateSimBarcodeResponse2.getData()) != null) {
            num = data.getMinPrice();
        } else {
            num = null;
        }
        Single<R> compose = onePostpaidRepository.onePostpaidRetailerPackageDetail(new OnePostpaidRetailerPackageDetailRequest(str, "POSTPAID", num, packageCode, Boolean.valueOf(isWithDevice))).compose(this.f94519d.applySingleAsync());
        final OnePostpaidPackagesViewModel$callPackageDetail$1 onePostpaidPackagesViewModel$callPackageDetail$1 = new OnePostpaidPackagesViewModel$callPackageDetail$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: q31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11758j(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun callPackageDetail(pa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidPackagesViewModel$callPackageDetail$2(this), new OnePostpaidPackagesViewModel$callPackageDetail$3(this)), this.f94522g);
    }

    public final void getAllPackageGroup(@NotNull OnePostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        m11756l(validateBarcodeResponse, false);
    }

    @NotNull
    public final CompositeDisposable getDisposable() {
        return this.f94522g;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidPackageSet>> getGetPackageDetailRetailerResponse() {
        return this.f94532q;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidBrandedSearchPackageGroupResponse>> getGetSearchOnePackageGroupBrandedResponse() {
        return this.f94536u;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidSearchPackage>> getGetSearchOnePackageRetailerResponse() {
        return this.f94534s;
    }

    @Nullable
    public final Package getMPackage() {
        return this.f94517b.getMPackage();
    }

    @NotNull
    public final LiveData<Event<FragmentNavEvent>> getNavigateNext() {
        return this.f94526k;
    }

    @NotNull
    public final LiveData<Resource<OnePostpaidPackageSetResponse>> getOneGetAllPackageGroupRetailerResponse() {
        return this.f94538w;
    }

    @Nullable
    public final OnePostpaidValidatePackageGroupCodeResponse getPackageGroupCodeResponse() {
        return this.f94517b.getPackageGroupCodeResponse();
    }

    @Nullable
    public final OnePostpaidPackageSet getPackageSetRetailer() {
        return this.f94517b.getPackageSetRetailer();
    }

    @Nullable
    public final OnePostpaidPackageSetResponse getPostpaidPackageSetRetailerResponse() {
        return this.f94517b.getPostpaidPackageSetRetailerResponse();
    }

    @NotNull
    public final LiveData<Resource<Boolean>> getRefreshPackage() {
        return this.f94530o;
    }

    @NotNull
    public final LiveData<Resource<ErrorCollection>> getShowErrorMessage() {
        return this.f94524i;
    }

    @NotNull
    public final String getSimBarcode() {
        return this.f94517b.getSimBarcode();
    }

    @Nullable
    public final SpecialPackageItem getSpecialPackageItem() {
        return this.f94517b.getSpecialPackageItem();
    }

    @Nullable
    public final OnePostpaidValidateSimBarcodeResponse getValidateSimBarcodeResponse() {
        return this.f94517b.getValidateSimBarcodeResponse();
    }

    public final boolean isDefaultPackage() {
        ValidateSimBarcodeData data;
        String packageGroupCode;
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = this.f94517b.getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (data = validateSimBarcodeResponse.getData()) == null || (packageGroupCode = data.getPackageGroupCode()) == null || packageGroupCode.length() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean isSpecialPackage() {
        if (this.f94517b.getSpecialPackageItem() != null) {
            return true;
        }
        return false;
    }

    public final boolean isUserLan() {
        return this.f94517b.isUserLan();
    }

    public final boolean isWithContract() {
        return this.f94517b.getWithContract();
    }

    /* renamed from: l */
    public final void m11756l(OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse, boolean z) {
        String str;
        Integer num;
        OnePostpaidRepository onePostpaidRepository = this.f94517b;
        ValidateSimBarcodeData data = onePostpaidValidateSimBarcodeResponse.getData();
        String str2 = null;
        if (data != null) {
            str = data.getSimType();
        } else {
            str = null;
        }
        boolean isWithDevice = this.f94517b.isWithDevice();
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
        Single<R> compose = onePostpaidRepository.onePostpaidRetailerAllPackageGroup(new OnePostpaidRetailerAllPackageGroupRequest(str, null, num, str2, Boolean.valueOf(isWithDevice), 2, null)).compose(this.f94519d.applySingleAsync());
        final C14983x14393d9c c14983x14393d9c = new C14983x14393d9c(z, this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: p31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11766b(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "private fun getOnePostpa… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new C14984x14393d9d(this), new C14986x14393d9e(this, z)), this.f94522g);
    }

    public final void navigateNext() {
        getLiveDataState().setValue(StatusResource.DISMISS);
        if (isDefaultPackage() && isDefaultPackageRetailer()) {
            m11753o().setValue(new Event(new FragmentNavEvent(OnePostpaidDefaultPackageFragment.class, null, null, 4, null)));
        } else {
            m11753o().setValue(new Event(new FragmentNavEvent(OnePostpaidAllPackageFragment.class, null, null, 4, null)));
        }
    }

    @Override // th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f94522g.clear();
    }

    public final void refreshPackage(@NotNull OnePostpaidValidateSimBarcodeResponse validateBarcodeResponse) {
        Intrinsics.checkNotNullParameter(validateBarcodeResponse, "validateBarcodeResponse");
        m11756l(validateBarcodeResponse, true);
    }

    public final void searchOnePackageGroupBranded(@NotNull String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Single<R> compose = this.f94517b.searchOnePackageGroupBranded(new OnePostpaidBrandedSearchPackageGroupRequest(this.f94517b.getPackageGroupRefNo(), keyword)).compose(this.f94519d.applySingleAsync());
        final OnePostpaidPackagesViewModel$searchOnePackageGroupBranded$1 onePostpaidPackagesViewModel$searchOnePackageGroupBranded$1 = new OnePostpaidPackagesViewModel$searchOnePackageGroupBranded$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: o31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11761g(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun searchOnePackageGrou… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidPackagesViewModel$searchOnePackageGroupBranded$2(this), new OnePostpaidPackagesViewModel$searchOnePackageGroupBranded$3(this)), this.f94522g);
    }

    public final void searchOnePackageGroupRetailer(@NotNull String keyword) {
        String str;
        String str2;
        Integer num;
        ValidateSimBarcodeData data;
        ValidateSimBarcodeData data2;
        String simType;
        ValidateSimBarcodeData data3;
        String packageGroupCode;
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        OnePostpaidRepository onePostpaidRepository = this.f94517b;
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse == null || (data3 = validateSimBarcodeResponse.getData()) == null || (packageGroupCode = data3.getPackageGroupCode()) == null) {
            str = "";
        } else {
            str = packageGroupCode;
        }
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse2 == null || (data2 = validateSimBarcodeResponse2.getData()) == null || (simType = data2.getSimType()) == null) {
            str2 = "";
        } else {
            str2 = simType;
        }
        boolean isWithDevice = this.f94517b.isWithDevice();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse3 = getValidateSimBarcodeResponse();
        if (validateSimBarcodeResponse3 != null && (data = validateSimBarcodeResponse3.getData()) != null) {
            num = data.getMinPrice();
        } else {
            num = null;
        }
        Single<OnePostpaidRetailerSearchPackageGroupResponse> searchOnePackageGroupRetailer = onePostpaidRepository.searchOnePackageGroupRetailer(new OnePostpaidRetailerSearchPackageGroupRequest(str2, "POSTPAID", num, str, Boolean.valueOf(isWithDevice), keyword));
        final OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1 onePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1 = new OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$1(this);
        Single compose = searchOnePackageGroupRetailer.map(new Function() { // from class: i31
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OnePostpaidPackagesViewModel.m11764d(Function1.this, obj);
            }
        }).compose(this.f94519d.applySingleAsync());
        final OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$2 onePostpaidPackagesViewModel$searchOnePackageGroupRetailer$2 = new OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$2(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: j31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11762f(Function1.this, obj);
            }
        });
        final OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3 onePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3 = new OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3(this);
        Consumer consumer = new Consumer() { // from class: k31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11760h(Function1.this, obj);
            }
        };
        final OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$4 onePostpaidPackagesViewModel$searchOnePackageGroupRetailer$4 = new OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$4(this);
        Disposable subscribe = doOnSubscribe.subscribe(consumer, new Consumer() { // from class: l31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11765c(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "fun searchOnePackageGrou… .addTo(disposable)\n    }");
        DisposableKt.addTo(subscribe, this.f94522g);
    }

    public final void setMPackage(@Nullable Package r2) {
        this.f94517b.setMPackage(r2);
    }

    public final void setPackageGroupCodeResponse(@Nullable OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse) {
        this.f94517b.setPackageGroupCodeResponse(onePostpaidValidatePackageGroupCodeResponse);
    }

    public final void setPackageSetRetailer(@Nullable OnePostpaidPackageSet onePostpaidPackageSet) {
        this.f94517b.setPackageSetRetailer(onePostpaidPackageSet);
    }

    public final void setPostpaidPackageSetRetailerResponse(@Nullable OnePostpaidPackageSetResponse onePostpaidPackageSetResponse) {
        this.f94517b.setPostpaidPackageSetRetailerResponse(onePostpaidPackageSetResponse);
    }

    public final void setSimBarcode(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f94517b.setSimBarcode(value);
    }

    public final void setSpecialPackageItem(@Nullable SpecialPackageItem specialPackageItem) {
        this.f94517b.setSpecialPackageItem(specialPackageItem);
    }

    public final void setValidateSimBarcodeResponse(@Nullable OnePostpaidValidateSimBarcodeResponse onePostpaidValidateSimBarcodeResponse) {
        this.f94517b.setValidateSimBarcodeResponse(onePostpaidValidateSimBarcodeResponse);
    }

    public final void setWithContract(boolean z) {
        this.f94517b.setWithContract(z);
    }

    /* renamed from: u */
    public final MutableLiveData m11747u() {
        return (MutableLiveData) this.f94528m.getValue();
    }

    public final void validatePackageGroupCode(@NotNull OnePostpaidPackageSet pack) {
        String str;
        String str2;
        ValidateSimBarcodeData data;
        GetNewIMEIResponse hardwareNumberResponse;
        String hardwareNumber;
        ValidateSimBarcodeData data2;
        Intrinsics.checkNotNullParameter(pack, "pack");
        OnePostpaidRepository onePostpaidRepository = this.f94517b;
        String userCode = onePostpaidRepository.getUserCode();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse = getValidateSimBarcodeResponse();
        Boolean bool = null;
        if (validateSimBarcodeResponse != null && (data2 = validateSimBarcodeResponse.getData()) != null) {
            str = data2.getSubscriberNumber();
        } else {
            str = null;
        }
        GetNewIMEIResponse hardwareNumberResponse2 = this.f94517b.getHardwareNumberResponse();
        if (hardwareNumberResponse2 != null) {
            bool = Boolean.valueOf(hardwareNumberResponse2.isDtacDevice());
        }
        if (!Intrinsics.areEqual(bool, Boolean.TRUE) || (hardwareNumberResponse = this.f94517b.getHardwareNumberResponse()) == null || (hardwareNumber = hardwareNumberResponse.getHardwareNumber()) == null) {
            str2 = "";
        } else {
            str2 = hardwareNumber;
        }
        String packageCode = pack.getPackageCode();
        OnePostpaidValidateSimBarcodeResponse validateSimBarcodeResponse2 = getValidateSimBarcodeResponse();
        Single<R> compose = onePostpaidRepository.onePostpaidValidatePackageGroupCode(new OnePostpaidValidatePackageGroupCodeRequest((validateSimBarcodeResponse2 == null || (data = validateSimBarcodeResponse2.getData()) == null || (r1 = data.getPackageGroupType()) == null) ? "10" : "10", packageCode, str, str2, userCode)).compose(this.f94519d.applySingleAsync());
        final OnePostpaidPackagesViewModel$validatePackageGroupCode$1 onePostpaidPackagesViewModel$validatePackageGroupCode$1 = new OnePostpaidPackagesViewModel$validatePackageGroupCode$1(this);
        Single doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: m31
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OnePostpaidPackagesViewModel.m11759i(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun validatePackageGroup… .addTo(disposable)\n    }");
        DisposableKt.addTo(SubscribersKt.subscribeBy(doOnSubscribe, new OnePostpaidPackagesViewModel$validatePackageGroupCode$2(this), new OnePostpaidPackagesViewModel$validatePackageGroupCode$3(this, pack)), this.f94522g);
    }

    /* renamed from: w */
    public final MutableLiveData m11745w() {
        return (MutableLiveData) this.f94527l.getValue();
    }
}