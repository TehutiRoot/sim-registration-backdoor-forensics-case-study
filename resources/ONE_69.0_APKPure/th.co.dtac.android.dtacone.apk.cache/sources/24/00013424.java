package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment;

import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setupObserve$1$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundSearchFragment$setupObserve$1$1 extends Lambda implements Function1<Resource<? extends String>, Unit> {
    final /* synthetic */ OneNadOutboundSearchFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setupObserve$1$1$WhenMappings */
    /* loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusResource.values().length];
            try {
                iArr[StatusResource.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundSearchFragment$setupObserve$1$1(OneNadOutboundSearchFragment oneNadOutboundSearchFragment) {
        super(1);
        this.this$0 = oneNadOutboundSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends String> resource) {
        invoke2((Resource<String>) resource);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<String> resource) {
        Resource<String> resourceContentIfNotHandled;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        EditText editText;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        TextView textView;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneNadOutboundSearchFragment oneNadOutboundSearchFragment = this.this$0;
        if (WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()] == 1) {
            recyclerView = oneNadOutboundSearchFragment.f92305r;
            ConstraintLayout constraintLayout4 = null;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNadList");
                recyclerView = null;
            }
            ViewVisibleExtKt.toGone(recyclerView);
            constraintLayout = oneNadOutboundSearchFragment.f92307t;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout);
            String data = resourceContentIfNotHandled.getData();
            if (data != null) {
                textView = oneNadOutboundSearchFragment.f92309v;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvSearchNotFound");
                    textView = null;
                }
                textView.setText(data);
            }
            editText = oneNadOutboundSearchFragment.f92296i;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
                editText = null;
            }
            if (Intrinsics.areEqual(editText.getText().toString(), "")) {
                constraintLayout3 = oneNadOutboundSearchFragment.f92306s;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                } else {
                    constraintLayout4 = constraintLayout3;
                }
                ViewVisibleExtKt.toGone(constraintLayout4);
            } else {
                constraintLayout2 = oneNadOutboundSearchFragment.f92306s;
                if (constraintLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                } else {
                    constraintLayout4 = constraintLayout2;
                }
                ViewVisibleExtKt.toVisible(constraintLayout4);
            }
            oneNadOutboundSearchFragment.m13338Q();
        }
    }
}