package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZAddPhotoItemListBinding */
/* loaded from: classes7.dex */
public final class ZAddPhotoItemListBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84581a;
    @NonNull
    public final AppCompatImageView btnTakePhoto;
    @NonNull
    public final RelativeLayout cameraBox;
    @NonNull
    public final View circleTakePhoto;
    @NonNull
    public final DtacFontTextView tvAddMorePhoto;
    @NonNull
    public final DtacFontTextView tvIdCardLabel;

    public ZAddPhotoItemListBinding(PercentRelativeLayout percentRelativeLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, View view, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84581a = percentRelativeLayout;
        this.btnTakePhoto = appCompatImageView;
        this.cameraBox = relativeLayout;
        this.circleTakePhoto = view;
        this.tvAddMorePhoto = dtacFontTextView;
        this.tvIdCardLabel = dtacFontTextView2;
    }

    @NonNull
    public static ZAddPhotoItemListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnTakePhoto;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.cameraBox;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.circleTakePhoto))) != null) {
                i = R.id.tvAddMorePhoto;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvIdCardLabel;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ZAddPhotoItemListBinding((PercentRelativeLayout) view, appCompatImageView, relativeLayout, findChildViewById, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZAddPhotoItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZAddPhotoItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_add_photo_item_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84581a;
    }
}
