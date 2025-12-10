package th.p047co.dtac.android.dtacone.util.format;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0018\u0010,\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010!¨\u00060"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/NumberTextWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/EditText;", "et", "", "allowThreeDecimal", "", "maxLength", "<init>", "(Landroid/widget/EditText;ZI)V", "Landroid/text/Editable;", OperatorName.CLOSE_AND_STROKE, "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "", "decimal", OperatorName.CURVE_TO, "(Ljava/lang/String;)Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.ENDPATH, PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Z", "Landroid/widget/EditText;", "Z", "I", "Ljava/text/DecimalFormat;", "d", "Ljava/text/DecimalFormat;", "df", "e", "dfnd", OperatorName.FILL_NON_ZERO, "hasFractionalPart", OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "beforeNum", OperatorName.CLOSE_PATH, "textCursor", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.format.NumberTextWatcher */
/* loaded from: classes8.dex */
public final class NumberTextWatcher implements TextWatcher {

    /* renamed from: a */
    public final EditText f87163a;

    /* renamed from: b */
    public boolean f87164b;

    /* renamed from: c */
    public int f87165c;

    /* renamed from: d */
    public final DecimalFormat f87166d;

    /* renamed from: e */
    public final DecimalFormat f87167e;

    /* renamed from: f */
    public boolean f87168f;

    /* renamed from: g */
    public String f87169g;

    /* renamed from: h */
    public int f87170h;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: i */
    public static final String f87162i = NumberTextWatcher.class.getSimpleName();

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/format/NumberTextWatcher$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.format.NumberTextWatcher$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public NumberTextWatcher(@NotNull EditText et, boolean z, int i) {
        Intrinsics.checkNotNullParameter(et, "et");
        this.f87163a = et;
        this.f87164b = z;
        this.f87165c = i;
        DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
        this.f87166d = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.UNNECESSARY);
        decimalFormat.setDecimalSeparatorAlwaysShown(true);
        DecimalFormat decimalFormat2 = new DecimalFormat("#,###,###");
        this.f87167e = decimalFormat2;
        decimalFormat2.setRoundingMode(RoundingMode.DOWN);
        this.f87168f = false;
    }

    /* renamed from: a */
    public final boolean m16759a(String str) {
        if (AbstractC19741eO1.replace$default(str, ",", "", false, 4, (Object) null).length() > this.f87165c) {
            return true;
        }
        return false;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable s) {
        int i;
        int i2;
        String str;
        String m16758b;
        Intrinsics.checkNotNullParameter(s, "s");
        String obj = s.toString();
        this.f87163a.removeTextChangedListener(this);
        try {
            if (StringsKt__StringsKt.contains$default((CharSequence) obj, (CharSequence) ".", false, 2, (Object) null)) {
                i2 = StringsKt__StringsKt.indexOf$default((CharSequence) obj, '.', 0, false, 6, (Object) null);
                AbstractC19741eO1.replace$default(obj, ".", "", false, 4, (Object) null);
            } else {
                i2 = -1;
            }
            Number parse = this.f87167e.parse(AbstractC19741eO1.replace$default(obj, ",", "", false, 4, (Object) null));
            if (this.f87168f) {
                String str2 = "";
                if (obj.length() > i2) {
                    String substring = obj.substring(i2, obj.length());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    if (!this.f87164b) {
                        m16758b = m16757c(substring);
                    } else {
                        m16758b = m16758b(substring);
                    }
                    str2 = m16758b;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f87167e.format(parse));
                if (i2 == -1) {
                    sb.append(".");
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "str.toString()");
                if (!m16759a(sb2)) {
                    sb.append(str2);
                    str = sb.toString();
                } else {
                    str = this.f87169g;
                }
                this.f87163a.setText(str);
            } else {
                String format = this.f87167e.format(parse);
                Intrinsics.checkNotNullExpressionValue(format, "dfnd.format(number)");
                if (m16759a(format)) {
                    format = this.f87169g;
                }
                this.f87163a.setText(format);
            }
        } catch (NumberFormatException unused) {
        } catch (ParseException e) {
            e.toString();
        }
        EditText editText = this.f87163a;
        if (this.f87170h > editText.getText().length()) {
            i = this.f87163a.getText().length();
        } else {
            i = this.f87170h;
        }
        editText.setSelection(i);
        this.f87163a.addTextChangedListener(this);
    }

    /* renamed from: b */
    public final String m16758b(String str) {
        if (str.length() > 4) {
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(s, "s");
        this.f87169g = s.toString();
    }

    /* renamed from: c */
    public final String m16757c(String str) {
        if (str.length() > 3) {
            String substring = str.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence s, int i, int i2, int i3) {
        boolean z;
        Intrinsics.checkNotNullParameter(s, "s");
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        int selectionStart = this.f87163a.getSelectionStart();
        if (!z && selectionStart == s.toString().length()) {
            selectionStart++;
        }
        this.f87170h = selectionStart;
        this.f87168f = StringsKt__StringsKt.contains$default((CharSequence) s.toString(), (CharSequence) String.valueOf(this.f87166d.getDecimalFormatSymbols().getDecimalSeparator()), false, 2, (Object) null);
    }

    public /* synthetic */ NumberTextWatcher(EditText editText, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(editText, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 6 : i);
    }
}