package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSimActivationConfirmTransactionBinding */
/* loaded from: classes7.dex */
public final class FragmentSimActivationConfirmTransactionBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84194a;
    @NonNull
    public final RelativeLayout btnSimActChangeMainPack;
    @NonNull
    public final RelativeLayout btnSimActStv;
    @NonNull
    public final RelativeLayout btnSimActTopup;
    @NonNull
    public final IncludeVerfySimActivationBinding incVerifySim;
    @NonNull
    public final ImageView ivChangePro;
    @NonNull
    public final ImageView ivProserm;
    @NonNull
    public final ImageView ivTopupImage;
    @NonNull
    public final LinearLayout layoutMenu;
    @NonNull
    public final DtacFontTextView tvChangePro;
    @NonNull
    public final DtacFontTextView tvProserm;
    @NonNull
    public final DtacFontTextView tvTopup;

    public FragmentSimActivationConfirmTransactionBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, IncludeVerfySimActivationBinding includeVerfySimActivationBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84194a = linearLayout;
        this.btnSimActChangeMainPack = relativeLayout;
        this.btnSimActStv = relativeLayout2;
        this.btnSimActTopup = relativeLayout3;
        this.incVerifySim = includeVerfySimActivationBinding;
        this.ivChangePro = imageView;
        this.ivProserm = imageView2;
        this.ivTopupImage = imageView3;
        this.layoutMenu = linearLayout2;
        this.tvChangePro = dtacFontTextView;
        this.tvProserm = dtacFontTextView2;
        this.tvTopup = dtacFontTextView3;
    }

    @NonNull
    public static FragmentSimActivationConfirmTransactionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnSimActChangeMainPack;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.btnSimActStv;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout2 != null) {
                i = R.id.btnSimActTopup;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incVerifySim))) != null) {
                    IncludeVerfySimActivationBinding bind = IncludeVerfySimActivationBinding.bind(findChildViewById);
                    i = R.id.ivChangePro;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivProserm;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.ivTopupImage;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.layoutMenu;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.tvChangePro;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.tvProserm;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.tvTopup;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                return new FragmentSimActivationConfirmTransactionBinding((LinearLayout) view, relativeLayout, relativeLayout2, relativeLayout3, bind, imageView, imageView2, imageView3, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSimActivationConfirmTransactionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSimActivationConfirmTransactionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sim_activation_confirm_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84194a;
    }
}
