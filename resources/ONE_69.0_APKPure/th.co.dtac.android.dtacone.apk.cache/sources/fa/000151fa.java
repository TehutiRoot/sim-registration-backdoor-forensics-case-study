package th.p047co.dtac.android.dtacone.view.fragment.multi_sim;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimInprogressBinding;
import th.p047co.dtac.android.dtacone.util.animation.ValueAnimatorListenerKt;
import th.p047co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00068"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimInprogressFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "initView", "", "count", "Lkotlin/Function0;", "end", "p", "(ILkotlin/jvm/functions/Function0;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", OperatorName.MOVE_TO, "Landroid/animation/ValueAnimator;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "animator", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getCount", "()I", "setCount", "(I)V", "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMultiSimInprogressBinding;", OperatorName.CURVE_TO, "Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMultiSimInprogressBinding;", "_binding", "Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;", "o", "()Lth/co/dtac/android/dtacone/view/activity/multi_sim/MrtrPrepaidMultiSimActivity;", "multiSimActivity", "Lth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSimViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/viewmodel/mrtr_prepaid_multi_sim/MrtrPrepaidMultiSimViewModel;", "viewModel", OperatorName.ENDPATH, "()Lth/co/dtac/android/dtacone/databinding/FragmentMrtrMultiSimInprogressBinding;", "binding", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment */
/* loaded from: classes9.dex */
public final class MrtrMultiSimInprogressFragment extends Fragment {

    /* renamed from: a */
    public ValueAnimator f103986a;

    /* renamed from: b */
    public int f103987b;

    /* renamed from: c */
    public FragmentMrtrMultiSimInprogressBinding f103988c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimInprogressFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimInprogressFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    @SourceDebugExtension({"SMAP\nMrtrMultiSimInprogressFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrMultiSimInprogressFragment.kt\nth/co/dtac/android/dtacone/view/fragment/multi_sim/MrtrMultiSimInprogressFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final MrtrMultiSimInprogressFragment newInstance() {
            MrtrMultiSimInprogressFragment mrtrMultiSimInprogressFragment = new MrtrMultiSimInprogressFragment();
            mrtrMultiSimInprogressFragment.setArguments(new Bundle());
            return mrtrMultiSimInprogressFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.multi_sim.MrtrMultiSimInprogressFragment$a */
    /* loaded from: classes9.dex */
    public static final class C16400a implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f103989a;

        public C16400a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f103989a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f103989a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103989a.invoke(obj);
        }
    }

    private final MrtrPrepaidMultiSimViewModel getViewModel() {
        return m4401o().getViewModel();
    }

    private final void initView() {
        m4402n().progress.setMax((getViewModel().getSubscriberListCount() + 1) * 100);
        DtacFontTextView dtacFontTextView = m4402n().tvPercent;
        int i = this.f103987b;
        int subscriberListCount = getViewModel().getSubscriberListCount();
        dtacFontTextView.setText(i + RemoteSettings.FORWARD_SLASH_STRING + subscriberListCount);
    }

    @JvmStatic
    @NotNull
    public static final MrtrMultiSimInprogressFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: o */
    public final MrtrPrepaidMultiSimActivity m4401o() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.multi_sim.MrtrPrepaidMultiSimActivity");
        return (MrtrPrepaidMultiSimActivity) activity;
    }

    /* renamed from: p */
    public final void m4400p(int i, Function0 function0) {
        ValueAnimator ofInt = ValueAnimator.ofInt(m4402n().progress.getProgress(), i * 100);
        this.f103986a = ofInt;
        if (ofInt != null) {
            ofInt.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.f103986a;
        if (valueAnimator != null) {
            valueAnimator.setStartDelay(0L);
        }
        ValueAnimator valueAnimator2 = this.f103986a;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(600L);
        }
        ValueAnimator valueAnimator3 = this.f103986a;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Bx0
                {
                    MrtrMultiSimInprogressFragment.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    MrtrMultiSimInprogressFragment.m4399q(MrtrMultiSimInprogressFragment.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f103986a;
        if (valueAnimator4 != null) {
            ValueAnimatorListenerKt.listenerEnd(valueAnimator4, new MrtrMultiSimInprogressFragment$startAnimation$2(function0));
        }
        ValueAnimator valueAnimator5 = this.f103986a;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    /* renamed from: q */
    public static final void m4399q(MrtrMultiSimInprogressFragment this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.m4402n().progress.setProgress(((Integer) animatedValue).intValue());
    }

    @Nullable
    public final ValueAnimator getAnimator() {
        return this.f103986a;
    }

    public final int getCount() {
        return this.f103987b;
    }

    /* renamed from: m */
    public final void m4403m() {
        m4400p(this.f103987b + 1, MrtrMultiSimInprogressFragment$callSubmit$1.INSTANCE);
        getViewModel().callSubmit();
        MrtrPrepaidMultiSimViewModel viewModel = getViewModel();
        viewModel.getSubmitLiveData().observe(getViewLifecycleOwner(), new C16400a(new MrtrMultiSimInprogressFragment$callSubmit$2$1(this, viewModel)));
    }

    /* renamed from: n */
    public final FragmentMrtrMultiSimInprogressBinding m4402n() {
        FragmentMrtrMultiSimInprogressBinding fragmentMrtrMultiSimInprogressBinding = this.f103988c;
        Intrinsics.checkNotNull(fragmentMrtrMultiSimInprogressBinding);
        return fragmentMrtrMultiSimInprogressBinding;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f103988c = FragmentMrtrMultiSimInprogressBinding.inflate(inflater, viewGroup, false);
        return m4402n().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m4401o().closeToolbarBackButton();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        m4401o().closeToolbarBackButton();
        initView();
        m4403m();
    }

    public final void setAnimator(@Nullable ValueAnimator valueAnimator) {
        this.f103986a = valueAnimator;
    }

    public final void setCount(int i) {
        this.f103987b = i;
    }
}