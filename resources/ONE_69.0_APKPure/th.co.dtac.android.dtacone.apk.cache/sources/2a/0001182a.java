package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeAdditionalAdvanceDeviceBinding */
/* loaded from: classes7.dex */
public final class OneIncludeAdditionalAdvanceDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84569a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView cardView4;
    @NonNull
    public final ImageView imageView20;
    @NonNull
    public final RecyclerView rvAdvances;
    @NonNull
    public final OneFontTextView title;
    @NonNull
    public final OneFontTextView tvPackageHeader;
    @NonNull
    public final OneFontTextView tvPriceHeader;
    @NonNull
    public final View view3;

    public OneIncludeAdditionalAdvanceDeviceBinding(View view, OneFontButton oneFontButton, CardView cardView, ImageView imageView, RecyclerView recyclerView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, View view2) {
        this.f84569a = view;
        this.btnNext = oneFontButton;
        this.cardView4 = cardView;
        this.imageView20 = imageView;
        this.rvAdvances = recyclerView;
        this.title = oneFontTextView;
        this.tvPackageHeader = oneFontTextView2;
        this.tvPriceHeader = oneFontTextView3;
        this.view3 = view2;
    }

    @NonNull
    public static OneIncludeAdditionalAdvanceDeviceBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardView4;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.imageView20;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.rvAdvances;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.title;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvPackageHeader;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvPriceHeader;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view3))) != null) {
                                    return new OneIncludeAdditionalAdvanceDeviceBinding(view, oneFontButton, cardView, imageView, recyclerView, oneFontTextView, oneFontTextView2, oneFontTextView3, findChildViewById);
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
    public static OneIncludeAdditionalAdvanceDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.one_include_additional_advance_device, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84569a;
    }
}