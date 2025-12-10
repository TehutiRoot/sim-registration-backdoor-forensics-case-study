package th.p047co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneGroupListCollection;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneStvGroupListCollection;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "Lth/co/dtac/android/dtacone/app_one/model/stv/OneStvGroupListCollection;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneProsermOnlineInputNumberFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneProsermOnlineInputNumberFragment.kt\nth/co/dtac/android/dtacone/view/appOne/stvProSermOnline/fragment/OneProsermOnlineInputNumberFragment$initViewModel$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1238:1\n1#2:1239\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$2 */
/* loaded from: classes10.dex */
public final class OneProsermOnlineInputNumberFragment$initViewModel$1$2 extends Lambda implements Function1<Resource<? extends OneStvGroupListCollection>, Unit> {
    final /* synthetic */ OneProsermOnlineInputNumberFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.stvProSermOnline.fragment.OneProsermOnlineInputNumberFragment$initViewModel$1$2$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StatusResource.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneProsermOnlineInputNumberFragment$initViewModel$1$2(OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment) {
        super(1);
        this.this$0 = oneProsermOnlineInputNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends OneStvGroupListCollection> resource) {
        invoke2((Resource<OneStvGroupListCollection>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<OneStvGroupListCollection> resource) {
        if (resource != null) {
            OneProsermOnlineInputNumberFragment oneProsermOnlineInputNumberFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                String string = oneProsermOnlineInputNumberFragment.getString(R.string.stv_package_not_found);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.stv_package_not_found)");
                oneProsermOnlineInputNumberFragment.showError(string);
                return;
            }
            OneStvGroupListCollection data = resource.getData();
            OneGroupListCollection stvGroupListCollection = data != null ? data.getStvGroupListCollection() : null;
            if (stvGroupListCollection != null) {
                oneProsermOnlineInputNumberFragment.m9789j0(stvGroupListCollection);
            }
        }
    }
}