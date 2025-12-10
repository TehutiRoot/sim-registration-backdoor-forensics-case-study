package th.p047co.dtac.android.dtacone.view.appOne.rectify.fragment;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyPhoneFoundListFragment$initView$1$1 */
/* loaded from: classes10.dex */
public final class OneRectifyPhoneFoundListFragment$initView$1$1 extends Lambda implements Function1<Resource<? extends List<? extends Object>>, Unit> {
    final /* synthetic */ OneRectifyPhoneFoundListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyPhoneFoundListFragment$initView$1$1$WhenMappings */
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
    public OneRectifyPhoneFoundListFragment$initView$1$1(OneRectifyPhoneFoundListFragment oneRectifyPhoneFoundListFragment) {
        super(1);
        this.this$0 = oneRectifyPhoneFoundListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends Object>> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<? extends Object>> resource) {
        OneRectifyAdapter oneRectifyAdapter;
        OneRectifyAdapter oneRectifyAdapter2;
        if (WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] != 1) {
            return;
        }
        List<? extends Object> data = resource.getData();
        oneRectifyAdapter = this.this$0.f96128n;
        if (oneRectifyAdapter != null) {
            oneRectifyAdapter.setRectifyList(data);
        }
        oneRectifyAdapter2 = this.this$0.f96128n;
        if (oneRectifyAdapter2 != null) {
            oneRectifyAdapter2.notifyDataSetChanged();
        }
    }
}