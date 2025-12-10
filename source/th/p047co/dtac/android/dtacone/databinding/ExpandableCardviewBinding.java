package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ExpandableCardviewBinding */
/* loaded from: classes7.dex */
public final class ExpandableCardviewBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f83641a;
    @NonNull
    public final ImageView cardArrow;
    @NonNull
    public final LinearLayout cardContainer;
    @NonNull
    public final RelativeLayout cardHeader;
    @NonNull
    public final ImageButton cardIcon;
    @NonNull
    public final CardView cardLayout;
    @NonNull
    public final LinearLayout cardStub;
    @NonNull
    public final DtacFontTextView cardTitle;

    public ExpandableCardviewBinding(CardView cardView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, ImageButton imageButton, CardView cardView2, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView) {
        this.f83641a = cardView;
        this.cardArrow = imageView;
        this.cardContainer = linearLayout;
        this.cardHeader = relativeLayout;
        this.cardIcon = imageButton;
        this.cardLayout = cardView2;
        this.cardStub = linearLayout2;
        this.cardTitle = dtacFontTextView;
    }

    @NonNull
    public static ExpandableCardviewBinding bind(@NonNull View view) {
        int i = R.id.card_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.card_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.card_header;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.card_icon;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton != null) {
                        CardView cardView = (CardView) view;
                        i = R.id.card_stub;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.card_title;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                return new ExpandableCardviewBinding(cardView, imageView, linearLayout, relativeLayout, imageButton, cardView, linearLayout2, dtacFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ExpandableCardviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ExpandableCardviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.expandable_cardview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f83641a;
    }
}
