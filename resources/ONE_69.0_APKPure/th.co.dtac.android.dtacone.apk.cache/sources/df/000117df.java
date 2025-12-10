package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPlaceSuggestionBinding */
/* loaded from: classes7.dex */
public final class ItemPlaceSuggestionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84494a;
    @NonNull
    public final RelativeLayout layoutPlaceSuggestion;
    @NonNull
    public final LinearLayout layoutPlaceWord;
    @NonNull
    public final DtacFontTextView tvMidPlaceSuggestion;
    @NonNull
    public final DtacFontTextView tvPostPlaceSuggestion;
    @NonNull
    public final DtacFontTextView tvPrePlaceSuggestion;

    public ItemPlaceSuggestionBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84494a = relativeLayout;
        this.layoutPlaceSuggestion = relativeLayout2;
        this.layoutPlaceWord = linearLayout;
        this.tvMidPlaceSuggestion = dtacFontTextView;
        this.tvPostPlaceSuggestion = dtacFontTextView2;
        this.tvPrePlaceSuggestion = dtacFontTextView3;
    }

    @NonNull
    public static ItemPlaceSuggestionBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = R.id.layoutPlaceWord;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.tvMidPlaceSuggestion;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvPostPlaceSuggestion;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvPrePlaceSuggestion;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new ItemPlaceSuggestionBinding(relativeLayout, relativeLayout, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPlaceSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPlaceSuggestionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_place_suggestion, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84494a;
    }
}