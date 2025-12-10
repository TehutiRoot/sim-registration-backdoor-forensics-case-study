package th.p047co.dtac.android.dtacone.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.format.OneCreditCardSpanUtils;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/IdCardMaskFormatter;", "Landroid/text/TextWatcher;", "", "format", "Landroid/widget/EditText;", "editText", "<init>", "(Ljava/lang/String;Landroid/widget/EditText;)V", "", OperatorName.CLOSE_AND_STROKE, "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "before", "onTextChanged", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/EditText;", "Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "getFormatter", "()Lth/co/dtac/android/dtacone/extension/format/TextFormatter;", "formatter", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.IdCardMaskFormatter */
/* loaded from: classes8.dex */
public final class IdCardMaskFormatter implements TextWatcher {
    public static final int $stable = 8;

    /* renamed from: a */
    public final String f87054a;

    /* renamed from: b */
    public final EditText f87055b;

    /* renamed from: c */
    public final Lazy f87056c;

    public IdCardMaskFormatter(@NotNull String format, @NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(editText, "editText");
        this.f87054a = format;
        this.f87055b = editText;
        this.f87056c = LazyKt__LazyJVMKt.lazy(new IdCardMaskFormatter$formatter$2(this));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable editable) {
        int i;
        Object[] objArr;
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        if (editable != null) {
            objArr = (OneCreditCardSpanUtils[]) editable.getSpans(0, editable.length(), OneCreditCardSpanUtils.class);
        } else {
            objArr = null;
        }
        if (objArr != null) {
            for (Integer num : objArr) {
                if (num == null) {
                    num = 0;
                }
                editable.removeSpan(num);
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (ArraysKt___ArraysKt.contains(new Integer[]{0, 4, 9, 11}, Integer.valueOf(i2))) {
                OneCreditCardSpanUtils oneCreditCardSpanUtils = new OneCreditCardSpanUtils(12);
                if (editable != null) {
                    editable.setSpan(oneCreditCardSpanUtils, i2, i2 + 1, 33);
                }
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
    }
}