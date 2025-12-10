package androidx.sqlite.p007db.framework;

import android.content.Context;
import android.os.Build;
import androidx.sqlite.p007db.SupportSQLiteCompat;
import androidx.sqlite.p007db.SupportSQLiteOpenHelper;
import androidx.sqlite.p007db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1 */
/* loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements Function0<FrameworkSQLiteOpenHelper.OpenHelper> {
    final /* synthetic */ FrameworkSQLiteOpenHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.this$0 = frameworkSQLiteOpenHelper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FrameworkSQLiteOpenHelper.OpenHelper invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        Context context;
        String str;
        SupportSQLiteOpenHelper.Callback callback;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        Context context2;
        String str3;
        Context context3;
        SupportSQLiteOpenHelper.Callback callback2;
        boolean z4;
        if (Build.VERSION.SDK_INT >= 23) {
            str2 = this.this$0.f37592b;
            if (str2 != null) {
                z3 = this.this$0.f37594d;
                if (z3) {
                    context2 = this.this$0.f37591a;
                    File noBackupFilesDir = SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(context2);
                    str3 = this.this$0.f37592b;
                    File file = new File(noBackupFilesDir, str3);
                    context3 = this.this$0.f37591a;
                    String absolutePath = file.getAbsolutePath();
                    FrameworkSQLiteOpenHelper.C5025a c5025a = new FrameworkSQLiteOpenHelper.C5025a(null);
                    callback2 = this.this$0.f37593c;
                    z4 = this.this$0.f37595e;
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context3, absolutePath, c5025a, callback2, z4);
                    z2 = this.this$0.f37597g;
                    SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z2);
                    return openHelper;
                }
            }
        }
        context = this.this$0.f37591a;
        str = this.this$0.f37592b;
        FrameworkSQLiteOpenHelper.C5025a c5025a2 = new FrameworkSQLiteOpenHelper.C5025a(null);
        callback = this.this$0.f37593c;
        z = this.this$0.f37595e;
        openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context, str, c5025a2, callback, z);
        z2 = this.this$0.f37597g;
        SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z2);
        return openHelper;
    }
}