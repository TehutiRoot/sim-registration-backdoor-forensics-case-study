package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityDummyEntry2Binding */
/* loaded from: classes7.dex */
public final class ActivityDummyEntry2Binding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83511a;
    @NonNull
    public final FrameLayout mainContrainer;

    public ActivityDummyEntry2Binding(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f83511a = constraintLayout;
        this.mainContrainer = frameLayout;
    }

    @NonNull
    public static ActivityDummyEntry2Binding bind(@NonNull View view) {
        int i = R.id.mainContrainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ActivityDummyEntry2Binding((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDummyEntry2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityDummyEntry2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_dummy_entry2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83511a;
    }
}
