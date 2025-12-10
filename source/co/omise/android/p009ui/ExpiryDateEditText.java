package co.omise.android.p009ui;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.extensions.EditTextExtensionsKt;
import co.omise.android.p009ui.InputValidationException;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u0003456B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.B\u001b\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b-\u00101B#\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00102\u001a\u00020\r¢\u0006\u0004\b-\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002J\u001c\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f*\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rR\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00060\u001bR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001b\u0010#\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010$\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010'¨\u00067"}, m28850d2 = {"Lco/omise/android/ui/ExpiryDateEditText;", "Lco/omise/android/ui/OmiseEditText;", "", "dateString", "", "setExpiryDateText", "formattedString", "notifyExpiryDateChanged", "str", "formatString", "addDateSeparatorIfNeed", "addZeroPrefixIfNeed", "Lkotlin/Pair;", "", "separateDates", "selStart", "selEnd", "onSelectionChanged", "validate", "Lco/omise/android/ui/ExpiryDateEditText$ExpiryDateChangeListener;", "textListener", "setInternalTextChangedListener", "month", "year", "setExpiryDate", "cursorPosition", "I", "Lco/omise/android/ui/ExpiryDateEditText$a;", "textWatcher", "Lco/omise/android/ui/ExpiryDateEditText$a;", "Lco/omise/android/ui/ExpiryDateEditText$ExpiryDateChangeListener;", "startedYear$delegate", "Lkotlin/Lazy;", "getStartedYear", "()I", "startedYear", "expiryMonth", "getExpiryMonth", "setExpiryMonth", "(I)V", "expiryYear", "getExpiryYear", "setExpiryYear", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "ExpiryDateChangeListener", PDPageLabelRange.STYLE_LETTERS_LOWER, "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1})
/* renamed from: co.omise.android.ui.ExpiryDateEditText */
/* loaded from: classes3.dex */
public final class ExpiryDateEditText extends OmiseEditText {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String DATE_SEPARATOR = "/";
    private static final int MAX_CHARS = 5;
    private static final int MAX_MONTH = 12;
    private static final int YEAR_LAST_TWO_DIGIT_MOD = 100;
    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int cursorPosition;
    private int expiryMonth;
    private int expiryYear;
    @NotNull
    private final Lazy startedYear$delegate;
    @Nullable
    private ExpiryDateChangeListener textListener;
    @NotNull
    private C5603a textWatcher;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Lco/omise/android/ui/ExpiryDateEditText$Companion;", "", "()V", "DATE_SEPARATOR", "", "MAX_CHARS", "", "MAX_MONTH", "YEAR_LAST_TWO_DIGIT_MOD", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.ExpiryDateEditText$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m28850d2 = {"Lco/omise/android/ui/ExpiryDateEditText$ExpiryDateChangeListener;", "", "textFormatted", "", "month", "", "year", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* renamed from: co.omise.android.ui.ExpiryDateEditText$ExpiryDateChangeListener */
    /* loaded from: classes3.dex */
    public interface ExpiryDateChangeListener {
        void textFormatted(@Nullable Integer num, @Nullable Integer num2);
    }

    /* renamed from: co.omise.android.ui.ExpiryDateEditText$a */
    /* loaded from: classes3.dex */
    public final class C5603a implements TextWatcher {

        /* renamed from: a */
        public String f40333a = "";

