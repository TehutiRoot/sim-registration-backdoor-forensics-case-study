package th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary;

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
import th.p047co.dtac.android.dtacone.model.customerenquiry.CurrentPackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.MrtrPackageInfoResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.PackageItem;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/model/customerenquiry/MrtrPackageInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMainPackageSummaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPackageSummaryFragment.kt\nth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/MainPackageSummaryFragment$onViewCreated$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1549#2:289\n1620#2,3:290\n1549#2:293\n1620#2,3:294\n*S KotlinDebug\n*F\n+ 1 MainPackageSummaryFragment.kt\nth/co/dtac/android/dtacone/view/fragment/customerenquiry/package_summary/MainPackageSummaryFragment$onViewCreated$3\n*L\n94#1:289\n94#1:290,3\n106#1:293\n106#1:294,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.MainPackageSummaryFragment$onViewCreated$3 */
/* loaded from: classes9.dex */
public final class MainPackageSummaryFragment$onViewCreated$3 extends Lambda implements Function1<Resource<? extends MrtrPackageInfoResponse>, Unit> {
    final /* synthetic */ MainPackageSummaryFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.customerenquiry.package_summary.MainPackageSummaryFragment$onViewCreated$3$WhenMappings */
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
    public MainPackageSummaryFragment$onViewCreated$3(MainPackageSummaryFragment mainPackageSummaryFragment) {
        super(1);
        this.this$0 = mainPackageSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends MrtrPackageInfoResponse> resource) {
        invoke2((Resource<MrtrPackageInfoResponse>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<MrtrPackageInfoResponse> resource) {
        MrtrPackageInfoResponse data;
        CurrentPackage currentPackage;
        ZIncludePackageSummaryBinding m8283o;
        ZIncludePackageSummaryBinding m8283o2;
        ZIncludePackageSummaryBinding m8283o3;
        ZIncludePackageSummaryBinding m8283o4;
        ZIncludePackageSummaryBinding m8283o5;
        ZIncludePackageSummaryBinding m8283o6;
        ZIncludePackageSummaryBinding m8283o7;
        if (resource != null) {
            MainPackageSummaryFragment mainPackageSummaryFragment = this.this$0;
            if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] != 1 || (data = resource.getData()) == null || (currentPackage = data.getCurrentPackage()) == null) {
                return;
            }
            mainPackageSummaryFragment.m8285m(currentPackage);
            m8283o = mainPackageSummaryFragment.m8283o();
            DtacFontTextView dtacFontTextView = m8283o.tvMainPack;
            String packageGroupCode = currentPackage.getPackageGroupCode();
            String packageGroupDescription = currentPackage.getPackageGroupDescription();
            dtacFontTextView.setText("[" + packageGroupCode + "] " + packageGroupDescription);
            List<PackageItem> mainPackage = currentPackage.getMainPackage();
            if (mainPackage == null || mainPackage.isEmpty()) {
                m8283o2 = mainPackageSummaryFragment.m8283o();
                ConstraintLayout constraintLayout = m8283o2.layoutMainPack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "summary.layoutMainPack");
                ViewVisibleExtKt.toGone(constraintLayout);
            } else {
                m8283o6 = mainPackageSummaryFragment.m8283o();
                ConstraintLayout constraintLayout2 = m8283o6.layoutMainPack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "summary.layoutMainPack");
                ViewVisibleExtKt.toVisible(constraintLayout2);
                List<PackageItem> mainPackage2 = currentPackage.getMainPackage();
                ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(mainPackage2, 10));
                for (PackageItem packageItem : mainPackage2) {
                    packageItem.setPackageGroupCode(currentPackage.getPackageGroupCode());
                    packageItem.setPage(PACKAGE_SUMMARY.MAIN_PAGE);
                    packageItem.setType(PACKAGE_SUMMARY.MAIN_PACKAGE);
                    arrayList.add(packageItem);
                }
                m8283o7 = mainPackageSummaryFragment.m8283o();
                m8283o7.listMainPackage.setAdapter(new PackageSummaryAdapter(arrayList, mainPackageSummaryFragment));
            }
            List<PackageItem> additionalPackage = currentPackage.getAdditionalPackage();
            if (additionalPackage == null || additionalPackage.isEmpty()) {
                m8283o3 = mainPackageSummaryFragment.m8283o();
                ConstraintLayout constraintLayout3 = m8283o3.layoutOtherPack;
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "summary.layoutOtherPack");
                ViewVisibleExtKt.toGone(constraintLayout3);
                return;
            }
            m8283o4 = mainPackageSummaryFragment.m8283o();
            ConstraintLayout constraintLayout4 = m8283o4.layoutOtherPack;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "summary.layoutOtherPack");
            ViewVisibleExtKt.toVisible(constraintLayout4);
            List<PackageItem> additionalPackage2 = currentPackage.getAdditionalPackage();
            ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(additionalPackage2, 10));
            for (PackageItem packageItem2 : additionalPackage2) {
                packageItem2.setPackageGroupCode(currentPackage.getPackageGroupCode());
                packageItem2.setPage(PACKAGE_SUMMARY.MAIN_PAGE);
                packageItem2.setType(PACKAGE_SUMMARY.ADDITIONAL_PACKAGE);
                arrayList2.add(packageItem2);
            }
            m8283o5 = mainPackageSummaryFragment.m8283o();
            m8283o5.listAdditionalPackage.setAdapter(new PackageSummaryAdapter(arrayList2, mainPackageSummaryFragment));
        }
    }
}