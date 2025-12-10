package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimFaceRecognitionBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimFaceRecognitionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83720a;
    @NonNull
    public final AdjustableImageView ivIdCard;
    @NonNull
    public final AdjustableImageView ivIdCardCompare;

    public FragmentEsimFaceRecognitionBinding(ConstraintLayout constraintLayout, AdjustableImageView adjustableImageView, AdjustableImageView adjustableImageView2) {
        this.f83720a = constraintLayout;
        this.ivIdCard = adjustableImageView;
        this.ivIdCardCompare = adjustableImageView2;
    }

    @NonNull
    public static FragmentEsimFaceRecognitionBinding bind(@NonNull View view) {
        int i = R.id.ivIdCard;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null) {
            i = R.id.ivIdCardCompare;
            AdjustableImageView adjustableImageView2 = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView2 != null) {
                return new FragmentEsimFaceRecognitionBinding((ConstraintLayout) view, adjustableImageView, adjustableImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_face_recognition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83720a;
    }
}
