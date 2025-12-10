package com.chuckerteam.chucker.internal.p010ui.transaction;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.core.text.HtmlCompat;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.p010ui.transaction.TransactionPayloadItem;
import com.chuckerteam.chucker.internal.support.BitmapUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$processPayload$2", m28800f = "TransactionPayloadFragment.kt", m28799i = {0, 0}, m28798l = {364}, m28797m = "invokeSuspend", m28796n = {"result", "responseBitmap"}, m28795s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nTransactionPayloadFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,460:1\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadFragment.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment$processPayload$2\n*L\n380#1:461,2\n*E\n"})
/* renamed from: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$processPayload$2 */
/* loaded from: classes3.dex */
public final class TransactionPayloadFragment$processPayload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<TransactionPayloadItem>>, Object> {
    final /* synthetic */ boolean $formatRequestBody;
    final /* synthetic */ HttpTransaction $transaction;
    final /* synthetic */ PayloadType $type;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TransactionPayloadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPayloadFragment$processPayload$2(PayloadType payloadType, HttpTransaction httpTransaction, boolean z, TransactionPayloadFragment transactionPayloadFragment, Continuation<? super TransactionPayloadFragment$processPayload$2> continuation) {
        super(2, continuation);
        this.$type = payloadType;
        this.$transaction = httpTransaction;
        this.$formatRequestBody = z;
        this.this$0 = transactionPayloadFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransactionPayloadFragment$processPayload$2(this.$type, this.$transaction, this.$formatRequestBody, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List arrayList;
        String responseHeadersString;
        boolean isResponseBodyEncoded;
        CharSequence spannedResponseBody;
        List<CharSequence> m49836u;
        SpannableStringBuilder valueOf;
        Bitmap bitmap;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                bitmap = (Bitmap) this.L$1;
                arrayList = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList();
            if (this.$type == PayloadType.REQUEST) {
                responseHeadersString = this.$transaction.getRequestHeadersString(true);
                isResponseBodyEncoded = this.$transaction.isRequestBodyEncoded();
                if (this.$formatRequestBody) {
                    spannedResponseBody = this.$transaction.getSpannedRequestBody(this.this$0.getContext());
                } else {
                    spannedResponseBody = this.$transaction.getRequestBody();
                    if (spannedResponseBody == null) {
                        spannedResponseBody = "";
                    }
                }
            } else {
                responseHeadersString = this.$transaction.getResponseHeadersString(true);
                isResponseBodyEncoded = this.$transaction.isResponseBodyEncoded();
                spannedResponseBody = this.$transaction.getSpannedResponseBody(this.this$0.getContext());
            }
            if (!AbstractC20204hN1.isBlank(responseHeadersString)) {
                Spanned fromHtml = HtmlCompat.fromHtml(responseHeadersString, 0);
                Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(\n              …                        )");
                arrayList.add(new TransactionPayloadItem.HeaderItem(fromHtml));
            }
            Bitmap responseImageBitmap = this.$transaction.getResponseImageBitmap();
            if (this.$type == PayloadType.RESPONSE && responseImageBitmap != null) {
                this.L$0 = arrayList;
                this.L$1 = responseImageBitmap;
                this.label = 1;
                Object calculateLuminance = BitmapUtilsKt.calculateLuminance(responseImageBitmap, this);
                if (calculateLuminance == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap = responseImageBitmap;
                obj = calculateLuminance;
            } else {
                if (isResponseBodyEncoded) {
                    String string = this.this$0.requireContext().getString(R.string.chucker_body_omitted);
                    Intrinsics.checkNotNullExpressionValue(string, "requireContext().getStri…ing.chucker_body_omitted)");
                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string);
                    Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(text)");
                    arrayList.add(new TransactionPayloadItem.BodyLineItem(valueOf2));
                } else if (!AbstractC20204hN1.isBlank(spannedResponseBody)) {
                    m49836u = this.this$0.m49836u(spannedResponseBody);
                    for (CharSequence charSequence : m49836u) {
                        if (charSequence instanceof SpannableStringBuilder) {
                            valueOf = (SpannableStringBuilder) charSequence;
                        } else {
                            valueOf = SpannableStringBuilder.valueOf(charSequence);
                        }
                        Intrinsics.checkNotNullExpressionValue(valueOf, "if (it is SpannableStrin…                        }");
                        arrayList.add(new TransactionPayloadItem.BodyLineItem(valueOf));
                    }
                } else {
                    String string2 = this.this$0.requireContext().getString(R.string.chucker_body_empty);
                    Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getStri…tring.chucker_body_empty)");
                    SpannableStringBuilder valueOf3 = SpannableStringBuilder.valueOf(string2);
                    Intrinsics.checkNotNullExpressionValue(valueOf3, "valueOf(text)");
                    arrayList.add(new TransactionPayloadItem.BodyLineItem(valueOf3));
                }
                return arrayList;
            }
        }
        arrayList.add(new TransactionPayloadItem.ImageItem(bitmap, (Double) obj));
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<TransactionPayloadItem>> continuation) {
        return ((TransactionPayloadFragment$processPayload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
