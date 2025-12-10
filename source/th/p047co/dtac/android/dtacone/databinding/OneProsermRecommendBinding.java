package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneProsermRecommendBinding */
/* loaded from: classes7.dex */
public final class OneProsermRecommendBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84519a;
    @NonNull
    public final ImageView imageView12;
    @NonNull
    public final ConstraintLayout prosermRecommContainer;
    @NonNull
    public final RecyclerView rvRecommendItems;
    @NonNull
    public final OneFontTextView tvRecommentTitle;
    @NonNull
    public final View viewBoxTitle;

    public OneProsermRecommendBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, OneFontTextView oneFontTextView, View view) {
        this.f84519a = constraintLayout;
        this.imageView12 = imageView;
        this.prosermRecommContainer = constraintLayout2;
        this.rvRecommendItems = recyclerView;
        this.tvRecommentTitle = oneFontTextView;
        this.viewBoxTitle = view;
    }

    @NonNull
    public static OneProsermRecommendBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.imageView12;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.rvRecommendItems;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tvRecommentTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewBoxTitle))) != null) {
                    return new OneProsermRecommendBinding(constraintLayout, imageView, constraintLayout, recyclerView, oneFontTextView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneProsermRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneProsermRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_proserm_recommend, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84519a;
    }
}
