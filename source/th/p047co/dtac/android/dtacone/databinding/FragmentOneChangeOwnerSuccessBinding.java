package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83911a;
    @NonNull
    public final OneFontButton buttonBackHome;
    @NonNull
    public final Guideline guideTop;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final OneFontTextView textCutSimStock;
    @NonNull
    public final OneFontTextView textHeaderSuccess;
    @NonNull
    public final OneFontTextView textMessageSuccess;

    public FragmentOneChangeOwnerSuccessBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, Guideline guideline, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f83911a = constraintLayout;
        this.buttonBackHome = oneFontButton;
        this.guideTop = guideline;
        this.imageIconSuccess = imageView;
        this.textCutSimStock = oneFontTextView;
        this.textHeaderSuccess = oneFontTextView2;
        this.textMessageSuccess = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneChangeOwnerSuccessBinding bind(@NonNull View view) {
        int i = R.id.buttonBackHome;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.guideTop;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.imageIconSuccess;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.textCutSimStock;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.textHeaderSuccess;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.textMessageSuccess;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                return new FragmentOneChangeOwnerSuccessBinding((ConstraintLayout) view, oneFontButton, guideline, imageView, oneFontTextView, oneFontTextView2, oneFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeOwnerSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83911a;
    }
}
