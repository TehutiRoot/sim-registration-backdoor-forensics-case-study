package io.fotoapparat.log;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class BackgroundThreadLogger$log$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $message;
    final /* synthetic */ BackgroundThreadLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundThreadLogger$log$1(BackgroundThreadLogger backgroundThreadLogger, String str) {
        super(0);
        this.this$0 = backgroundThreadLogger;
        this.$message = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Logger logger;
        logger = this.this$0.f62995a;
        logger.log(this.$message);
    }
}
