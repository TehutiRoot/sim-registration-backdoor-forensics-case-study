package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacIdCardEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneNumberEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpdateRtrProfileBinding */
/* loaded from: classes7.dex */
public final class FragmentUpdateRtrProfileBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84223a;
    @NonNull
    public final DtacFontButton btnUpdate;
    @NonNull
    public final ConstraintLayout container;
    @NonNull
    public final View dividerId;
    @NonNull
    public final View dividerLastName;
    @NonNull
    public final View dividerName;
    @NonNull
    public final View dividerPhoneNumber;
    @NonNull
    public final DtacIdCardEditText edtIdCard;
    @NonNull
    public final DtacClearableEditText edtLastName;
    @NonNull
    public final DtacClearableEditText edtName;
    @NonNull
    public final DtacPhoneNumberEditText edtPhoneNumber;
    @NonNull
    public final Guideline guideline;
    @NonNull
    public final ImageView ivCamera;
    @NonNull
    public final ImageView ivUpdateIdCard;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final Space space;
    @NonNull
    public final DtacFontTextView tvCameraLabel;
    @NonNull
    public final DtacFontTextView tvIdCardLabel;
    @NonNull
    public final DtacFontTextView tvLastNameLabel;
    @NonNull
    public final DtacFontTextView tvNameLabel;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;

    public FragmentUpdateRtrProfileBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, DtacIdCardEditText dtacIdCardEditText, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacPhoneNumberEditText dtacPhoneNumberEditText, Guideline guideline, ImageView imageView, ImageView imageView2, NestedScrollView nestedScrollView2, Space space, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84223a = nestedScrollView;
        this.btnUpdate = dtacFontButton;
        this.container = constraintLayout;
        this.dividerId = view;
        this.dividerLastName = view2;
        this.dividerName = view3;
        this.dividerPhoneNumber = view4;
        this.edtIdCard = dtacIdCardEditText;
        this.edtLastName = dtacClearableEditText;
        this.edtName = dtacClearableEditText2;
        this.edtPhoneNumber = dtacPhoneNumberEditText;
        this.guideline = guideline;
        this.ivCamera = imageView;
        this.ivUpdateIdCard = imageView2;
        this.nestedScrollView = nestedScrollView2;
        this.space = space;
        this.tvCameraLabel = dtacFontTextView;
        this.tvIdCardLabel = dtacFontTextView2;
        this.tvLastNameLabel = dtacFontTextView3;
        this.tvNameLabel = dtacFontTextView4;
        this.tvPhoneNumberLabel = dtacFontTextView5;
    }

    @NonNull
    public static FragmentUpdateRtrProfileBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        int i = R.id.btnUpdate;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dividerId))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.dividerLastName))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.dividerName))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.dividerPhoneNumber))) != null) {
                i = R.id.edtIdCard;
                DtacIdCardEditText dtacIdCardEditText = (DtacIdCardEditText) ViewBindings.findChildViewById(view, i);
                if (dtacIdCardEditText != null) {
                    i = R.id.edtLastName;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.edtName;
                        DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText2 != null) {
                            i = R.id.edtPhoneNumber;
                            DtacPhoneNumberEditText dtacPhoneNumberEditText = (DtacPhoneNumberEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacPhoneNumberEditText != null) {
                                i = R.id.guideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = R.id.ivCamera;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.ivUpdateIdCard;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i = R.id.space;
                                            Space space = (Space) ViewBindings.findChildViewById(view, i);
                                            if (space != null) {
                                                i = R.id.tvCameraLabel;
                                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView != null) {
                                                    i = R.id.tvIdCardLabel;
                                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView2 != null) {
                                                        i = R.id.tvLastNameLabel;
                                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView3 != null) {
                                                            i = R.id.tvNameLabel;
                                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView4 != null) {
                                                                i = R.id.tvPhoneNumberLabel;
                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView5 != null) {
                                                                    return new FragmentUpdateRtrProfileBinding(nestedScrollView, dtacFontButton, constraintLayout, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, dtacIdCardEditText, dtacClearableEditText, dtacClearableEditText2, dtacPhoneNumberEditText, guideline, imageView, imageView2, nestedScrollView, space, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentUpdateRtrProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpdateRtrProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_rtr_profile, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84223a;
    }
}
