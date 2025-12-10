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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneSummaryReferenceDocBinding */
/* loaded from: classes7.dex */
public final class ItemOneSummaryReferenceDocBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84372a;
    @NonNull
    public final ImageView imageReferenceDocCountItemImageView;
    @NonNull
    public final OneFontTextView imageReferenceDocCountItemTextView;
    @NonNull
    public final ConstraintLayout referenceDocCountItemLayout;
    @NonNull
    public final OneFontTextView referenceDocTitleItemTextView;

    public ItemOneSummaryReferenceDocBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView2) {
        this.f84372a = constraintLayout;
        this.imageReferenceDocCountItemImageView = imageView;
        this.imageReferenceDocCountItemTextView = oneFontTextView;
        this.referenceDocCountItemLayout = constraintLayout2;
        this.referenceDocTitleItemTextView = oneFontTextView2;
    }

    @NonNull
    public static ItemOneSummaryReferenceDocBinding bind(@NonNull View view) {
        int i = R.id.imageReferenceDocCountItemImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.imageReferenceDocCountItemTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.referenceDocCountItemLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.referenceDocTitleItemTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new ItemOneSummaryReferenceDocBinding((ConstraintLayout) view, imageView, oneFontTextView, constraintLayout, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneSummaryReferenceDocBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneSummaryReferenceDocBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_summary_reference_doc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84372a;
    }
}
