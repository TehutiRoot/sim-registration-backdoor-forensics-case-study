package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSettingSectionItemBinding */
/* loaded from: classes7.dex */
public final class ZSettingSectionItemBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84694a;
    @NonNull
    public final FrameLayout section;
    @NonNull
    public final DtacFontTextView tvSection;

    public ZSettingSectionItemBinding(FrameLayout frameLayout, FrameLayout frameLayout2, DtacFontTextView dtacFontTextView) {
        this.f84694a = frameLayout;
        this.section = frameLayout2;
        this.tvSection = dtacFontTextView;
    }

    @NonNull
    public static ZSettingSectionItemBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.tvSection;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZSettingSectionItemBinding(frameLayout, frameLayout, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSettingSectionItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSettingSectionItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_setting_section_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84694a;
    }
}
