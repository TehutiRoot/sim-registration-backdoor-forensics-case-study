package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBlacklistCustomerSubscriberInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentBlacklistCustomerSubscriberInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83741a;
    @NonNull
    public final CardView identityCard;
    @NonNull
    public final DtacFontTextView labelBlacklist;
    @NonNull
    public final DtacFontTextView labelCustomerInfo;
    @NonNull
    public final View lineID;
    @NonNull
    public final RecyclerView recyclerViewSubscriberInfo;
    @NonNull
    public final DtacFontTextView textView3;
    @NonNull
    public final DtacFontTextView textViewBlackList;
    @NonNull
    public final DtacFontTextView valueCustomerNumber;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentBlacklistCustomerSubscriberInfoBinding(NestedScrollView nestedScrollView, CardView cardView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view, RecyclerView recyclerView, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f83741a = nestedScrollView;
        this.identityCard = cardView;
        this.labelBlacklist = dtacFontTextView;
        this.labelCustomerInfo = dtacFontTextView2;
        this.lineID = view;
        this.recyclerViewSubscriberInfo = recyclerView;
        this.textView3 = dtacFontTextView3;
        this.textViewBlackList = dtacFontTextView4;
        this.valueCustomerNumber = dtacFontTextView5;
        this.warningMessage = dtacFontTextView6;
    }

    @NonNull
    public static FragmentBlacklistCustomerSubscriberInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.identityCard;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.labelBlacklist;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.labelCustomerInfo;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineID))) != null) {
                    i = R.id.recyclerViewSubscriberInfo;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.textView3;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.textViewBlackList;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.valueCustomerNumber;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.warningMessage;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        return new FragmentBlacklistCustomerSubscriberInfoBinding((NestedScrollView) view, cardView, dtacFontTextView, dtacFontTextView2, findChildViewById, recyclerView, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static FragmentBlacklistCustomerSubscriberInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBlacklistCustomerSubscriberInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blacklist_customer_subscriber_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83741a;
    }
}