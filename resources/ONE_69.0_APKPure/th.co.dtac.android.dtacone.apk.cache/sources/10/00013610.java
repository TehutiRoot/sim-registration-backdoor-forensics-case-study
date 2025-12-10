package th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.DateHeaderItemModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.LastTransactionBodyModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.TransactionItemListModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.request.OneOwnerListRequest;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerDataResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerLastTransaction;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.model.response.OneOwnerTransactionDataResponse;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.repository.OneOwnerManagementRepository;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel;
import th.p047co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.TransactionItemList;
import th.p047co.dtac.android.dtacone.viewmodel.BaseViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u00102\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00190\"j\b\u0012\u0004\u0012\u00020\u0019`#2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0018H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R#\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020201088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R7\u0010@\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\"j\b\u0012\u0004\u0012\u00020\u0019`#01008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u00106R3\u0010C\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\"j\b\u0012\u0004\u0012\u00020\u0019`#01088\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R'\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D01008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\bA\u00106R#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D01088\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\bF\u0010<R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010H¨\u0006I"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/OneOwnerManagementViewModel;", "Lth/co/dtac/android/dtacone/viewmodel/BaseViewModel;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepository;", "repository", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "rtrRx2Repository", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "threadService", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", "oneErrorService", "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "configurationRepository", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepository;Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;Lth/co/dtac/android/dtacone/manager/service/OneErrorService;Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;)V", "", "companyName", "", "getOneOwnerList", "(Ljava/lang/String;)V", "", "mrtrUserId", "getOneOwnerDetail", "(I)V", "deleteOneOwner", "", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/TransactionItemListModel;", "ownTransactionList", "setOwnTransactionList", "(Ljava/util/List;)V", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/TransactionItemList;", "getOwnTransactionList", "()Ljava/util/List;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerTransactionDataResponse;", "transaction", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", OperatorName.MOVE_TO, "(Ljava/util/List;)Ljava/util/ArrayList;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/repository/OneOwnerManagementRepository;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "d", "Lth/co/dtac/android/dtacone/manager/service/Rx2ThreadService;", "e", "Lth/co/dtac/android/dtacone/manager/service/OneErrorService;", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/repository/ConfigurationRepository;", "Landroidx/lifecycle/MutableLiveData;", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/view/appOne/ownerManagement/model/response/OneOwnerDataResponse;", OperatorName.NON_STROKING_GRAY, "Lkotlin/Lazy;", OperatorName.LINE_TO, "()Landroidx/lifecycle/MutableLiveData;", "_ownerListLiveData", "Landroidx/lifecycle/LiveData;", OperatorName.CLOSE_PATH, "Landroidx/lifecycle/LiveData;", "getOwnerListLiveData", "()Landroidx/lifecycle/LiveData;", "ownerListLiveData", "i", OperatorName.NON_STROKING_CMYK, "_ownerDetailLiveData", OperatorName.SET_LINE_JOINSTYLE, "getOwnerDetailLiveData", "ownerDetailLiveData", "Lth/co/dtac/android/dtacone/model/status/StatusResponse;", "_deleteOwnerLiveData", "getDeleteOwnerLiveData", "deleteOwnerLiveData", "Ljava/util/List;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneOwnerManagementViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneOwnerManagementViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/OneOwnerManagementViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1045#2:186\n1054#2:187\n766#2:188\n857#2,2:189\n1855#2:191\n1855#2,2:192\n1856#2:194\n1855#2,2:195\n*S KotlinDebug\n*F\n+ 1 OneOwnerManagementViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/ownerManagement/viewModel/OneOwnerManagementViewModel\n*L\n106#1:186\n108#1:187\n110#1:188\n110#1:189,2\n115#1:191\n121#1:192,2\n115#1:194\n150#1:195,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel */
/* loaded from: classes10.dex */
public final class OneOwnerManagementViewModel extends BaseViewModel {
    public static final int $stable = 8;

    /* renamed from: b */
    public final OneOwnerManagementRepository f93153b;

    /* renamed from: c */
    public final RtrRx2Repository f93154c;

    /* renamed from: d */
    public final Rx2ThreadService f93155d;

    /* renamed from: e */
    public final OneErrorService f93156e;

    /* renamed from: f */
    public final ConfigurationRepository f93157f;

    /* renamed from: g */
    public final Lazy f93158g;

    /* renamed from: h */
    public final LiveData f93159h;

