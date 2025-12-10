package th.p047co.dtac.android.dtacone.util.validation.mailing;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/mailing/BirthDayBelowEighteenAge;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "<init>", "()V", "value", "", "validate", "(Ljava/lang/String;)V", "birthday", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Z", "date", "Lkotlin/Triple;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Lkotlin/Triple;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.validation.mailing.BirthDayBelowEighteenAge */
/* loaded from: classes8.dex */
public final class BirthDayBelowEighteenAge implements ValidationRule<String> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final Triple m16728a(String str) {
        int i;
        int i2;
        if (str.length() >= 4) {
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            i = Integer.parseInt(substring);
        } else {
            i = 1999;
        }
        int i3 = 1;
        if (str.length() >= 6) {
            String substring2 = str.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            i2 = Integer.parseInt(substring2);
        } else {
            i2 = 1;
        }
        if (str.length() >= 8) {
            String substring3 = str.substring(6, 8);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            i3 = Integer.parseInt(substring3);
        }
        return new Triple(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public final boolean m16727b(String str) {
        Triple m16728a = m16728a(str);
        int intValue = ((Number) m16728a.component1()).intValue();
        int intValue2 = ((Number) m16728a.component2()).intValue();
        int intValue3 = ((Number) m16728a.component3()).intValue();
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(intValue - 543, intValue2 - 1, intValue3);
        calendar.add(1, 18);
        return calendar.getTime().after(new Date());
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable String str) {
        if (str != null && str.length() != 0) {
            if (m16727b(DateFormatExtKt.thaiDateToThaiDateValidateFormat(str))) {
                throw new ValidatedRuleException(R.string.rtr_below_eighteen_age_message);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_birthdate);
    }
}