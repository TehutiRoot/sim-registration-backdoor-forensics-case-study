package th.p047co.dtac.android.dtacone.view.fragment.eSIM;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.view.ActivityExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.animation.ValueAnimatorListenerKt;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.view.activity.eSIM.ESimActivity;
import th.p047co.dtac.android.dtacone.view.fragment.BaseFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment;
import th.p047co.dtac.android.dtacone.viewmodel.esim.ESimViewModel;
import th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\rR\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00108\u001a\n 6*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006B"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimInProgressFragment;", "Lth/co/dtac/android/dtacone/view/fragment/BaseFragment;", "<init>", "()V", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "", OperatorName.SAVE, "()I", OperatorName.ENDPATH, "", "code", OperatorName.CLOSE_AND_STROKE, "(Ljava/lang/String;)V", "count", "Lkotlin/Function0;", "end", "t", "(ILkotlin/jvm/functions/Function0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Landroid/view/View;)V", "navigateNext", "getScreenName", "()Ljava/lang/String;", "tagError", "o", "Landroid/animation/ValueAnimator;", "i", "Landroid/animation/ValueAnimator;", "animator", OperatorName.SET_LINE_JOINSTYLE, "I", "retryCount", OperatorName.NON_STROKING_CMYK, "Landroid/widget/ProgressBar;", OperatorName.LINE_TO, "Landroid/widget/ProgressBar;", "progress", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", OperatorName.MOVE_TO, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvPercent", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Lth/co/dtac/android/dtacone/view/activity/eSIM/ESimActivity;", "p", "()Lth/co/dtac/android/dtacone/view/activity/eSIM/ESimActivity;", "eSimActivity", "Lth/co/dtac/android/dtacone/viewmodel/esim/ESimViewModel;", "getViewModel", "()Lth/co/dtac/android/dtacone/viewmodel/esim/ESimViewModel;", "viewModel", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment */
/* loaded from: classes9.dex */
public final class ESimInProgressFragment extends BaseFragment {

    /* renamed from: i */
    public ValueAnimator f100363i;

    /* renamed from: k */
    public int f100365k;

    /* renamed from: l */
    public ProgressBar f100366l;

    /* renamed from: m */
    public DtacFontTextView f100367m;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: j */
    public int f100364j = 1;

    /* renamed from: n */
    public final String f100368n = ESimInProgressFragment.class.getSimpleName();

    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimInProgressFragment$Companion;", "", "()V", "newInstance", "Lth/co/dtac/android/dtacone/view/fragment/eSIM/ESimInProgressFragment;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ESimInProgressFragment newInstance() {
            ESimInProgressFragment eSimInProgressFragment = new ESimInProgressFragment();
            eSimInProgressFragment.setArguments(new Bundle());
            return eSimInProgressFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$a */
    /* loaded from: classes9.dex */
    public static final class C16028a implements Observer {
        public C16028a() {
            ESimInProgressFragment.this = r1;
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a */
        public final void onChanged(Resource resource) {
            Resource resourceContentIfNotHandled;
            String str;
            if (resource != null && (resourceContentIfNotHandled = resource.getResourceContentIfNotHandled()) != null) {
                ESimInProgressFragment eSimInProgressFragment = ESimInProgressFragment.this;
                if (resourceContentIfNotHandled.getStatus() == StatusResource.SUCCESS && (str = (String) resourceContentIfNotHandled.getData()) != null) {
                    eSimInProgressFragment.m7788s(str);
                }
            }
        }
    }

    /* renamed from: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$b */
    /* loaded from: classes9.dex */
    public static final class C16029b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f100370a;

        public C16029b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f100370a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f100370a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f100370a.invoke(obj);
        }
    }

    public final ESimViewModel getViewModel() {
        return m7791p().getESimViewModel();
    }

    /* renamed from: n */
    private final void m7793n() {
        ESimViewModel viewModel = getViewModel();
        viewModel.checkCallValidate();
        viewModel.getInProgressLiveData().observe(getViewLifecycleOwner(), new C16029b(new ESimInProgressFragment$callAPI$1$1(this, viewModel)));
        viewModel.getShowDialogWarningSimConfirm().observe(getViewLifecycleOwner(), new C16028a());
    }

    @JvmStatic
    @NotNull
    public static final ESimInProgressFragment newInstance() {
        return Companion.newInstance();
    }

