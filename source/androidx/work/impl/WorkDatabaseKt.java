package androidx.work.impl;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"", "PRUNE_THRESHOLD_MILLIS", OperatorName.SET_LINE_CAPSTYLE, "work-runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WorkDatabaseKt {
    @JvmField
    public static final long PRUNE_THRESHOLD_MILLIS = TimeUnit.DAYS.toMillis(1);
}
