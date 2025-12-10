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
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimFaceRecognitionBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimFaceRecognitionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83901a;
    @NonNull
    public final AdjustableImageView ivIdCard;
    @NonNull
    public final AdjustableImageView ivIdCardCompare;
    @NonNull
    public final ImageView ivRetakeIdCardPhoto;

    public FragmentMrtrMultiSimFaceRecognitionBinding(ConstraintLayout constraintLayout, AdjustableImageView adjustableImageView, AdjustableImageView adjustableImageView2, ImageView imageView) {
        this.f83901a = constraintLayout;
        this.ivIdCard = adjustableImageView;
        this.ivIdCardCompare = adjustableImageView2;
        this.ivRetakeIdCardPhoto = imageView;
    }

    @NonNull
    public static FragmentMrtrMultiSimFaceRecognitionBinding bind(@NonNull View view) {
        int i = R.id.ivIdCard;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null) {
            i = R.id.ivIdCardCompare;
            AdjustableImageView adjustableImageView2 = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView2 != null) {
                i = R.id.ivRetakeIdCardPhoto;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new FragmentMrtrMultiSimFaceRecognitionBinding((ConstraintLayout) view, adjustableImageView, adjustableImageView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_face_recognition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83901a;
    }
}