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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidFaceRecognitionBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidFaceRecognitionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84127a;
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

    public FragmentOnePostpaidFaceRecognitionBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, AdjustableImageView adjustableImageView, AdjustableImageView adjustableImageView2, ImageView imageView) {
        this.f84127a = constraintLayout;
        this.cardCusView = cardView;
        this.cardIdView = cardView2;
        this.ivIdCard = adjustableImageView;
        this.ivIdCardCompare = adjustableImageView2;
        this.ivRetryIDCard = imageView;
    }

    @NonNull
    public static FragmentOnePostpaidFaceRecognitionBinding bind(@NonNull View view) {
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
                            return new FragmentOnePostpaidFaceRecognitionBinding((ConstraintLayout) view, cardView, cardView2, adjustableImageView, adjustableImageView2, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_face_recognition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84127a;
    }
}