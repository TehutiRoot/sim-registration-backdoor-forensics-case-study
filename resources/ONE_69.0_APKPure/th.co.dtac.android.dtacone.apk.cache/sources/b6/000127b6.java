package th.p047co.dtac.android.dtacone.util.validation.self_update;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.p2post.validate.BirthDayCollection;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/self_update/BirthdayValidate;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;", "", "minAge", "<init>", "(I)V", "value", "", "validate", "(Lth/co/dtac/android/dtacone/model/p2post/validate/BirthDayCollection;)V", "year", "month", "day", PDPageLabelRange.STYLE_LETTERS_LOWER, "(III)Ljava/lang/Integer;", "I", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.validation.self_update.BirthdayValidate */
/* loaded from: classes8.dex */
public final class BirthdayValidate implements ValidationRule<BirthDayCollection> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final int f87218a;

    public BirthdayValidate(int i) {
        this.f87218a = i;
    }

    /* renamed from: a */
    public final Integer m16719a(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance()");
        Calendar calendar2 = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar2, "getInstance()");
        calendar.set(i, i2, i3);
        int i4 = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(6) < calendar.get(6)) {
            i4--;
        }
        return Integer.valueOf(i4);
    }

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public void validate(@Nullable BirthDayCollection birthDayCollection) {
        if (birthDayCollection != null) {
            Integer m16719a = m16719a(birthDayCollection.getYear(), birthDayCollection.getMonth(), birthDayCollection.getDay());
            if ((m16719a != null ? m16719a.intValue() : 0) < this.f87218a) {
                throw new ValidatedRuleException(R.string.online_registration_person_validate_min_age);
            }
            return;
        }
        throw new ValidatedRuleException(R.string.online_registration_validate_empty_date_of_birth);
    }
}