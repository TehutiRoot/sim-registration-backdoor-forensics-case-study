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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidReserveNumberListBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidReserveNumberListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84145a;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final RecyclerView reserveNumberRCV;
    @NonNull
    public final OneFontTextView reserveNumberTitleTextView;

    public FragmentOnePostpaidReserveNumberListBinding(ConstraintLayout constraintLayout, CardView cardView, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84145a = constraintLayout;
        this.cardView = cardView;
        this.reserveNumberRCV = recyclerView;
        this.reserveNumberTitleTextView = oneFontTextView;
    }

    @NonNull
    public static FragmentOnePostpaidReserveNumberListBinding bind(@NonNull View view) {
        int i = R.id.cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.reserveNumberRCV;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.reserveNumberTitleTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOnePostpaidReserveNumberListBinding((ConstraintLayout) view, cardView, recyclerView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidReserveNumberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidReserveNumberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_reserve_number_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84145a;
    }
}