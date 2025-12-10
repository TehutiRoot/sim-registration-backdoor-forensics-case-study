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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityPureSmartCardBinding */
/* loaded from: classes7.dex */
public final class ActivityPureSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83672a;
    @NonNull
    public final ZIncludeReadIdCardBinding incReadIdCard;
    @NonNull
    public final ZToolbarBinding incToolBar;

    public ActivityPureSmartCardBinding(NestedScrollView nestedScrollView, ZIncludeReadIdCardBinding zIncludeReadIdCardBinding, ZToolbarBinding zToolbarBinding) {
        this.f83672a = nestedScrollView;
        this.incReadIdCard = zIncludeReadIdCardBinding;
        this.incToolBar = zToolbarBinding;
    }

    @NonNull
    public static ActivityPureSmartCardBinding bind(@NonNull View view) {
        int i = R.id.incReadIdCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeReadIdCardBinding bind = ZIncludeReadIdCardBinding.bind(findChildViewById);
            int i2 = R.id.incToolBar;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                return new ActivityPureSmartCardBinding((NestedScrollView) view, bind, ZToolbarBinding.bind(findChildViewById2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPureSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPureSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_pure_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83672a;
    }
}