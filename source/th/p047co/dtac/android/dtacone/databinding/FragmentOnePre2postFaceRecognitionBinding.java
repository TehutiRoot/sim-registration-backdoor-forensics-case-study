package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postFaceRecognitionBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postFaceRecognitionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84071a;
    @NonNull
    public final CardView cardCusView;
    @NonNull
    public final CardView cardIdView;
    @NonNull
    public final AdjustableImageView idCardCompareFaceRecognitionImageView;
    @NonNull
    public final AdjustableImageView idCardFaceRecognitionImageView;

    public FragmentOnePre2postFaceRecognitionBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, AdjustableImageView adjustableImageView, AdjustableImageView adjustableImageView2) {
        this.f84071a = constraintLayout;
        this.cardCusView = cardView;
        this.cardIdView = cardView2;
        this.idCardCompareFaceRecognitionImageView = adjustableImageView;
        this.idCardFaceRecognitionImageView = adjustableImageView2;
    }

    @NonNull
    public static FragmentOnePre2postFaceRecognitionBinding bind(@NonNull View view) {
        int i = R.id.cardCusView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardIdView;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.idCardCompareFaceRecognitionImageView;
                AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                if (adjustableImageView != null) {
                    i = R.id.idCardFaceRecognitionImageView;
                    AdjustableImageView adjustableImageView2 = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                    if (adjustableImageView2 != null) {
                        return new FragmentOnePre2postFaceRecognitionBinding((ConstraintLayout) view, cardView, cardView2, adjustableImageView, adjustableImageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2postFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postFaceRecognitionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_face_recognition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84071a;
    }
}
