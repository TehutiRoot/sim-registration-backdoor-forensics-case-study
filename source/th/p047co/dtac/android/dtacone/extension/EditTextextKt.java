package th.p047co.dtac.android.dtacone.extension;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.EditTextextKt;
import th.p047co.dtac.android.dtacone.extension.format.MaskFormatter;
import th.p047co.dtac.android.dtacone.util.IdCardMaskFormatter;
import th.p047co.dtac.android.dtacone.util.PhoneMaskFormatter;

@Metadata(m28851d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0004\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0004\u001a\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0004\u001a-\u0010\u0011\u001a\u00020\u0001*\u00020\u00022!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0013\u001a\n\u0010\u0017\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0017\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0006\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u001a"}, m28850d2 = {"disableCopyPast", "", "Landroid/widget/EditText;", "filterDenySpecialChar", "filterDenySpecialCharAndMaxLength", "length", "", "filterDenySpecialCharForNumberOnly", "filterOnlyNamingChar", "filterOnlyNamingCharMaxLength", "limitLength", "maxLength", "maskFormat", "str", "", "maskIDCardFormat", "maskPhoneFormat", "onRightDrawableClicked", "onClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", Promotion.ACTION_VIEW, "setupClearButtonWithAction", UriUtil.LOCAL_RESOURCE_SCHEME, "toUpperCase", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.extension.EditTextextKt */
/* loaded from: classes7.dex */
public final class EditTextextKt {
    /* renamed from: A */
    public static final boolean m19503A(int i) {
        return 3632 <= i && i < 3662;
    }

    /* renamed from: B */
    public static final CharSequence m19502B(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if ((!m19476y(String.valueOf(charSequence.charAt(i))) && !m19503A(charSequence.charAt(i)) && !m19475z(String.valueOf(charSequence.charAt(i)))) || m19477x(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: C */
    public static final boolean m19501C(Function1 function1, EditText editText, View view, MotionEvent motionEvent) {
        if (view instanceof EditText) {
            EditText editText2 = (EditText) view;
            if (motionEvent.getX() >= editText2.getWidth() - editText2.getTotalPaddingRight()) {
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                function1.invoke(editText);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ CharSequence m19500a(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m19478w(charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m19499b(Function1 function1, EditText editText, View view, MotionEvent motionEvent) {
        return m19501C(function1, editText, view, motionEvent);
    }

    /* renamed from: c */
    public static /* synthetic */ CharSequence m19498c(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m19502B(charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: d */
    public static /* synthetic */ CharSequence m19497d(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m19491j(charSequence, i, i2, spanned, i3, i4);
    }

    public static final void disableCopyPast(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: th.co.dtac.android.dtacone.extension.EditTextextKt$disableCopyPast$1
            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(@Nullable ActionMode actionMode, @Nullable MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(@Nullable ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(@Nullable ActionMode actionMode, @Nullable Menu menu) {
                return false;
            }
        });
    }

    /* renamed from: e */
    public static /* synthetic */ CharSequence m19496e(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m19483r(charSequence, i, i2, spanned, i3, i4);
    }

    /* renamed from: f */
    public static /* synthetic */ CharSequence m19495f(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return m19487n(charSequence, i, i2, spanned, i3, i4);
    }

    public static final void filterDenySpecialChar(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter inputFilter = new InputFilter() { // from class: YQ
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return EditTextextKt.m19497d(charSequence, i, i2, spanned, i3, i4);
            }
        };
        editText.setInputType(524288);
        editText.setFilters(new InputFilter[]{inputFilter});
    }

    public static final void filterDenySpecialCharAndMaxLength(@NotNull EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter inputFilter = new InputFilter() { // from class: bR
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return EditTextextKt.m19495f(charSequence, i2, i3, spanned, i4, i5);
            }
        };
        editText.setInputType(524288);
        editText.setFilters(new InputFilter[]{inputFilter, new InputFilter.LengthFilter(i)});
    }

    public static final void filterDenySpecialCharForNumberOnly(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter inputFilter = new InputFilter() { // from class: XQ
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return EditTextextKt.m19496e(charSequence, i, i2, spanned, i3, i4);
            }
        };
        editText.setInputType(3);
        editText.setFilters(new InputFilter[]{inputFilter});
    }

    public static final void filterOnlyNamingChar(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter inputFilter = new InputFilter() { // from class: aR
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return EditTextextKt.m19500a(charSequence, i, i2, spanned, i3, i4);
            }
        };
        editText.setInputType(524288);
        editText.setFilters(new InputFilter[]{inputFilter});
    }

    public static final void filterOnlyNamingCharMaxLength(@NotNull EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter inputFilter = new InputFilter() { // from class: ZQ
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return EditTextextKt.m19498c(charSequence, i2, i3, spanned, i4, i5);
            }
        };
        editText.setInputType(524288);
        editText.setFilters(new InputFilter[]{inputFilter, new InputFilter.LengthFilter(i)});
    }

    /* renamed from: g */
    public static final boolean m19494g(String str) {
        return new Regex("[a-zA-Z0-9ก-ฮ๑-๙]").matches(str);
    }

    /* renamed from: h */
    public static final boolean m19493h(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) " _-*[]()/@.,?", (CharSequence) str, false, 2, (Object) null);
    }

    /* renamed from: i */
    public static final boolean m19492i(int i) {
        return 3632 <= i && i < 3662;
    }

    /* renamed from: j */
    public static final CharSequence m19491j(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!m19494g(String.valueOf(charSequence.charAt(i))) && !m19492i(charSequence.charAt(i)) && !m19493h(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: k */
    public static final boolean m19490k(String str) {
        return new Regex("[a-zA-Z0-9ก-ฮ๑-๙]").matches(str);
    }

    /* renamed from: l */
    public static final boolean m19489l(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) " _-*[]()/@.,?", (CharSequence) str, false, 2, (Object) null);
    }

    public static final void limitLength(@NotNull EditText editText, int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: m */
    public static final boolean m19488m(int i) {
        return 3632 <= i && i < 3662;
    }

    public static final void maskFormat(@NotNull EditText editText, @NotNull String str) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        editText.addTextChangedListener(new MaskFormatter(str, editText));
    }

    public static final void maskIDCardFormat(@NotNull EditText editText, @NotNull String str) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        editText.addTextChangedListener(new IdCardMaskFormatter(str, editText));
    }

    public static final void maskPhoneFormat(@NotNull EditText editText, @NotNull String str) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        editText.addTextChangedListener(new PhoneMaskFormatter(str, editText));
    }

    /* renamed from: n */
    public static final CharSequence m19487n(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!m19490k(String.valueOf(charSequence.charAt(i))) && !m19488m(charSequence.charAt(i)) && !m19489l(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: o */
    public static final boolean m19486o(String str) {
        return new Regex("[0-9๑-๙]").matches(str);
    }

    public static final void onRightDrawableClicked(@NotNull final EditText editText, @NotNull final Function1<? super EditText, Unit> onClicked) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: WQ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EditTextextKt.m19499b(onClicked, editText, view, motionEvent);
            }
        });
    }

    /* renamed from: p */
    public static final boolean m19485p(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) " _-*[]()/@.,?", (CharSequence) str, false, 2, (Object) null);
    }

    /* renamed from: q */
    public static final boolean m19484q(int i) {
        return 3632 <= i && i < 3662;
    }

    /* renamed from: r */
    public static final CharSequence m19483r(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if (!m19486o(String.valueOf(charSequence.charAt(i))) && !m19484q(charSequence.charAt(i)) && !m19485p(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: s */
    public static final boolean m19482s(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) "฿", (CharSequence) str, false, 2, (Object) null);
    }

    public static final void setupClearButtonWithAction(@NotNull final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.extension.EditTextextKt$setupClearButtonWithAction$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                int i;
                if (editable != null && editable.length() > 0) {
                    i = R.drawable.ic_baseline_cancel_24;
                } else {
                    i = 0;
                }
                editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    /* renamed from: t */
    public static final boolean m19481t(String str) {
        return new Regex("[a-zA-Zก-ฮ]").matches(str);
    }

    public static final void toUpperCase(@NotNull EditText editText, int i) {
        InputFilter.AllCaps[] allCapsArr;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        if (i == 0) {
            allCapsArr = new InputFilter.AllCaps[]{new InputFilter.AllCaps()};
        } else {
            allCapsArr = new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(i)};
        }
        editText.setFilters(allCapsArr);
    }

    public static /* synthetic */ void toUpperCase$default(EditText editText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        toUpperCase(editText, i);
    }

    /* renamed from: u */
    public static final boolean m19480u(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, (CharSequence) str, false, 2, (Object) null);
    }

    /* renamed from: v */
    public static final boolean m19479v(int i) {
        return 3632 <= i && i < 3662;
    }

    /* renamed from: w */
    public static final CharSequence m19478w(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            if ((!m19481t(String.valueOf(charSequence.charAt(i))) && !m19479v(charSequence.charAt(i)) && !m19480u(String.valueOf(charSequence.charAt(i)))) || m19482s(String.valueOf(charSequence.charAt(i)))) {
                return "";
            }
            i++;
        }
        return null;
    }

    /* renamed from: x */
    public static final boolean m19477x(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) "฿", (CharSequence) str, false, 2, (Object) null);
    }

    /* renamed from: y */
    public static final boolean m19476y(String str) {
        return new Regex("[a-zA-Zก-ฮ]").matches(str);
    }

    /* renamed from: z */
    public static final boolean m19475z(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, (CharSequence) str, false, 2, (Object) null);
    }

    public static final void setupClearButtonWithAction(@NotNull final EditText editText, @DrawableRes final int i) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.addTextChangedListener(new TextWatcher() { // from class: th.co.dtac.android.dtacone.extension.EditTextextKt$setupClearButtonWithAction$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                int i2;
                if (editable != null && editable.length() > 0) {
                    i2 = i;
                } else {
                    i2 = 0;
                }
                editText.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
    }
}
