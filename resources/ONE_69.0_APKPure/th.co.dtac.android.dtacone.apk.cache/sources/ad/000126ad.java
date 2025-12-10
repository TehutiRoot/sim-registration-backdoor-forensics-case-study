package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p023io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.util.PdfBitmapConverter$base64PdfPageToBitmap$2", m29092f = "PdfBitmapConverter.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.util.PdfBitmapConverter$base64PdfPageToBitmap$2 */
/* loaded from: classes8.dex */
public final class PdfBitmapConverter$base64PdfPageToBitmap$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $base64;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ String $tempPrefix;
    final /* synthetic */ String $tempSuffix;
    int label;
    final /* synthetic */ PdfBitmapConverter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfBitmapConverter$base64PdfPageToBitmap$2(PdfBitmapConverter pdfBitmapConverter, String str, String str2, String str3, int i, Continuation<? super PdfBitmapConverter$base64PdfPageToBitmap$2> continuation) {
        super(2, continuation);
        this.this$0 = pdfBitmapConverter;
        this.$base64 = str;
        this.$tempPrefix = str2;
        this.$tempSuffix = str3;
        this.$pageIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PdfBitmapConverter$base64PdfPageToBitmap$2(this.this$0, this.$base64, this.$tempPrefix, this.$tempSuffix, this.$pageIndex, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        File m16797b;
        Context context;
        Bitmap m16796c;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PdfRenderer renderer = this.this$0.getRenderer();
            if (renderer != null) {
                renderer.close();
            }
            try {
                m16797b = this.this$0.m16797b(this.$base64, this.$tempPrefix, this.$tempSuffix);
                if (m16797b != null) {
                    context = this.this$0.f87070a;
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.fromFile(m16797b), PDPageLabelRange.STYLE_ROMAN_LOWER);
                    if (openFileDescriptor == null) {
                        return null;
                    }
                    PdfBitmapConverter pdfBitmapConverter = this.this$0;
                    int i = this.$pageIndex;
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(openFileDescriptor);
                        pdfBitmapConverter.setRenderer(pdfRenderer);
                        m16796c = pdfBitmapConverter.m16796c(pdfRenderer, i);
                        CloseableKt.closeFinally(openFileDescriptor, null);
                        return m16796c;
                    } finally {
                    }
                } else {
                    return null;
                }
            } catch (FileNotFoundException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("base64PdfPageToBitmap - File not found: ");
                sb.append(message);
                return null;
            } catch (IOException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("base64PdfPageToBitmap - Error accessing file: ");
                sb2.append(message2);
                return null;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
        return ((PdfBitmapConverter$base64PdfPageToBitmap$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}