package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemIntroductionCardBinding */
/* loaded from: classes7.dex */
public final class ItemIntroductionCardBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84324a;
    @NonNull
    public final RoundedImageView ivIntro;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final View vLineSeparate;

    public ItemIntroductionCardBinding(RelativeLayout relativeLayout, RoundedImageView roundedImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, View view) {
        this.f84324a = relativeLayout;
        this.ivIntro = roundedImageView;
        this.tvDescription = oneFontTextView;
        this.tvTitle = oneFontTextView2;
        this.vLineSeparate = view;
    }

    @NonNull
    public static ItemIntroductionCardBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivIntro;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            i = R.id.tvDescription;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.tvTitle;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                    return new ItemIntroductionCardBinding((RelativeLayout) view, roundedImageView, oneFontTextView, oneFontTextView2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemIntroductionCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemIntroductionCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_introduction_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84324a;
    }
}
