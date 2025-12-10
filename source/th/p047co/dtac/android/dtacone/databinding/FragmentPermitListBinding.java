package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPermitListBinding */
/* loaded from: classes7.dex */
public final class FragmentPermitListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84137a;
    @NonNull
    public final ImageView arrowBlacklist;
    @NonNull
    public final ConstraintLayout blacklistLayout;
    @NonNull
    public final DtacFontTextView blacklistList;
    @NonNull
    public final View line3Level;
    @NonNull
    public final View lineBlackList;
    @NonNull
    public final View lineGreyList;
    @NonNull
    public final View lineId2Device;
    @NonNull
    public final DtacFontTextView textView3Level;
    @NonNull
    public final DtacFontTextView textViewBlackList;
    @NonNull
    public final DtacFontTextView textViewGreyList;
    @NonNull
    public final DtacFontTextView textViewId2Device;

    public FragmentPermitListBinding(LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, View view, View view2, View view3, View view4, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84137a = linearLayout;
        this.arrowBlacklist = imageView;
        this.blacklistLayout = constraintLayout;
        this.blacklistList = dtacFontTextView;
        this.line3Level = view;
        this.lineBlackList = view2;
        this.lineGreyList = view3;
        this.lineId2Device = view4;
        this.textView3Level = dtacFontTextView2;
        this.textViewBlackList = dtacFontTextView3;
        this.textViewGreyList = dtacFontTextView4;
        this.textViewId2Device = dtacFontTextView5;
    }

    @NonNull
    public static FragmentPermitListBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        int i = R.id.arrowBlacklist;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.blacklistLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.blacklistList;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line3Level))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.lineBlackList))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.lineGreyList))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.lineId2Device))) != null) {
                    i = R.id.textView3Level;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.textViewBlackList;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.textViewGreyList;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.textViewId2Device;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    return new FragmentPermitListBinding((LinearLayout) view, imageView, constraintLayout, dtacFontTextView, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentPermitListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPermitListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_permit_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84137a;
    }
}
