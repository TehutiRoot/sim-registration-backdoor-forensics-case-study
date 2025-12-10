package co.omise.android.p009ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import co.omise.android.C5511R;
import co.omise.android.models.CardBrand;
import co.omise.android.p009ui.SecurityCodeTooltipDialogFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m28850d2 = {"Lco/omise/android/ui/SecurityCodeTooltipDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "cardBrand", "Lco/omise/android/models/CardBrand;", "closeButton", "Landroid/widget/ImageButton;", "getCloseButton", "()Landroid/widget/ImageButton;", "closeButton$delegate", "Lkotlin/Lazy;", "cvvDescriptionText", "Landroid/widget/TextView;", "getCvvDescriptionText", "()Landroid/widget/TextView;", "cvvDescriptionText$delegate", "cvvImage", "Landroid/widget/ImageView;", "getCvvImage", "()Landroid/widget/ImageView;", "cvvImage$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", Promotion.ACTION_VIEW, "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* renamed from: co.omise.android.ui.SecurityCodeTooltipDialogFragment */
/* loaded from: classes3.dex */
public final class SecurityCodeTooltipDialogFragment extends DialogFragment {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_CARD_BRAND = "SecurityCodeTooltipDialogFragment.CardBrand";
    @Nullable
    private CardBrand cardBrand;
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    private final Lazy cvvImage$delegate = LazyKt__LazyJVMKt.lazy(new C5630c());
    @NotNull
    private final Lazy cvvDescriptionText$delegate = LazyKt__LazyJVMKt.lazy(new C5629b());
    @NotNull
    private final Lazy closeButton$delegate = LazyKt__LazyJVMKt.lazy(new C5628a());

    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/SecurityCodeTooltipDialogFragment$Companion;", "", "()V", "EXTRA_CARD_BRAND", "", "newInstant", "Lco/omise/android/ui/SecurityCodeTooltipDialogFragment;", "brand", "Lco/omise/android/models/CardBrand;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.SecurityCodeTooltipDialogFragment$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SecurityCodeTooltipDialogFragment newInstant$default(Companion companion, CardBrand cardBrand, int i, Object obj) {
            if ((i & 1) != 0) {
                cardBrand = null;
            }
            return companion.newInstant(cardBrand);
        }

        @NotNull
        public final SecurityCodeTooltipDialogFragment newInstant(@Nullable CardBrand cardBrand) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(SecurityCodeTooltipDialogFragment.EXTRA_CARD_BRAND, cardBrand);
            SecurityCodeTooltipDialogFragment securityCodeTooltipDialogFragment = new SecurityCodeTooltipDialogFragment();
            securityCodeTooltipDialogFragment.setArguments(bundle);
            return securityCodeTooltipDialogFragment;
        }

        private Companion() {
        }
    }

    /* renamed from: co.omise.android.ui.SecurityCodeTooltipDialogFragment$a */
    /* loaded from: classes3.dex */
    public static final class C5628a extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5628a() {
            super(0);
            SecurityCodeTooltipDialogFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ImageButton invoke() {
            return (ImageButton) SecurityCodeTooltipDialogFragment.this._$_findCachedViewById(C5511R.C5514id.close_button);
        }
    }

    /* renamed from: co.omise.android.ui.SecurityCodeTooltipDialogFragment$b */
    /* loaded from: classes3.dex */
    public static final class C5629b extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5629b() {
            super(0);
            SecurityCodeTooltipDialogFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TextView invoke() {
            return (TextView) SecurityCodeTooltipDialogFragment.this._$_findCachedViewById(C5511R.C5514id.cvv_description_text);
        }
    }

    /* renamed from: co.omise.android.ui.SecurityCodeTooltipDialogFragment$c */
    /* loaded from: classes3.dex */
    public static final class C5630c extends Lambda implements Function0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5630c() {
            super(0);
            SecurityCodeTooltipDialogFragment.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ImageView invoke() {
            return (ImageView) SecurityCodeTooltipDialogFragment.this._$_findCachedViewById(C5511R.C5514id.cvv_image);
        }
    }

    private final ImageButton getCloseButton() {
        Object value = this.closeButton$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-closeButton>(...)");
        return (ImageButton) value;
    }

    private final TextView getCvvDescriptionText() {
        Object value = this.cvvDescriptionText$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cvvDescriptionText>(...)");
        return (TextView) value;
    }

    private final ImageView getCvvImage() {
        Object value = this.cvvImage$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cvvImage>(...)");
        return (ImageView) value;
    }

    /* renamed from: n */
    public static /* synthetic */ void m51163n(SecurityCodeTooltipDialogFragment securityCodeTooltipDialogFragment, View view) {
        m73948onViewCreated$lambda0(securityCodeTooltipDialogFragment, view);
    }

    /* renamed from: onViewCreated$lambda-0 */
    public static final void m73948onViewCreated$lambda0(SecurityCodeTooltipDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Parcelable] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object obj;
        Object parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        CardBrand cardBrand = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = arguments.getParcelable(EXTRA_CARD_BRAND, CardBrand.class);
                obj = (Parcelable) parcelable;
            } else {
                ?? parcelable2 = arguments.getParcelable(EXTRA_CARD_BRAND);
                if (parcelable2 instanceof CardBrand) {
                    cardBrand = parcelable2;
                }
                obj = cardBrand;
            }
            cardBrand = (CardBrand) obj;
        }
        this.cardBrand = cardBrand;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C5511R.C5515layout.dialog_security_code_tooltip, viewGroup);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: nF1
            {
                SecurityCodeTooltipDialogFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SecurityCodeTooltipDialogFragment.m51163n(SecurityCodeTooltipDialogFragment.this, view2);
            }
        });
        if (Intrinsics.areEqual(this.cardBrand, CardBrand.AMEX)) {
            getCvvImage().setImageResource(C5511R.C5513drawable.cvv_4_digits);
            getCvvDescriptionText().setText(C5511R.C5518string.cvv_tooltip_4_digits);
            return;
        }
        getCvvImage().setImageResource(C5511R.C5513drawable.cvv_3_digits);
        getCvvDescriptionText().setText(C5511R.C5518string.cvv_tooltip_3_digits);
    }
}
