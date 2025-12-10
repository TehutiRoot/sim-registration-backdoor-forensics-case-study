package th.p047co.dtac.android.dtacone.util.printing;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0012\u001a\u00020\u00112\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u001a\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/printing/DtacOnePrintDocumentAdapter;", "Landroid/print/PrintDocumentAdapter;", "Landroid/app/Activity;", "activity", "Ljava/io/File;", "file", "<init>", "(Landroid/app/Activity;Ljava/io/File;)V", "", "Landroid/print/PageRange;", "pageRanges", "Landroid/os/ParcelFileDescriptor;", "parcelFileDescriptor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/print/PrintDocumentAdapter$WriteResultCallback;", "callback", "", "onWrite", "([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V", "Landroid/print/PrintAttributes;", "oldAttributes", "newAttributes", "Landroid/print/PrintDocumentAdapter$LayoutResultCallback;", "Landroid/os/Bundle;", "metadata", "onLayout", "(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/io/File;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SuppressLint({"NewApi"})
/* renamed from: th.co.dtac.android.dtacone.util.printing.DtacOnePrintDocumentAdapter */
/* loaded from: classes8.dex */
public final class DtacOnePrintDocumentAdapter extends PrintDocumentAdapter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Activity f87213a;

    /* renamed from: b */
    public final File f87214b;

    public DtacOnePrintDocumentAdapter(@NotNull Activity activity, @NotNull File file) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f87213a = activity;
        this.f87214b = file;
    }

    @NotNull
    public final Activity getActivity() {
        return this.f87213a;
    }

    @Override // android.print.PrintDocumentAdapter
    public void onLayout(@Nullable PrintAttributes printAttributes, @NotNull PrintAttributes newAttributes, @Nullable CancellationSignal cancellationSignal, @Nullable PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (cancellationSignal != null) {
            try {
                if (cancellationSignal.isCanceled()) {
                    if (layoutResultCallback != null) {
                        layoutResultCallback.onLayoutCancelled();
                        return;
                    }
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Exception ");
                sb.append(message);
                if (layoutResultCallback != null) {
                    layoutResultCallback.onLayoutFailed("Page count calculation failed.");
                    return;
                }
                return;
            }
        }
        PrintDocumentInfo build = new PrintDocumentInfo.Builder(this.f87214b.getName()).setContentType(0).setPageCount(-1).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder(file.name)\n     …                 .build()");
        if (layoutResultCallback != null) {
            layoutResultCallback.onLayoutFinished(build, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:6:0x0022, B:7:0x0024, B:9:0x002b, B:12:0x0032, B:19:0x004b, B:22:0x0053, B:24:0x0059, B:26:0x005e, B:27:0x006a, B:47:0x0091, B:49:0x0096, B:55:0x00a8, B:57:0x00ad), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f A[Catch: IOException -> 0x0074, TRY_ENTER, TryCatch #5 {IOException -> 0x0074, blocks: (B:28:0x006d, B:51:0x009f, B:53:0x00a4, B:59:0x00b6, B:61:0x00bb), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4 A[Catch: IOException -> 0x0074, TRY_LEAVE, TryCatch #5 {IOException -> 0x0074, blocks: (B:28:0x006d, B:51:0x009f, B:53:0x00a4, B:59:0x00b6, B:61:0x00bb), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:6:0x0022, B:7:0x0024, B:9:0x002b, B:12:0x0032, B:19:0x004b, B:22:0x0053, B:24:0x0059, B:26:0x005e, B:27:0x006a, B:47:0x0091, B:49:0x0096, B:55:0x00a8, B:57:0x00ad), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6 A[Catch: IOException -> 0x0074, TRY_ENTER, TryCatch #5 {IOException -> 0x0074, blocks: (B:28:0x006d, B:51:0x009f, B:53:0x00a4, B:59:0x00b6, B:61:0x00bb), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: IOException -> 0x0074, TRY_LEAVE, TryCatch #5 {IOException -> 0x0074, blocks: (B:28:0x006d, B:51:0x009f, B:53:0x00a4, B:59:0x00b6, B:61:0x00bb), top: B:75:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9 A[Catch: IOException -> 0x00c5, TRY_LEAVE, TryCatch #3 {IOException -> 0x00c5, blocks: (B:64:0x00c1, B:68:0x00c9), top: B:73:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    @Override // android.print.PrintDocumentAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWrite(@org.jetbrains.annotations.NotNull android.print.PageRange[] r6, @org.jetbrains.annotations.NotNull android.os.ParcelFileDescriptor r7, @org.jetbrains.annotations.NotNull android.os.CancellationSignal r8, @org.jetbrains.annotations.Nullable android.print.PrintDocumentAdapter.WriteResultCallback r9) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.util.printing.DtacOnePrintDocumentAdapter.onWrite(android.print.PageRange[], android.os.ParcelFileDescriptor, android.os.CancellationSignal, android.print.PrintDocumentAdapter$WriteResultCallback):void");
    }
}