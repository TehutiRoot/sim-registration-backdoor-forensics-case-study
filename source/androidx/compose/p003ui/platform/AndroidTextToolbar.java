package androidx.compose.p003ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p003ui.platform.actionmodecallback.PrimaryTextActionModeCallback;
import androidx.compose.p003ui.platform.actionmodecallback.TextActionModeCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "Landroid/view/View;", Promotion.ACTION_VIEW, "<init>", "(Landroid/view/View;)V", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "hide", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/View;", "Landroid/view/ActionMode;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/ActionMode;", "actionMode", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", OperatorName.CURVE_TO, "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "textActionModeCallback", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "d", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", NotificationCompat.CATEGORY_STATUS, "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar */
/* loaded from: classes2.dex */
public final class AndroidTextToolbar implements TextToolbar {

    /* renamed from: a */
    public final View f30609a;

    /* renamed from: b */
    public ActionMode f30610b;

    /* renamed from: c */
    public final TextActionModeCallback f30611c;

    /* renamed from: d */
    public TextToolbarStatus f30612d;

    public AndroidTextToolbar(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f30609a = view;
        this.f30611c = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this), null, null, null, null, null, 62, null);
        this.f30612d = TextToolbarStatus.Hidden;
    }

    @Override // androidx.compose.p003ui.platform.TextToolbar
    @NotNull
    public TextToolbarStatus getStatus() {
        return this.f30612d;
    }

    @Override // androidx.compose.p003ui.platform.TextToolbar
    public void hide() {
        this.f30612d = TextToolbarStatus.Hidden;
        ActionMode actionMode = this.f30610b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f30610b = null;
    }

    @Override // androidx.compose.p003ui.platform.TextToolbar
    public void showMenu(@NotNull Rect rect, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable Function0<Unit> function04) {
        ActionMode startActionMode;
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f30611c.setRect(rect);
        this.f30611c.setOnCopyRequested(function0);
        this.f30611c.setOnCutRequested(function03);
        this.f30611c.setOnPasteRequested(function02);
        this.f30611c.setOnSelectAllRequested(function04);
        ActionMode actionMode = this.f30610b;
        if (actionMode == null) {
            this.f30612d = TextToolbarStatus.Shown;
            if (Build.VERSION.SDK_INT >= 23) {
                startActionMode = TextToolbarHelperMethods.INSTANCE.startActionMode(this.f30609a, new FloatingTextActionModeCallback(this.f30611c), 1);
            } else {
                startActionMode = this.f30609a.startActionMode(new PrimaryTextActionModeCallback(this.f30611c));
            }
            this.f30610b = startActionMode;
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }
}
