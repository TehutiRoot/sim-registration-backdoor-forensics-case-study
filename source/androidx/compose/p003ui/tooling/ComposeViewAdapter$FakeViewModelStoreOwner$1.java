package androidx.compose.p003ui.tooling;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28850d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/ViewModelStore;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/lifecycle/ViewModelStore;", "vmStore", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$FakeViewModelStoreOwner$1 */
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$FakeViewModelStoreOwner$1 implements ViewModelStoreOwner {

    /* renamed from: a */
    public final ViewModelStore f31612a;

    /* renamed from: b */
    public final ViewModelStore f31613b;

    public ComposeViewAdapter$FakeViewModelStoreOwner$1() {
        ViewModelStore viewModelStore = new ViewModelStore();
        this.f31612a = viewModelStore;
        this.f31613b = viewModelStore;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        return this.f31613b;
    }
}
