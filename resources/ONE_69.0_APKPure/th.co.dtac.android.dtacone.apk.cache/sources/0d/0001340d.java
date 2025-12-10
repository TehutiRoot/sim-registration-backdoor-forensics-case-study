package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.extension.DividerItemDecorator;
import th.p047co.dtac.android.dtacone.databinding.FragmentOneNadOutboundFilterDialogBinding;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.adapter.OneNadOutboundSelectFilterListAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/dialog/OneNadOutboundFilterDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lth/co/dtac/android/dtacone/databinding/FragmentOneNadOutboundFilterDialogBinding;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/databinding/FragmentOneNadOutboundFilterDialogBinding;", "binding", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSelectFilterListAdapter;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/adapter/OneNadOutboundSelectFilterListAdapter;", "oneNadOutboundSelectFilterListAdapter", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity;", PDPageLabelRange.STYLE_ROMAN_LOWER, "()Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/activity/OneNadOutboundActivity;", "nadOutboundActivity", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/viewModel/OneNadOutboundViewModel;", OperatorName.CLOSE_AND_STROKE, "()Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/viewModel/OneNadOutboundViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneNadOutboundFilterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundFilterDialogFragment.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/dialog/OneNadOutboundFilterDialogFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.dialog.OneNadOutboundFilterDialogFragment */
/* loaded from: classes10.dex */
public final class OneNadOutboundFilterDialogFragment extends BottomSheetDialogFragment {

    /* renamed from: b */
    public FragmentOneNadOutboundFilterDialogBinding f92287b;

    /* renamed from: c */
    public OneNadOutboundSelectFilterListAdapter f92288c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/dialog/OneNadOutboundFilterDialogFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/appOne/nadOutbound/dialog/OneNadOutboundFilterDialogFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nOneNadOutboundFilterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundFilterDialogFragment.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/dialog/OneNadOutboundFilterDialogFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.dialog.OneNadOutboundFilterDialogFragment$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneNadOutboundFilterDialogFragment newInstance() {
            OneNadOutboundFilterDialogFragment oneNadOutboundFilterDialogFragment = new OneNadOutboundFilterDialogFragment();
            oneNadOutboundFilterDialogFragment.setArguments(new Bundle());
            return oneNadOutboundFilterDialogFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: r */
    private final OneNadOutboundActivity m13377r() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.nadOutbound.activity.OneNadOutboundActivity");
        return (OneNadOutboundActivity) activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final OneNadOutboundViewModel m13376s() {
        return m13377r().getOneNadOutboundViewModel();
    }

    /* renamed from: t */
    private final void m13375t() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        OneNadOutboundViewModel m13376s = m13376s();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        this.f92288c = new OneNadOutboundSelectFilterListAdapter(m13376s.getFilterList(requireContext), new OneNadOutboundFilterDialogFragment$setupView$1(this));
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.one_divider_item);
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        DividerItemDecorator dividerItemDecorator = new DividerItemDecorator(drawable, 1, false, requireContext2);
        FragmentOneNadOutboundFilterDialogBinding fragmentOneNadOutboundFilterDialogBinding = this.f92287b;
        OneNadOutboundSelectFilterListAdapter oneNadOutboundSelectFilterListAdapter = null;
        if (fragmentOneNadOutboundFilterDialogBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentOneNadOutboundFilterDialogBinding = null;
        }
        RecyclerView recyclerView = fragmentOneNadOutboundFilterDialogBinding.selectFilterRecyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(dividerItemDecorator);
        recyclerView.setHasFixedSize(true);
        OneNadOutboundSelectFilterListAdapter oneNadOutboundSelectFilterListAdapter2 = this.f92288c;
        if (oneNadOutboundSelectFilterListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("oneNadOutboundSelectFilterListAdapter");
        } else {
            oneNadOutboundSelectFilterListAdapter = oneNadOutboundSelectFilterListAdapter2;
        }
        recyclerView.setAdapter(oneNadOutboundSelectFilterListAdapter);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.MyTransparentBottomSheetDialogTheme);
        getArguments();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOneNadOutboundFilterDialogBinding inflate = FragmentOneNadOutboundFilterDialogBinding.inflate(inflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(inflater, container, false)");
        this.f92287b = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m13375t();
    }
}