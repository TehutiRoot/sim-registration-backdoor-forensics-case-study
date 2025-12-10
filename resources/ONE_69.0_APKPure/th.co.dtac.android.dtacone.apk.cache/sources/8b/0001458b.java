package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.Data;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.DistrictsItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.ProvinceItem;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.SubDistrictItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getTrueLocation$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {437}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getTrueLocation$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,3:2378\n233#2,2:2387\n230#2,3:2389\n233#2,2:2398\n230#2,3:2400\n233#2,2:2409\n230#2,3:2411\n233#2,2:2419\n1559#3:2381\n1590#3,4:2382\n1045#3:2386\n1559#3:2392\n1590#3,4:2393\n1045#3:2397\n1559#3:2403\n1590#3,4:2404\n1045#3:2408\n1559#3:2414\n1590#3,4:2415\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getTrueLocation$1\n*L\n440#1:2373,5\n442#1:2378,3\n442#1:2387,2\n447#1:2389,3\n447#1:2398,2\n454#1:2400,3\n454#1:2409,2\n463#1:2411,3\n463#1:2419,2\n443#1:2381\n443#1:2382,4\n445#1:2386\n449#1:2392\n449#1:2393,4\n452#1:2397\n457#1:2403\n457#1:2404,4\n461#1:2408\n466#1:2414\n466#1:2415,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getTrueLocation$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$getTrueLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$getTrueLocation$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$getTrueLocation$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$getTrueLocation$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object trueLocation;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        List<ProvinceItem> list;
        int i;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        Collection emptyList;
        Collection emptyList2;
        Iterator it;
        Collection emptyList3;
        Iterator it2;
        Iterator it3;
        ProvinceItem provinceItem;
        List list2;
        Iterator it4;
        int i2;
        Iterator it5;
        int i3;
        ProvinceItem provinceItem2;
        int i4;
        Collection emptyList4;
        OneRegisterTrueOnlineViewModel$getTrueLocation$1 oneRegisterTrueOnlineViewModel$getTrueLocation$1 = this;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i5 = oneRegisterTrueOnlineViewModel$getTrueLocation$1.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            OneTolRepository oneTolRepository = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98221c;
            oneRegisterTrueOnlineViewModel$getTrueLocation$1.label = 1;
            trueLocation = oneTolRepository.getTrueLocation(oneRegisterTrueOnlineViewModel$getTrueLocation$1);
            if (trueLocation == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            trueLocation = obj;
        }
        OneCommonTrueLocationResponse oneCommonTrueLocationResponse = (OneCommonTrueLocationResponse) trueLocation;
        if (oneCommonTrueLocationResponse.getData() != null) {
            Data data = oneCommonTrueLocationResponse.getData();
            mutableStateFlow = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98206V;
            while (true) {
                Object value = mutableStateFlow.getValue();
                Data data2 = (Data) value;
                if (mutableStateFlow.compareAndSet(value, data)) {
                    break;
                }
                oneRegisterTrueOnlineViewModel$getTrueLocation$1 = this;
            }
            List<ProvinceItem> province = data.getProvince();
            if (province == null) {
                province = CollectionsKt__CollectionsKt.emptyList();
            }
            List<ProvinceItem> list3 = province;
            mutableStateFlow2 = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98208W;
            while (true) {
                Object value2 = mutableStateFlow2.getValue();
                List list4 = (List) value2;
                list = list3;
                i = 10;
                ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
                Iterator<T> it6 = list.iterator();
                int i6 = 0;
                while (true) {
                    String str = "";
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next = it6.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ProvinceItem provinceItem3 = (ProvinceItem) next;
                    String id2 = provinceItem3.getId();
                    int parseInt = id2 != null ? Integer.parseInt(id2) : i7;
                    String th2 = provinceItem3.getTh();
                    if (th2 != null) {
                        str = th2;
                    }
                    arrayList.add(new Province(parseInt, str));
                    i6 = i7;
                }
                if (mutableStateFlow2.compareAndSet(value2, CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getTrueLocation$1$invokeSuspend$lambda$3$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC16870uu.compareValues(((Province) t).getName(), ((Province) t2).getName());
                    }
                }))) {
                    break;
                }
                oneRegisterTrueOnlineViewModel$getTrueLocation$1 = this;
            }
            mutableStateFlow3 = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98212Y;
            while (true) {
                Object value3 = mutableStateFlow3.getValue();
                List list5 = (List) value3;
                ArrayList arrayList2 = new ArrayList();
                int i8 = 0;
                for (Object obj2 : list) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ProvinceItem provinceItem4 = (ProvinceItem) obj2;
                    List<DistrictsItem> districts = provinceItem4.getDistricts();
                    if (districts != null) {
                        List<DistrictsItem> list6 = districts;
                        emptyList4 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list6, i));
                        int i10 = 0;
                        for (Object obj3 : list6) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            DistrictsItem districtsItem = (DistrictsItem) obj3;
                            String id3 = districtsItem.getId();
                            int parseInt2 = id3 != null ? Integer.parseInt(id3) : i11;
                            String th3 = districtsItem.getTh();
                            if (th3 == null) {
                                th3 = "";
                            }
                            String id4 = provinceItem4.getId();
                            emptyList4.add(new District(parseInt2, th3, id4 != null ? Integer.parseInt(id4) : i9));
                            i10 = i11;
                        }
                    } else {
                        emptyList4 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    AbstractC10396hs.addAll(arrayList2, emptyList4);
                    i8 = i9;
                    i = 10;
                }
                if (mutableStateFlow3.compareAndSet(value3, CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getTrueLocation$1$invokeSuspend$lambda$7$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC16870uu.compareValues(((District) t).getName(), ((District) t2).getName());
                    }
                }))) {
                    break;
                }
                oneRegisterTrueOnlineViewModel$getTrueLocation$1 = this;
                i = 10;
            }
            mutableStateFlow4 = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98216a0;
            while (true) {
                Object value4 = mutableStateFlow4.getValue();
                List list7 = (List) value4;
                ArrayList arrayList3 = new ArrayList();
                Iterator it7 = list.iterator();
                int i12 = 0;
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ProvinceItem provinceItem5 = (ProvinceItem) next2;
                    List<DistrictsItem> districts2 = provinceItem5.getDistricts();
                    if (districts2 != null) {
                        emptyList3 = new ArrayList();
                        Iterator it8 = districts2.iterator();
                        int i14 = 0;
                        while (it8.hasNext()) {
                            Object next3 = it8.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            DistrictsItem districtsItem2 = (DistrictsItem) next3;
                            List<SubDistrictItem> subDistrict = districtsItem2.getSubDistrict();
                            if (subDistrict != null) {
                                List<SubDistrictItem> list8 = subDistrict;
                                it2 = it7;
                                ArrayList arrayList4 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list8, 10));
                                Iterator it9 = list8.iterator();
                                int i16 = 0;
                                while (it9.hasNext()) {
                                    Object next4 = it9.next();
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    SubDistrictItem subDistrictItem = (SubDistrictItem) next4;
                                    String id5 = subDistrictItem.getId();
                                    if (id5 != null) {
                                        int parseInt3 = Integer.parseInt(id5);
                                        it4 = it9;
                                        i2 = parseInt3;
                                    } else {
                                        it4 = it9;
                                        i2 = i17;
                                    }
                                    String th4 = subDistrictItem.getTh();
                                    if (th4 == null) {
                                        th4 = "";
                                    }
                                    String id6 = districtsItem2.getId();
                                    if (id6 != null) {
                                        int parseInt4 = Integer.parseInt(id6);
                                        it5 = it8;
                                        i3 = parseInt4;
                                    } else {
                                        it5 = it8;
                                        i3 = i15;
                                    }
                                    String id7 = provinceItem5.getId();
                                    if (id7 != null) {
                                        int parseInt5 = Integer.parseInt(id7);
                                        provinceItem2 = provinceItem5;
                                        i4 = parseInt5;
                                    } else {
                                        provinceItem2 = provinceItem5;
                                        i4 = i13;
                                    }
                                    arrayList4.add(new SubDistrict(i2, th4, i3, i4));
                                    i16 = i17;
                                    it9 = it4;
                                    it8 = it5;
                                    provinceItem5 = provinceItem2;
                                }
                                it3 = it8;
                                provinceItem = provinceItem5;
                                list2 = CollectionsKt___CollectionsKt.distinct(arrayList4);
                                if (list2 != null) {
                                    AbstractC10396hs.addAll(emptyList3, list2);
                                    i14 = i15;
                                    it7 = it2;
                                    it8 = it3;
                                    provinceItem5 = provinceItem;
                                }
                            } else {
                                it2 = it7;
                                it3 = it8;
                                provinceItem = provinceItem5;
                            }
                            list2 = CollectionsKt__CollectionsKt.emptyList();
                            AbstractC10396hs.addAll(emptyList3, list2);
                            i14 = i15;
                            it7 = it2;
                            it8 = it3;
                            provinceItem5 = provinceItem;
                        }
                        it = it7;
                    } else {
                        it = it7;
                        emptyList3 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    AbstractC10396hs.addAll(arrayList3, emptyList3);
                    i12 = i13;
                    it7 = it;
                }
                if (mutableStateFlow4.compareAndSet(value4, CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getTrueLocation$1$invokeSuspend$lambda$12$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC16870uu.compareValues(((SubDistrict) t).getName(), ((SubDistrict) t2).getName());
                    }
                }))) {
                    break;
                }
                oneRegisterTrueOnlineViewModel$getTrueLocation$1 = this;
            }
            mutableStateFlow5 = oneRegisterTrueOnlineViewModel$getTrueLocation$1.this$0.f98222c0;
            while (true) {
                Object value5 = mutableStateFlow5.getValue();
                List list9 = (List) value5;
                ArrayList arrayList5 = new ArrayList();
                int i18 = 0;
                for (Object obj4 : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ProvinceItem provinceItem6 = (ProvinceItem) obj4;
                    List<DistrictsItem> districts3 = provinceItem6.getDistricts();
                    if (districts3 != null) {
                        emptyList = new ArrayList();
                        int i20 = 0;
                        for (Object obj5 : districts3) {
                            int i21 = i20 + 1;
                            if (i20 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            DistrictsItem districtsItem3 = (DistrictsItem) obj5;
                            List<SubDistrictItem> subDistrict2 = districtsItem3.getSubDistrict();
                            if (subDistrict2 != null) {
                                List<SubDistrictItem> list10 = subDistrict2;
                                emptyList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list10, 10));
                                int i22 = 0;
                                for (Object obj6 : list10) {
                                    int i23 = i22 + 1;
                                    if (i22 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    }
                                    SubDistrictItem subDistrictItem2 = (SubDistrictItem) obj6;
                                    String zipCode = subDistrictItem2.getZipCode();
                                    String str2 = zipCode == null ? "" : zipCode;
                                    String id8 = subDistrictItem2.getId();
                                    int parseInt6 = id8 != null ? Integer.parseInt(id8) : i23;
                                    String id9 = districtsItem3.getId();
                                    int parseInt7 = id9 != null ? Integer.parseInt(id9) : i21;
                                    String id10 = provinceItem6.getId();
                                    emptyList2.add(new PostCode(i23, str2, parseInt6, parseInt7, id10 != null ? Integer.parseInt(id10) : i19));
                                    i22 = i23;
                                }
                            } else {
                                emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                            AbstractC10396hs.addAll(emptyList, emptyList2);
                            i20 = i21;
                        }
                    } else {
                        emptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    AbstractC10396hs.addAll(arrayList5, emptyList);
                    i18 = i19;
                }
                if (mutableStateFlow5.compareAndSet(value5, arrayList5)) {
                    break;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$getTrueLocation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}