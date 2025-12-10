package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneNadOutboundSearchBinding */
/* loaded from: classes7.dex */
public final class FragmentOneNadOutboundSearchBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84090a;
    @NonNull
    public final OneFontButton btn1BillToggle;
    @NonNull
    public final OneFontButton btn2BillToggle;
    @NonNull
    public final OneFontButton btn3BillToggle;
    @NonNull
    public final OneFontButton btn3PlusBillToggle;
    @NonNull
    public final OneFontTextView btnCancelSearch;
    @NonNull
    public final ImageView btnClearSearch;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final OneFontButton btnTMHToggle;
    @NonNull
    public final OneFontButton btnTOLToggle;
    @NonNull
    public final OneEditText edtSearchBox;
    @NonNull
    public final ImageView icSearch;
    @NonNull
    public final CardView layoutFilterButton;
    @NonNull
    public final ConstraintLayout layoutNotFound;
    @NonNull
    public final ConstraintLayout layoutRetry;
    @NonNull
    public final ConstraintLayout layoutSearchBar;
    @NonNull
    public final ConstraintLayout layoutSearchField;
    @NonNull
    public final RecyclerView rvNadList;
    @NonNull
    public final OneFontTextView tvBillRemainingTitle;
    @NonNull
    public final OneFontTextView tvRetryText;
    @NonNull
    public final OneFontTextView tvSearchNotFound;
    @NonNull
    public final OneFontTextView tvServiceTitle;

    public FragmentOneNadOutboundSearchBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontButton oneFontButton3, OneFontButton oneFontButton4, OneFontTextView oneFontTextView, ImageView imageView, OneFontButton oneFontButton5, OneFontButton oneFontButton6, OneFontButton oneFontButton7, OneEditText oneEditText, ImageView imageView2, CardView cardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, RecyclerView recyclerView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f84090a = constraintLayout;
        this.btn1BillToggle = oneFontButton;
        this.btn2BillToggle = oneFontButton2;
        this.btn3BillToggle = oneFontButton3;
        this.btn3PlusBillToggle = oneFontButton4;
        this.btnCancelSearch = oneFontTextView;
        this.btnClearSearch = imageView;
        this.btnRetry = oneFontButton5;
        this.btnTMHToggle = oneFontButton6;
        this.btnTOLToggle = oneFontButton7;
        this.edtSearchBox = oneEditText;
        this.icSearch = imageView2;
        this.layoutFilterButton = cardView;
        this.layoutNotFound = constraintLayout2;
        this.layoutRetry = constraintLayout3;
        this.layoutSearchBar = constraintLayout4;
        this.layoutSearchField = constraintLayout5;
        this.rvNadList = recyclerView;
        this.tvBillRemainingTitle = oneFontTextView2;
        this.tvRetryText = oneFontTextView3;
        this.tvSearchNotFound = oneFontTextView4;
        this.tvServiceTitle = oneFontTextView5;
    }

    @NonNull
    public static FragmentOneNadOutboundSearchBinding bind(@NonNull View view) {
        int i = R.id.btn1BillToggle;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn2BillToggle;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.btn3BillToggle;
                OneFontButton oneFontButton3 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton3 != null) {
                    i = R.id.btn3PlusBillToggle;
                    OneFontButton oneFontButton4 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton4 != null) {
                        i = R.id.btnCancelSearch;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.btnClearSearch;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.btnRetry;
                                OneFontButton oneFontButton5 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                if (oneFontButton5 != null) {
                                    i = R.id.btnTMHToggle;
                                    OneFontButton oneFontButton6 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton6 != null) {
                                        i = R.id.btnTOLToggle;
                                        OneFontButton oneFontButton7 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                        if (oneFontButton7 != null) {
                                            i = R.id.edtSearchBox;
                                            OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                                            if (oneEditText != null) {
                                                i = R.id.icSearch;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView2 != null) {
                                                    i = R.id.layoutFilterButton;
                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                                    if (cardView != null) {
                                                        i = R.id.layoutNotFound;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout != null) {
                                                            i = R.id.layoutRetry;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.layoutSearchBar;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.layoutSearchField;
                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout4 != null) {
                                                                        i = R.id.rvNadList;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.tvBillRemainingTitle;
                                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView2 != null) {
                                                                                i = R.id.tvRetryText;
                                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView3 != null) {
                                                                                    i = R.id.tvSearchNotFound;
                                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView4 != null) {
                                                                                        i = R.id.tvServiceTitle;
                                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView5 != null) {
                                                                                            return new FragmentOneNadOutboundSearchBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, oneFontButton3, oneFontButton4, oneFontTextView, imageView, oneFontButton5, oneFontButton6, oneFontButton7, oneEditText, imageView2, cardView, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, recyclerView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static FragmentOneNadOutboundSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneNadOutboundSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_nad_outbound_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84090a;
    }
}