package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.p023io.CloseableKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.util.PdfBitmapConverter$pdfToBitmaps$2", m29092f = "PdfBitmapConverter.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.util.PdfBitmapConverter$pdfToBitmaps$2 */
/* loaded from: classes8.dex */
public final class PdfBitmapConverter$pdfToBitmaps$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Bitmap>>, Object> {
    final /* synthetic */ Uri $contentUri;
    int label;
    final /* synthetic */ PdfBitmapConverter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfBitmapConverter$pdfToBitmaps$2(PdfBitmapConverter pdfBitmapConverter, Uri uri, Continuation<? super PdfBitmapConverter$pdfToBitmaps$2> continuation) {
        super(2, continuation);
        this.this$0 = pdfBitmapConverter;
        this.$contentUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new PdfBitmapConverter$pdfToBitmaps$2(this.this$0, this.$contentUri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Bitmap>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Bitmap>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        List m16798a;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PdfRenderer renderer = this.this$0.getRenderer();
            if (renderer != null) {
                renderer.close();
            }
            try {
                context = this.this$0.f87070a;
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(this.$contentUri, PDPageLabelRange.STYLE_ROMAN_LOWER);
                if (openFileDescriptor != null) {
                    PdfBitmapConverter pdfBitmapConverter = this.this$0;
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(openFileDescriptor);
                        pdfBitmapConverter.setRenderer(pdfRenderer);
                        m16798a = pdfBitmapConverter.m16798a(pdfRenderer);
                        CloseableKt.closeFinally(openFileDescriptor, null);
                        return m16798a;
                    } finally {
                    }
                }
            } catch (FileNotFoundException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("pdfPageToBitmap - File not found: ");
                sb.append(message);
            } catch (IOException e2) {
                String message2 = e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pdfPageToBitmap - Error accessing file: ");
                sb2.append(message2);
            }
            return CollectionsKt__CollectionsKt.emptyList();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Bitmap>> continuation) {
        return ((PdfBitmapConverter$pdfToBitmaps$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}