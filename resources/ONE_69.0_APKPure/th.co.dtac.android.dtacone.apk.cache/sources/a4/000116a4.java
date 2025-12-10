package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postReferenceDocPreviewBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postReferenceDocPreviewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84179a;
    @NonNull
    public final OneIncludePreviewOptionalImageBinding incPreviewOptional;

    public FragmentOnePre2postReferenceDocPreviewBinding(ConstraintLayout constraintLayout, OneIncludePreviewOptionalImageBinding oneIncludePreviewOptionalImageBinding) {
        this.f84179a = constraintLayout;
        this.incPreviewOptional = oneIncludePreviewOptionalImageBinding;
    }

    @NonNull
    public static FragmentOnePre2postReferenceDocPreviewBinding bind(@NonNull View view) {
        int i = R.id.incPreviewOptional;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePre2postReferenceDocPreviewBinding((ConstraintLayout) view, OneIncludePreviewOptionalImageBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2postReferenceDocPreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postReferenceDocPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_reference_doc_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84179a;
    }
}