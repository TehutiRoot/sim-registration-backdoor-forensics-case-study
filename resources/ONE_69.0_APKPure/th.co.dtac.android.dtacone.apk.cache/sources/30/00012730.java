package th.p047co.dtac.android.dtacone.util.p052enum;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "", "", "userFormatType", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getUserFormatType", "()Ljava/lang/String;", "TELEPHONE_NUMBER", "USER_LAN", "Lth/co/dtac/android/dtacone/util/enum/UserNameType$TELEPHONE_NUMBER;", "Lth/co/dtac/android/dtacone/util/enum/UserNameType$USER_LAN;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.enum.UserNameType */
/* loaded from: classes8.dex */
public abstract class UserNameType {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f87155a;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/UserNameType$TELEPHONE_NUMBER;", "Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.UserNameType$TELEPHONE_NUMBER */
    /* loaded from: classes8.dex */
    public static final class TELEPHONE_NUMBER extends UserNameType {
        public static final int $stable = 0;
        @NotNull
        public static final TELEPHONE_NUMBER INSTANCE = new TELEPHONE_NUMBER();

        public TELEPHONE_NUMBER() {
            super("TELEPHONE_NUMBER", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/UserNameType$USER_LAN;", "Lth/co/dtac/android/dtacone/util/enum/UserNameType;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.UserNameType$USER_LAN */
    /* loaded from: classes8.dex */
    public static final class USER_LAN extends UserNameType {
        public static final int $stable = 0;
        @NotNull
        public static final USER_LAN INSTANCE = new USER_LAN();

        public USER_LAN() {
            super("USER_LAN", null);
        }
    }

    public /* synthetic */ UserNameType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getUserFormatType() {
        return this.f87155a;
    }

    public UserNameType(String str) {
        this.f87155a = str;
    }
}