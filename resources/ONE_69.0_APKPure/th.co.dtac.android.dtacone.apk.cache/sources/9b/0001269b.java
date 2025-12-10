package th.p047co.dtac.android.dtacone.util;

import android.text.InputFilter;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.FilterEditText;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/FilterEditText;", "", "()V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.FilterEditText */
/* loaded from: classes8.dex */
public final class FilterEditText {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public static InputFilter f87052a = new InputFilter() { // from class: W00
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return FilterEditText.m16805a(charSequence, i, i2, spanned, i3, i4);
        }
    };

    /* renamed from: b */
    public static InputFilter f87053b = new InputFilter() { // from class: X00
        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return FilterEditText.m16804b(charSequence, i, i2, spanned, i3, i4);
        }
    };

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/FilterEditText$Companion;", "", "()V", "filterPattern", "Landroid/text/InputFilter;", "getFilterPattern", "()Landroid/text/InputFilter;", "setFilterPattern", "(Landroid/text/InputFilter;)V", "filterUsernamePattern", "getFilterUsernamePattern", "setFilterUsernamePattern", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.FilterEditText$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InputFilter getFilterPattern() {
            return FilterEditText.f87052a;
        }

        @NotNull
        public final InputFilter getFilterUsernamePattern() {
            return FilterEditText.f87053b;
        }

        public final void setFilterPattern(@NotNull InputFilter inputFilter) {
            Intrinsics.checkNotNullParameter(inputFilter, "<set-?>");
            FilterEditText.f87052a = inputFilter;
        }

        public final void setFilterUsernamePattern(@NotNull InputFilter inputFilter) {
            Intrinsics.checkNotNullParameter(inputFilter, "<set-?>");
            FilterEditText.f87053b = inputFilter;
        }

        public Companion() {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ CharSequence m16805a(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m16803c(charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: b */
    public static /* synthetic */ CharSequence m16804b(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m16802d(charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: c */
    public static final CharSequence m16803c(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!new Regex("[\u0e00-\u0e7fa-zA-Z0-9( )_@;,.&/-]").matches(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: d */
    public static final CharSequence m16802d(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!new Regex("[a-zA-Z0-9]").matches(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }
}