package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpWriteSimBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpWriteSimBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83898a;
    @NonNull
    public final AdjustableImageView ivInsertSimCard;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding switchModeToSmartCard;
    @NonNull
    public final DtacFontTextView tvWarning;

    public FragmentMrtrMnpWriteSimBinding(NestedScrollView nestedScrollView, AdjustableImageView adjustableImageView, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, DtacFontTextView dtacFontTextView) {
        this.f83898a = nestedScrollView;
        this.ivInsertSimCard = adjustableImageView;
        this.switchModeToSmartCard = zIncludeSwitchModeCameraBinding;
        this.tvWarning = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrMnpWriteSimBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivInsertSimCard;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.switchModeToSmartCard))) != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.tvWarning;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView != null) {
                return new FragmentMrtrMnpWriteSimBinding((NestedScrollView) view, adjustableImageView, bind, dtacFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpWriteSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpWriteSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_write_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83898a;
    }
}