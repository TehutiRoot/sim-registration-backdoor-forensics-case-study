package th.p047co.dtac.android.dtacone.util.appOne;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/appOne/OneBirthDayBelowEighteenAge;", "", "()V", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.appOne.OneBirthDayBelowEighteenAge */
/* loaded from: classes8.dex */
public final class OneBirthDayBelowEighteenAge {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/appOne/OneBirthDayBelowEighteenAge$Companion;", "", "<init>", "()V", "", "birthday", "", "isBelowEighteenAge", "(Ljava/lang/String;)Z", "date", "Lkotlin/Triple;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;)Lkotlin/Triple;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.util.appOne.OneBirthDayBelowEighteenAge$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Triple m16786a(String str) {
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

        public final boolean isBelowEighteenAge(@NotNull String birthday) {
            Intrinsics.checkNotNullParameter(birthday, "birthday");
            Triple m16786a = m16786a(AbstractC19741eO1.replace$default(AbstractC19741eO1.replace$default(birthday, HelpFormatter.DEFAULT_OPT_PREFIX, "", false, 4, (Object) null), RemoteSettings.FORWARD_SLASH_STRING, "", false, 4, (Object) null));
            int intValue = ((Number) m16786a.component1()).intValue();
            int intValue2 = ((Number) m16786a.component2()).intValue();
            int intValue3 = ((Number) m16786a.component3()).intValue();
            Calendar calendar = Calendar.getInstance(Locale.US);
            if (intValue > 2400) {
                intValue -= 543;
            }
            calendar.set(intValue, intValue2 - 1, intValue3);
            calendar.add(1, 18);
            return calendar.getTime().after(new Date());
        }

        public Companion() {
        }
    }
}