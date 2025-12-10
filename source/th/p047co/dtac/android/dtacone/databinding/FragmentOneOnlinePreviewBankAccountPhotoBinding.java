package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlinePreviewBankAccountPhotoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlinePreviewBankAccountPhotoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83991a;
    @NonNull
    public final LinearLayout bottom;
    @NonNull
    public final OneFontButton btnPhotoOk;
    @NonNull
    public final OneFontButton btnRetry;
    @NonNull
    public final AdjustableImageView ivPreview;
    @NonNull
    public final FrameLayout middle;
    @NonNull
    public final OneTransparentToolbarBinding toolbarLayout;
    @NonNull
    public final FrameLayout top;

    public FragmentOneOnlinePreviewBankAccountPhotoBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, AdjustableImageView adjustableImageView, FrameLayout frameLayout, OneTransparentToolbarBinding oneTransparentToolbarBinding, FrameLayout frameLayout2) {
        this.f83991a = constraintLayout;
        this.bottom = linearLayout;
        this.btnPhotoOk = oneFontButton;
        this.btnRetry = oneFontButton2;
        this.ivPreview = adjustableImageView;
        this.middle = frameLayout;
        this.toolbarLayout = oneTransparentToolbarBinding;
        this.top = frameLayout2;
    }

    @NonNull
    public static FragmentOneOnlinePreviewBankAccountPhotoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.bottom;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btnPhotoOk;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.btnRetry;
                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton2 != null) {
                    i = R.id.ivPreview;
                    AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                    if (adjustableImageView != null) {
                        i = R.id.middle;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
                            OneTransparentToolbarBinding bind = OneTransparentToolbarBinding.bind(findChildViewById);
                            i = R.id.top;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                return new FragmentOneOnlinePreviewBankAccountPhotoBinding((ConstraintLayout) view, linearLayout, oneFontButton, oneFontButton2, adjustableImageView, frameLayout, bind, frameLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlinePreviewBankAccountPhotoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlinePreviewBankAccountPhotoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_preview_bank_account_photo, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83991a;
    }
}
