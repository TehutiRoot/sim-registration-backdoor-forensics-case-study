package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOnePre2postSectionSelectedBinding */
/* loaded from: classes7.dex */
public final class IncludeOnePre2postSectionSelectedBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84280a;
    @NonNull
    public final LinearLayoutCompat buttonEditProposition;
    @NonNull
    public final ConstraintLayout layoutProposition;
    @NonNull
    public final OneFontTextView propositionLabel;
    @NonNull
    public final CardView sectionSelected;
    @NonNull
    public final OneFontTextView tvPropositionName;

    public IncludeOnePre2postSectionSelectedBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, CardView cardView, OneFontTextView oneFontTextView2) {
        this.f84280a = constraintLayout;
        this.buttonEditProposition = linearLayoutCompat;
        this.layoutProposition = constraintLayout2;
        this.propositionLabel = oneFontTextView;
        this.sectionSelected = cardView;
        this.tvPropositionName = oneFontTextView2;
    }

    @NonNull
    public static IncludeOnePre2postSectionSelectedBinding bind(@NonNull View view) {
        int i = R.id.buttonEditProposition;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.layoutProposition;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.propositionLabel;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.sectionSelected;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.tvPropositionName;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            return new IncludeOnePre2postSectionSelectedBinding((ConstraintLayout) view, linearLayoutCompat, constraintLayout, oneFontTextView, cardView, oneFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOnePre2postSectionSelectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOnePre2postSectionSelectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_pre2post_section_selected, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84280a;
    }
}
