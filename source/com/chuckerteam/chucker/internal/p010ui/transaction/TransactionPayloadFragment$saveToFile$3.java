package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Logger;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.ByteStreamsKt;
import kotlin.p023io.CloseableKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$3", m28800f = "TransactionPayloadFragment.kt", m28799i = {}, m28798l = {}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$3 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$saveToFile$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ HttpTransaction $transaction;
    final /* synthetic */ PayloadType $type;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ TransactionPayloadFragment this$0;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$saveToFile$3$WhenMappings */
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PayloadType.values().length];
            try {
                iArr[PayloadType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayloadType.RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$saveToFile$3(TransactionPayloadFragment transactionPayloadFragment, Uri uri, PayloadType payloadType, HttpTransaction httpTransaction, Continuation<? super TransactionPayloadFragment$saveToFile$3> continuation) {
        super(2, continuation);
        this.this$0 = transactionPayloadFragment;
        this.$uri = uri;
        this.$type = payloadType;
        this.$transaction = httpTransaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionPayloadFragment$saveToFile$3(this.this$0, this.$uri, this.$type, this.$transaction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long copyTo$default;
        AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                ParcelFileDescriptor openFileDescriptor = this.this$0.requireContext().getContentResolver().openFileDescriptor(this.$uri, OperatorName.SET_LINE_WIDTH);
                if (openFileDescriptor != null) {
                    PayloadType payloadType = this.$type;
                    HttpTransaction httpTransaction = this.$transaction;
                    FileOutputStream fileOutputStream = new FileOutputStream(openFileDescriptor.getFileDescriptor());
                    try {
                        int i = WhenMappings.$EnumSwitchMapping$0[payloadType.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                String responseBody = httpTransaction.getResponseBody();
                                if (responseBody != null) {
                                    byte[] bytes = responseBody.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                                    copyTo$default = ByteStreamsKt.copyTo$default(new ByteArrayInputStream(bytes), fileOutputStream, 0, 2, null);
                                } else {
                                    throw new IOException("Transaction not ready");
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            String requestBody = httpTransaction.getRequestBody();
                            if (requestBody != null) {
                                byte[] bytes2 = requestBody.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                                copyTo$default = ByteStreamsKt.copyTo$default(new ByteArrayInputStream(bytes2), fileOutputStream, 0, 2, null);
                            } else {
                                throw new IOException("Transaction not ready");
                            }
                        }
                        CloseableKt.closeFinally(fileOutputStream, null);
                        Boxing.boxLong(copyTo$default);
                        CloseableKt.closeFinally(openFileDescriptor, null);
                    } finally {
                    }
                }
                return Boxing.boxBoolean(true);
            } catch (IOException e) {
                Logger.Companion.error("Failed to save transaction to a file", e);
                return Boxing.boxBoolean(false);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((TransactionPayloadFragment$saveToFile$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
