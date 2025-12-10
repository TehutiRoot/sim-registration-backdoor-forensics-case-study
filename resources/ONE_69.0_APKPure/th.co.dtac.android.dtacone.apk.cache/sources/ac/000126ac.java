package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u0004\u0018\u00010\f*\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0013*\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R$\u0010'\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/PdfBitmapConverter;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "base64", "", "pageIndex", "tempPrefix", "tempSuffix", "Landroid/graphics/Bitmap;", "base64PdfPageToBitmap", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/net/Uri;", "contentUri", "pdfPageToBitmap", "(Landroid/net/Uri;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pdfToBitmaps", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base64PdfToBitmaps", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "base64String", "Ljava/io/File;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;", "Landroid/graphics/pdf/PdfRenderer;", OperatorName.CURVE_TO, "(Landroid/graphics/pdf/PdfRenderer;I)Landroid/graphics/Bitmap;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/pdf/PdfRenderer;)Ljava/util/List;", "Landroid/content/Context;", "Landroid/graphics/pdf/PdfRenderer;", "getRenderer", "()Landroid/graphics/pdf/PdfRenderer;", "setRenderer", "(Landroid/graphics/pdf/PdfRenderer;)V", "renderer", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPdfBitmapConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PdfBitmapConverter.kt\nth/co/dtac/android/dtacone/util/PdfBitmapConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1#2:189\n95#3:178\n1603#4,9:179\n1855#4:188\n1856#4:190\n1612#4:191\n*S KotlinDebug\n*F\n+ 1 PdfBitmapConverter.kt\nth/co/dtac/android/dtacone/util/PdfBitmapConverter\n*L\n172#1:189\n158#1:178\n172#1:179,9\n172#1:188\n172#1:190\n172#1:191\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.PdfBitmapConverter */
/* loaded from: classes8.dex */
public final class PdfBitmapConverter {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Context f87070a;

    /* renamed from: b */
    public PdfRenderer f87071b;

    public PdfBitmapConverter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87070a = context;
    }

    public static /* synthetic */ Object base64PdfPageToBitmap$default(PdfBitmapConverter pdfBitmapConverter, String str, int i, String str2, String str3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "temp_pdf";
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            str3 = ".pdf";
        }
        return pdfBitmapConverter.base64PdfPageToBitmap(str, i, str4, str3, continuation);
    }

    public static /* synthetic */ Object base64PdfToBitmaps$default(PdfBitmapConverter pdfBitmapConverter, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "temp_pdf";
        }
        if ((i & 4) != 0) {
            str3 = ".pdf";
        }
        return pdfBitmapConverter.base64PdfToBitmaps(str, str2, str3, continuation);
    }

    /* renamed from: a */
    public final List m16798a(PdfRenderer pdfRenderer) {
        IntRange until = AbstractC11695c.until(0, pdfRenderer.getPageCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Bitmap m16796c = m16796c(pdfRenderer, ((IntIterator) it).nextInt());
            if (m16796c != null) {
                arrayList.add(m16796c);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final File m16797b(String str, String str2, String str3) {
        try {
            byte[] decode = Base64.decode(str, 0);
            File createTempFile = File.createTempFile(str2, str3, this.f87070a.getCacheDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(decode);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return createTempFile;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final Object base64PdfPageToBitmap(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PdfBitmapConverter$base64PdfPageToBitmap$2(this, str, str2, str3, i, null), continuation);
    }

    @Nullable
    public final Object base64PdfToBitmaps(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super List<Bitmap>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PdfBitmapConverter$base64PdfToBitmaps$2(this, str, str2, str3, null), continuation);
    }

    /* renamed from: c */
    public final Bitmap m16796c(PdfRenderer pdfRenderer, int i) {
        if (i < 0 || i >= pdfRenderer.getPageCount()) {
            return null;
        }
        PdfRenderer.Page openPage = pdfRenderer.openPage(i);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
            new Canvas(createBitmap).drawColor(-1);
            openPage.render(createBitmap, null, null, 1);
            AutoCloseableKt.closeFinally(openPage, null);
            return createBitmap;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(openPage, th2);
                throw th3;
            }
        }
    }

    @Nullable
    public final PdfRenderer getRenderer() {
        return this.f87071b;
    }

    @Nullable
    public final Object pdfPageToBitmap(@NotNull Uri uri, int i, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PdfBitmapConverter$pdfPageToBitmap$2(this, uri, i, null), continuation);
    }

    @Nullable
    public final Object pdfToBitmaps(@NotNull Uri uri, @NotNull Continuation<? super List<Bitmap>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PdfBitmapConverter$pdfToBitmaps$2(this, uri, null), continuation);
    }

    public final void setRenderer(@Nullable PdfRenderer pdfRenderer) {
        this.f87071b = pdfRenderer;
    }
}