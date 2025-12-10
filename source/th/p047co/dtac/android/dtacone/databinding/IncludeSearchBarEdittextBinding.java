package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeSearchBarEdittextBinding */
/* loaded from: classes7.dex */
public final class IncludeSearchBarEdittextBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84292a;
    @NonNull
    public final ImageView btnClearText;
    @NonNull
    public final ImageView btnSearch;
    @NonNull
    public final DtacEditText edtSearchBox;

    public IncludeSearchBarEdittextBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, DtacEditText dtacEditText) {
        this.f84292a = relativeLayout;
        this.btnClearText = imageView;
        this.btnSearch = imageView2;
        this.edtSearchBox = dtacEditText;
    }

    @NonNull
    public static IncludeSearchBarEdittextBinding bind(@NonNull View view) {
        int i = R.id.btnClearText;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnSearch;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.edtSearchBox;
                DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                if (dtacEditText != null) {
                    return new IncludeSearchBarEdittextBinding((RelativeLayout) view, imageView, imageView2, dtacEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeSearchBarEdittextBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeSearchBarEdittextBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_search_bar_edittext, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84292a;
    }
}
