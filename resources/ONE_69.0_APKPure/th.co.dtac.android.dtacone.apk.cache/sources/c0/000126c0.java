package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.multipdf.PDFMergerUtility;
import com.tom_roush.pdfbox.p019io.MemoryUsageSetting;
import io.reactivex.Completable;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import io.realm.CollectionUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nJ\u001e\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011J6\u0010\u0015\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/Utils;", "", "()V", "deleteCacheFile", "", "file", "Ljava/io/File;", "delay", "", "callback", "Lkotlin/Function1;", "", "saveFileAndCombinePDFs", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", CollectionUtils.LIST_TYPE, "", "", "saveFileFromBase64", "filename", "stringBase64", "saveFileFromBase64Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nth/co/dtac/android/dtacone/util/Utils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1864#2,3:105\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nth/co/dtac/android/dtacone/util/Utils\n*L\n62#1:105,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.Utils */
/* loaded from: classes8.dex */
public final class Utils {
    public static final int $stable = 0;

    public static /* synthetic */ void deleteCacheFile$default(Utils utils, File file, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 3;
        }
        utils.deleteCacheFile(file, j);
    }

    public final void deleteCacheFile(@NotNull File file, long j) {
        Intrinsics.checkNotNullParameter(file, "file");
        Completable subscribeOn = Completable.timer(j, TimeUnit.SECONDS).subscribeOn(Schedulers.m30138io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "timer(delay, TimeUnit.SE…scribeOn(Schedulers.io())");
        SubscribersKt.subscribeBy$default(subscribeOn, (Function1) null, new Utils$deleteCacheFile$1(file), 1, (Object) null);
    }

    @Nullable
    public final File saveFileAndCombinePDFs(@NotNull Context context, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "list");
        PDFMergerUtility pDFMergerUtility = new PDFMergerUtility();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            pDFMergerUtility.addSource(saveFileFromBase64(context, "receipt_" + i + ".pdf", (String) obj));
            i = i2;
        }
        File file = new File(context.getCacheDir(), "receipt.pdf");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            pDFMergerUtility.setDestinationStream(fileOutputStream);
            pDFMergerUtility.mergeDocuments(MemoryUsageSetting.setupTempFileOnly());
            return file;
        } finally {
            fileOutputStream.close();
        }
    }

    @NotNull
    public final File saveFileFromBase64(@NotNull Context context, @NotNull String filename, @NotNull String stringBase64) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(stringBase64, "stringBase64");
        File cacheDir = context.getCacheDir();
        byte[] decode = Base64.decode(stringBase64, 0);
        File file = new File(cacheDir, filename);
        if (file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(decode);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    public final void saveFileFromBase64Callback(@NotNull Context context, @NotNull String filename, @NotNull String stringBase64, @Nullable Function1<? super File, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        Intrinsics.checkNotNullParameter(stringBase64, "stringBase64");
        try {
            File cacheDir = context.getCacheDir();
            byte[] decode = Base64.decode(stringBase64, 0);
            File file = new File(cacheDir, filename);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            if (function1 != null) {
                function1.invoke(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (function1 != null) {
                function1.invoke(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deleteCacheFile$default(Utils utils, File file, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 3;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        utils.deleteCacheFile(file, j, function1);
    }

    public final void deleteCacheFile(@NotNull File file, long j, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(file, "file");
        Completable subscribeOn = Completable.timer(j, TimeUnit.SECONDS).subscribeOn(Schedulers.m30138io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "timer(delay, TimeUnit.SE…scribeOn(Schedulers.io())");
        SubscribersKt.subscribeBy(subscribeOn, new Utils$deleteCacheFile$2(function1), new Utils$deleteCacheFile$3(file, function1));
    }
}