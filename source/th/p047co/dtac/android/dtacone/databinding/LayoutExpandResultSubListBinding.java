package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutExpandResultSubListBinding */
/* loaded from: classes7.dex */
public final class LayoutExpandResultSubListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84405a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final CardView card;
    @NonNull
    public final LinearLayoutCompat content;
    @NonNull
    public final LinearLayoutCompat layoutContent;
    @NonNull
    public final LinearLayoutCompat layoutHeader;
    @NonNull
    public final View line;
    @NonNull
    public final RecyclerView subList;
    @NonNull
    public final DtacFontTextView tvCountSub;
    @NonNull
    public final DtacFontTextView tvLabelNumber;
    @NonNull
    public final DtacFontTextView tvTitle;

    public LayoutExpandResultSubListBinding(FrameLayout frameLayout, ImageView imageView, CardView cardView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, View view, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84405a = frameLayout;
        this.arrow = imageView;
        this.card = cardView;
        this.content = linearLayoutCompat;
        this.layoutContent = linearLayoutCompat2;
        this.layoutHeader = linearLayoutCompat3;
        this.line = view;
        this.subList = recyclerView;
        this.tvCountSub = dtacFontTextView;
        this.tvLabelNumber = dtacFontTextView2;
        this.tvTitle = dtacFontTextView3;
    }

    @NonNull
    public static LayoutExpandResultSubListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.content;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.layoutContent;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.layoutHeader;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                            i = R.id.subList;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tvCountSub;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.tvLabelNumber;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.tvTitle;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            return new LayoutExpandResultSubListBinding((FrameLayout) view, imageView, cardView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, findChildViewById, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static LayoutExpandResultSubListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutExpandResultSubListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_expand_result_sub_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84405a;
    }
}
