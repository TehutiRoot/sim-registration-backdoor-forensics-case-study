package th.p047co.dtac.android.dtacone.util.validation.self_update;

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
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/self_update/IdCardSmartCardValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "<init>", "()V", "", "birthday", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Z", "date", "Lkotlin/Triple;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Lkotlin/Triple;", "value", "", "validate", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;)V", "checkExpire", "checkNoBirthDay", "checkEightAge", "(Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;ZZZ)V", "validateExpireOnly", OperatorName.CURVE_TO, "d", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.validation.self_update.IdCardSmartCardValidate */
/* loaded from: classes8.dex */
public final class IdCardSmartCardValidate implements ValidationRule<IdCardInformationCollection> {
    public static final int $stable = 0;

    /* renamed from: a */
    private final Triple m16718a(String str) {
        int i;
        int i2;
        if (str.length() >= 4) {
            String substring = str.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            i = Integer.parseInt(substring);
        } else {
            i = 3000;
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
    private final boolean m16717b(String str) {
        Triple m16718a = m16718a(str);
        int intValue = ((Number) m16718a.component1()).intValue();
        int intValue2 = ((Number) m16718a.component2()).intValue();
        int intValue3 = ((Number) m16718a.component3()).intValue();
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(intValue - 543, intValue2 - 1, intValue3);
        calendar.add(1, 18);
        return calendar.getTime().after(new Date());
    }

    /* renamed from: c */
    public final boolean m16716c(String str) {
        if (str != null && str.length() != 0) {
            Triple m16718a = m16718a(str);
            int intValue = ((Number) m16718a.component1()).intValue();
            int intValue2 = ((Number) m16718a.component2()).intValue();
            int intValue3 = ((Number) m16718a.component3()).intValue();
            Calendar calendar = Calendar.getInstance(Locale.US);
            calendar.set(intValue - 543, intValue2 - 1, intValue3);
            return calendar.getTime().before(new Date());
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m16715d(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public final void validateExpireOnly(@Nullable IdCardInformationCollection idCardInformationCollection) {
        if (idCardInformationCollection != null) {
            if (!m16716c(idCardInformationCollection.getExpire())) {
                return;
            }
            throw new ValidatedRuleException(R.string.read_smartcard_expire);
        }
        throw new ValidatedRuleException(R.string.mnp_card_reader_read_error);
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable IdCardInformationCollection idCardInformationCollection) {
        if (idCardInformationCollection != null) {
            if (!m16716c(idCardInformationCollection.getExpire())) {
                if (!m16715d(idCardInformationCollection.getBirthday())) {
                    String birthday = idCardInformationCollection.getBirthday();
                    Intrinsics.checkNotNullExpressionValue(birthday, "value.birthday");
                    if (m16717b(birthday)) {
                        throw new ValidatedRuleException(R.string.rtr_below_eighteen_age_message);
                    }
                    return;
                }
                throw new ValidatedRuleException(R.string.read_smartcard_no_birthdate);
            }
            throw new ValidatedRuleException(R.string.read_smartcard_expire);
        }
        throw new ValidatedRuleException(R.string.mnp_card_reader_read_error);
    }

    public final void validate(@Nullable IdCardInformationCollection idCardInformationCollection, boolean z, boolean z2, boolean z3) {
        if (idCardInformationCollection != null) {
            if (z && m16716c(idCardInformationCollection.getExpire())) {
                throw new ValidatedRuleException(R.string.read_smartcard_expire);
            }
            if (z2 && m16715d(idCardInformationCollection.getBirthday())) {
                throw new ValidatedRuleException(R.string.read_smartcard_no_birthdate);
            }
            if (z3) {
                String birthday = idCardInformationCollection.getBirthday();
                Intrinsics.checkNotNullExpressionValue(birthday, "value.birthday");
                if (m16717b(birthday)) {
                    throw new ValidatedRuleException(R.string.rtr_below_eighteen_age_message);
                }
                return;
            }
            return;
        }
        throw new ValidatedRuleException(R.string.mnp_card_reader_read_error);
    }
}