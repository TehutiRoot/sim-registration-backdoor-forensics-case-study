package androidx.compose.p003ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.geometry.Rect;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@ExperimentalComposeUiApi
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "Landroid/view/View;", Promotion.ACTION_VIEW, "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "<init>", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "", "requestAutofillForNode", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "cancelAutofillForNode", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "getView", "()Landroid/view/View;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "Landroid/view/autofill/AutofillManager;", OperatorName.CURVE_TO, "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.autofill.AndroidAutofill */
/* loaded from: classes2.dex */
public final class AndroidAutofill implements Autofill {

    /* renamed from: a */
    public final View f28951a;

    /* renamed from: b */
    public final AutofillTree f28952b;

    /* renamed from: c */
    public final AutofillManager f28953c;

    public AndroidAutofill(@NotNull View view, @NotNull AutofillTree autofillTree) {
        Object systemService;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(autofillTree, "autofillTree");
        this.f28951a = view;
        this.f28952b = autofillTree;
        systemService = view.getContext().getSystemService(AbstractC1777Z2.m65268a());
        AutofillManager m51996a = AbstractC5327b3.m51996a(systemService);
        if (m51996a != null) {
            this.f28953c = m51996a;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    @Override // androidx.compose.p003ui.autofill.Autofill
    public void cancelAutofillForNode(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        this.f28953c.notifyViewExited(this.f28951a, autofillNode.getId());
    }

    @NotNull
    public final AutofillManager getAutofillManager() {
        return this.f28953c;
    }

    @NotNull
    public final AutofillTree getAutofillTree() {
        return this.f28952b;
    }

    @NotNull
    public final View getView() {
        return this.f28951a;
    }

    @Override // androidx.compose.p003ui.autofill.Autofill
    public void requestAutofillForNode(@NotNull AutofillNode autofillNode) {
        Intrinsics.checkNotNullParameter(autofillNode, "autofillNode");
        Rect boundingBox = autofillNode.getBoundingBox();
        if (boundingBox != null) {
            this.f28953c.notifyViewEntered(this.f28951a, autofillNode.getId(), new android.graphics.Rect(AbstractC22237sr0.roundToInt(boundingBox.getLeft()), AbstractC22237sr0.roundToInt(boundingBox.getTop()), AbstractC22237sr0.roundToInt(boundingBox.getRight()), AbstractC22237sr0.roundToInt(boundingBox.getBottom())));
            return;
        }
        throw new IllegalStateException("requestAutofill called before onChildPositioned()".toString());
    }
}