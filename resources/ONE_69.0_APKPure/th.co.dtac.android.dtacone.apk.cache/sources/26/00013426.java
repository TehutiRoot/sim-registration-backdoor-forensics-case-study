package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSearchAdapter;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/Resource;", "", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OneNadOutboundSearchFragment$setupObserve$1$2 extends Lambda implements Function1<Resource<? extends List<? extends OneNadOutboundBillingItem>>, Unit> {
    final /* synthetic */ OneNadOutboundSearchFragment this$0;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment$setupObserve$1$2$WhenMappings */
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
    public OneNadOutboundSearchFragment$setupObserve$1$2(OneNadOutboundSearchFragment oneNadOutboundSearchFragment) {
        super(1);
        this.this$0 = oneNadOutboundSearchFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends List<? extends OneNadOutboundBillingItem>> resource) {
        invoke2((Resource<? extends List<OneNadOutboundBillingItem>>) resource);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r8v23, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Resource<? extends List<OneNadOutboundBillingItem>> resource) {
        Resource<? extends List<OneNadOutboundBillingItem>> resourceContentIfNotHandled;
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        RecyclerView recyclerView2;
        EditText editText;
        RecyclerView recyclerView3;
        EditText editText2;
        ConstraintLayout constraintLayout3;
        ?? r8;
        ConstraintLayout constraintLayout4;
        RecyclerView recyclerView4;
        ConstraintLayout constraintLayout5;
        TextView textView;
        ?? r82;
        if (resource == null || (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) == null) {
            return;
        }
        OneNadOutboundSearchFragment oneNadOutboundSearchFragment = this.this$0;
        int i = WhenMappings.$EnumSwitchMapping$0[resourceContentIfNotHandled.getStatus().ordinal()];
        EditText editText3 = null;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            recyclerView4 = oneNadOutboundSearchFragment.f92305r;
            if (recyclerView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNadList");
                recyclerView4 = null;
            }
            ViewVisibleExtKt.toGone(recyclerView4);
            constraintLayout5 = oneNadOutboundSearchFragment.f92306s;
            if (constraintLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                constraintLayout5 = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout5);
            textView = oneNadOutboundSearchFragment.f92310w;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRetryText");
                textView = null;
            }
            textView.setText(resourceContentIfNotHandled.getMessage());
            r82 = oneNadOutboundSearchFragment.f92307t;
            if (r82 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            } else {
                editText3 = r82;
            }
            ViewVisibleExtKt.toVisible(editText3);
            return;
        }
        List<OneNadOutboundBillingItem> data = resourceContentIfNotHandled.getData();
        if (data == null) {
            data = new ArrayList<>();
        }
        if (data.isEmpty()) {
            recyclerView3 = oneNadOutboundSearchFragment.f92305r;
            if (recyclerView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNadList");
                recyclerView3 = null;
            }
            ViewVisibleExtKt.toGone(recyclerView3);
            editText2 = oneNadOutboundSearchFragment.f92296i;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
                editText2 = null;
            }
            if (Intrinsics.areEqual(editText2.getText().toString(), "")) {
                constraintLayout4 = oneNadOutboundSearchFragment.f92306s;
                if (constraintLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                    constraintLayout4 = null;
                }
                ViewVisibleExtKt.toGone(constraintLayout4);
            } else {
                constraintLayout3 = oneNadOutboundSearchFragment.f92306s;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                    constraintLayout3 = null;
                }
                ViewVisibleExtKt.toVisible(constraintLayout3);
            }
            r8 = oneNadOutboundSearchFragment.f92307t;
            if (r8 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
            } else {
                editText3 = r8;
            }
            ViewVisibleExtKt.toGone(editText3);
        } else {
            recyclerView = oneNadOutboundSearchFragment.f92305r;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNadList");
                recyclerView = null;
            }
            ViewVisibleExtKt.toVisible(recyclerView);
            constraintLayout = oneNadOutboundSearchFragment.f92306s;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutNotFound");
                constraintLayout = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout);
            constraintLayout2 = oneNadOutboundSearchFragment.f92307t;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                constraintLayout2 = null;
            }
            ViewVisibleExtKt.toGone(constraintLayout2);
            recyclerView2 = oneNadOutboundSearchFragment.f92305r;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rvNadList");
                recyclerView2 = null;
            }
            Context requireContext = oneNadOutboundSearchFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            List<OneNadOutboundBillingItem> data2 = resourceContentIfNotHandled.getData();
            if (data2 == null) {
                data2 = new ArrayList<>();
            }
            editText = oneNadOutboundSearchFragment.f92296i;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSearchBox");
            } else {
                editText3 = editText;
            }
            recyclerView2.setAdapter(new OneNadOutboundSearchAdapter(requireContext, data2, editText3.getText().toString(), new OneNadOutboundSearchFragment$setupObserve$1$2$1$1$1(oneNadOutboundSearchFragment)));
        }
        oneNadOutboundSearchFragment.m13338Q();
    }
}