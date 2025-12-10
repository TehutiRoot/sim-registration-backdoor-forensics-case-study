package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.PACKAGE_SUMMARY;
import th.p047co.dtac.android.dtacone.adapter.customer_enquiry.PackageSummaryAdapter;
import th.p047co.dtac.android.dtacone.databinding.ZIncludePackageSummaryBinding;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.MrtrPackageInfoResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.NextCyclePackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.NextDayPackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.NextPackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageItem;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/MrtrPackageInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nNextPackageSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NextPackageSummaryFragment.kt\nth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/NextPackageSummaryFragment$onViewCreated$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1549#2:322\n1620#2,3:323\n1549#2:326\n1620#2,3:327\n1549#2:330\n1620#2,3:331\n*S KotlinDebug\n*F\n+ 1 NextPackageSummaryFragment.kt\nth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/NextPackageSummaryFragment$onViewCreated$5\n*L\n104#1:322\n104#1:323,3\n117#1:326\n117#1:327,3\n137#1:330\n137#1:331,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.NextPackageSummaryFragment$onViewCreated$5 */
/* loaded from: classes9.dex */
public final class NextPackageSummaryFragment$onViewCreated$5 extends Lambda implements Function1<Resource<? extends MrtrPackageInfoResponse>, Unit> {
    final /* synthetic */ NextPackageSummaryFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.NextPackageSummaryFragment$onViewCreated$5$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextPackageSummaryFragment$onViewCreated$5(NextPackageSummaryFragment nextPackageSummaryFragment) {
        super(1);
        this.this$0 = nextPackageSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends MrtrPackageInfoResponse> resource) {
        invoke2((Resource<MrtrPackageInfoResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<MrtrPackageInfoResponse> resource) {
        MrtrPackageInfoResponse data;
        NextPackage nextPackage;
        ZIncludePackageSummaryBinding m8277o;
        ZIncludePackageSummaryBinding m8277o2;
        ZIncludePackageSummaryBinding m8277o3;
        ZIncludePackageSummaryBinding m8277o4;
        ZIncludePackageSummaryBinding m8277o5;
        ZIncludePackageSummaryBinding m8277o6;
        ZIncludePackageSummaryBinding m8277o7;
        SubscriberInfoViewModel subscriberInfoViewModel;
        ZIncludePackageSummaryBinding m8277o8;
        ZIncludePackageSummaryBinding m8277o9;
        ZIncludePackageSummaryBinding m8277o10;
        ZIncludePackageSummaryBinding m8277o11;
        ZIncludePackageSummaryBinding m8277o12;
        ZIncludePackageSummaryBinding m8277o13;
        ZIncludePackageSummaryBinding m8277o14;
        if (resource != null) {
            NextPackageSummaryFragment nextPackageSummaryFragment = this.this$0;
            if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] != 1 || (data = resource.getData()) == null || (nextPackage = data.getNextPackage()) == null) {
                return;
            }
            m8277o = nextPackageSummaryFragment.m8277o();
            DtacFontTextView dtacFontTextView = m8277o.tvMainPack;
            String packageGroupCode = nextPackage.getPackageGroupCode();
            String packageGroupDescription = nextPackage.getPackageGroupDescription();
            dtacFontTextView.setText("[" + packageGroupCode + "] " + packageGroupDescription);
            nextPackageSummaryFragment.m8279m(nextPackage);
            List<PackageItem> mainPackage = nextPackage.getMainPackage();
            if (mainPackage == null || mainPackage.isEmpty()) {
                m8277o2 = nextPackageSummaryFragment.m8277o();
                CardView cardView = m8277o2.cardMainPack;
                Intrinsics.checkNotNullExpressionValue(cardView, "summary.cardMainPack");
                ViewVisibleExtKt.toGone(cardView);
            } else {
                m8277o13 = nextPackageSummaryFragment.m8277o();
                CardView cardView2 = m8277o13.cardMainPack;
                Intrinsics.checkNotNullExpressionValue(cardView2, "summary.cardMainPack");
                ViewVisibleExtKt.toVisible(cardView2);
                List<PackageItem> mainPackage2 = nextPackage.getMainPackage();
                ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(mainPackage2, 10));
                for (PackageItem packageItem : mainPackage2) {
                    packageItem.setPackageGroupCode(nextPackage.getPackageGroupCode());
                    packageItem.setPage(PACKAGE_SUMMARY.NEXT_PAGE);
                    packageItem.setType(PACKAGE_SUMMARY.MAIN_PACKAGE);
                    arrayList.add(packageItem);
                }
                m8277o14 = nextPackageSummaryFragment.m8277o();
                m8277o14.listMainPackage.setAdapter(new PackageSummaryAdapter(arrayList, nextPackageSummaryFragment));
            }
            NextDayPackage nextDay = nextPackage.getNextDay();
            if (nextDay != null) {
                List<PackageItem> mainPackage3 = nextDay.getMainPackage();
                if (mainPackage3 == null || mainPackage3.isEmpty()) {
                    m8277o9 = nextPackageSummaryFragment.m8277o();
                    ConstraintLayout constraintLayout = m8277o9.layoutNextDayPack;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "summary.layoutNextDayPack");
                    ViewVisibleExtKt.toGone(constraintLayout);
                } else {
                    m8277o10 = nextPackageSummaryFragment.m8277o();
                    DtacFontTextView dtacFontTextView2 = m8277o10.tvNextDayPack;
                    String packageGroupCode2 = nextDay.getPackageGroupCode();
                    String packageGroupDescription2 = nextDay.getPackageGroupDescription();
                    dtacFontTextView2.setText("[" + packageGroupCode2 + "] " + packageGroupDescription2);
                    m8277o11 = nextPackageSummaryFragment.m8277o();
                    ConstraintLayout constraintLayout2 = m8277o11.layoutNextDayPack;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "summary.layoutNextDayPack");
                    ViewVisibleExtKt.toVisible(constraintLayout2);
                    List<PackageItem> mainPackage4 = nextDay.getMainPackage();
                    ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(mainPackage4, 10));
                    for (PackageItem packageItem2 : mainPackage4) {
                        packageItem2.setPackageGroupCode(nextDay.getPackageGroupCode());
                        packageItem2.setPage(PACKAGE_SUMMARY.NEXT_PAGE);
                        packageItem2.setType(PACKAGE_SUMMARY.NEXT_DAY_PACKAGE);
                        arrayList2.add(packageItem2);
                    }
                    m8277o12 = nextPackageSummaryFragment.m8277o();
                    m8277o12.listNextDayPackage.setAdapter(new PackageSummaryAdapter(arrayList2, nextPackageSummaryFragment));
                }
            }
            List<NextCyclePackage> nextCycle = nextPackage.getNextCycle();
            if (nextCycle == null || nextCycle.isEmpty()) {
                m8277o3 = nextPackageSummaryFragment.m8277o();
                ConstraintLayout constraintLayout3 = m8277o3.layoutEndOfCyclePack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "summary.layoutEndOfCyclePack");
                ViewVisibleExtKt.toGone(constraintLayout3);
            } else {
                m8277o7 = nextPackageSummaryFragment.m8277o();
                ConstraintLayout constraintLayout4 = m8277o7.layoutEndOfCyclePack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "summary.layoutEndOfCyclePack");
                ViewVisibleExtKt.toVisible(constraintLayout4);
                subscriberInfoViewModel = nextPackageSummaryFragment.f99687i;
                if (subscriberInfoViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subscriberInfoViewModel");
                    subscriberInfoViewModel = null;
                }
                List<PackageItem> mapToPackageItem = subscriberInfoViewModel.mapToPackageItem(nextPackage.getNextCycle());
                m8277o8 = nextPackageSummaryFragment.m8277o();
                m8277o8.listEndOfCyclePackage.setAdapter(new PackageSummaryAdapter(mapToPackageItem, nextPackageSummaryFragment));
            }
            List<PackageItem> additionalPackage = nextPackage.getAdditionalPackage();
            if (additionalPackage == null || additionalPackage.isEmpty()) {
                m8277o4 = nextPackageSummaryFragment.m8277o();
                ConstraintLayout constraintLayout5 = m8277o4.layoutOtherPack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "summary.layoutOtherPack");
                ViewVisibleExtKt.toGone(constraintLayout5);
                return;
            }
            m8277o5 = nextPackageSummaryFragment.m8277o();
            ConstraintLayout constraintLayout6 = m8277o5.layoutOtherPack;
            Intrinsics.checkNotNullExpressionValue(constraintLayout6, "summary.layoutOtherPack");
            ViewVisibleExtKt.toVisible(constraintLayout6);
            List<PackageItem> additionalPackage2 = nextPackage.getAdditionalPackage();
            ArrayList arrayList3 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(additionalPackage2, 10));
            for (PackageItem packageItem3 : additionalPackage2) {
                packageItem3.setPackageGroupCode(nextPackage.getPackageGroupCode());
                packageItem3.setPage(PACKAGE_SUMMARY.NEXT_PAGE);
                packageItem3.setType(PACKAGE_SUMMARY.ADDITIONAL_PACKAGE);
                arrayList3.add(packageItem3);
            }
            m8277o6 = nextPackageSummaryFragment.m8277o();
            m8277o6.listAdditionalPackage.setAdapter(new PackageSummaryAdapter(arrayList3, nextPackageSummaryFragment));
        }
    }
}