        public C5603a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            Editable text = ExpiryDateEditText.this.getText();
            if (text != null) {
                ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                expiryDateEditText.cursorPosition = text.length() - expiryDateEditText.getSelectionStart();
            }
            this.f40333a = s.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(s, "s");
            if (s.length() >= this.f40333a.length()) {
                ExpiryDateEditText.this.setExpiryDateText(s.toString());
                ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                expiryDateEditText.notifyExpiryDateChanged(String.valueOf(expiryDateEditText.getText()));
                return;
            }
            String str = this.f40333a;
            if (!Intrinsics.areEqual(String.valueOf(str.charAt(str.length() - 1)), "/")) {
                ExpiryDateEditText.this.notifyExpiryDateChanged(s.toString());
                return;
            }
            String obj = s.subSequence(0, s.length() - 1).toString();
            ExpiryDateEditText.this.setText(obj);
            ExpiryDateEditText.this.notifyExpiryDateChanged(obj);
        }
    }

    /* renamed from: co.omise.android.ui.ExpiryDateEditText$b */
    /* loaded from: classes3.dex */
    public static final class C5604b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final C5604b f40335a = new C5604b();

        public C5604b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Integer invoke() {
            int i = Calendar.getInstance().get(1);
            return Integer.valueOf(i - (i % 100));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.textWatcher = new C5603a();
        this.startedYear$delegate = LazyKt__LazyJVMKt.lazy(C5604b.f40335a);
        addTextChangedListener(this.textWatcher);
        EditTextExtensionsKt.disableOptions(this);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setInputType(2);
    }

    private final String addDateSeparatorIfNeed(String str) {
        if (str.length() == 2 && !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null)) {
            return str + '/';
        }
        return str;
    }

    private final String addZeroPrefixIfNeed(String str) {
        if (Integer.parseInt(str) > 1) {
            return '0' + str;
        }
        return str;
    }

    private final String formatString(String str) {
        if (str.length() == 1 && Integer.parseInt(str) > 1) {
            str = addZeroPrefixIfNeed(str);
        } else if (str.length() == 2 && Integer.parseInt(str) > 12) {
            str = "12";
        }
        return addDateSeparatorIfNeed(str);
    }

    public static /* synthetic */ String formatString$default(ExpiryDateEditText expiryDateEditText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return expiryDateEditText.formatString(str);
    }

    private final int getStartedYear() {
        return ((Number) this.startedYear$delegate.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyExpiryDateChanged(String str) {
        int i;
        int i2 = 0;
        if (str.length() == 0) {
            this.expiryMonth = 0;
            this.expiryYear = 0;
            ExpiryDateChangeListener expiryDateChangeListener = this.textListener;
            if (expiryDateChangeListener != null) {
                expiryDateChangeListener.textFormatted(null, null);
                return;
            }
            return;
        }
        Pair<Integer, Integer> separateDates = separateDates(str);
        Integer component1 = separateDates.component1();
        Integer component2 = separateDates.component2();
        if (component1 != null) {
            i = component1.intValue();
        } else {
            i = 0;
        }
        this.expiryMonth = i;
        if (component2 != null) {
            i2 = component2.intValue() + getStartedYear();
        }
        this.expiryYear = i2;
        ExpiryDateChangeListener expiryDateChangeListener2 = this.textListener;
        if (expiryDateChangeListener2 != null) {
            expiryDateChangeListener2.textFormatted(Integer.valueOf(this.expiryMonth), Integer.valueOf(this.expiryYear));
        }
    }

    public static /* synthetic */ void notifyExpiryDateChanged$default(ExpiryDateEditText expiryDateEditText, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        expiryDateEditText.notifyExpiryDateChanged(str);
    }

    private final Pair<Integer, Integer> separateDates(String str) {
        if (str.length() > 0 && !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "/", false, 2, (Object) null)) {
            return new Pair<>(AbstractC20032gN1.toIntOrNull(str), null);
        }
        List<String> split = new Regex("/").split(str, 0);
        if (split.size() > 1) {
            return new Pair<>(AbstractC20032gN1.toIntOrNull(split.get(0)), AbstractC20032gN1.toIntOrNull(split.get(1)));
        }
        return new Pair<>(AbstractC20032gN1.toIntOrNull(split.get(0)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setExpiryDateText(String str) {
        removeTextChangedListener(this.textWatcher);
        setText(formatString(str));
        setSelection(String.valueOf(getText()).length() - this.cursorPosition);
        addTextChangedListener(this.textWatcher);
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById != null) {
                map.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final int getExpiryMonth() {
        return this.expiryMonth;
    }

    public final int getExpiryYear() {
        return this.expiryYear;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Editable text = getText();
        if (text != null) {
            setSelection(text.length());
        }
    }

    public final void setExpiryDate(int i, int i2) throws IllegalArgumentException {
        if (i >= 1 && i <= 12 && i2 >= 1 && i2 <= 99) {
            Editable text = getText();
            if (text != null) {
                text.append((CharSequence) String.valueOf(i));
            }
            Editable text2 = getText();
            if (text2 != null) {
                text2.append((CharSequence) String.valueOf(i2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid month or year.");
    }

    public final void setExpiryMonth(int i) {
        this.expiryMonth = i;
    }

    public final void setExpiryYear(int i) {
        this.expiryYear = i;
    }

    public final void setInternalTextChangedListener(@NotNull ExpiryDateChangeListener textListener) {
        Intrinsics.checkNotNullParameter(textListener, "textListener");
        this.textListener = textListener;
    }

    @Override // co.omise.android.p009ui.OmiseEditText
    public void validate() {
        super.validate();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = this.expiryMonth;
        int i4 = this.expiryYear;
        if (i4 >= i && (i3 != i2 || i4 > i)) {
            return;
        }
        throw InputValidationException.InvalidInputException.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.textWatcher = new C5603a();
        this.startedYear$delegate = LazyKt__LazyJVMKt.lazy(C5604b.f40335a);
        addTextChangedListener(this.textWatcher);
        EditTextExtensionsKt.disableOptions(this);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setInputType(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.textWatcher = new C5603a();
        this.startedYear$delegate = LazyKt__LazyJVMKt.lazy(C5604b.f40335a);
        addTextChangedListener(this.textWatcher);
        EditTextExtensionsKt.disableOptions(this);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setInputType(2);
    }
}
