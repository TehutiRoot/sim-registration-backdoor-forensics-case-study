package th.p047co.dtac.android.dtacone.util.p052enum;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PhotoType;", "", "", "name", "<init>", "(Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "CUSTOMER_PHOTO", "ID_CARD", "REFERENCE_DOC", "Lth/co/dtac/android/dtacone/util/enum/PhotoType$CUSTOMER_PHOTO;", "Lth/co/dtac/android/dtacone/util/enum/PhotoType$ID_CARD;", "Lth/co/dtac/android/dtacone/util/enum/PhotoType$REFERENCE_DOC;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.enum.PhotoType */
/* loaded from: classes8.dex */
public abstract class PhotoType {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f87154a;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PhotoType$CUSTOMER_PHOTO;", "Lth/co/dtac/android/dtacone/util/enum/PhotoType;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.PhotoType$CUSTOMER_PHOTO */
    /* loaded from: classes8.dex */
    public static final class CUSTOMER_PHOTO extends PhotoType {
        public static final int $stable = 0;
        @NotNull
        public static final CUSTOMER_PHOTO INSTANCE = new CUSTOMER_PHOTO();

        public CUSTOMER_PHOTO() {
            super("CUSTOMER_PHOTO", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PhotoType$ID_CARD;", "Lth/co/dtac/android/dtacone/util/enum/PhotoType;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.PhotoType$ID_CARD */
    /* loaded from: classes8.dex */
    public static final class ID_CARD extends PhotoType {
        public static final int $stable = 0;
        @NotNull
        public static final ID_CARD INSTANCE = new ID_CARD();

        public ID_CARD() {
            super("ID_CARD", null);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PhotoType$REFERENCE_DOC;", "Lth/co/dtac/android/dtacone/util/enum/PhotoType;", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.PhotoType$REFERENCE_DOC */
    /* loaded from: classes8.dex */
    public static final class REFERENCE_DOC extends PhotoType {
        public static final int $stable = 0;
        @NotNull
        public static final REFERENCE_DOC INSTANCE = new REFERENCE_DOC();

        public REFERENCE_DOC() {
            super("REFERENCE_DOC", null);
        }
    }

    public /* synthetic */ PhotoType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getName() {
        return this.f87154a;
    }

    public PhotoType(String str) {
        this.f87154a = str;
    }
}