package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOnePureSmartCardBinding */
/* loaded from: classes7.dex */
public final class ActivityOnePureSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83655a;
    @NonNull
    public final OneIncludeReadIdCardBinding mainLayout;
    @NonNull
    public final OneToolbarBinding toolBar;

    public ActivityOnePureSmartCardBinding(NestedScrollView nestedScrollView, OneIncludeReadIdCardBinding oneIncludeReadIdCardBinding, OneToolbarBinding oneToolbarBinding) {
        this.f83655a = nestedScrollView;
        this.mainLayout = oneIncludeReadIdCardBinding;
        this.toolBar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOnePureSmartCardBinding bind(@NonNull View view) {
        int i = R.id.mainLayout;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeReadIdCardBinding bind = OneIncludeReadIdCardBinding.bind(findChildViewById);
            int i2 = R.id.toolBar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new ActivityOnePureSmartCardBinding((NestedScrollView) view, bind, OneToolbarBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOnePureSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOnePureSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_pure_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83655a;
    }
}