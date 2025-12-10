package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityPreviewImageBinding */
/* loaded from: classes7.dex */
public final class ActivityPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83572a;
    @NonNull
    public final AdjustableImageView ivCard;
    @NonNull
    public final AppCompatImageView ivClose;

    public ActivityPreviewImageBinding(RelativeLayout relativeLayout, AdjustableImageView adjustableImageView, AppCompatImageView appCompatImageView) {
        this.f83572a = relativeLayout;
        this.ivCard = adjustableImageView;
        this.ivClose = appCompatImageView;
    }

    @NonNull
    public static ActivityPreviewImageBinding bind(@NonNull View view) {
        int i = R.id.ivCard;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null) {
            i = R.id.ivClose;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                return new ActivityPreviewImageBinding((RelativeLayout) view, adjustableImageView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83572a;
    }
}
