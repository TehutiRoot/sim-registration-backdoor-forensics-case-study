package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpdateRtrAddressBinding */
/* loaded from: classes7.dex */
public final class FragmentUpdateRtrAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84326a;
    @NonNull
    public final DtacFontButton btnUpdate;
    @NonNull
    public final ConstraintLayout constraintLayout2;
    @NonNull
    public final ConstraintLayout constraintLayout3;
    @NonNull
    public final View dividerDistrict;
    @NonNull
    public final View dividerName;
    @NonNull
    public final View dividerPoscode;
    @NonNull
    public final View dividerProvince;
    @NonNull
    public final View dividerRtrCode;
    @NonNull
    public final View dividerSubDistrict;
    @NonNull
    public final DtacFontTextView dtacFontTextView6;
    @NonNull
    public final DtacEditText edtAddress1;
    @NonNull
    public final DtacEditText edtAddress2;
    @NonNull
    public final DtacClearableEditText edtRtrCode;
    @NonNull
    public final DtacClearableEditText edtRtrName;
    @NonNull
    public final Guideline guideline;
    @NonNull
    public final Guideline guideline1;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final DtacFontTextView tvDistrict;
    @NonNull
    public final DtacFontTextView tvDistrictLabel;
    @NonNull
    public final DtacFontTextView tvPostcode;
    @NonNull
    public final DtacFontTextView tvPostcodeLabel;
    @NonNull
    public final DtacFontTextView tvProvince;
    @NonNull
    public final DtacFontTextView tvProvinceLabel;
    @NonNull
    public final DtacFontTextView tvRtrAddressLabel;
    @NonNull
    public final DtacFontTextView tvRtrCodeLabel;
    @NonNull
    public final DtacFontTextView tvRtrNameLabel;
    @NonNull
    public final DtacFontTextView tvSubDistrict;
    @NonNull
    public final DtacFontTextView tvSubDistrictLabel;

    public FragmentUpdateRtrAddressBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, View view2, View view3, View view4, View view5, View view6, DtacFontTextView dtacFontTextView, DtacEditText dtacEditText, DtacEditText dtacEditText2, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, Guideline guideline, Guideline guideline2, NestedScrollView nestedScrollView2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12) {
        this.f84326a = nestedScrollView;
        this.btnUpdate = dtacFontButton;
        this.constraintLayout2 = constraintLayout;
        this.constraintLayout3 = constraintLayout2;
        this.dividerDistrict = view;
        this.dividerName = view2;
        this.dividerPoscode = view3;
        this.dividerProvince = view4;
        this.dividerRtrCode = view5;
        this.dividerSubDistrict = view6;
        this.dtacFontTextView6 = dtacFontTextView;
        this.edtAddress1 = dtacEditText;
        this.edtAddress2 = dtacEditText2;
        this.edtRtrCode = dtacClearableEditText;
        this.edtRtrName = dtacClearableEditText2;
        this.guideline = guideline;
        this.guideline1 = guideline2;
        this.nestedScrollView = nestedScrollView2;
        this.tvDistrict = dtacFontTextView2;
        this.tvDistrictLabel = dtacFontTextView3;
        this.tvPostcode = dtacFontTextView4;
        this.tvPostcodeLabel = dtacFontTextView5;
        this.tvProvince = dtacFontTextView6;
        this.tvProvinceLabel = dtacFontTextView7;
        this.tvRtrAddressLabel = dtacFontTextView8;
        this.tvRtrCodeLabel = dtacFontTextView9;
        this.tvRtrNameLabel = dtacFontTextView10;
        this.tvSubDistrict = dtacFontTextView11;
        this.tvSubDistrictLabel = dtacFontTextView12;
    }

    @NonNull
    public static FragmentUpdateRtrAddressBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        View findChildViewById4;
        View findChildViewById5;
        View findChildViewById6;
        int i = R.id.btnUpdate;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.constraintLayout2;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.constraintLayout3;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.dividerDistrict))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.dividerName))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.dividerPoscode))) != null && (findChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.dividerProvince))) != null && (findChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.dividerRtrCode))) != null && (findChildViewById6 = ViewBindings.findChildViewById(view, (i = R.id.dividerSubDistrict))) != null) {
                    i = R.id.dtacFontTextView6;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.edt_address1;
                        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacEditText != null) {
                            i = R.id.edt_address2;
                            DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacEditText2 != null) {
                                i = R.id.edtRtrCode;
                                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacClearableEditText != null) {
                                    i = R.id.edtRtrName;
                                    DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (dtacClearableEditText2 != null) {
                                        i = R.id.guideline;
                                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                        if (guideline != null) {
                                            i = R.id.guideline1;
                                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                            if (guideline2 != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                i = R.id.tvDistrict;
                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView2 != null) {
                                                    i = R.id.tvDistrictLabel;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null) {
                                                        i = R.id.tvPostcode;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.tvPostcodeLabel;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                i = R.id.tvProvince;
                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView6 != null) {
                                                                    i = R.id.tvProvinceLabel;
                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView7 != null) {
                                                                        i = R.id.tvRtrAddressLabel;
                                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView8 != null) {
                                                                            i = R.id.tvRtrCodeLabel;
                                                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView9 != null) {
                                                                                i = R.id.tvRtrNameLabel;
                                                                                DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView10 != null) {
                                                                                    i = R.id.tvSubDistrict;
                                                                                    DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView11 != null) {
                                                                                        i = R.id.tvSubDistrictLabel;
                                                                                        DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView12 != null) {
                                                                                            return new FragmentUpdateRtrAddressBinding(nestedScrollView, dtacFontButton, constraintLayout, constraintLayout2, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5, findChildViewById6, dtacFontTextView, dtacEditText, dtacEditText2, dtacClearableEditText, dtacClearableEditText2, guideline, guideline2, nestedScrollView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12);
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
    public static FragmentUpdateRtrAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpdateRtrAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_rtr_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84326a;
    }
}