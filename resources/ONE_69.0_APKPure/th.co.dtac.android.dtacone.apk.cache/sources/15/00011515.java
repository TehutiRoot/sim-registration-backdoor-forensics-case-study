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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeSimWriteBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeSimWriteBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83776a;
    @NonNull
    public final AdjustableImageView ivInsertSimCard;
    @NonNull
    public final DtacFontTextView tvWarning;

    public FragmentChangeSimWriteBinding(NestedScrollView nestedScrollView, AdjustableImageView adjustableImageView, DtacFontTextView dtacFontTextView) {
        this.f83776a = nestedScrollView;
        this.ivInsertSimCard = adjustableImageView;
        this.tvWarning = dtacFontTextView;
    }

    @NonNull
    public static FragmentChangeSimWriteBinding bind(@NonNull View view) {
        int i = R.id.ivInsertSimCard;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null) {
            i = R.id.tvWarning;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new FragmentChangeSimWriteBinding((NestedScrollView) view, adjustableImageView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeSimWriteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeSimWriteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_sim_write, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83776a;
    }
}