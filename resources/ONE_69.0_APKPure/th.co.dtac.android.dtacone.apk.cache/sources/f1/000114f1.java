package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.CustomerInfoStatusView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBlacklistCustomerInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentBlacklistCustomerInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final SwipeRefreshLayout f83740a;
    @NonNull
    public final CustomerInfoStatusView customerInfoStatusView;
    @NonNull
    public final CardView identityCard;
    @NonNull
    public final DtacFontTextView labelBlacklist;
    @NonNull
    public final DtacFontTextView labelCustomerInfo;
    @NonNull
    public final View lineID;
    @NonNull
    public final RecyclerView recyclerViewCustomerInfo;
    @NonNull
    public final SwipeRefreshLayout refresh;
    @NonNull
    public final DtacFontTextView textViewBlackList;
    @NonNull
    public final TextViewTopLabelView textViewIdentityNumber;
    @NonNull
    public final TextViewTopLabelView textViewName;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentBlacklistCustomerInfoBinding(SwipeRefreshLayout swipeRefreshLayout, CustomerInfoStatusView customerInfoStatusView, CardView cardView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2, DtacFontTextView dtacFontTextView3, TextViewTopLabelView textViewTopLabelView, TextViewTopLabelView textViewTopLabelView2, DtacFontTextView dtacFontTextView4) {
        this.f83740a = swipeRefreshLayout;
        this.customerInfoStatusView = customerInfoStatusView;
        this.identityCard = cardView;
        this.labelBlacklist = dtacFontTextView;
        this.labelCustomerInfo = dtacFontTextView2;
        this.lineID = view;
        this.recyclerViewCustomerInfo = recyclerView;
        this.refresh = swipeRefreshLayout2;
        this.textViewBlackList = dtacFontTextView3;
        this.textViewIdentityNumber = textViewTopLabelView;
        this.textViewName = textViewTopLabelView2;
        this.warningMessage = dtacFontTextView4;
    }

    @NonNull
    public static FragmentBlacklistCustomerInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.customerInfoStatusView;
        CustomerInfoStatusView customerInfoStatusView = (CustomerInfoStatusView) ViewBindings.findChildViewById(view, i);
        if (customerInfoStatusView != null) {
            i = R.id.identityCard;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.labelBlacklist;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.labelCustomerInfo;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineID))) != null) {
                        i = R.id.recyclerViewCustomerInfo;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                            i = R.id.textViewBlackList;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.textViewIdentityNumber;
                                TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                if (textViewTopLabelView != null) {
                                    i = R.id.textViewName;
                                    TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                    if (textViewTopLabelView2 != null) {
                                        i = R.id.warningMessage;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            return new FragmentBlacklistCustomerInfoBinding(swipeRefreshLayout, customerInfoStatusView, cardView, dtacFontTextView, dtacFontTextView2, findChildViewById, recyclerView, swipeRefreshLayout, dtacFontTextView3, textViewTopLabelView, textViewTopLabelView2, dtacFontTextView4);
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
    public static FragmentBlacklistCustomerInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBlacklistCustomerInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blacklist_customer_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SwipeRefreshLayout getRoot() {
        return this.f83740a;
    }
}