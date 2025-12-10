package coil.util;

import android.util.Log;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0005R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, m29142d2 = {"Lcoil/util/DebugLogger;", "Lcoil/util/Logger;", "", "level", "<init>", "(I)V", "", "tag", LogFactory.PRIORITY_KEY, "message", "", "throwable", "", "log", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLevel", "()I", "setLevel", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDebugLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugLogger.kt\ncoil/util/DebugLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes3.dex */
public final class DebugLogger implements Logger {

    /* renamed from: a */
    public int f40874a;

    @JvmOverloads
    public DebugLogger() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void m51016a(int i) {
        if (2 <= i && i < 8) {
            return;
        }
        throw new IllegalArgumentException(("Invalid log level: " + i).toString());
    }

    @Override // coil.util.Logger
    public int getLevel() {
        return this.f40874a;
    }

    @Override // coil.util.Logger
    public void log(@NotNull String str, int i, @Nullable String str2, @Nullable Throwable th2) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i, str, stringWriter.toString());
        }
    }

    @Override // coil.util.Logger
    public void setLevel(int i) {
        m51016a(i);
        this.f40874a = i;
    }

    @JvmOverloads
    public DebugLogger(int i) {
        this.f40874a = i;
        m51016a(i);
    }

    public /* synthetic */ DebugLogger(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}