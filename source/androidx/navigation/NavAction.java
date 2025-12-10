package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Landroidx/navigation/NavAction;", "", "", "destinationId", "Landroidx/navigation/NavOptions;", "navOptions", "Landroid/os/Bundle;", "defaultArguments", "<init>", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getDestinationId", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/navigation/NavOptions;", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", OperatorName.CURVE_TO, "Landroid/os/Bundle;", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "navigation-common_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavAction {

    /* renamed from: a */
    public final int f36188a;

    /* renamed from: b */
    public NavOptions f36189b;

    /* renamed from: c */
    public Bundle f36190c;

    @JvmOverloads
    public NavAction(@IdRes int i) {
        this(i, null, null, 6, null);
    }

    @Nullable
    public final Bundle getDefaultArguments() {
        return this.f36190c;
    }

    public final int getDestinationId() {
        return this.f36188a;
    }

    @Nullable
    public final NavOptions getNavOptions() {
        return this.f36189b;
    }

    public final void setDefaultArguments(@Nullable Bundle bundle) {
        this.f36190c = bundle;
    }

    public final void setNavOptions(@Nullable NavOptions navOptions) {
        this.f36189b = navOptions;
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions) {
        this(i, navOptions, null, 4, null);
    }

    @JvmOverloads
    public NavAction(@IdRes int i, @Nullable NavOptions navOptions, @Nullable Bundle bundle) {
        this.f36188a = i;
        this.f36189b = navOptions;
        this.f36190c = bundle;
    }

    public /* synthetic */ NavAction(int i, NavOptions navOptions, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : navOptions, (i2 & 4) != 0 ? null : bundle);
    }
}
