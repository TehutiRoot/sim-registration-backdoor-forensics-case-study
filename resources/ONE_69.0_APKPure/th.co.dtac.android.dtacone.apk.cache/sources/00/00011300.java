package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.repository.model.SimData;
import th.p047co.dtac.android.dtacone.app_one.util.p048enum.RegistrationType;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.registration.adapter.OneRtrAndPhoneAdapter;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00042\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0019j\b\u0012\u0004\u0012\u00020\n`\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R2\u0010@\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneRtrPhoneDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "initView", "Landroid/view/View;", Promotion.ACTION_VIEW, "binding", "(Landroid/view/View;)V", "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", OperatorName.CLOSE_AND_STROKE, "setLastSelectedItem", "(Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;)V", Constant.ServiceAPIName.onStart, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", UriUtil.LOCAL_RESOURCE_SCHEME, "setData", "(Ljava/util/ArrayList;)V", OperatorName.SAVE, PDPageLabelRange.STYLE_ROMAN_LOWER, "Landroidx/recyclerview/widget/RecyclerView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/recyclerview/widget/RecyclerView;", "rvRtrAndPhone", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", MessageBundle.TITLE_ENTRY, "Landroid/widget/ImageView;", OperatorName.CURVE_TO, "Landroid/widget/ImageView;", "close", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "d", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonRed;", "btnRequestOTP", "Lth/co/dtac/android/dtacone/view/appOne/registration/adapter/OneRtrAndPhoneAdapter;", "e", "Lkotlin/Lazy;", "o", "()Lth/co/dtac/android/dtacone/view/appOne/registration/adapter/OneRtrAndPhoneAdapter;", "oneRtrAndPhoneAdapter", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "selectItem", "Lkotlin/Function1;", OperatorName.NON_STROKING_GRAY, "Lkotlin/jvm/functions/Function1;", "getOnButtonClick", "()Lkotlin/jvm/functions/Function1;", "setOnButtonClick", "(Lkotlin/jvm/functions/Function1;)V", "onButtonClick", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog */
/* loaded from: classes7.dex */
public final class OneRtrPhoneDialog extends DialogFragment {

    /* renamed from: a */
    public RecyclerView f83090a;

    /* renamed from: b */
    public OneFontTextView f83091b;

    /* renamed from: c */
    public ImageView f83092c;

    /* renamed from: d */
    public OneButtonRed f83093d;

    /* renamed from: e */
    public final Lazy f83094e = LazyKt__LazyJVMKt.lazy(OneRtrPhoneDialog$oneRtrAndPhoneAdapter$2.INSTANCE);

    /* renamed from: f */
    public SimData f83095f;

    /* renamed from: g */
    public Function1 f83096g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneRtrPhoneDialog$Companion;", "", "()V", "EXTRA_TYPE", "", "newInstance", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneRtrPhoneDialog;", "registrationType", "Lth/co/dtac/android/dtacone/app_one/util/enum/RegistrationType;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneRtrPhoneDialog newInstance(@NotNull RegistrationType registrationType) {
            Intrinsics.checkNotNullParameter(registrationType, "registrationType");
            OneRtrPhoneDialog oneRtrPhoneDialog = new OneRtrPhoneDialog();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_TYPE", registrationType);
            oneRtrPhoneDialog.setArguments(bundle);
            return oneRtrPhoneDialog;
        }

        public Companion() {
        }
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneRtrPhoneDialog$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegistrationType.values().length];
            try {
                iArr[RegistrationType.PhoneMultiple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void binding(View view) {
        View findViewById = view.findViewById(R.id.rvRtrAndPhone);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.rvRtrAndPhone)");
        this.f83090a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.title)");
        this.f83091b = (OneFontTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.close);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.close)");
        this.f83092c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.btnRequestOTP);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.btnRequestOTP)");
        this.f83093d = (OneButtonRed) findViewById4;
    }

    private final void initView() {
        m19898r();
        RecyclerView recyclerView = this.f83090a;
        OneButtonRed oneButtonRed = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rvRtrAndPhone");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(m19901o());
        OneRtrAndPhoneAdapter m19901o = m19901o();
        m19901o.setOnSelectItem(new OneRtrPhoneDialog$initView$2$1(this));
        m19901o.setLastSelected(this.f83095f);
        ImageView imageView = this.f83092c;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("close");
            imageView = null;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: Kc1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneRtrPhoneDialog.m19902n(OneRtrPhoneDialog.this, view);
            }
        });
        OneButtonRed oneButtonRed2 = this.f83093d;
        if (oneButtonRed2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnRequestOTP");
        } else {
            oneButtonRed = oneButtonRed2;
        }
        OnSingleClickListenerKt.setOnSingleClickListener(oneButtonRed, new OneRtrPhoneDialog$initView$4(this));
    }

    /* renamed from: n */
    public static /* synthetic */ void m19902n(OneRtrPhoneDialog oneRtrPhoneDialog, View view) {
        m19900p(oneRtrPhoneDialog, view);
    }

    /* renamed from: p */
    public static final void m19900p(OneRtrPhoneDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Nullable
    public final Function1<SimData, Unit> getOnButtonClick() {
        return this.f83096g;
    }

    /* renamed from: o */
    public final OneRtrAndPhoneAdapter m19901o() {
        return (OneRtrAndPhoneAdapter) this.f83094e.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.one_dialog_rtr_number_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        WindowManager.LayoutParams layoutParams = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            window.setLayout(-1, -2);
        }
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.background_dialog_white_rounded);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.windowAnimations = R.style.DialogFragment;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        binding(view);
        initView();
        m19899q();
    }

    /* renamed from: q */
    public final void m19899q() {
        RegistrationType registrationType;
        int i;
        CharSequence charSequence;
        String string;
        CharSequence charSequence2;
        String string2;
        if (getArguments() != null && requireArguments().containsKey("EXTRA_TYPE")) {
            Bundle arguments = getArguments();
            OneButtonRed oneButtonRed = null;
            if (arguments != null) {
                registrationType = (RegistrationType) arguments.getParcelable("EXTRA_TYPE");
            } else {
                registrationType = null;
            }
            if (registrationType == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[registrationType.ordinal()];
            }
            String str = "";
            if (i == 1) {
                OneFontTextView oneFontTextView = this.f83091b;
                if (oneFontTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(MessageBundle.TITLE_ENTRY);
                    oneFontTextView = null;
                }
                Context context = getContext();
                if (context != null) {
                    charSequence2 = context.getText(R.string.dialog_title_dol_ltwo);
                } else {
                    charSequence2 = null;
                }
                oneFontTextView.setText(charSequence2);
                OneButtonRed oneButtonRed2 = this.f83093d;
                if (oneButtonRed2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("btnRequestOTP");
                } else {
                    oneButtonRed = oneButtonRed2;
                }
                Context context2 = getContext();
                if (context2 != null && (string2 = context2.getString(R.string.one_request_otp_from_sms)) != null) {
                    str = string2;
                }
                oneButtonRed.setText(str);
                return;
            }
            OneFontTextView oneFontTextView2 = this.f83091b;
            if (oneFontTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(MessageBundle.TITLE_ENTRY);
                oneFontTextView2 = null;
            }
            Context context3 = getContext();
            if (context3 != null) {
                charSequence = context3.getText(R.string.dialog_title_rtr_code);
            } else {
                charSequence = null;
            }
            oneFontTextView2.setText(charSequence);
            OneButtonRed oneButtonRed3 = this.f83093d;
            if (oneButtonRed3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("btnRequestOTP");
            } else {
                oneButtonRed = oneButtonRed3;
            }
            Context context4 = getContext();
            if (context4 != null && (string = context4.getString(R.string.confirm_text)) != null) {
                str = string;
            }
            oneButtonRed.setText(str);
        }
    }

    /* renamed from: r */
    public final void m19898r() {
        RegistrationType registrationType;
        int i;
        if (getArguments() != null && requireArguments().containsKey("EXTRA_TYPE")) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                registrationType = (RegistrationType) arguments.getParcelable("EXTRA_TYPE");
            } else {
                registrationType = null;
            }
            if (registrationType == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[registrationType.ordinal()];
            }
            if (i == 1) {
                m19901o().setType(RegistrationType.PhoneMultiple);
            } else {
                m19901o().setType(RegistrationType.RtrCodeMultiple);
            }
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull ArrayList<SimData> res) {
        Intrinsics.checkNotNullParameter(res, "res");
        if (this.f83095f == null) {
            this.f83095f = (SimData) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) res);
        }
        m19901o().setData(CollectionsKt___CollectionsKt.toList(res));
        m19901o().notifyDataSetChanged();
    }

    public final void setLastSelectedItem(@Nullable SimData simData) {
        this.f83095f = simData;
    }

    public final void setOnButtonClick(@Nullable Function1<? super SimData, Unit> function1) {
        this.f83096g = function1;
    }
}