package androidx.compose.p003ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\bø\u0001\u0000\u001a\"\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m29142d2 = {"addExactOrElse", "", OneNadOutboundSearchFragment.POSITION_RIGHT, "defaultValue", "Lkotlin/Function0;", "subtractExactOrElse", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.input.MathUtilsKt */
/* loaded from: classes2.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i, int i2, @NotNull Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            return defaultValue.invoke().intValue();
        }
        return i3;
    }

    public static final int subtractExactOrElse(int i, int i2, @NotNull Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int i3 = i - i2;
        if (((i ^ i3) & (i2 ^ i)) < 0) {
            return defaultValue.invoke().intValue();
        }
        return i3;
    }
}