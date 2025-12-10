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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneGroupServiceBinding */
/* loaded from: classes7.dex */
public final class ItemOneGroupServiceBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84462a;
    @NonNull
    public final LinearLayoutCompat layoutGroupService;
    @NonNull
    public final RecyclerView recyclerViewService;
    @NonNull
    public final OneFontTextView tvGroupServiceTitle;
    @NonNull
    public final View vHeaderTheme;

    public ItemOneGroupServiceBinding(CardView cardView, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, OneFontTextView oneFontTextView, View view) {
        this.f84462a = cardView;
        this.layoutGroupService = linearLayoutCompat;
        this.recyclerViewService = recyclerView;
        this.tvGroupServiceTitle = oneFontTextView;
        this.vHeaderTheme = view;
    }

    @NonNull
    public static ItemOneGroupServiceBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.layoutGroupService;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.recyclerViewService;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.tvGroupServiceTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vHeaderTheme))) != null) {
                    return new ItemOneGroupServiceBinding((CardView) view, linearLayoutCompat, recyclerView, oneFontTextView, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneGroupServiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneGroupServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_group_service, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84462a;
    }
}