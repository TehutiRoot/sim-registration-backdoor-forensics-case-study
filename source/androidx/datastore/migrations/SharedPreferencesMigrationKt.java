package androidx.datastore.migrations;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28850d2 = {"", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/Set;", "getMIGRATE_ALL_KEYS", "()Ljava/util/Set;", "MIGRATE_ALL_KEYS", "datastore_release"}, m28849k = 2, m28848mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class SharedPreferencesMigrationKt {

    /* renamed from: a */
    public static final Set f34640a = new LinkedHashSet();

    @NotNull
    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return f34640a;
    }
}
