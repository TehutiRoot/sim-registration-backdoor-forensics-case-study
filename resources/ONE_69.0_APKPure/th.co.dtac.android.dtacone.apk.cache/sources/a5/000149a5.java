package th.p047co.dtac.android.dtacone.view.fragment.change_pack;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.p052enum.PackageType;
import th.p047co.dtac.android.dtacone.viewmodel.change_pack.ChangePackViewModel;
import th.p047co.dtac.android.dtacone.widget.BigTabLayout;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSelectPackageFragment$onStart$1$5$onChanged$1$2 */
/* loaded from: classes9.dex */
public final class ChangePackSelectPackageFragment$onStart$1$5$onChanged$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChangePackViewModel $this_apply;
    final /* synthetic */ Object $toTab;
    final /* synthetic */ ChangePackSelectPackageFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.change_pack.ChangePackSelectPackageFragment$onStart$1$5$onChanged$1$2$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageType.values().length];
            try {
                iArr[PackageType.MainPackage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageType.AddtionalPackage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePackSelectPackageFragment$onStart$1$5$onChanged$1$2(ChangePackViewModel changePackViewModel, ChangePackSelectPackageFragment changePackSelectPackageFragment, Object obj) {
        super(0);
        this.$this_apply = changePackViewModel;
        this.this$0 = changePackSelectPackageFragment;
        this.$toTab = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_apply.setSelectedFromOfferList(false);
        this.this$0.m8663s().tabChangePackage.setLockSelectView(false);
        int i = WhenMappings.$EnumSwitchMapping$0[((PackageType) this.$toTab).ordinal()];
        if (i == 1) {
            BigTabLayout bigTabLayout = this.this$0.m8663s().tabChangePackage;
            Intrinsics.checkNotNullExpressionValue(bigTabLayout, "binding.tabChangePackage");
            BigTabLayout.selectLeftTab$default(bigTabLayout, false, 1, null);
        } else if (i != 2) {
        } else {
            BigTabLayout bigTabLayout2 = this.this$0.m8663s().tabChangePackage;
            Intrinsics.checkNotNullExpressionValue(bigTabLayout2, "binding.tabChangePackage");
            BigTabLayout.selectRightTab$default(bigTabLayout2, false, 1, null);
        }
    }
}