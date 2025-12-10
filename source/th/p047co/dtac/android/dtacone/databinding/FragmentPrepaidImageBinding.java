package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPrepaidImageBinding */
/* loaded from: classes7.dex */
public final class FragmentPrepaidImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84150a;
    @NonNull
    public final FrameLayout deleteBox;
    @NonNull
    public final ImageView ivDelete;
    @NonNull
    public final AdjustableImageView ivIdCard;
    @NonNull
    public final OneFontTextView tvWatermark;

    public FragmentPrepaidImageBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ImageView imageView, AdjustableImageView adjustableImageView, OneFontTextView oneFontTextView) {
        this.f84150a = relativeLayout;
        this.deleteBox = frameLayout;
        this.ivDelete = imageView;
        this.ivIdCard = adjustableImageView;
        this.tvWatermark = oneFontTextView;
    }

    @NonNull
    public static FragmentPrepaidImageBinding bind(@NonNull View view) {
        int i = R.id.deleteBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivDelete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivIdCard;
                AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                if (adjustableImageView != null) {
                    i = R.id.tvWatermark;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new FragmentPrepaidImageBinding((RelativeLayout) view, frameLayout, imageView, adjustableImageView, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPrepaidImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPrepaidImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_prepaid_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84150a;
    }
}