    /* renamed from: p */
    private final ESimActivity m7791p() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.eSIM.ESimActivity");
        return (ESimActivity) activity;
    }

    /* renamed from: q */
    public final int m7790q() {
        if (getViewModel().isCheckSimStock()) {
            return 3;
        }
        return 2;
    }

    /* renamed from: r */
    private final void m7789r() {
        ProgressBar progressBar = this.f100366l;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        }
        progressBar.setMax((m7790q() + 1) * 100);
    }

    /* renamed from: s */
    public final void m7788s(String str) {
        String format = new SimpleDateFormat(DateUtil.FORMAT_ERROR_FULL_DATE_TIME, Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "sdf.format(Date())");
        MrtrDialogBoxConfirm.Companion companion = MrtrDialogBoxConfirm.Companion;
        final MrtrDialogBoxConfirm newInstance$default = MrtrDialogBoxConfirm.Companion.newInstance$default(companion, null, "ขออภัยค่ะ ไม่พบซิมนี้ในคลังของคุณ\nยืนยันการทำรายการใช่หรือไม่?", "วันที่ " + format + "\ncode: " + str, getString(R.string.cancel_text), getString(R.string.confirm_text), false, 33, null);
        newInstance$default.setOnClickListener(new MrtrDialogBoxConfirm.OnClickButtonListener() { // from class: th.co.dtac.android.dtacone.view.fragment.eSIM.ESimInProgressFragment$showMrtrErrorDialogConfirm$dialog$1$1
            @Override // th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm.OnClickButtonListener
            public void onClickLeftButton() {
                ESimViewModel viewModel;
                viewModel = ESimInProgressFragment.this.getViewModel();
                viewModel.resetInProgressLiveData();
                FragmentManager fragmentManager = newInstance$default.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.popBackStack();
                }
            }

            @Override // th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogBoxConfirm.OnClickButtonListener
            public void onClickRightButton() {
                int m7790q;
                int i;
                ESimInProgressFragment eSimInProgressFragment = ESimInProgressFragment.this;
                m7790q = eSimInProgressFragment.m7790q();
                eSimInProgressFragment.f100365k = m7790q + 1;
                ESimInProgressFragment eSimInProgressFragment2 = ESimInProgressFragment.this;
                i = eSimInProgressFragment2.f100365k;
                eSimInProgressFragment2.m7787t(i, new C16030x2c21ad50(ESimInProgressFragment.this));
            }
        });
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            fragmentManager.beginTransaction();
            newInstance$default.show(fragmentManager, (String) null);
        }
    }

    /* renamed from: t */
    public final void m7787t(int i, Function0 function0) {
        ProgressBar progressBar = this.f100366l;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(progressBar.getProgress(), i * 100);
        this.f100363i = ofInt;
        if (ofInt != null) {
            ofInt.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.f100363i;
        if (valueAnimator != null) {
            valueAnimator.setStartDelay(0L);
        }
        ValueAnimator valueAnimator2 = this.f100363i;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(600L);
        }
        ValueAnimator valueAnimator3 = this.f100363i;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bN
                {
                    ESimInProgressFragment.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    ESimInProgressFragment.m7786u(ESimInProgressFragment.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f100363i;
        if (valueAnimator4 != null) {
            ValueAnimatorListenerKt.listenerEnd(valueAnimator4, new ESimInProgressFragment$startAnimation$2(function0));
        }
        ValueAnimator valueAnimator5 = this.f100363i;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    /* renamed from: u */
    public static final void m7786u(ESimInProgressFragment this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ProgressBar progressBar = this$0.f100366l;
        DtacFontTextView dtacFontTextView = null;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar = null;
        }
        progressBar.setProgress(intValue);
        ProgressBar progressBar2 = this$0.f100366l;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar2 = null;
        }
        float progress = progressBar2.getProgress();
        ProgressBar progressBar3 = this$0.f100366l;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progress");
            progressBar3 = null;
        }
        float max = (progress / progressBar3.getMax()) * 100.0f;
        DtacFontTextView dtacFontTextView2 = this$0.f100367m;
        if (dtacFontTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvPercent");
        } else {
            dtacFontTextView = dtacFontTextView2;
        }
        dtacFontTextView.setText(((int) max) + "%");
    }

    public final void bindView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R.id.progress);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.progress)");
        this.f100366l = (ProgressBar) findViewById;
        View findViewById2 = view.findViewById(R.id.tvPercent);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tvPercent)");
        this.f100367m = (DtacFontTextView) findViewById2;
    }

    @Override // th.p047co.dtac.android.dtacone.view.fragment.BaseFragment
    @NotNull
    public String getScreenName() {
        String name = ESimInProgressFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ESimInProgressFragment::class.java.name");
        return name;
    }

    public final void navigateNext() {
        getViewModel().resetInProgressLiveData();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.eSIM.ESimActivity");
        ((ESimActivity) activity).showToolbarBackButton();
        m7791p().replaceFragment(ESimCommonFragment.Companion.newInstance(ESimSelectNumberFragment.TAG), null);
    }

    /* renamed from: o */
    public final void m7792o(String str) {
        this.f100364j++;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(R.string.dialog_title_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.dialog_title_error)");
            String string2 = getString(R.string.esim_error_message_loading);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.esim_error_message_loading)");
            String string3 = getString(R.string.cancel_text);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.cancel_text)");
            String string4 = getString(R.string.try_again);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.try_again)");
            Dialog createConfirmDialog = ActivityExtKt.createConfirmDialog(activity, string, string2, string3, string4, Float.valueOf(20.0f), Float.valueOf(14.0f), Boolean.FALSE, new ESimInProgressFragment$dialogTryAgain$1(this), new ESimInProgressFragment$dialogTryAgain$2(this, str));
            if (createConfirmDialog != null) {
                createConfirmDialog.show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_esim_in_progress, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        bindView(view);
        m7789r();
        m7793n();
    }
}