    /* renamed from: i */
    public final Lazy f93160i;

    /* renamed from: j */
    public final LiveData f93161j;

    /* renamed from: k */
    public final Lazy f93162k;

    /* renamed from: l */
    public final LiveData f93163l;

    /* renamed from: m */
    public List f93164m;

    @Inject
    public OneOwnerManagementViewModel(@NotNull OneOwnerManagementRepository repository, @NotNull RtrRx2Repository rtrRx2Repository, @NotNull Rx2ThreadService threadService, @NotNull OneErrorService oneErrorService, @NotNull ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(rtrRx2Repository, "rtrRx2Repository");
        Intrinsics.checkNotNullParameter(threadService, "threadService");
        Intrinsics.checkNotNullParameter(oneErrorService, "oneErrorService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f93153b = repository;
        this.f93154c = rtrRx2Repository;
        this.f93155d = threadService;
        this.f93156e = oneErrorService;
        this.f93157f = configurationRepository;
        this.f93158g = LazyKt__LazyJVMKt.lazy(OneOwnerManagementViewModel$_ownerListLiveData$2.INSTANCE);
        this.f93159h = m12770l();
        this.f93160i = LazyKt__LazyJVMKt.lazy(OneOwnerManagementViewModel$_ownerDetailLiveData$2.INSTANCE);
        this.f93161j = m12771k();
        this.f93162k = LazyKt__LazyJVMKt.lazy(OneOwnerManagementViewModel$_deleteOwnerLiveData$2.INSTANCE);
        this.f93163l = m12772j();
    }

    /* renamed from: b */
    public static /* synthetic */ void m12780b(Function1 function1, Object obj) {
        m12775g(function1, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m12779c(Function1 function1, Object obj) {
        m12776f(function1, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m12778d(Function1 function1, Object obj) {
        m12773i(function1, obj);
    }

    /* renamed from: e */
    public static /* synthetic */ ArrayList m12777e(Function1 function1, Object obj) {
        return m12774h(function1, obj);
    }

    /* renamed from: f */
    public static final void m12776f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m12775g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final ArrayList m12774h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ArrayList) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m12773i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final void deleteOneOwner(int i) {
        Observable<R> compose = this.f93153b.deleteOneOwner(i).compose(this.f93155d.applyAsync());
        final OneOwnerManagementViewModel$deleteOneOwner$1 oneOwnerManagementViewModel$deleteOneOwner$1 = new OneOwnerManagementViewModel$deleteOneOwner$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Y01
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOwnerManagementViewModel.m12779c(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun deleteOneOwner(mrtrU…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneOwnerManagementViewModel$deleteOneOwner$2(this), (Function0) null, new OneOwnerManagementViewModel$deleteOneOwner$3(this), 2, (Object) null);
    }

    @NotNull
    public final LiveData<Resource<StatusResponse>> getDeleteOwnerLiveData() {
        return this.f93163l;
    }

    public final void getOneOwnerDetail(int i) {
        Observable<R> compose = this.f93153b.getOneOwnerDetail(i).compose(this.f93155d.applyAsync());
        final OneOwnerManagementViewModel$getOneOwnerDetail$1 oneOwnerManagementViewModel$getOneOwnerDetail$1 = new OneOwnerManagementViewModel$getOneOwnerDetail$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: Z01
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOwnerManagementViewModel.m12780b(Function1.this, obj);
            }
        });
        final OneOwnerManagementViewModel$getOneOwnerDetail$2 oneOwnerManagementViewModel$getOneOwnerDetail$2 = new OneOwnerManagementViewModel$getOneOwnerDetail$2(this);
        Observable map = doOnSubscribe.map(new Function() { // from class: a11
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OneOwnerManagementViewModel.m12777e(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "fun getOneOwnerDetail(mr…    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(map, new OneOwnerManagementViewModel$getOneOwnerDetail$3(this), (Function0) null, new OneOwnerManagementViewModel$getOneOwnerDetail$4(this), 2, (Object) null);
    }

    public final void getOneOwnerList(@NotNull String companyName) {
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Observable<R> compose = this.f93153b.getOneOwnerList(new OneOwnerListRequest(this.f93154c.getSessionNow().getToken().getRtrCode(), companyName)).compose(this.f93155d.applyAsync());
        final OneOwnerManagementViewModel$getOneOwnerList$1 oneOwnerManagementViewModel$getOneOwnerList$1 = new OneOwnerManagementViewModel$getOneOwnerList$1(this);
        Observable doOnSubscribe = compose.doOnSubscribe(new Consumer() { // from class: X01
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OneOwnerManagementViewModel.m12778d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnSubscribe, "fun getOneOwnerList(\n   …    }\n            )\n    }");
        SubscribersKt.subscribeBy$default(doOnSubscribe, new OneOwnerManagementViewModel$getOneOwnerList$2(this), (Function0) null, new OneOwnerManagementViewModel$getOneOwnerList$3(this), 2, (Object) null);
    }

    @Nullable
    public final List<TransactionItemList> getOwnTransactionList() {
        return this.f93164m;
    }

    @NotNull
    public final LiveData<Resource<ArrayList<TransactionItemListModel>>> getOwnerDetailLiveData() {
        return this.f93161j;
    }

    @NotNull
    public final LiveData<Resource<OneOwnerDataResponse>> getOwnerListLiveData() {
        return this.f93159h;
    }

    /* renamed from: j */
    public final MutableLiveData m12772j() {
        return (MutableLiveData) this.f93162k.getValue();
    }

    /* renamed from: k */
    public final MutableLiveData m12771k() {
        return (MutableLiveData) this.f93160i.getValue();
    }

    /* renamed from: l */
    public final MutableLiveData m12770l() {
        return (MutableLiveData) this.f93158g.getValue();
    }

    /* renamed from: m */
    public final ArrayList m12769m(List list) {
        String str;
        ArrayList<OneOwnerTransactionDataResponse> arrayList = new ArrayList();
        for (Object obj : CollectionsKt___CollectionsKt.sortedWith(CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel$groupTransactionByDate$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC16870uu.compareValues(((OneOwnerTransactionDataResponse) t).getDate(), ((OneOwnerTransactionDataResponse) t2).getDate());
            }
        }), new Comparator() { // from class: th.co.dtac.android.dtacone.view.appOne.ownerManagement.viewModel.OneOwnerManagementViewModel$groupTransactionByDate$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC16870uu.compareValues(((OneOwnerTransactionDataResponse) t2).getDate(), ((OneOwnerTransactionDataResponse) t).getDate());
            }
        })) {
            if (true ^ ((OneOwnerTransactionDataResponse) obj).getLastTransactions().isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (OneOwnerTransactionDataResponse oneOwnerTransactionDataResponse : arrayList) {
            OneOwnerLastTransaction oneOwnerLastTransaction = (OneOwnerLastTransaction) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) oneOwnerTransactionDataResponse.getLastTransactions());
            if (oneOwnerLastTransaction != null) {
                str = oneOwnerLastTransaction.getDisplayDate();
            } else {
                str = null;
            }
            arrayList2.add(new TransactionItemListModel(new DateHeaderItemModel(str), null, 2, null));
            for (OneOwnerLastTransaction oneOwnerLastTransaction2 : oneOwnerTransactionDataResponse.getLastTransactions()) {
                arrayList2.add(new TransactionItemListModel(null, new LastTransactionBodyModel(oneOwnerLastTransaction2), 1, null));
            }
        }
        return arrayList2;
    }

    public final void setOwnTransactionList(@Nullable List<TransactionItemListModel> list) {
        OneOwnerLastTransaction transaction;
        String str;
        String date;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (TransactionItemListModel transactionItemListModel : list) {
                DateHeaderItemModel dateHeaderItem = transactionItemListModel.getDateHeaderItem();
                if (dateHeaderItem != null && (date = dateHeaderItem.getDate()) != null) {
                    arrayList.add(new TransactionItemList.DateHeaderItem(date));
                }
                LastTransactionBodyModel lastTransactionBody = transactionItemListModel.getLastTransactionBody();
                if (lastTransactionBody != null && (transaction = lastTransactionBody.getTransaction()) != null) {
                    String subscriberNumber = transaction.getSubscriberNumber();
                    if (subscriberNumber != null) {
                        str = AESCryptUtil.decryptCBC(subscriberNumber, this.f93157f.dataPrivacyEncryptionAES256CBCKey());
                    } else {
                        str = null;
                    }
                    transaction.setSubscriberNumber(str);
                    arrayList.add(new TransactionItemList.LastTransactionItem(transaction));
                }
            }
        }
        this.f93164m = arrayList;
    }
}