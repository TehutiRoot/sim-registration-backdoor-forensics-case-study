package th.p047co.dtac.android.dtacone.view.appOne.rectify.fragment;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.activity.OneRectifyActivity;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.adapter.OneRectifyAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyListFragment$initView$3$1 */
/* loaded from: classes10.dex */
public final class OneRectifyListFragment$initView$3$1 extends Lambda implements Function1<Resource<? extends List<? extends Object>>, Unit> {
    final /* synthetic */ OneRectifyListFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.fragment.OneRectifyListFragment$initView$3$1$WhenMappings */
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
    public OneRectifyListFragment$initView$3$1(OneRectifyListFragment oneRectifyListFragment) {
        super(1);
        this.this$0 = oneRectifyListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends Object>> resource) {
        invoke2(resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<? extends Object>> resource) {
        OneRectifyViewModel m10494s;
        OneRectifyAdapter oneRectifyAdapter;
        OneRectifyAdapter oneRectifyAdapter2;
        OnePhoneBookEditText onePhoneBookEditText;
        OneRectifyActivity m10497p;
        OneRectifyAdapter oneRectifyAdapter3;
        OneRectifyAdapter oneRectifyAdapter4;
        Resource<? extends List<? extends Object>> resourceContentIfNotHandled = resource.getResourceContentIfNotHandled();
        if (resourceContentIfNotHandled != null) {
            OneRectifyListFragment oneRectifyListFragment = this.this$0;
            int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
            if (i == 1) {
                m10494s = oneRectifyListFragment.m10494s();
                String customerPhoneNumber = m10494s.getCustomerPhoneNumber();
                if (customerPhoneNumber != null && customerPhoneNumber.length() != 0) {
                    onePhoneBookEditText = oneRectifyListFragment.f96107k;
                    if (onePhoneBookEditText == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("onePhoneBookEditText");
                        onePhoneBookEditText = null;
                    }
                    onePhoneBookEditText.setText("");
                    m10497p = oneRectifyListFragment.m10497p();
                    m10497p.addFragment(new OneRectifyPhoneFoundListFragment(), null);
                } else {
                    List<? extends Object> data = resourceContentIfNotHandled.getData();
                    oneRectifyAdapter = oneRectifyListFragment.f96112p;
                    if (oneRectifyAdapter != null) {
                        oneRectifyAdapter.setRectifyList(data);
                    }
                    oneRectifyAdapter2 = oneRectifyListFragment.f96112p;
                    if (oneRectifyAdapter2 != null) {
                        oneRectifyAdapter2.notifyDataSetChanged();
                    }
                }
            } else if (i == 2) {
                oneRectifyAdapter3 = oneRectifyListFragment.f96112p;
                if (oneRectifyAdapter3 != null) {
                    oneRectifyAdapter3.setRectifyList(null);
                }
                oneRectifyAdapter4 = oneRectifyListFragment.f96112p;
                if (oneRectifyAdapter4 != null) {
                    oneRectifyAdapter4.notifyDataSetChanged();
                }
            }
            oneRectifyListFragment.f96113q = true;
            oneRectifyListFragment.m10492u();
        }
    }
}