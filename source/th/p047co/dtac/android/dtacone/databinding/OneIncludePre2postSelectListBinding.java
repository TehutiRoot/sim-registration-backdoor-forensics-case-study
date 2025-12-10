package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePre2postSelectListBinding */
/* loaded from: classes7.dex */
public final class OneIncludePre2postSelectListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84479a;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final CardView cvListItem;
    @NonNull
    public final CardView cvSearchList;
    @NonNull
    public final OneCustomClearableEditText edtSearch;
    @NonNull
    public final ImageView ivSearchIcon;
    @NonNull
    public final LinearLayoutCompat layoutRetry;
    @NonNull
    public final RecyclerView listViewPackage;
    @NonNull
    public final RecyclerView rvListItem;
    @NonNull
    public final OneFontTextView tvListTitle;
    @NonNull
    public final OneFontTextView tvRetryMessage;
    @NonNull
    public final OneFontTextView tvWarningMessage;

    public OneIncludePre2postSelectListBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, CardView cardView2, OneCustomClearableEditText oneCustomClearableEditText, ImageView imageView, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, RecyclerView recyclerView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84479a = constraintLayout;
        this.btnRetry = oneFontButton;
        this.cvListItem = cardView;
        this.cvSearchList = cardView2;
        this.edtSearch = oneCustomClearableEditText;
        this.ivSearchIcon = imageView;
        this.layoutRetry = linearLayoutCompat;
        this.listViewPackage = recyclerView;
        this.rvListItem = recyclerView2;
        this.tvListTitle = oneFontTextView;
        this.tvRetryMessage = oneFontTextView2;
        this.tvWarningMessage = oneFontTextView3;
    }

    @NonNull
    public static OneIncludePre2postSelectListBinding bind(@NonNull View view) {
        int i = R.id.btnRetry;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cvListItem;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.cvSearchList;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = R.id.edtSearch;
                    OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText != null) {
                        i = R.id.ivSearchIcon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.layoutRetry;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.listViewPackage;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.rvListItem;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView2 != null) {
                                        i = R.id.tvListTitle;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            i = R.id.tvRetryMessage;
                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView2 != null) {
                                                i = R.id.tvWarningMessage;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null) {
                                                    return new OneIncludePre2postSelectListBinding((ConstraintLayout) view, oneFontButton, cardView, cardView2, oneCustomClearableEditText, imageView, linearLayoutCompat, recyclerView, recyclerView2, oneFontTextView, oneFontTextView2, oneFontTextView3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludePre2postSelectListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePre2postSelectListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_pre2post_select_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84479a;
    }
}
