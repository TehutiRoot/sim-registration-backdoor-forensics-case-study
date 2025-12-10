package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineFaceRecognitionBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineFaceRecognitionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84099a;
    @NonNull
    public final CardView cardCusView;
    @NonNull
    public final CardView cardIdView;
    @NonNull
    public final AdjustableImageView ivIdCard;
    @NonNull
    public final AdjustableImageView ivIdCardCompare;
    @NonNull
    public final ImageView ivRetryIDCard;

    public FragmentOneRegisterTrueOnlineFaceRecognitionBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, AdjustableImageView adjustableImageView, AdjustableImageView adjustableImageView2, ImageView imageView) {
        this.f84099a = constraintLayout;
        this.cardCusView = cardView;
        this.cardIdView = cardView2;
        this.ivIdCard = adjustableImageView;
        this.ivIdCardCompare = adjustableImageView2;
        this.ivRetryIDCard = imageView;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFaceRecognitionBinding bind(@NonNull View view) {
        int i = R.id.cardCusView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardIdView;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.ivIdCard;
                AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                if (adjustableImageView != null) {
                    i = R.id.ivIdCardCompare;
                    AdjustableImageView adjustableImageView2 = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                    if (adjustableImageView2 != null) {
                        i = R.id.ivRetryIDCard;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            return new FragmentOneRegisterTrueOnlineFaceRecognitionBinding((ConstraintLayout) view, cardView, cardView2, adjustableImageView, adjustableImageView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_face_recognition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84099a;
    }
}
