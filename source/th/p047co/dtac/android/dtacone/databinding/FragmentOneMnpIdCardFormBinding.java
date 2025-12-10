package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpIdCardFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpIdCardFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83969a;
    @NonNull
    public final OneCustomClearableEditText idCardNumberEditText;
    @NonNull
    public final ConstraintLayout idCardNumberMainLayout;
    @NonNull
    public final OneCheckBox idExpirationCheckBox;
    @NonNull
    public final ImageView ivOcrIcon;
    @NonNull
    public final ConstraintLayout ocrInfoLayout;
    @NonNull
    public final OneFontTextView tvOcrIntro;

    public FragmentOneMnpIdCardFormBinding(ConstraintLayout constraintLayout, OneCustomClearableEditText oneCustomClearableEditText, ConstraintLayout constraintLayout2, OneCheckBox oneCheckBox, ImageView imageView, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView) {
        this.f83969a = constraintLayout;
        this.idCardNumberEditText = oneCustomClearableEditText;
        this.idCardNumberMainLayout = constraintLayout2;
        this.idExpirationCheckBox = oneCheckBox;
        this.ivOcrIcon = imageView;
        this.ocrInfoLayout = constraintLayout3;
        this.tvOcrIntro = oneFontTextView;
    }

    @NonNull
    public static FragmentOneMnpIdCardFormBinding bind(@NonNull View view) {
        int i = R.id.idCardNumberEditText;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.idExpirationCheckBox;
            OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
            if (oneCheckBox != null) {
                i = R.id.ivOcrIcon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ocrInfoLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.tvOcrIntro;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new FragmentOneMnpIdCardFormBinding(constraintLayout, oneCustomClearableEditText, constraintLayout, oneCheckBox, imageView, constraintLayout2, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpIdCardFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_id_card_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83969a;
    }
}
