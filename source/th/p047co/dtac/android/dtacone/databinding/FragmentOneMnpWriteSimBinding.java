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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpWriteSimBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpWriteSimBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83988a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final AdjustableImageView ivInsertSimCard;
    @NonNull
    public final OneFontTextView tvWarning;

    public FragmentOneMnpWriteSimBinding(NestedScrollView nestedScrollView, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding, AdjustableImageView adjustableImageView, OneFontTextView oneFontTextView) {
        this.f83988a = nestedScrollView;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
        this.ivInsertSimCard = adjustableImageView;
        this.tvWarning = oneFontTextView;
    }

    @NonNull
    public static FragmentOneMnpWriteSimBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeSwitchModeCameraBinding bind = OneIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.ivInsertSimCard;
            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i2);
            if (adjustableImageView != null) {
                i2 = R.id.tvWarning;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
                if (oneFontTextView != null) {
                    return new FragmentOneMnpWriteSimBinding((NestedScrollView) view, bind, adjustableImageView, oneFontTextView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpWriteSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpWriteSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_write_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83988a;
    }
}
