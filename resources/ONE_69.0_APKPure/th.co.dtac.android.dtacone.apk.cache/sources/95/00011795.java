package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemGroupOtherMenuBinding */
/* loaded from: classes7.dex */
public final class ItemGroupOtherMenuBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84420a;
    @NonNull
    public final LinearLayoutCompat layoutGroupMenu;
    @NonNull
    public final RecyclerView recyclerViewOtherMenu;
    @NonNull
    public final OneFontTextView tvGroupMenuTitle;

    public ItemGroupOtherMenuBinding(CardView cardView, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84420a = cardView;
        this.layoutGroupMenu = linearLayoutCompat;
        this.recyclerViewOtherMenu = recyclerView;
        this.tvGroupMenuTitle = oneFontTextView;
    }

    @NonNull
    public static ItemGroupOtherMenuBinding bind(@NonNull View view) {
        int i = R.id.layoutGroupMenu;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.recyclerViewOtherMenu;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tvGroupMenuTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new ItemGroupOtherMenuBinding((CardView) view, linearLayoutCompat, recyclerView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemGroupOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemGroupOtherMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_group_other_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84420a;
    }
}