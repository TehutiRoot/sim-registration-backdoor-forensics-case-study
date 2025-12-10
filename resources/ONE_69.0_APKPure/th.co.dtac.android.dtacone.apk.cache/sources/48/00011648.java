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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneNadOutboundFilterDialogBinding */
/* loaded from: classes7.dex */
public final class FragmentOneNadOutboundFilterDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84087a;
    @NonNull
    public final ImageView dividerImageView;
    @NonNull
    public final RecyclerView selectFilterRecyclerView;
    @NonNull
    public final View spaceView;

    public FragmentOneNadOutboundFilterDialogBinding(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, View view) {
        this.f84087a = constraintLayout;
        this.dividerImageView = imageView;
        this.selectFilterRecyclerView = recyclerView;
        this.spaceView = view;
    }

    @NonNull
    public static FragmentOneNadOutboundFilterDialogBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.dividerImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.selectFilterRecyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.spaceView))) != null) {
                return new FragmentOneNadOutboundFilterDialogBinding((ConstraintLayout) view, imageView, recyclerView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneNadOutboundFilterDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneNadOutboundFilterDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_nad_outbound_filter_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84087a;
    }
}