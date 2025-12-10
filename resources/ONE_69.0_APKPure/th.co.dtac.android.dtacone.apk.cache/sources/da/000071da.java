package androidx.navigation;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m29142d2 = {"Landroidx/navigation/AnimBuilder;", "", "<init>", "()V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getEnter", "()I", "setEnter", "(I)V", "enter", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getExit", "setExit", "exit", OperatorName.CURVE_TO, "getPopEnter", "setPopEnter", "popEnter", "d", "getPopExit", "setPopExit", "popExit", "navigation-common_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@NavOptionsDsl
/* loaded from: classes2.dex */
public final class AnimBuilder {

    /* renamed from: a */
    public int f36270a = -1;

    /* renamed from: b */
    public int f36271b = -1;

    /* renamed from: c */
    public int f36272c = -1;

    /* renamed from: d */
    public int f36273d = -1;

    public final int getEnter() {
        return this.f36270a;
    }

    public final int getExit() {
        return this.f36271b;
    }

    public final int getPopEnter() {
        return this.f36272c;
    }

    public final int getPopExit() {
        return this.f36273d;
    }

    public final void setEnter(int i) {
        this.f36270a = i;
    }

    public final void setExit(int i) {
        this.f36271b = i;
    }

    public final void setPopEnter(int i) {
        this.f36272c = i;
    }

    public final void setPopExit(int i) {
        this.f36273d = i;
    }
}