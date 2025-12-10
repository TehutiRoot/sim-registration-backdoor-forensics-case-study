package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeRegisterTrueOnlineListBinding */
/* loaded from: classes7.dex */
public final class OneIncludeRegisterTrueOnlineListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84593a;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final RecyclerView listView;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final OneFontTextView tvTitle;

    public OneIncludeRegisterTrueOnlineListBinding(ConstraintLayout constraintLayout, CardView cardView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView) {
        this.f84593a = constraintLayout;
        this.cardView = cardView;
        this.constraintLayout10 = constraintLayout2;
        this.listView = recyclerView;
        this.root = constraintLayout3;
        this.tvTitle = oneFontTextView;
    }

    @NonNull
    public static OneIncludeRegisterTrueOnlineListBinding bind(@NonNull View view) {
        int i = R.id.cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.constraintLayout10;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.listView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                    i = R.id.tvTitle;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneIncludeRegisterTrueOnlineListBinding(constraintLayout2, cardView, constraintLayout, recyclerView, constraintLayout2, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeRegisterTrueOnlineListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeRegisterTrueOnlineListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_register_true_online_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84593a;
    }
}